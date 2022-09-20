package com.chaddevz.micro;

import androidx.annotation.RequiresApi;

import android.graphics.Rect;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

import android.view.WindowMetrics;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.view.View;
import android.content.Context;
import androidx.appcompat.widget.SwitchCompat;

import com.chaddevz.micro.error.e;
import com.chaddevz.micro.util.Utils;

import android.widget.TextView;
import androidx.core.view.GravityCompat;
import android.widget.EditText;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import androidx.drawerlayout.widget.DrawerLayout;
import android.net.Uri;
import android.widget.Button;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.chaddevz.micro.activities.ConfigGeralActivity;
import android.view.LayoutInflater;

import android.text.Html;
import androidx.appcompat.app.AlertDialog;

import com.chaddevz.micro.sshservice.util.SkProtect;
import com.chaddevz.micro.sshservice.logger.SkStatus;

import android.widget.LinearLayout;

import android.os.Build;

import android.app.Activity;
import com.chaddevz.micro.sshservice.logger.ConnectionStatus;
import android.os.Handler;
import com.chaddevz.micro.sshservice.config.Settings;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.annotation.NonNull;

import android.widget.RadioGroup;
import com.chaddevz.micro.sshservice.config.ConfigParser;

import android.content.DialogInterface;
import com.chaddevz.micro.sshservice.tunnel.TunnelManagerHelper;
import androidx.viewpager.widget.ViewPager;

import java.io.IOException;
import com.google.android.material.navigation.NavigationView;

import com.chaddevz.micro.activities.BaseActivity;
import com.chaddevz.micro.sshservice.tunnel.TunnelUtils;

import androidx.annotation.Nullable;
import android.widget.Spinner;

import java.io.File;
import java.io.FileOutputStream;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import com.chaddevz.micro.util.ConfigUtil;

import com.chaddevz.micro.util.ConfigUpdate;
import com.chaddevz.micro.util.AESCrypt;

import android.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.chaddevz.micro.adapter.LogsAdapter;
import com.chaddevz.micro.activities.AboutActivity;

import android.widget.AdapterView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Timer;
import java.util.TimerTask;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import android.os.CountDownTimer;
import java.util.concurrent.TimeUnit;
import com.chaddevz.micro.sshservice.SocksHttpService;
import java.util.Locale;

import androidx.preference.PreferenceManager;
import android.app.ProgressDialog;

import android.view.Gravity;

import org.json.JSONObject;
import android.graphics.drawable.ColorDrawable;
import java.security.GeneralSecurityException;
import java.net.Proxy;
import java.net.InetSocketAddress;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.UpdateAvailability;
import android.os.StrictMode;
import android.content.IntentSender;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.material.snackbar.Snackbar;
import android.os.Looper;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.graphics.drawable.GradientDrawable.Orientation;
import io.michaelrocks.paranoid.Obfuscate;
import com.chaddevz.micro.sshservice.LaunchVpn;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.chaddevz.micro.adapter.PromoAdapter;
import com.chaddevz.micro.adapter.SpinnerAdapter;

import com.chaddevz.micro.util.RetrieveData;
import com.chaddevz.micro.util.StoredData;
import android.icu.util.Calendar;
import android.icu.text.SimpleDateFormat;
import com.google.android.material.textfield.TextInputLayout;
import com.chaddevz.micro.adapter.SetupAdapter;
import android.widget.AdapterView.OnItemSelectedListener;
import com.chaddevz.micro.sshservice.util.securepreferences.SecurePreferences;

