package com.chaddevz.micro.activities;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.chaddevz.micro.R;
import java.util.Objects;

public class AboutActivity extends BaseActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);

		Toolbar mToolbar = findViewById(R.id.toolbar_main);
		setSupportActionBar(mToolbar);
		Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
		}

	@Override
	public boolean onSupportNavigateUp() {
		onBackPressed();
		return true;
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

}

