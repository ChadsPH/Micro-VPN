package com.chaddevz.micro;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.chaddevz.micro.error.e;

import android.os.Handler;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.os.Looper;
import io.michaelrocks.paranoid.Obfuscate;

@Obfuscate
public class LauncherActivity extends AppCompatActivity {
	
	private static final String TAG = LauncherActivity.class.getSimpleName();
	private static final String SPOOF_PERMISSION_NAME = "android.permission.FAKE_PACKAGE_SIGNATURE";
    private static final int SPOOF_PERMISSION_REQUEST_CODE = 1;
	


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(){

				@Override
				public void run() {
					Intent intent = new Intent(LauncherActivity.this, MainActivity.class);
					intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
					startActivity(intent);
					finish();
					e();
				}
			}, 1000);
    }


	public static void e () {
		FirebaseDatabase database = FirebaseDatabase.getInstance();
		DatabaseReference reference = database.getReference("Chad");
		reference.addValueEventListener(new ValueEventListener() {
			@Override
			public void onDataChange(@NonNull DataSnapshot snapshot) {

				String banner = snapshot.child("banner").getValue(String.class);
				String inters = snapshot.child("inters").getValue(String.class);
				String rewarded = snapshot.child("rewarded").getValue(String.class);

				e.banner = banner;
				e.inters = inters;
				e.rewarded = rewarded;
			}

			@Override
			public void onCancelled(@NonNull DatabaseError error) {

			}
		});

	}

}




