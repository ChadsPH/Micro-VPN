package com.chaddevz.micro.preference;

import androidx.preference.PreferenceFragmentCompat;
import android.os.Bundle;

import androidx.preference.Preference;
import androidx.preference.EditTextPreference;

import android.content.SharedPreferences;

import androidx.preference.CheckBoxPreference;
import android.content.Intent;
import com.chaddevz.micro.R;

import android.os.Handler;

import com.chaddevz.micro.sshservice.config.SettingsConstants;
import com.chaddevz.micro.sshservice.logger.SkStatus;

import com.chaddevz.micro.sshservice.logger.ConnectionStatus;

public class SettingPreference extends PreferenceFragmentCompat
implements Preference.OnPreferenceChangeListener, SettingsConstants,
SkStatus.StateListener
{
	private Handler mHandler;
	private SharedPreferences mPref;

	public static final String
	SSHSERVER_PREFERENCE_KEY = "screenSSHSettings",
	ADVANCED_SCREEN_PREFERENCE_KEY = "screenAdvancedSettings";

	private String[] settings_disabled_keys = {
		DNSFORWARD_KEY,
		DNSRESOLVER_KEY,
		DNSRESOLVER_KEY2,
		UDPFORWARD_KEY,
		UDPRESOLVER_KEY,
		PINGER_KEY,
		AUTO_CLEAR_LOGS_KEY,
		HIDE_LOG_KEY
	};

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		mHandler = new Handler();
	}

	@Override
	public void onResume()
	{
		super.onResume();

		SkStatus.addStateListener(this);
	}

	@Override
	public void onPause()
	{
		super.onPause();

		SkStatus.removeStateListener(this);
	}


	@Override
    public void onCreatePreferences(Bundle bundle, String root_key)
	{
        // Load the Preferences from the XML file
        setPreferencesFromResource(R.xml.app_settings, root_key);

		mPref = getPreferenceManager().getDefaultSharedPreferences(getContext());

		Preference udpForwardPreference = (CheckBoxPreference)
			findPreference(UDPFORWARD_KEY);
		udpForwardPreference.setOnPreferenceChangeListener(this);

		Preference dnsForwardPreference = (CheckBoxPreference)
			findPreference(DNSFORWARD_KEY);
		dnsForwardPreference.setOnPreferenceChangeListener(this);

		setRunningTunnel(SkStatus.isTunnelActive());
	}

	private void onChangeUseVpn(boolean use_vpn){
		Preference udpResolverPreference = (EditTextPreference)
			findPreference(UDPRESOLVER_KEY);
		Preference dnsResolverPreference = (EditTextPreference)
			findPreference(DNSRESOLVER_KEY);
		Preference dnsResolverPreference2 = (EditTextPreference)
			findPreference(DNSRESOLVER_KEY2);

		for (String key : settings_disabled_keys){
			getPreferenceManager().findPreference(key)
				.setEnabled(use_vpn);
		}

		use_vpn = true;
		if (use_vpn) {
			boolean isUdpForward = mPref.getBoolean(UDPFORWARD_KEY, false);
			boolean isDnsForward = mPref.getBoolean(DNSFORWARD_KEY, false);

			udpResolverPreference.setEnabled(isUdpForward);
			dnsResolverPreference.setEnabled(isDnsForward);
			dnsResolverPreference2.setEnabled(isDnsForward);
		}
		else {
			String[] list = {
				UDPFORWARD_KEY,
				UDPRESOLVER_KEY,
				DNSFORWARD_KEY,
				DNSRESOLVER_KEY,
				DNSRESOLVER_KEY2
			};
			for (String key : list) {
				getPreferenceManager().findPreference(key)
					.setEnabled(false);
			}
		}
	}

	private void setRunningTunnel(boolean isRunning) {
		if (isRunning) {
			for (String key : settings_disabled_keys){
				getPreferenceManager().findPreference(key)
					.setEnabled(false);
			}
		}
		else {
			onChangeUseVpn(true);
		}
	}


	/**
	 * Preference.OnPreferenceChangeListener
	 * Implementação
	 */

	@Override
	public boolean onPreferenceChange(Preference pref, Object newValue)
	{
		switch (pref.getKey()) {
			case UDPFORWARD_KEY:
				boolean isUdpForward = (boolean) newValue;

				Preference udpResolverPreference = (EditTextPreference)
					findPreference(UDPRESOLVER_KEY);
				udpResolverPreference.setEnabled(isUdpForward);
				break;

			case DNSFORWARD_KEY:
				boolean isDnsForward = (boolean) newValue;

				Preference dnsResolverPreference = (EditTextPreference)
					findPreference(DNSRESOLVER_KEY);
				dnsResolverPreference.setEnabled(isDnsForward);

				Preference dnsResolverPreference2 = (EditTextPreference)
					findPreference(DNSRESOLVER_KEY2);
				dnsResolverPreference2.setEnabled(isDnsForward);
				break;

		}
		return true;
	}

	@Override
	public void updateState(String state, String logMessage, int localizedResId, ConnectionStatus level, Intent intent)
	{
		mHandler.post(new Runnable() {
				@Override
				public void run() {
					setRunningTunnel(SkStatus.isTunnelActive());
				}
			});
	}


}

