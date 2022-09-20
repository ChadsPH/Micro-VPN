package com.chaddevz.micro;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;;
import java.util.Objects;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.chaddevz.micro.activities.BaseActivity;
import com.chaddevz.micro.util.ConfigUtil;
import androidx.appcompat.widget.Toolbar;
import com.chaddevz.micro.adapter.ServerStatus;
 
public class ServerStatusActivity extends BaseActivity { 

    private final ArrayList<HashMap<String, String>> mData = new ArrayList<>();
	ConfigUtil config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuc);
        Toolbar mToolbar = findViewById(R.id.toolbar_main);
		setSupportActionBar(mToolbar);
		Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
		
		
		this.config = new ConfigUtil(this);
            try {
				for (int i=0;i < config.getServersArray().length();i++) {         
			    JSONObject obj = config.getServersArray().getJSONObject(i);
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("NAME", obj.getString("Name"));
                map.put("FLAG", obj.getString("FLAG"));
				map.put("HOST", obj.getString("ServerIP"));
                map.put("PORT", obj.getString("ServerPort"));
			    mData.add(map); 
				}
            }catch (JSONException e) {
                e.printStackTrace();
            }
        
        LinearLayoutManager layoutManagerz = new LinearLayoutManager(this);
        ServerStatus adapter = new ServerStatus(this, mData); 
        RecyclerView recyclerView = findViewById(R.id.rv);        
        recyclerView.setAdapter(adapter);       
        recyclerView.setLayoutManager(layoutManagerz);    
    }
    @Override
	public boolean onSupportNavigateUp() {
		onBackPressed();
		return true;
	}
} 