@Obfuscate
public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener, RadioGroup.OnCheckedChangeListener, View.OnClickListener, SkStatus.StateListener, AdapterView.OnItemSelectedListener {

    @Override
    public void onItemSelected(AdapterView<?> p1, View p2, int p3, long p4) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> p1) {
    }
    
	private static final String[] tabTitle = {"HOME","LOGS"};
	private TextView connectionStatus;
	NavigationView navi;
	private DrawerLayout drawer;
	Toolbar toolbar_main;
	private static final String UPDATE_VIEWS = "MainUpdate";
	private Handler mHandler;
	MaterialButton starterButton;
	public ConfigUtil config;
	public Settings mConfig;
	static int PICK_FILE = 1;
	public static SharedPreferences sp;
	private TextView mTextViewCountDown;
    private long mTimeLeftInMillis;
    boolean mTimerEnabled;
    private boolean mTimerRunning;
    private long saved_ads_time;
    private CountDownTimer mCountDownTimer;
	long mEndTime;
	public static SharedPreferences sp1;
	private TextView configversion;
	public static final String ll ="http://noloadbalance.globe.com.ph";
	public static final String ill ="104.16.213.74";
	private AppUpdateManager mAppUpdateManager;
	private static final int RC_APP_UPDATE = 100;
	public static boolean mConnected;

	private boolean isLoading;
	private ProgressDialog ppd;
	boolean cancelProgressBar;
	private static final String AD_UNIT = "ca-app-pub-8484224253322831/2079430201";
	LogsAdapter mLogAdapter;
    RecyclerView logList;
   	ViewPager vp;
    TabLayout tabs;
    private SpinnerAdapter serverAdapter;
    private PromoAdapter payloadAdapter;
	private Spinner serverSpinner;
	private Spinner payloadSpinner;
    private ArrayList<JSONObject> serverList;
	private ArrayList<JSONObject> payloadList;
    public TextView bytes_in_view;
	public TextView bytes_out_view;
    public static final String TODAY_DATA = "todaydata";
	private SharedPreferences myData;
    private static final int S_ONSTART_CALLED = 2;
	private static final int S_BIND_CALLED = 1;
    SwitchMaterial imgFavorite;
    private TextInputLayout sslPayloadLay;
    private TextInputLayout payLaySsl;
    private TextInputLayout edUserLayout;
    private TextInputLayout edPassLayout;
    private EditText webuser;
    private EditText webpass;
    private TextInputLayout bugsLayout;
	private EditText bugremote;
    private EditText edPayload;
    private EditText edSsl;
    private EditText sslPayload;
    private EditText edSslpayload;
    private TextInputLayout payLay, sslLay;
    private Spinner setupSpinner;
    private LinearLayout messLay;
    private SharedPreferences prefs;
    String[] setupList = {"Direct Connection", "Custom Payload", "Custom SNI", "CustomSNI + Payload",};
    private SwitchCompat customPayloadSwitch;
    private TextInputEditText payloadEdit;
    private LinearLayout proxyInputLayout;
    private LinearLayout payloadLayout;
    private TextView proxyText;
	private RadioGroup metodoConexaoRadio;
    private LinearLayout loginLayout;
    private LinearLayout configMsgLayout;
	private TextView configMsgText;
    private TextView tvMess;
	private SecurePreferences.Editor edit;
	private SecurePreferences.Editor putInt;


    private AdView mAdView;
    private FrameLayout adContainerView;
    private boolean initialLayoutComplete = false;

    private InterstitialAd interstitialAds;

    private static final long COUNTER_TIME = 10;
    private CountDownTimer countDownTimer;

    private boolean gameOver;
    private boolean gamePaused;
    private RewardedAd rewardedAd;

    private Button retryButton;
    private long timeRemaining;

    private android.app.AlertDialog alert;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		sp = PreferenceManager.getDefaultSharedPreferences(this);
		mHandler = new Handler();
		mConfig = new Settings(this);
		config = new ConfigUtil(this);
		mHandler = new Handler();
		mConfig = new Settings(this);
        SharedPreferences prefs = mConfig.getPrefsPrivate();
        myData = getSharedPreferences(TODAY_DATA, Context.MODE_PRIVATE);
		doLayout();
	    SkProtect.CharlieProtect();
		sp = new Settings(this).getPrefsPrivate();
    	mHandler = new Handler(Looper.getMainLooper());
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);
		mAppUpdateManager = AppUpdateManagerFactory.create(this);
		mAppUpdateManager.getAppUpdateInfo().addOnSuccessListener(result -> {
            if(result.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE && result.isUpdateTypeAllowed(AppUpdateType.FLEXIBLE)) {
                try {
                    mAppUpdateManager.startUpdateFlowForResult(result, AppUpdateType.IMMEDIATE, MainActivity.this,
                                                               RC_APP_UPDATE);
                } catch (IntentSender.SendIntentException ignored) {}}
        });
		mAppUpdateManager.registerListener(installUpdatelistener);

		String chaddev = getString(R.string.app_name);
		

		if(!chaddev.equals("Micro VPN")){
			AlertDialog.Builder chaddevz = new AlertDialog.Builder(this, R.style.AlertDialog);
			chaddevz.setTitle("Ajax Dev SECURITY");
			chaddevz.setMessage("You Want to MOD APK , But You're Chicken :(");
			chaddevz.setCancelable(false);
			chaddevz.setPositiveButton("Agree", (p1, p2) -> {
                finishAndRemoveTask();
                System.exit(0);
            });
            chaddevz.show();
		}
		
		if(dontme.isDeviceRooted()){
			Intent intent = getIntent(); 
			finish();
			startActivity(intent);
		}
		
		sp = new Settings(this).getPrefsPrivate();
        boolean showFirstTime = prefs.getBoolean("connect_first_time", true);
        int lastVersion = prefs.getInt("last_version", 0);
        
        if (showFirstTime) {
            SharedPreferences.Editor pEdit = prefs.edit();
            pEdit.putBoolean("connect_first_time", false);
            pEdit.apply();
            Settings.setDefaultConfig(this);
        }

        try {
            int idAtual = ConfigParser.getBuildId(this);

            if (lastVersion < idAtual) {
                SharedPreferences.Editor pEdit = prefs.edit();
                pEdit.putInt("last_version", idAtual);
                pEdit.apply();

                if (!showFirstTime) {
                    if (lastVersion <= 12) {
                        Settings.setDefaultConfig(this);
                        Settings.clearSettings(this);
                    }
                }
            }
		} catch(IOException ignored) {}
		IntentFilter filter = new IntentFilter();
		filter.addAction(UPDATE_VIEWS);

		LocalBroadcastManager.getInstance(this).registerReceiver(mActivityReceiver, filter);
		doUpdateLayout();
		Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));
		sp1 = PreferenceManager.getDefaultSharedPreferences(this);
		doLayout();
        loadServer();
        loadNetworks();
		doUpdateLayout();
		updateConfig(true);
	    onShowe();
		doTabs();
		setSpinner();

        LauncherActivity.e();

        //Inters
        startGames();
        IntersLoad();

        //Reward Ads
        loadRewardedAd();

        MobileAds.initialize(this, initializationStatus -> { });

        
        if(!StoredData.isSetData) {
            StoredData.setZero();
		}
        
        liveData();

	}
	
	public void doTabs() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mLogAdapter = new LogsAdapter(layoutManager,this);
        logList = findViewById(R.id.recyclerLog);
        logList.setAdapter(mLogAdapter);
        logList.setLayoutManager(layoutManager);
        mLogAdapter.scrollToLastPosition();
        vp = findViewById(R.id.viewpager);
        tabs = findViewById(R.id.tablayout);
        vp.setAdapter(new MyAdapter(Arrays.asList(tabTitle)));
        vp.setOffscreenPageLimit(2);
        tabs.setTabMode(TabLayout.MODE_FIXED);
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
        tabs.setupWithViewPager(vp);
	}
	
	public class MyAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            // TODO: Implement this method
            return 2;
        }

        @Override
        public boolean isViewFromObject(View p1, Object p2) {
            // TODO: Implement this method
            return p1 == p2;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            int[] ids = new int[]{R.id.tab1, R.id.tab2};
            int id = 0;
            id = ids[position];
            // TODO: Implement this method
            return findViewById(id);
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            // TODO: Implement this method
            return titles.get(position);
        }

        private final List<String> titles;
        public MyAdapter(List<String> str)
        {
            titles = str;
        }
	}


	@Override
	public boolean onNavigationItemSelected(MenuItem item) {
		switch (item.getItemId()) {
            
			case R.id.configupdate:
				updateConfig(false);
				break;

			case R.id.rate:
				Intent s = new Intent("android.intent.action.SEND");
				s.setType("text/plain");
				s.putExtra("android.intent.extra.SUBJECT", "AjaxVPN");
				s.putExtra("android.intent.extra.TEXT", "AjaxVPN - Free\nDownload at Playstore\nhttps://play.google.com/store/apps/details?id=com.chaddevz.micro");
				MainActivity.this.startActivity(Intent.createChooser(s, "Share via"));
                break;

			case R.id.facebook:
				startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://m.facebook.com/adik016")));
                break;

			case R.id.iphunt:
				iphunt();
				break;

			case R.id.about:
				Intent about = new Intent(MainActivity.this, AboutActivity.class);
				about.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				MainActivity.this.startActivity(about);
				break;


			case R.id.miSettings:
				Intent intent = new Intent(MainActivity.this, ConfigGeralActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				MainActivity.this.startActivity(intent);

				break;

		}
		drawer.closeDrawer(GravityCompat.START);
		return false;
	}
	

	@Override
	protected void onStop() {
		if(mAppUpdateManager != null) mAppUpdateManager.unregisterListener(installUpdatelistener);
		super.onStop();
	}
	

	private final InstallStateUpdatedListener installUpdatelistener = state -> {
        if(state.installStatus() == InstallStatus.DOWNLOADED) {
            showCompleterUpdate();
        }
    };

	private void showCompleterUpdate()
	{
		Snackbar snacks = Snackbar.make(findViewById(android.R.id.content), "New app is ready!",
										Snackbar.LENGTH_INDEFINITE);
		snacks.setAction("Install", new View.OnClickListener()
			{
				@Override
				public void onClick(View view) {
					mAppUpdateManager.completeUpdate();
				}
			});
		snacks.setActionTextColor(Color.parseColor("#ffffff"));
		snacks.show();
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(requestCode == RC_APP_UPDATE && resultCode != RESULT_OK)
		{
			Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
		}
		super.onActivityResult(requestCode, resultCode, data);
	}
	
	
	@Override
    public void onCheckedChanged(RadioGroup p1, int p2)
    {
        SharedPreferences.Editor edit = mConfig.getPrefsPrivate().edit();

        switch (p1.getCheckedRadioButtonId()) {
            case R.id.activity_mainSSHDirectRadioButton:
                edit.putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSH_DIRECT);
                proxyInputLayout.setVisibility(View.GONE);
                break;

            case R.id.activity_mainSSHProxyRadioButton:
                edit.putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSH_PROXY);
                proxyInputLayout.setVisibility(View.VISIBLE);
                break;
        }

        edit.apply();
        dosavedata();
        doUpdateLayout();
	}

	private synchronized void dosavedata() {
        try {
            SharedPreferences prefs = mConfig.getPrefsPrivate();
            SharedPreferences.Editor edit = prefs.edit();

            if (imgFavorite.isChecked()) {
                int pos = setupSpinner.getSelectedItemPosition();
                int pos1 = serverSpinner.getSelectedItemPosition();
                switch (pos) {
                    case 0:
                        prefs.edit().putBoolean(Settings.PROXY_USAR_DEFAULT_PAYLOAD, false).apply();
                        prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSH_DIRECT).apply();
                        break;
                    case 1:
                        prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSH_PROXY).apply();
                        String payload = edPayload.getText().toString();
                        edit.putString(Settings.CUSTOM_PAYLOAD_KEY, payload);
                        String ssh_port = config.getServersArray().getJSONObject(pos1).getString("ServerPort");
                        edit.putString(Settings.SERVIDOR_PORTA_KEY, ssh_port);
                        prefs.edit().putString("SavedHTTP", payload).apply();
                        break;
                    case 2:
                        prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSH_SSLTUNNEL).apply();
                        String sni = edSsl.getText().toString();
                        edit.putString(Settings.CUSTOM_PAYLOAD_KEY, sni);
                        String ssl_port = config.getServersArray().getJSONObject(pos1).getString("SSLPort");
                        edit.putString(Settings.SERVIDOR_PORTA_KEY, ssl_port);
                        prefs.edit().putString("SavedSSL", sni).apply();
                        break;
                    case 3:
                        prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_PAY_SSL).apply();
                        String sslpayload = sslPayload.getText().toString();
                        String snipayload = edSslpayload.getText().toString();
                        String user = webuser.getText().toString();
                        String pass = webpass.getText().toString();
                        String bughost1 = bugremote.getText().toString();
                        edit.putString(Settings.CUSTOM_SNI, snipayload);
                        edit.putString(Settings.CUSTOM_PAYLOAD_KEY, sslpayload);
                        edit.putString(Settings.USUARIO_KEY, user);
                        edit.putString(Settings.SENHA_KEY, pass);
                        edit.putString(Settings.SERVIDOR_KEY, bughost1);
                        String ssl_port2 = config.getServersArray().getJSONObject(pos1).getString("SSLPort");
                        edit.putString(Settings.SERVIDOR_PORTA_KEY, ssl_port2);
                        prefs.edit().putString("SavedHTTP + SSL", sslpayload).apply();
                        prefs.edit().putString("SavedSSL + HTTP", snipayload).apply();
                        prefs.edit().putString("SavedUSER", user).apply();
                        prefs.edit().putString("SavedPASS", pass).apply();
                        prefs.edit().putString("SavedBUG", bughost1).apply();
                    break;
                    
   
                            
                }
            } else {
                if (!prefs.getBoolean(Settings.CONFIG_PROTEGER_KEY, false)) {
                    if (!prefs.getBoolean(Settings.PROXY_USAR_DEFAULT_PAYLOAD, true)) {
                        int pos = payloadSpinner.getSelectedItemPosition();
                        // int modeType = prefs.getInt("TunnelMode",modeGroup.getCheckedRadioButtonId());


                        boolean directModeType = config.getNetworksArray().getJSONObject(pos).getBoolean("isSSL");
                        boolean sshssltype =  config.getNetworksArray().getJSONObject(pos).getBoolean("wsPayload");
                        boolean remotessltype = config.getNetworksArray().getJSONObject(pos).getBoolean("remoteHost");
                        boolean slowdnstype = config.getNetworksArray().getJSONObject(pos).getBoolean("SlowDns");
                          if (directModeType) {
                            prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSH_SSLTUNNEL).apply();
                            String sni = config.getNetworksArray().getJSONObject(pos).getString("SNI");
                            edit.putString(Settings.CUSTOM_PAYLOAD_KEY, sni);
                            
                    
                        } else if (sshssltype) {
                            prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_PAY_SSL).apply();
                            String payload = config.getNetworksArray().getJSONObject(pos).getString("Payload");
                            String snissl = config.getNetworksArray().getJSONObject(pos).getString("SNI");
                            edit.putString(Settings.CUSTOM_PAYLOAD_KEY, payload);
                            edit.putString(Settings.CUSTOM_SNI, snissl);
                
                        }else if (remotessltype){
                            prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSL_RP).apply();
                            String payloadrp = config.getNetworksArray().getJSONObject(pos).getString("Payload");
                            String sslrp = config.getNetworksArray().getJSONObject(pos).getString("SNI");
                            edit.putString(Settings.CUSTOM_PAYLOAD_KEY, payloadrp);
                            edit.putString(Settings.CUSTOM_SNI, sslrp);
                            
                        }else if (slowdnstype){
                            prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SLOWDNS).apply();
                            String chvKey = config.getNetworksArray().getJSONObject(pos).getString("chaveKey");
                            String nvKey = config.getNetworksArray().getJSONObject(pos).getString("serverNameKey");
                            String dnsKey = config.getNetworksArray().getJSONObject(pos).getString("dnsKey");
                            
                            edit.putString(Settings.CHAVE_KEY, chvKey);
                            edit.putString(Settings.NAMESERVER_KEY, nvKey);
                            edit.putString(Settings.DNS_KEY, dnsKey);
                            
                        } else {
                            prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSH_PROXY).apply();
                            String payload = config.getNetworksArray().getJSONObject(pos).getString("Payload");
                            edit.putString(Settings.CUSTOM_PAYLOAD_KEY, payload);
                        }
                    }
                }
            }
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	private void loadServerData() {
        try {
            SharedPreferences prefs = mConfig.getPrefsPrivate();
            SharedPreferences.Editor edit = prefs.edit();
            int pos1 = serverSpinner.getSelectedItemPosition();
            int pos2 = payloadSpinner.getSelectedItemPosition();
            boolean directModeType = config.getNetworksArray().getJSONObject(pos2).getBoolean("isSSL");
            boolean sshssltype = config.getNetworksArray().getJSONObject(pos2).getBoolean("wsPayload");
            boolean remotessltype = config.getNetworksArray().getJSONObject(pos2).getBoolean("remoteHost");
            boolean slowdnstype = config.getNetworksArray().getJSONObject(pos2).getBoolean("SlowDns");
            if (directModeType) {
                String ssl_port = config.getServersArray().getJSONObject(pos1).getString("SSLPort");
                edit.putString(Settings.SERVIDOR_PORTA_KEY, ssl_port);

            } else if (sshssltype) {
                String ssl_port1 = config.getServersArray().getJSONObject(pos1).getString("SSLPort");
                edit.putString(Settings.SERVIDOR_PORTA_KEY, ssl_port1);

            } else if (remotessltype) {
                String ssl_port2 = config.getServersArray().getJSONObject(pos1).getString("SSLPort");
                edit.putString(Settings.SERVIDOR_PORTA_KEY, ssl_port2);

            } else if (slowdnstype) {
                edit.putString(Settings.SERVIDOR_KEY, "127.0.0.1");
                edit.putString(Settings.SERVIDOR_PORTA_KEY, "2222");

            } else {
                String ssh_port = config.getServersArray().getJSONObject(pos1).getString("ServerPort");
                edit.putString(Settings.SERVIDOR_PORTA_KEY, ssh_port);
            }

            String ssh_server = config.getServersArray().getJSONObject(pos1).getString("ServerIP");
            String remote_proxy = config.getServersArray().getJSONObject(pos1).getString("ProxyIP");
            String proxy_port = config.getServersArray().getJSONObject(pos1).getString("ProxyPort");
            String ssh_user = config.getServersArray().getJSONObject(pos1).getString("ServerUser");
            String ssh_pass = config.getServersArray().getJSONObject(pos1).getString("ServerPass");

            edit.putString(Settings.USUARIO_KEY, ssh_user);
            edit.putString(Settings.SENHA_KEY, ssh_pass);
            edit.putString(Settings.SERVIDOR_KEY, ssh_server);
            edit.putString(Settings.PROXY_IP_KEY, remote_proxy);
            edit.putString(Settings.PROXY_PORTA_KEY, proxy_port);

            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadNetworks() {
        try {
            if (payloadList.size() > 0) {
                payloadList.clear();
                payloadAdapter.notifyDataSetChanged();
            }
            for (int i = 0; i < config.getNetworksArray().length(); i++) {
                JSONObject obj = config.getNetworksArray().getJSONObject(i);
                payloadList.add(obj);
                payloadAdapter.notifyDataSetChanged();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
    
    private void loadServer() {
        try {
            if (serverList.size() > 0) {
                serverList.clear();
                serverAdapter.notifyDataSetChanged();
            }
            for (int i = 0; i < config.getServersArray().length(); i++) {
                JSONObject obj = config.getServersArray().getJSONObject(i);
                serverList.add(obj);
                serverAdapter.notifyDataSetChanged();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*public void loadNetworks1() {
        try {
            if (payloadList.size() > 0) {
                payloadList.clear();
                payloadAdapter.clear();
            }
            JSONObject obj = getJSONConfig2(this);
            JSONArray networkPayload = obj.getJSONArray("Networks");
            for (int i = 0; i < networkPayload.length(); i++) {
                payloadList.add(networkPayload.getJSONObject(i));
            }
            //Collections.sort(listNetwork, NetworkNameComparator());
            payloadAdapter.notifyDataSetChanged();
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }*/

    private void doLayout() {
        setContentView(R.layout.activity_main_drawer);

        prefs = mConfig.getPrefsPrivate();
        SharedPreferences.Editor edit = prefs.edit();
        SharedPreferences sPrefs = mConfig.getPrefsPrivate();

        toolbar_main = findViewById(R.id.toolbar_main);
        navi = findViewById(R.id.navigation);
        drawer = findViewById(R.id.drawer);
        setSupportActionBar(toolbar_main);
        navi.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer,toolbar_main,R.string.bobo,R.string.bobo);
        toggle.syncState();

       /* mButtonSet = findViewById(R.id.btnAddTime);
        mButtonSet.setOnClickListener(this);*/

        starterButton = findViewById(R.id.activity_starterButtonMain);
        sPrefs.edit().putBoolean(Settings.PROXY_USAR_DEFAULT_PAYLOAD, false).apply();
        sPrefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSH_PROXY).apply();
        config = new ConfigUtil(this);
        connectionStatus = findViewById(R.id.connection_status);
        serverList = new ArrayList<>();
        payloadList = new ArrayList<>();
        serverSpinner = findViewById(R.id.serverSpinner);
        payloadSpinner = findViewById(R.id.payloadSpinner);
        serverAdapter = new SpinnerAdapter(this, R.id.serverSpinner, serverList);
        payloadAdapter = new PromoAdapter(this, R.id.payloadSpinner, payloadList);

        dosavedata();
        setSpinner();

        serverSpinner.setSelection(prefs.getInt("LastSelectedServer", 0));
        serverSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> p1, View p2, int p3, long p4) {

                SharedPreferences prefs = mConfig.getPrefsPrivate();
                SharedPreferences.Editor edit = prefs.edit();
                edit.putInt("LastSelectedServer", p3).apply();

            }

            @Override
            public void onNothingSelected(AdapterView<?> p1) {
            }
        });

        payloadSpinner.setSelection(prefs.getInt("LastSelectedPayload", -1));
        payloadSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> p1, View p2, int p3, long p4) {

                SharedPreferences prefs = mConfig.getPrefsPrivate();
                SharedPreferences.Editor edit = prefs.edit();
                int pos = payloadSpinner.getSelectedItemPosition();
                edit.putInt("LastSelectedPayload", pos).apply();
                // payloadSpinner.getSelectedItemPosition();
            }

            @Override
            public void onNothingSelected(AdapterView<?> p1) {
            }
        });

        serverSpinner.setAdapter(serverAdapter);
        payloadSpinner.setAdapter(payloadAdapter);
        payloadSpinner.setOnItemSelectedListener(this);

        updateConfig(true);
        configversion = findViewById(R.id.ConfigVersion);
        starterButton.setOnClickListener(this);
        mTextViewCountDown = findViewById(R.id.timerTextView);
        tvMess = findViewById(R.id.tvMessage);

        payloadLayout = findViewById(R.id.activity_mainInputPayloadLinearLayout);
        payloadEdit = findViewById(R.id.activity_mainInputPayloadEditText);
        proxyInputLayout = findViewById(R.id.activity_mainInputProxyLayout);
        proxyText = findViewById(R.id.activity_mainProxyText);
        metodoConexaoRadio = findViewById(R.id.activity_mainMetodoConexaoRadio);
        customPayloadSwitch = findViewById(R.id.activity_mainCustomPayloadSwitch);
        configMsgLayout = findViewById(R.id.activity_mainMensagemConfigLinearLayout);
        configMsgText = findViewById(R.id.activity_mainMensagemConfigTextView);
        loginLayout = findViewById(R.id.activity_mainInputPasswordLayout);

        bytes_in_view = findViewById(R.id.bytes_in);
        bytes_out_view = findViewById(R.id.bytes_out);

        messLay = findViewById(R.id.messageLayout);
        payLay = findViewById(R.id.payloadLayout);
        sslLay = findViewById(R.id.sniLayout);
        edPayload = findViewById(R.id.edCustomPayload);
        edPayload.setText(prefs.getString("SavedHTTP", ""));
        edSsl = findViewById(R.id.edCustomSSL);
        edSsl.setText(prefs.getString("SavedSSL", ""));

        payLaySsl = findViewById(R.id.sslpayloadLayout);
        sslPayloadLay = findViewById(R.id.snipayloadLayout);
        sslPayload = findViewById(R.id.sslCustomPayload);
        sslPayload.setText(prefs.getString("SavedHTTP + SSL", ""));
        edSslpayload = findViewById(R.id.sniCustomSSL);
        edSslpayload.setText(prefs.getString("SavedSSL + HTTP", ""));

        edUserLayout = findViewById(R.id.UserLayout);
        edPassLayout = findViewById(R.id.PassLayout);
        webuser = findViewById(R.id.webUser);
        webuser.setText(prefs.getString("SavedUSER", ""));
        webpass = findViewById(R.id.webPass);
        webpass.setText(prefs.getString("SavedPASS", ""));

        bugsLayout = findViewById(R.id.bugLayout);
        bugremote = findViewById(R.id.webBug);
        bugremote.setText(prefs.getString("SavedBUG", ""));

        if (mConfig.getPrefsPrivate().getBoolean(Settings.CONFIG_PROTEGER_KEY, false)) {
        }
        else {
            payloadEdit.setText(mConfig.getPrivString(Settings.CUSTOM_PAYLOAD_KEY));
        }
        setupSpinner = findViewById(R.id.setupSpinner);
        SetupAdapter setupAdapter = new SetupAdapter(this, R.id.setupSpinner, setupList);
        setupSpinner.setAdapter(setupAdapter);
        setupSpinner.setSelection(prefs.getInt("SavedPos",0));
        setupSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> p1, View p2, int p3, long p4)
            {
                prefs.edit().putInt("SavedPos", p3).apply();
                if (p3 == 0) {

                    bugsLayout.setVisibility(View.GONE);
                    bugremote.setVisibility(View.GONE);
                    edPayload.setVisibility(View.GONE);
                    edSsl.setVisibility(View.GONE);
                    payLay.setVisibility(View.GONE);
                    sslLay.setVisibility(View.GONE);
                    messLay.setVisibility(View.GONE);
                    sslPayload.setVisibility(View.GONE);
                    edSslpayload.setVisibility(View.GONE);
                    payLaySsl.setVisibility(View.GONE);
                    sslPayloadLay.setVisibility(View.GONE);
                    edUserLayout.setVisibility(View.GONE);
                    edPassLayout.setVisibility(View.GONE);
                    webuser.setVisibility(View.GONE);
                    webpass.setVisibility(View.GONE);
                } else if (p3 == 1) {

                    edPayload.setVisibility(View.VISIBLE);
                    edSsl.setVisibility(View.GONE);
                    sslPayload.setVisibility(View.GONE);
                    edSslpayload.setVisibility(View.GONE);
                    payLaySsl.setVisibility(View.GONE);
                    sslPayloadLay.setVisibility(View.GONE);
                    payLay.setVisibility(View.VISIBLE);
                    sslLay.setVisibility(View.GONE);
                    messLay.setVisibility(View.GONE);
                    edUserLayout.setVisibility(View.GONE);
                    edPassLayout.setVisibility(View.GONE);
                    webuser.setVisibility(View.GONE);
                    webpass.setVisibility(View.GONE);
                    bugsLayout.setVisibility(View.GONE);
                    bugremote.setVisibility(View.GONE);


                } else if (p3 == 2) {

                    edPayload.setVisibility(View.GONE);
                    edSsl.setVisibility(View.VISIBLE);
                    payLay.setVisibility(View.GONE);
                    sslLay.setVisibility(View.VISIBLE);
                    messLay.setVisibility(View.GONE);
                    sslPayload.setVisibility(View.GONE);
                    edSslpayload.setVisibility(View.GONE);
                    payLaySsl.setVisibility(View.GONE);
                    sslPayloadLay.setVisibility(View.GONE);
                    edUserLayout.setVisibility(View.GONE);
                    edPassLayout.setVisibility(View.GONE);
                    webuser.setVisibility(View.GONE);
                    webpass.setVisibility(View.GONE);
                    bugsLayout.setVisibility(View.GONE);
                    bugremote.setVisibility(View.GONE);



                }else if(p3 == 3) {

                    prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_PAY_SSL).apply();
                    sslPayload.setVisibility(View.VISIBLE);
                    edSslpayload.setVisibility(View.VISIBLE);
                    payLaySsl.setVisibility(View.VISIBLE);
                    sslPayloadLay.setVisibility(View.VISIBLE);
                    edUserLayout.setVisibility(View.VISIBLE);
                    edPassLayout.setVisibility(View.VISIBLE);
                    webuser.setVisibility(View.VISIBLE);
                    webpass.setVisibility(View.VISIBLE);
                    bugsLayout.setVisibility(View.VISIBLE);
                    bugremote.setVisibility(View.VISIBLE);
                    edPayload.setVisibility(View.GONE);
                    edSsl.setVisibility(View.GONE);
                    payLay.setVisibility(View.GONE);
                    sslLay.setVisibility(View.GONE);
                    messLay.setVisibility(View.GONE);


                }else if(p3 == 4) {


                    edPayload.setVisibility(View.GONE);
                    edSsl.setVisibility(View.GONE);
                    payLay.setVisibility(View.GONE);
                    sslLay.setVisibility(View.VISIBLE);
                    messLay.setVisibility(View.GONE);
                    sslPayload.setVisibility(View.GONE);
                    edSslpayload.setVisibility(View.GONE);
                    payLaySsl.setVisibility(View.GONE);
                    sslPayloadLay.setVisibility(View.GONE);
                    edUserLayout.setVisibility(View.GONE);
                    edPassLayout.setVisibility(View.GONE);
                    webuser.setVisibility(View.GONE);
                    webpass.setVisibility(View.GONE);
                    bugsLayout.setVisibility(View.GONE);
                    bugremote.setVisibility(View.GONE);

                }else if (p3 == 5) {


                    bugsLayout.setVisibility(View.GONE);
                    bugremote.setVisibility(View.GONE);
                    edUserLayout.setVisibility(View.GONE);
                    edPassLayout.setVisibility(View.GONE);
                    webuser.setVisibility(View.GONE);
                    webpass.setVisibility(View.GONE);
                    edPayload.setVisibility(View.GONE);
                    edSsl.setVisibility(View.GONE);
                    payLay.setVisibility(View.GONE);
                    sslLay.setVisibility(View.GONE);
                    sslPayload.setVisibility(View.GONE);
                    edSslpayload.setVisibility(View.GONE);
                    payLaySsl.setVisibility(View.GONE);
                    sslPayloadLay.setVisibility(View.GONE);
                    if (prefs.getBoolean("isMsg", false)) {
                        messLay.setVisibility(View.VISIBLE);
                        tvMess.setText(prefs.getString("Mess",""));
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> p1)
            {

            }
        });

        imgFavorite = findViewById(R.id.ckSetup);
        imgFavorite.setChecked(prefs.getBoolean("SavedSetup", false));
        imgFavorite.setOnCheckedChangeListener((p1, p2) -> {
            prefs.edit().putBoolean("SavedSetup", p2).apply();
            if (p2) {
                payloadSpinner.setVisibility(View.GONE);
                setupSpinner.setVisibility(View.VISIBLE);
                int p3 = prefs.getInt("SavedPos", 0);
                if (p3 == 0) {
                    prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSH_DIRECT).apply();
                    edPayload.setVisibility(View.GONE);
                    edSsl.setVisibility(View.GONE);
                    payLay.setVisibility(View.GONE);
                    sslLay.setVisibility(View.GONE);
                    messLay.setVisibility(View.GONE);
                    sslPayload.setVisibility(View.GONE);
                    edSslpayload.setVisibility(View.GONE);
                    payLaySsl.setVisibility(View.GONE);
                    sslPayloadLay.setVisibility(View.GONE);
                    edUserLayout.setVisibility(View.GONE);
                    edPassLayout.setVisibility(View.GONE);
                    webuser.setVisibility(View.GONE);
                    webpass.setVisibility(View.GONE);
                    bugsLayout.setVisibility(View.GONE);
                    bugremote.setVisibility(View.GONE);



                } else if (p3 == 1) {
                    bugsLayout.setVisibility(View.GONE);
                    bugremote.setVisibility(View.GONE);
                    edUserLayout.setVisibility(View.GONE);
                    edPassLayout.setVisibility(View.GONE);
                    webuser.setVisibility(View.GONE);
                    webpass.setVisibility(View.GONE);
                    edPayload.setVisibility(View.VISIBLE);
                    edSsl.setVisibility(View.GONE);
                    payLay.setVisibility(View.VISIBLE);
                    sslLay.setVisibility(View.GONE);
                    messLay.setVisibility(View.GONE);



                } else if (p3 == 2) {
                    edUserLayout.setVisibility(View.GONE);
                    edPassLayout.setVisibility(View.GONE);
                    webuser.setVisibility(View.GONE);
                    webpass.setVisibility(View.GONE);
                    edPayload.setVisibility(View.GONE);
                    edSsl.setVisibility(View.VISIBLE);
                    payLay.setVisibility(View.GONE);
                    sslLay.setVisibility(View.VISIBLE);
                    messLay.setVisibility(View.GONE);
                    sslPayload.setVisibility(View.GONE);
                    edSslpayload.setVisibility(View.GONE);
                    payLaySsl.setVisibility(View.GONE);
                    sslPayloadLay.setVisibility(View.GONE);
                    bugsLayout.setVisibility(View.GONE);
                    bugremote.setVisibility(View.GONE);




                }else if(p3 == 3){
                    prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_PAY_SSL).apply();
                    sslPayload.setVisibility(View.VISIBLE);
                    edSslpayload.setVisibility(View.VISIBLE);
                    payLaySsl.setVisibility(View.VISIBLE);
                    sslPayloadLay.setVisibility(View.VISIBLE);
                    edUserLayout.setVisibility(View.VISIBLE);
                    edPassLayout.setVisibility(View.VISIBLE);
                    webuser.setVisibility(View.VISIBLE);
                    webpass.setVisibility(View.VISIBLE);
                    bugsLayout.setVisibility(View.VISIBLE);
                    bugremote.setVisibility(View.VISIBLE);
                    edPayload.setVisibility(View.GONE);
                    edSsl.setVisibility(View.GONE);
                    payLay.setVisibility(View.GONE);
                    sslLay.setVisibility(View.GONE);
                    messLay.setVisibility(View.GONE);
                }else if(p3 == 4) {
                    edPayload.setVisibility(View.GONE);
                    edSsl.setVisibility(View.GONE);
                    payLay.setVisibility(View.GONE);
                    sslLay.setVisibility(View.VISIBLE);
                    messLay.setVisibility(View.GONE);
                    sslPayload.setVisibility(View.GONE);
                    edSslpayload.setVisibility(View.GONE);
                    payLaySsl.setVisibility(View.GONE);
                    sslPayloadLay.setVisibility(View.GONE);
                    edUserLayout.setVisibility(View.GONE);
                    edPassLayout.setVisibility(View.GONE);
                    webuser.setVisibility(View.GONE);
                    webpass.setVisibility(View.GONE);
                    bugsLayout.setVisibility(View.GONE);
                    bugremote.setVisibility(View.GONE);
                }else if (p3 == 5) {
                    bugsLayout.setVisibility(View.GONE);
                    bugremote.setVisibility(View.GONE);
                    edUserLayout.setVisibility(View.GONE);
                    edPassLayout.setVisibility(View.GONE);
                    webuser.setVisibility(View.GONE);
                    webpass.setVisibility(View.GONE);
                    edPayload.setVisibility(View.GONE);
                    edSsl.setVisibility(View.GONE);
                    payLay.setVisibility(View.GONE);
                    sslLay.setVisibility(View.GONE);
                    sslPayload.setVisibility(View.GONE);
                    edSslpayload.setVisibility(View.GONE);
                    payLaySsl.setVisibility(View.GONE);
                    sslPayloadLay.setVisibility(View.GONE);
                    if (prefs.getBoolean("isMsg", false)) {
                        messLay.setVisibility(View.VISIBLE);
                        tvMess.setText(prefs.getString("Mess",""));
                    }
                }
            } else {

                payloadSpinner.setVisibility(View.VISIBLE);
                setupSpinner.setVisibility(View.GONE);
                edPayload.setVisibility(View.GONE);
                edSsl.setVisibility(View.GONE);
                payLay.setVisibility(View.GONE);
                sslLay.setVisibility(View.GONE);
                messLay.setVisibility(View.GONE);
                sslPayload.setVisibility(View.GONE);
                edSslpayload.setVisibility(View.GONE);
                payLaySsl.setVisibility(View.GONE);
                sslPayloadLay.setVisibility(View.GONE);
                edUserLayout.setVisibility(View.GONE);
                edPassLayout.setVisibility(View.GONE);
                webuser.setVisibility(View.GONE);
                webpass.setVisibility(View.GONE);
                bugsLayout.setVisibility(View.GONE);
                bugremote.setVisibility(View.GONE);
            }
        });

        customPayloadSwitch.setChecked(true);
        metodoConexaoRadio.setOnCheckedChangeListener(this);
        edit.putBoolean(Settings.PROXY_USAR_DEFAULT_PAYLOAD, !true);
        setPayloadSwitch(prefs.getInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSH_DIRECT), true);
        int p3 = setupSpinner.getSelectedItemPosition();
        if (prefs.getBoolean("SavedSetup", false)) {
            setupSpinner.setVisibility(View.VISIBLE);
            payloadSpinner.setVisibility(View.GONE);
            if (p3 == 0) {
                prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSH_DIRECT).apply();
                edPayload.setVisibility(View.GONE);
                edSsl.setVisibility(View.GONE);
                payLay.setVisibility(View.GONE);
                sslLay.setVisibility(View.GONE);
                edUserLayout.setVisibility(View.GONE);
                edPassLayout.setVisibility(View.GONE);
                webuser.setVisibility(View.GONE);
                webpass.setVisibility(View.GONE);
                messLay.setVisibility(View.GONE);
                sslPayload.setVisibility(View.GONE);
                edSslpayload.setVisibility(View.GONE);
                payLaySsl.setVisibility(View.GONE);
                sslPayloadLay.setVisibility(View.GONE);
                bugsLayout.setVisibility(View.GONE);
                bugremote.setVisibility(View.GONE);



            } else if (p3 == 1) {
                edUserLayout.setVisibility(View.GONE);
                edPassLayout.setVisibility(View.GONE);
                webuser.setVisibility(View.GONE);
                webpass.setVisibility(View.GONE);
                edPayload.setVisibility(View.VISIBLE);
                edSsl.setVisibility(View.GONE);
                payLay.setVisibility(View.VISIBLE);
                sslLay.setVisibility(View.GONE);
                messLay.setVisibility(View.GONE);
                sslPayload.setVisibility(View.GONE);
                edSslpayload.setVisibility(View.GONE);
                payLaySsl.setVisibility(View.GONE);
                sslPayloadLay.setVisibility(View.GONE);
                bugsLayout.setVisibility(View.GONE);
                bugremote.setVisibility(View.GONE);



            } else if (p3 == 2) {
                edUserLayout.setVisibility(View.GONE);
                edPassLayout.setVisibility(View.GONE);
                webuser.setVisibility(View.GONE);
                webpass.setVisibility(View.GONE);
                edPayload.setVisibility(View.GONE);
                edSsl.setVisibility(View.VISIBLE);
                payLay.setVisibility(View.GONE);
                sslLay.setVisibility(View.VISIBLE);
                messLay.setVisibility(View.GONE);
                sslPayload.setVisibility(View.GONE);
                edSslpayload.setVisibility(View.GONE);
                payLaySsl.setVisibility(View.GONE);
                sslPayloadLay.setVisibility(View.GONE);
                bugsLayout.setVisibility(View.GONE);
                bugremote.setVisibility(View.GONE);



            }else if (p3 == 3) {
                prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_PAY_SSL).apply();
                edPayload.setVisibility(View.GONE);
                edSsl.setVisibility(View.GONE);
                payLay.setVisibility(View.GONE);
                sslLay.setVisibility(View.GONE);
                messLay.setVisibility(View.GONE);
                sslPayload.setVisibility(View.VISIBLE);
                edSslpayload.setVisibility(View.VISIBLE);
                payLaySsl.setVisibility(View.VISIBLE);
                sslPayloadLay.setVisibility(View.VISIBLE);
                edUserLayout.setVisibility(View.VISIBLE);
                edPassLayout.setVisibility(View.VISIBLE);
                webuser.setVisibility(View.VISIBLE);
                webpass.setVisibility(View.VISIBLE);
                bugsLayout.setVisibility(View.VISIBLE);
                bugremote.setVisibility(View.VISIBLE);


            }else if(p3 == 4) {



                edPayload.setVisibility(View.GONE);
                edSsl.setVisibility(View.GONE);
                payLay.setVisibility(View.GONE);
                sslLay.setVisibility(View.VISIBLE);
                messLay.setVisibility(View.GONE);
                sslPayload.setVisibility(View.GONE);
                edSslpayload.setVisibility(View.GONE);
                payLaySsl.setVisibility(View.GONE);
                sslPayloadLay.setVisibility(View.GONE);
                edUserLayout.setVisibility(View.GONE);
                edPassLayout.setVisibility(View.GONE);
                webuser.setVisibility(View.GONE);
                webpass.setVisibility(View.GONE);
                bugsLayout.setVisibility(View.GONE);
                bugremote.setVisibility(View.GONE);
            }else if (p3 == 5) {



                bugsLayout.setVisibility(View.GONE);
                bugremote.setVisibility(View.GONE);
                edUserLayout.setVisibility(View.GONE);
                edPassLayout.setVisibility(View.GONE);
                webuser.setVisibility(View.GONE);
                webpass.setVisibility(View.GONE);
                edPayload.setVisibility(View.GONE);
                edSsl.setVisibility(View.GONE);
                payLay.setVisibility(View.GONE);
                sslLay.setVisibility(View.GONE);
                sslPayload.setVisibility(View.GONE);
                edSslpayload.setVisibility(View.GONE);
                payLaySsl.setVisibility(View.GONE);
                sslPayloadLay.setVisibility(View.GONE);
                if (prefs.getBoolean("isMsg", false)) {
                    messLay.setVisibility(View.VISIBLE);
                    tvMess.setText(prefs.getString("Mess",""));
                }
            }
            //   configMessageLay.setVisibility(View.GONE);
        } else {


            setupSpinner.setVisibility(View.GONE);
            payloadSpinner.setVisibility(View.VISIBLE);
            edPayload.setVisibility(View.GONE);
            edSsl.setVisibility(View.GONE);
            payLay.setVisibility(View.GONE);
            sslLay.setVisibility(View.GONE);
            messLay.setVisibility(View.GONE);
            sslPayload.setVisibility(View.GONE);
            edSslpayload.setVisibility(View.GONE);
            payLaySsl.setVisibility(View.GONE);
            sslPayloadLay.setVisibility(View.GONE);
            edUserLayout.setVisibility(View.GONE);
            edPassLayout.setVisibility(View.GONE);
            webuser.setVisibility(View.GONE);
            webpass.setVisibility(View.GONE);
            bugsLayout.setVisibility(View.GONE);
            bugremote.setVisibility(View.GONE);
        }

        if (imgFavorite.isChecked()) {
            if (p3 == 0) {
                prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSH_DIRECT).apply();
                edPayload.setVisibility(View.GONE);
                edSsl.setVisibility(View.GONE);
                payLay.setVisibility(View.GONE);
                sslLay.setVisibility(View.GONE);
                messLay.setVisibility(View.GONE);
                sslPayload.setVisibility(View.GONE);
                edSslpayload.setVisibility(View.GONE);
                payLaySsl.setVisibility(View.GONE);
                sslPayloadLay.setVisibility(View.GONE);
                edUserLayout.setVisibility(View.GONE);
                edPassLayout.setVisibility(View.GONE);
                webuser.setVisibility(View.GONE);
                webpass.setVisibility(View.GONE);
                bugsLayout.setVisibility(View.GONE);
                bugremote.setVisibility(View.GONE);



            } else if (p3 == 1) {
                edPayload.setVisibility(View.VISIBLE);
                edSsl.setVisibility(View.GONE);
                payLay.setVisibility(View.VISIBLE);
                sslLay.setVisibility(View.GONE);
                messLay.setVisibility(View.GONE);
                sslPayload.setVisibility(View.GONE);
                edSslpayload.setVisibility(View.GONE);
                payLaySsl.setVisibility(View.GONE);
                sslPayloadLay.setVisibility(View.GONE);
                edUserLayout.setVisibility(View.GONE);
                edPassLayout.setVisibility(View.GONE);
                webuser.setVisibility(View.GONE);
                webpass.setVisibility(View.GONE);
                bugsLayout.setVisibility(View.GONE);
                bugremote.setVisibility(View.GONE);


            } else if (p3 == 2) {
                edPayload.setVisibility(View.GONE);
                edSsl.setVisibility(View.VISIBLE);
                payLay.setVisibility(View.GONE);
                sslLay.setVisibility(View.VISIBLE);
                messLay.setVisibility(View.GONE);
                sslPayload.setVisibility(View.GONE);
                edSslpayload.setVisibility(View.GONE);
                payLaySsl.setVisibility(View.GONE);
                sslPayloadLay.setVisibility(View.GONE);
                edUserLayout.setVisibility(View.GONE);
                edPassLayout.setVisibility(View.GONE);
                webuser.setVisibility(View.GONE);
                webpass.setVisibility(View.GONE);
                bugsLayout.setVisibility(View.GONE);
                bugremote.setVisibility(View.GONE);


            } else if (p3 == 3) {
                prefs.edit().putInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_PAY_SSL).apply();
                edPayload.setVisibility(View.GONE);
                edSsl.setVisibility(View.GONE);
                payLay.setVisibility(View.GONE);
                sslLay.setVisibility(View.GONE);
                messLay.setVisibility(View.GONE);
                sslPayload.setVisibility(View.VISIBLE);
                edSslpayload.setVisibility(View.VISIBLE);
                payLaySsl.setVisibility(View.VISIBLE);
                sslPayloadLay.setVisibility(View.VISIBLE);
                edUserLayout.setVisibility(View.VISIBLE);
                edPassLayout.setVisibility(View.VISIBLE);
                webuser.setVisibility(View.VISIBLE);
                webpass.setVisibility(View.VISIBLE);
                bugsLayout.setVisibility(View.VISIBLE);
                bugremote.setVisibility(View.VISIBLE);


            }else if(p3 == 4) {



                edPayload.setVisibility(View.GONE);
                edSsl.setVisibility(View.GONE);
                payLay.setVisibility(View.GONE);
                sslLay.setVisibility(View.VISIBLE);
                messLay.setVisibility(View.GONE);
                sslPayload.setVisibility(View.GONE);
                edSslpayload.setVisibility(View.GONE);
                payLaySsl.setVisibility(View.GONE);
                sslPayloadLay.setVisibility(View.GONE);
                edUserLayout.setVisibility(View.GONE);
                edPassLayout.setVisibility(View.GONE);
                webuser.setVisibility(View.GONE);
                webpass.setVisibility(View.GONE);
                bugsLayout.setVisibility(View.GONE);
                bugremote.setVisibility(View.GONE);
            } else if (p3 == 5) {



                bugsLayout.setVisibility(View.GONE);
                bugremote.setVisibility(View.GONE);
                edUserLayout.setVisibility(View.GONE);
                edPassLayout.setVisibility(View.GONE);
                webuser.setVisibility(View.GONE);
                webpass.setVisibility(View.GONE);
                edPayload.setVisibility(View.GONE);
                edSsl.setVisibility(View.GONE);
                payLay.setVisibility(View.GONE);
                sslLay.setVisibility(View.GONE);
                sslPayload.setVisibility(View.GONE);
                edSslpayload.setVisibility(View.GONE);
                payLaySsl.setVisibility(View.GONE);
                sslPayloadLay.setVisibility(View.GONE);
                if (prefs.getBoolean("isMsg", false)) {
                    messLay.setVisibility(View.VISIBLE);
                    tvMess.setText(prefs.getString("Mess",""));
                }
            }
        }

        retryButton = findViewById(R.id.retry_button);
        retryButton.setOnClickListener(view -> {
            //inters
            startGames();
            IntersLoad();
            showsInterstitial();

            //Reward Ads
            loadRewardedAd();
            startGame();
            Toast.makeText(MainActivity.this,"Requesting Ad Please wait...", Toast.LENGTH_SHORT).show();
        });
    }

    void isRunning(boolean z) {
        if (z) {
            payloadSpinner.setEnabled(false);
            serverSpinner.setEnabled(false);
            setupSpinner.setEnabled(false);
            imgFavorite.setEnabled(false);
            edPayload.setEnabled(false);
            edSsl.setEnabled(false);
            sslPayload.setEnabled(false);
            edSslpayload.setEnabled(false);
            webuser.setEnabled(false);
            webpass.setEnabled(false);
            bugremote.setEnabled(false);
        } else {
            payloadSpinner.setEnabled(true);
            serverSpinner.setEnabled(true);
            setupSpinner.setEnabled(true);
            imgFavorite.setEnabled(true);
            edPayload.setEnabled(true);
            edSsl.setEnabled(true);
            sslPayload.setEnabled(true);
            edSslpayload.setEnabled(true);
            webuser.setEnabled(true);
            webpass.setEnabled(true);
            bugremote.setEnabled(true);
            }
	}

    private void liveData(){
        new Timer().schedule(new TimerTask(){
                @RequiresApi(api = Build.VERSION_CODES.N)
                @Override
                public void run(){
                    mHandler.post(() -> {
                        getData();
                    });
                }
            }, 0,1000);
    }

	@RequiresApi(api = Build.VERSION_CODES.N)
	public void getData() {
        boolean isRunning = SkStatus.isTunnelActive();
        long mUpload, mDownload, saved_Send ,saved_Down/*,up, down*/;
        String saved_date, tDate;
        List<Long> allData;
        allData = RetrieveData.findData();
        mDownload = allData.get(0);
        mUpload = allData.get(1);
        StoredData.storedData(mDownload, mUpload);
        Calendar ca = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
        tDate = sdf.format(ca.getTime());
        saved_date = myData.getString("today_date", "empty");
        SharedPreferences.Editor editor = myData.edit();
        if (saved_date.equals(tDate)) {
            saved_Send = myData.getLong("UP_DATA", 0);
            saved_Down = myData.getLong("DOWN_DATA", 0);
            editor.putLong("UP_DATA", mUpload + saved_Send);
            editor.putLong("DOWN_DATA", mDownload + saved_Down);
            editor.apply();
        } else {
            editor.clear();
            editor.putString("today_date", tDate);
            editor.apply();
        }
        if(isRunning){
            bytes_out_view.setText(render_bandwidth(myData.getLong("UP_DATA", 0)));
            bytes_in_view.setText(render_bandwidth(myData.getLong("DOWN_DATA", 0)));
        }else{
            myData.edit().putLong("UP_DATA", 0).apply();
            myData.edit().putLong("DOWN_DATA", 0).apply();
        }
        StatisticGraphData.DataTransferStats stats = StatisticGraphData.getStatisticData().getDataTransferStats();
        String duration = stats.isConnected() ? stats.elapsedTimeToDisplay(stats.getElapsedTime()) : "00h:00m:00s";

    }
    
    private String render_bandwidth(double bw) {
        String postfix;
        float div;
        Object[] objArr;
        float bwf = (float) bw;
        if (bwf >= 1.0E12f) {
            postfix = "TB";
            div = 1.0995116E12f;
        } else if (bwf >= 1.0E9f) {
            postfix = "GB";
            div = 1.0737418E9f;
        } else if (bwf >= 1000000.0f) {
            postfix = "MB";
            div = 1048576.0f;
        } else if (bwf >= 1000.0f) {
            postfix = "KB";
            div = 1024.0f;
        } else {
            objArr = new Object[S_BIND_CALLED];
            objArr[0] = Float.valueOf(bwf);
            return String.format("%.0f", objArr);
        }
        objArr = new Object[S_ONSTART_CALLED];
        objArr[0] = Float.valueOf(bwf / div);
        objArr[S_BIND_CALLED] = postfix;
        return String.format("%.2f %s", objArr);
    }

    private void iphunt () {
        View inflate = LayoutInflater.from(this).inflate(R.layout.notifs, null);
        AlertDialog.Builder builer = new AlertDialog.Builder(this);
        builer.setView(inflate);
        TextView title = inflate.findViewById(R.id.notiftext1);
        final TextView ms = inflate.findViewById(R.id.confimsg);
        final Button ok = inflate.findViewById(R.id.appButton1);
        TextView cancel = inflate.findViewById(R.id.appButton2);
        title.setText("GTM IP Hunter");
        ms.setText("To connect to GTM No Load No Blocking, Make sure that you are now in the Magic IP. Click the button to check your IP!");
        ok.setText("Check Now");
        cancel.setText("Close");
        final AlertDialog alert = builer.create();
        alert.setCanceledOnTouchOutside(false);
        alert.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alert.getWindow().setGravity(Gravity.CENTER);
        alert.show();
        ok.setOnClickListener(p1 -> {
            ms.setText("Please wait while we are checking your IP...");
            ok.setEnabled(false);
            ok.setText("Checking...");
            new Handler().postDelayed(() -> {
                try {
                    int l = 0;
                    URL whatismyip = new URL(MainActivity.ll);
                    String magic = "✅ Congrats!! You are now connected to MAGIC IP.";
                    String fail = "🚫 Disconnected. Please Airplane Mode On/Off and Try Again.";
                    try{
                        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(MainActivity.ill, 80));
                        HttpURLConnection connection = (HttpURLConnection) whatismyip.openConnection(proxy);
                        connection.setRequestMethod("GET");
                        connection.connect();
                        connection.getContentLength();
                        connection.setConnectTimeout(3000);
                        InputStream in = connection.getInputStream();
                        byte[] buffer = new byte[4096];
                        int countBytesRead;
                        while((countBytesRead = in.read(buffer)) != -1) {
                            l += countBytesRead;
                        }
                        in.markSupported();
                        if (l == 333){
                            ms.setText(magic);
                            ok.setText("Check Again");
                            ok.setEnabled(true);
                            return;
                        }
                        if (connection.getResponseCode() == 200){
                            ms.setText(magic);
                            ok.setText("Check Again");
                            ok.setEnabled(true);
                            return;
                        }
                        in.close();
                        ms.setText(fail);
                        ok.setText("Check Again");
                        ok.setEnabled(true);
                    } catch (IOException e) {
                        ok.setText("Check Again");
                        ok.setEnabled(true);
                        ms.setText(fail);
                    }

                }catch (MalformedURLException e) {}}, 1000);

        });

        cancel.setOnClickListener(p1 -> alert.dismiss());
        alert.show();

    }
   
    private void setPayloadSwitch(int tunnelType, boolean isCustomPayload) {
        SharedPreferences prefs = mConfig.getPrefsPrivate();

        boolean isRunning = SkStatus.isTunnelActive();

        customPayloadSwitch.setChecked(isCustomPayload);

        if (prefs.getBoolean(Settings.CONFIG_PROTEGER_KEY, false)) {
            payloadEdit.setEnabled(false);

            if (mConfig.getPrivString(Settings.CUSTOM_PAYLOAD_KEY).isEmpty()) {
                customPayloadSwitch.setEnabled(false);
            }
            else {
                customPayloadSwitch.setEnabled(!isRunning);
            }

            if (!isCustomPayload && tunnelType == Settings.bTUNNEL_TYPE_SSH_PROXY)
                payloadEdit.setText(Settings.PAYLOAD_DEFAULT);
            else
                payloadEdit.setText("*******");
        }
        else {
            customPayloadSwitch.setEnabled(!isRunning);

            if (isCustomPayload) {
                payloadEdit.setText(mConfig.getPrivString(Settings.CUSTOM_PAYLOAD_KEY));
                payloadEdit.setEnabled(!isRunning);
            }
            else if (tunnelType == Settings.bTUNNEL_TYPE_SSH_PROXY) {
                payloadEdit.setText(Settings.PAYLOAD_DEFAULT);
                payloadEdit.setEnabled(true);
            }
        }

        if (isCustomPayload || tunnelType == Settings.bTUNNEL_TYPE_SSH_PROXY) {
            payloadLayout.setVisibility(View.VISIBLE);
        }
        else {
            payloadLayout.setVisibility(View.GONE);
        }
	}
	
	
	private void doUpdateLayout() {
        
		configversion.setText(""+config.getVersion());
	    
        SharedPreferences mPref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences prefs = mConfig.getPrefsPrivate();

        boolean isRunning = SkStatus.isTunnelActive();
        int tunnelType = prefs.getInt(Settings.TUNNELTYPE_KEY, Settings.bTUNNEL_TYPE_SSH_DIRECT);
        isRunning(isRunning);
        setStarterButton(starterButton, this);
        setPayloadSwitch(tunnelType, !prefs.getBoolean(Settings.PROXY_USAR_DEFAULT_PAYLOAD, true));
        isRunning(isRunning);
        String proxyStr = getText(R.string.no_value).toString();

        if (prefs.getBoolean(Settings.CONFIG_PROTEGER_KEY, false)) {
            proxyStr = "*******";
            proxyInputLayout.setEnabled(false);
        }
        else {
            String proxy = mConfig.getPrivString(Settings.PROXY_IP_KEY);

            if (proxy != null && !proxy.isEmpty())
                proxyStr = String.format("%s:%s", proxy, mConfig.getPrivString(Settings.PROXY_PORTA_KEY));
            proxyInputLayout.setEnabled(!isRunning);
        } 

        proxyText.setText(proxyStr);

        setPayloadSwitch(tunnelType, !prefs.getBoolean(Settings.PROXY_USAR_DEFAULT_PAYLOAD, true));

        switch (tunnelType) {
            case Settings.bTUNNEL_TYPE_SSH_DIRECT:
                customPayloadSwitch.setChecked(true);
                break;

            case Settings.bTUNNEL_TYPE_SSH_PROXY:
                customPayloadSwitch.setChecked(true);
                break;
                
            case Settings.bTUNNEL_TYPE_SSH_SSLTUNNEL:
                customPayloadSwitch.setChecked(false);
                break;

            case Settings.bTUNNEL_TYPE_PAY_SSL:
                customPayloadSwitch.setChecked(true);
                break;
            case Settings.bTUNNEL_TYPE_SSL_RP:
                customPayloadSwitch.setChecked(true);
                break;
            case Settings.bTUNNEL_TYPE_SLOWDNS:
                customPayloadSwitch.setChecked(false);
                break;
		}
	
    
    int msgVisibility = View.GONE;
    int loginVisibility = View.GONE;
    String msgText = "";
    boolean enabled_radio = !isRunning;

    if (prefs.getBoolean(Settings.CONFIG_PROTEGER_KEY, false)) {

        if (prefs.getBoolean(Settings.CONFIG_INPUT_PASSWORD_KEY, false)) {
            loginVisibility = View.VISIBLE;

        }

        String msg = mConfig.getPrivString(Settings.CONFIG_MENSAGEM_KEY);
        if (!msg.isEmpty()) {
            msgText = msg.replace("\n", "<br/>");
            msgVisibility = View.VISIBLE;
        }

        if (mConfig.getPrivString(Settings.PROXY_IP_KEY).isEmpty() ||
            mConfig.getPrivString(Settings.PROXY_PORTA_KEY).isEmpty()) {
            enabled_radio = false;
        }
    }

    loginLayout.setVisibility(loginVisibility);
    configMsgText.setText(msgText.isEmpty() ? "" : Html.fromHtml(msgText));
    configMsgLayout.setVisibility(msgVisibility);

    for (int i = 0; i < metodoConexaoRadio.getChildCount(); i++) {
        metodoConexaoRadio.getChildAt(i).setEnabled(enabled_radio);
    }
}
    
		
	private void updateConfig(final boolean isOnCreate) {
		new ConfigUpdate(this, result -> {
            try {
                if (!result.contains("Error on getting data")) {
                    String json_data = AESCrypt.decrypt(ConfigUtil.abcdefghijklmnopqrstuvwxyz, result);
                    if (isNewVersion(json_data)) {
                        newUpdateDialog(result);
                    } else {
                        if (!isOnCreate) {
                            noUpdateDialog();
                        }
                    }
                } else if(result.contains("Error on getting data") && !isOnCreate){
                    errorUpdateDialog(result);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start(isOnCreate);
	}

	private boolean isNewVersion(String result) {
		try {
			String current = config.getVersion();
			String update = new JSONObject(result).getString("Version");
			return config.versionCompare(update, current);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return false;
	}

	private void newUpdateDialog(final String result) throws JSONException, GeneralSecurityException {
        String json = AESCrypt.decrypt(ConfigUtil.abcdefghijklmnopqrstuvwxyz, result);
        String releasenotes = new JSONObject(json).getString("ReleaseNotes");
		View inflate = LayoutInflater.from(this).inflate(R.layout.notif, null);
		AlertDialog.Builder builer = new AlertDialog.Builder(this); 
		builer.setView(inflate);
		TextView title = inflate.findViewById(R.id.notiftext1);
		TextView ms = inflate.findViewById(R.id.confimsg);
		Button ok = inflate.findViewById(R.id.appButton1);
		TextView cancel = inflate.findViewById(R.id.appButton2);
		title.setText("Notification");
		ms.setText(releasenotes);
		ok.setText("Apply Now");
		cancel.setText("Dismiss");
		final AlertDialog alert = builer.create(); 
		alert.setCanceledOnTouchOutside(false);
		alert.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		alert.getWindow().setGravity(Gravity.CENTER); 
		alert.show();
		ok.setOnClickListener(p1 -> {
            try {
                alert.dismiss();
                File file = new File(getFilesDir(), "Config.json");
                OutputStream out = new FileOutputStream(file);
                out.write(result.getBytes());
                out.flush();
                out.close();
                Utils.restart_app(MainActivity.this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
		cancel.setOnClickListener(p1 -> alert.dismiss());
		alert.show();
	}

	private void noUpdateDialog() {
		View inflate = LayoutInflater.from(this).inflate(R.layout.notif, null);
		AlertDialog.Builder builer = new AlertDialog.Builder(this); 
		builer.setView(inflate); 
		overridePendingTransition(R.anim.grow, R.anim.shrink);
		TextView title = inflate.findViewById(R.id.notiftext1);
		TextView ms = inflate.findViewById(R.id.confimsg);
		Button ok = inflate.findViewById(R.id.appButton1);
		TextView cancel = inflate.findViewById(R.id.appButton2);
		title.setText("No Update Available");
		ms.setText("Please try again soon.");
		ok.setText("Hide");
		cancel.setText(".");
		cancel.setVisibility(View.GONE);
		final AlertDialog alert = builer.create(); 
		alert.setCanceledOnTouchOutside(false);
		alert.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		alert.getWindow().setGravity(Gravity.CENTER); 
		ok.setOnClickListener(p1 -> alert.dismiss());
		cancel.setOnClickListener(p1 -> alert.dismiss());
		alert.show();
	}

	private void errorUpdateDialog(String error) {
		View inflate = LayoutInflater.from(this).inflate(R.layout.notif, null);
		AlertDialog.Builder builer = new AlertDialog.Builder(this); 
		builer.setView(inflate);
		TextView title = inflate.findViewById(R.id.notiftext1);
		TextView ms = inflate.findViewById(R.id.confimsg);
		Button ok = inflate.findViewById(R.id.appButton1);
		TextView cancel = inflate.findViewById(R.id.appButton2);
		title.setText("Notification");
		ms.setText("Update Error: " + error);
		ok.setText("OK");
		cancel.setText("");
		cancel.setVisibility(View.GONE);
		final AlertDialog alert = builer.create(); 
		alert.setCanceledOnTouchOutside(false);
		alert.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		alert.getWindow().setGravity(Gravity.CENTER); 
		alert.show();
		ok.setOnClickListener(p1 -> alert.dismiss());
		cancel.setOnClickListener(p1 -> alert.dismiss());
		alert.show();
	}

    public void startOrStopTunnel(Activity activity) {
        if (SkStatus.isTunnelActive()) {
            TunnelManagerHelper.stopSocksHttp(activity);
        }
        else {
            Settings config = new Settings(activity);
            Intent intent = new Intent(activity, LaunchVpn.class);
            intent.setAction(Intent.ACTION_MAIN);
            if (config.getHideLog()) {
                intent.putExtra(LaunchVpn.EXTRA_HIDELOG, true);
            }
            activity.startActivity(intent);
        }
    }

    public void setStarterButton(Button starterButton, Activity activity) {
		String state = SkStatus.getLastState();
		boolean isRunning = SkStatus.isTunnelActive();

		if (starterButton != null) {
			int resId;

			SharedPreferences prefsPrivate = new Settings(activity).getPrefsPrivate();

			if (ConfigParser.isValidadeExpirou(prefsPrivate
											   .getLong(Settings.CONFIG_VALIDADE_KEY, 0))) {
				resId = R.string.expired;
				starterButton.setEnabled(false);

				if (isRunning) {
					startOrStopTunnel(activity);
				}
			}

			else if (SkStatus.SSH_INICIANDO.equals(state)) {
				resId = R.string.stop;
				starterButton.setEnabled(false);
			}
			else if (SkStatus.SSH_PARANDO.equals(state)) {
				resId = R.string.state_stopping;
				starterButton.setEnabled(false);
			}
			else {
				resId = isRunning ? R.string.stop : R.string.start;
				starterButton.setEnabled(true);
			}
			starterButton.setText(resId);
		}
	}
	

	@Override
	public void onClick(View p1) {
        if (p1.getId() == R.id.activity_starterButtonMain) {
            dosavedata();
            saveSpinner();
            loadServerData();
            startOrStopTunnel(this);

			/*case R.id.btnAddTime:
				if(mConnected) {
					showRewardTime();
					return;
				} else {
					Toast.makeText(MainActivity.this, "Connect VPN First!", Toast.LENGTH_SHORT).show();
				}
				Toast.makeText(MainActivity.this, "This Not Available For Now!", Toast.LENGTH_SHORT).show();
				break;*/
        }
	}
	
	public void showRewardTime(){

		MaterialAlertDialogBuilder dialog = new MaterialAlertDialogBuilder(this);
			dialog.setTitle("More Time?")
			.setMessage("Add more time to make your connection stable.")
			.setPositiveButton("Add More", (dia, which) -> {
                watcher();
                dia.dismiss();
            })
			.setNegativeButton("Later", (dialog1, id) -> dialog1.cancel())
			.create();
		dialog.show();

	}

    @RequiresApi(api = Build.VERSION_CODES.R)
	@Override
    public void updateState(final String state, String msg, int localizedResId, final ConnectionStatus level, Intent intent) {
        mHandler.post(() -> {
            doUpdateLayout();
            if(SkStatus.isTunnelActive()){
                if(level.equals(ConnectionStatus.LEVEL_CONNECTED)) {

                    if(dontme.isDeviceRooted()){
                        Intent intent1 = getIntent();
                        finish();
                        startActivity(intent1);
                    }

                    MobileAds.initialize(this, initializationStatus -> { });
                    adContainerView = findViewById(R.id.chad);
                    mAdView = new AdView(this);
                    adContainerView.addView(mAdView);
                    adContainerView.getViewTreeObserver().addOnGlobalLayoutListener(() -> {
                        if (!initialLayoutComplete) {
                            initialLayoutComplete = true;

                            //Banner
                            setBanner();

                            //Inters
                            startGames();
                            IntersLoad();

                            //Reward Ads
                            loadRewardedAd();
                        }
                    });

                    start();
                    connectionStatus.setText(R.string.connected);
                  //  MDToast mdToast = MDToast.makeText(MainActivity.this,"Connected",MDToast.LENGTH_SHORT,MDToast.TYPE_SUCCESS);mdToast.show();
                }
                if (level.equals(ConnectionStatus.LEVEL_NOTCONNECTED)){
                    stop();
                }

                if (level.equals(ConnectionStatus.LEVEL_CONNECTING_SERVER_REPLIED)){
                    connectionStatus.setText(R.string.connecting);
                }

                if (level.equals(ConnectionStatus.LEVEL_CONNECTING_NO_SERVER_REPLY_YET)){
                }
                if (level.equals(ConnectionStatus.LEVEL_AUTH_FAILED)){
                }
                if (level.equals(ConnectionStatus.UNKNOWN_LEVEL)){
                    stop();
                    connectionStatus.setText(R.string.disconnected);
                //  MDToast mdToast = MDToast.makeText(MainActivity.this,"Disconnected",MDToast.LENGTH_SHORT,MDToast.TYPE_ERROR);mdToast.show();
                }
                if (level.equals(ConnectionStatus.LEVEL_NONETWORK)){
                }

            }
        });

		switch (state) {
			case SkStatus.SSH_CONECTADO:

				break;
		}
	}

	private final BroadcastReceiver mActivityReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null)
                return;

            if (action.equals(UPDATE_VIEWS) && !isFinishing()) {
				doUpdateLayout();
			}
        }
    };


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.miExit:
				Intent status = new Intent(this, ServerStatusActivity.class);
		        startActivity(status);
				break;
		}

		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onBackPressed() {

		DrawerLayout drawer = findViewById(R.id.drawer);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            showExitDialog();
        }
	}

	private void setSpinner() {
        SecurePreferences prefsPrivate = mConfig.getPrefsPrivate();
        serverSpinner.setSelection(prefsPrivate.getInt("LastSelectedServer", 0));
        payloadSpinner.setSelection(prefsPrivate.getInt("LastSelectedPayload", 0));
	}

    private void saveSpinner() {
        edit = mConfig.getPrefsPrivate().edit();
        int selectedItemPosition = this.serverSpinner.getSelectedItemPosition();
        int selectedItemPosition2 = this.payloadSpinner.getSelectedItemPosition();
        putInt = edit.putInt("LastSelectedServer", selectedItemPosition);
        putInt = edit.putInt("LastSelectedPayload", selectedItemPosition2);
        edit.apply();
		}
	

	@Override
    public void onResume() {
        startGames();
        onResumeBanner();
        if (!gameOver && gamePaused) {
            resumeGame();
        }
        super.onResume();

        imgFavorite.setChecked(prefs.getBoolean("SavedSetup", false));
        setupSpinner.setSelection(prefs.getInt("SavedPos",0));
        if (imgFavorite.isChecked()) {
            int i = setupSpinner.getSelectedItemPosition();
            if (i == 5) {
                if (prefs.getBoolean("isMsg", false)) {
                    messLay.setVisibility(View.VISIBLE);
                    tvMess.setText(prefs.getString("Mess", ""));
                }
            }
        }
        saveSpinner();
        setSpinner();
        //loadRewardedAd2();
        if (!mTimerEnabled) {
            resumeTime();
        }


        mAppUpdateManager.getAppUpdateInfo().addOnSuccessListener(result -> {
            if(result.updateAvailability() == UpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS) {
                try {
                    mAppUpdateManager.startUpdateFlowForResult(result, AppUpdateType.IMMEDIATE, MainActivity.this, RC_APP_UPDATE);

                } catch (IntentSender.SendIntentException ignored) {}}
        });

        SkStatus.addStateListener(this);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> {
                    //updateHeaderCallback();
                    // TODO: Implement this method
                });
                // TODO: Implement this method
            }
        }, 0,1000);

    }

	@Override
	protected void onPause() {
		super.onPause();
		dosavedata();
        onPauseBanner();
        pauseGame();
		SkStatus.removeStateListener(this);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
        onDestroyBanner();
		LocalBroadcastManager.getInstance(this).unregisterReceiver(mActivityReceiver);
	}

	public static void updateMainViews(Context context) {
		Intent updateView = new Intent(UPDATE_VIEWS);
		LocalBroadcastManager.getInstance(context).sendBroadcast(updateView);
	}

	private void showExitDialog() {
		MaterialAlertDialogBuilder alertDialogBuilder = new MaterialAlertDialogBuilder(this);
		alertDialogBuilder.setMessage("Are you sure you want to exit?");
		alertDialogBuilder.setNegativeButton("Minimize", (arg0, arg1) -> {
            Intent startMain = new Intent(Intent.ACTION_MAIN);
            startMain.addCategory(Intent.CATEGORY_HOME);
            startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(startMain);
        });
		alertDialogBuilder.setPositiveButton("Exit", (arg0, arg1) -> {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(0);
            if (TunnelUtils.isActiveVpn(MainActivity.this)) {
                Utils.exitAll(MainActivity.this);
            }
        });
		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();
	}

	private void start(){
		if (saved_ads_time == 0){
			long millisInput = 1800 * 1000;
			setTime(millisInput);
		}
		if (!mTimerRunning){
			startTimer();
		}
    }


    private void stop() {
        if (mTimerRunning) {
            pauseTimer();
        }

    }

    private void pauseTimer() {
		mCountDownTimer.cancel();
		mTimerRunning = false;
		mConnected = false;
	}

    private void updateCountDownText() {
        long toDays = TimeUnit.MILLISECONDS.toDays(mTimeLeftInMillis);
        long toMillis = TimeUnit.DAYS.toMillis(toDays);
        long toHours = TimeUnit.MILLISECONDS.toHours(mTimeLeftInMillis - toMillis);
        long toMillis2 = TimeUnit.HOURS.toMillis(toHours);
        long toMinutes = TimeUnit.MILLISECONDS.toMinutes((mTimeLeftInMillis - toMillis) - toMillis2);
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(((mTimeLeftInMillis - toMillis) - toMillis2) - TimeUnit.MINUTES.toMillis(toMinutes));
        String timeLeftFormatted;
        if (toDays > 0) {
            timeLeftFormatted = String.format(Locale.getDefault(),
                                              "%02d:%02d:%02d:%02d", toDays, toHours, toMinutes, toSeconds);
        }else{
            timeLeftFormatted = String.format(Locale.getDefault(), 
											  "%02d:%02d:%02d:%02d", toDays, toHours, toMinutes, toSeconds);            
        }
        mTextViewCountDown.setText(timeLeftFormatted);
    }


    private void addTime(long time){
        setTime(time);
        if (mTimerRunning){
            pauseTimer();
        }
        startTimer();
    }


	private void setTime(long milliseconds) {
		saved_ads_time = mTimeLeftInMillis + milliseconds;
		mTimeLeftInMillis = saved_ads_time;
		updateCountDownText();

	}

	private void saveTime(){
		SharedPreferences saved_current_time = getSharedPreferences("time", Context.MODE_PRIVATE);
		SharedPreferences.Editor time_edit = saved_current_time.edit();
		time_edit.putLong("SAVED_TIME", mTimeLeftInMillis);
		time_edit.apply();
	}

	private void resumeTime(){
		SharedPreferences time = getSharedPreferences("time", Context.MODE_PRIVATE);
        long saved_time = time.getLong("SAVED_TIME", 0);
		setTime(saved_time);
		// Use this code to continue time if app close accidentally while connected
		String state = SkStatus.getLastState();
	    if (SkStatus.SSH_CONECTADO.equals(state)) {
			if (!mTimerRunning){
				startTimer();
			}
		}
		mTimerEnabled = true;
	}

    /*private void btnTimer() {

		mBtnCountDown = new CountDownTimer(20000, 1000) {

			@Override
			public void onTick(long millisUntilFinished) {
				mTimeLeftBtn = millisUntilFinished;
				mButtonSet.setEnabled(false);
				updateBtnText();
			}
			@Override
			public void onFinish() {
				mButtonSet.setEnabled(true);
				mButtonSet.setText("ADD TIME");
			}

		}.start();

	}*/

	/*private void updateBtnText() {
		int seconds = (int) (mTimeLeftBtn / 1000) % 60;
		String timeLeftFormatted;
		if (seconds > 0) {
			timeLeftFormatted = String.format(Locale.getDefault(),
											  "%02d", seconds);

			mButtonSet.setText("Refresh in " + timeLeftFormatted);

		}
	}*/

    private void startTimer() {
		mEndTime = System.currentTimeMillis() + mTimeLeftInMillis;
		mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {


			@Override
			public void onTick(long millisUntilFinished) {
				mTimeLeftInMillis = millisUntilFinished;
				saveTime();
				updateCountDownText();

			}
			@Override
			public void onFinish() {
				mTimerRunning = false;
				pauseTimer();
				saved_ads_time = 0;
				Intent stopVPN = new Intent(SocksHttpService.TUNNEL_SSH_STOP_SERVICE);
				LocalBroadcastManager.getInstance(MainActivity.this)
					.sendBroadcast(stopVPN);
				showRewardTime2();
				MainActivity.toast(getApplicationContext(), R.color.red, "Time expired! Click Add + Time to renew access!");
			}

		}.start();
		mTimerRunning = true;

		mConnected = true;
	}

	public void showRewardTime2(){

		AlertDialog dialog = new AlertDialog.Builder(this)
			.setTitle("More Time?")
			.setMessage("Your time is expiring soon, please click ADD TIME to renew access!")
			.setPositiveButton("Add More", new DialogInterface.OnClickListener() {

				@Override
				public void onClick(DialogInterface dia, int which) {
					watcher();

					dia.dismiss();
				}
			})
			.setNegativeButton("Later", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                }
            })
			.create();
		dialog.show();

	}

	private void watcher () {
		ppd = new ProgressDialog(MainActivity.this);
		ppd.setIcon(R.drawable.timer);
		ppd.setTitle("Watch Video - FREE");
		ppd.setMessage("Loading video please wait...");
		ppd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		ppd.setCanceledOnTouchOutside(false);
		cancelProgressBar = true;
		ppd.show();

	}

	public static void toast(Context contxt, int color, String string){
		LayoutInflater inflater = (LayoutInflater) contxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View inflate = inflater.inflate(R.layout.toast, null);
        LinearLayout ll1 = new LinearLayout(contxt);
		Toast llIl = Toast.makeText(contxt,Html.fromHtml(""),Toast.LENGTH_LONG);
		final TextView text1 = inflate.findViewById(R.id.textqt);
		final ImageView img = inflate.findViewById(R.id.img);
        final RelativeLayout toastlayout = inflate.findViewById(R.id.toastlayout);
		GradientDrawable var1 = new GradientDrawable();
		final Animation e = AnimationUtils.loadAnimation(contxt,R.anim.grow);
		var1.setColor(contxt.getResources().getColor(color));
		if (color == R.color.red){
			img.setBackgroundResource(R.drawable.err1);

		} else if (color == R.color.colorPrimary){
			img.setBackgroundResource(R.drawable.err);

		} else if (color == R.color.green){
			img.setBackgroundResource(R.drawable.cnt);

		} else {
			img.setBackgroundResource(R.drawable.err);

		}
        var1.setCornerRadius((float)50);
        var1.setOrientation(Orientation.RIGHT_LEFT);
        var1.setStroke(0, Color.parseColor("#ffffff"));
		text1.setText(Html.fromHtml(string));
        ll1.setBackgroundDrawable(var1);
        ll1.addView(inflate);
		toastlayout.setAnimation(e);
		llIl.setView(ll1);
		llIl.show();

	}

	private void onShowe(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View inflate = inflater.inflate(R.layout.update_dialog, null);
        final MaterialAlertDialogBuilder builer = new MaterialAlertDialogBuilder(this ,R.style.MaterialAlertDialogText); 
        builer.setView(inflate); 
        TextView title = inflate.findViewById(R.id.notiftext1);
        TextView ms = inflate.findViewById(R.id.confimsg);

        title.setText("Messenger Group.");
        ms.setText(Html.fromHtml("</strong> " + "For More Update Kindly Join In Our Group Chat."));

        builer.setPositiveButton("Click Me", (p1, p2) -> {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://m.me/j/Abbj90AD2-JJJIMr/")));
                builer.create().dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        builer.setNeutralButton("Cancel", (p1, p2) -> builer.create().dismiss());
        builer.create().show();
    }


    //Ads Setup Start Here
    private void onResumeBanner() {
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    private void onDestroyBanner() {
        if (mAdView != null) {
            mAdView.destroy();
        }
    }

    private void onPauseBanner() {
        if (mAdView != null) {
            mAdView.pause();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.R)
    public void setBanner() {
        mAdView.setAdUnitId(e.banner);
        AdSize adSize = getAdSize();
        mAdView.setAdSize(adSize);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    @RequiresApi(api = Build.VERSION_CODES.R)
    private AdSize getAdSize() {
        WindowMetrics windowMetrics = getWindowManager().getCurrentWindowMetrics();
        Rect bounds = windowMetrics.getBounds();
        float adWidthPixels = adContainerView.getWidth();

        if (adWidthPixels == 0f) {
            adWidthPixels = bounds.width();
        }
        float density = getResources().getDisplayMetrics().density;
        int adWidth = (int) (adWidthPixels / density);
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, adWidth);
    }

    //Interstitial
    private void showsInterstitial() {
        if (interstitialAds != null) {
            interstitialAds.show(this);
        } else {
            startGames();
        }
    }

    private void startGames() {
        if (interstitialAds == null) {
            IntersLoad();
        }
    }

    public void IntersLoad() {
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,e.inters,adRequest,new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                MainActivity.this.interstitialAds = interstitialAd;
                interstitialAds.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        MainActivity.this.interstitialAds = null;
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                        MainActivity.this.interstitialAds = null;
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {}
                });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                interstitialAds = null;
            }
        });
    }

    /** Rewarded Setup */
    private void startGame() {
        if (rewardedAd != null && !isLoading) {
            loadRewardedAd();
        }
        createTimer();
        gamePaused = false;
        gameOver = false;
    }

    private void pauseGame() {
        gamePaused = true;
    }

    private void resumeGame() {
        //createTimer();
        gamePaused = false;
    }

    private void createTimer() {
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        countDownTimer = new CountDownTimer(MainActivity.COUNTER_TIME * 1000, 50) {
            @Override
            public void onTick(long millisUnitFinished) {
                timeRemaining = ((millisUnitFinished / 1000) + 1);
                retryButton.setText("Requesting  "  + timeRemaining);
            }

            @Override
            public void onFinish() {
                if (rewardedAd != null) {
                    reward();
                }
                retryButton.setText("Request Ads");
                gameOver = true;
            }
        };
        countDownTimer.start();
    }

    private  void reward(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View inflate = inflater.inflate(R.layout.request_view_ads, null);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setView(inflate);

        alert = builder.create();
        alert.setCanceledOnTouchOutside(true);
        alert.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alert.getWindow().setGravity(Gravity.CENTER);
        alert.getWindow().getAttributes().windowAnimations = R.style.dialogs;
        alert.show();

        TextView message = inflate.findViewById(R.id.message);
        TextView title = inflate.findViewById(R.id.title);

        Button confirm = inflate.findViewById(R.id.confirmMovie);
        Button cancel = inflate.findViewById(R.id.cancelMovie);

        confirm.setText("WATCH");
        cancel.setText("CANCEL");

        title.setText("REWARDED VIDEO IS AVAILABLE");
        message.setText("watch ads to earn more coins");

        confirm.setOnClickListener(v -> {
            showRewardedVideo();
        });

        cancel.setOnClickListener(v -> alert.dismiss());
    }

    private void loadRewardedAd() {
        if (rewardedAd == null) {
            isLoading = true;
            AdRequest adRequest = new AdRequest.Builder().build();
            RewardedAd.load(this, e.rewarded, adRequest, new RewardedAdLoadCallback() {
                @Override
                public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                    rewardedAd = null;
                    MainActivity.this.isLoading = false;
                }

                @Override
                public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                    MainActivity.this.rewardedAd = rewardedAd;
                    MainActivity.this.isLoading = false;
                }
            });
        }
    }

    private void showRewardedVideo() {
        if (rewardedAd == null) {
            Toast.makeText(MainActivity.this,"The rewarded ad wasn't ready yet", Toast.LENGTH_LONG).show();
            return;
        }
        rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
            @Override
            public void onAdShowedFullScreenContent() {
                alert.dismiss();
            }

            @Override
            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                alert.dismiss();
                rewardedAd = null;
            }

            @Override
            public void onAdDismissedFullScreenContent() {
                rewardedAd = null;
                MainActivity.this.loadRewardedAd();
            }
        });
        Activity activityContext = MainActivity.this;
        rewardedAd.show(activityContext, rewardItem -> {
            addTime(Long.valueOf(2*3600*1000));
            Toast.makeText(MainActivity.this, "+2h successfully added", Toast.LENGTH_SHORT).show();
        });
    }

}



























