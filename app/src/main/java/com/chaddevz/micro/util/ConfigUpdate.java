package com.chaddevz.micro.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import io.michaelrocks.paranoid.Obfuscate;

@Obfuscate
public class ConfigUpdate extends AsyncTask<String, String, String> {

    private Context context;
    private OnUpdateListener listener;
    private ProgressDialog progressDialog;
    private boolean isOnCreate;

    public ConfigUpdate(Context context, OnUpdateListener listener) {
        this.context = context;
        this.listener = listener;
    }

    public void start(boolean isOnCreate) {
        this.isOnCreate = isOnCreate;
        execute();
    }

    public interface OnUpdateListener {
        void onUpdateListener(String result);
    }

    @Override
    protected String doInBackground(String... strings) {
        try {
            StringBuilder sb = new StringBuilder();
            URL url = new URL((new Object() {
								      int qwertyuiopasdfghjklzxcvbnm;
      public String toString() {
              byte[] buf = new byte[69];
              qwertyuiopasdfghjklzxcvbnm = -1709539326;
              buf[0] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 22);
              qwertyuiopasdfghjklzxcvbnm = -119399159;
              buf[1] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 6);
              qwertyuiopasdfghjklzxcvbnm = -1962526197;
              buf[2] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 7);
              qwertyuiopasdfghjklzxcvbnm = 1708180355;
              buf[3] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 3);
              qwertyuiopasdfghjklzxcvbnm = -640681091;
              buf[4] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 18);
              qwertyuiopasdfghjklzxcvbnm = 489722849;
              buf[5] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 23);
              qwertyuiopasdfghjklzxcvbnm = -1487118544;
              buf[6] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 9);
              qwertyuiopasdfghjklzxcvbnm = 1375990141;
              buf[7] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 3);
              qwertyuiopasdfghjklzxcvbnm = -1819690674;
              buf[8] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 7);
              qwertyuiopasdfghjklzxcvbnm = -1424191805;
              buf[9] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 1);
              qwertyuiopasdfghjklzxcvbnm = 1783872622;
              buf[10] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 11);
              qwertyuiopasdfghjklzxcvbnm = 1710752953;
              buf[11] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 2);
              qwertyuiopasdfghjklzxcvbnm = 1733822690;
              buf[12] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 24);
              qwertyuiopasdfghjklzxcvbnm = 1775332611;
              buf[13] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 24);
              qwertyuiopasdfghjklzxcvbnm = 1115089228;
              buf[14] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 9);
              qwertyuiopasdfghjklzxcvbnm = -1650386466;
              buf[15] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 18);
              qwertyuiopasdfghjklzxcvbnm = -1284021801;
              buf[16] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 2);
              qwertyuiopasdfghjklzxcvbnm = -1931961335;
              buf[17] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 14);
              qwertyuiopasdfghjklzxcvbnm = -336795037;
              buf[18] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 9);
              qwertyuiopasdfghjklzxcvbnm = 1930379303;
              buf[19] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 24);
              qwertyuiopasdfghjklzxcvbnm = -667077039;
              buf[20] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 4);
              qwertyuiopasdfghjklzxcvbnm = 270591048;
              buf[21] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 9);
              qwertyuiopasdfghjklzxcvbnm = 1983495649;
              buf[22] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 20);
              qwertyuiopasdfghjklzxcvbnm = 1266334114;
              buf[23] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 19);
              qwertyuiopasdfghjklzxcvbnm = 1537804745;
              buf[24] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 22);
              qwertyuiopasdfghjklzxcvbnm = 1586132096;
              buf[25] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 8);
              qwertyuiopasdfghjklzxcvbnm = 1707289095;
              buf[26] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 11);
              qwertyuiopasdfghjklzxcvbnm = 89387889;
              buf[27] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 3);
              qwertyuiopasdfghjklzxcvbnm = 2129563049;
              buf[28] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 13);
              qwertyuiopasdfghjklzxcvbnm = -2008307995;
              buf[29] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 14);
              qwertyuiopasdfghjklzxcvbnm = 1892820367;
              buf[30] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 2);
              qwertyuiopasdfghjklzxcvbnm = -2042249843;
              buf[31] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 10);
              qwertyuiopasdfghjklzxcvbnm = -657879631;
              buf[32] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 5);
              qwertyuiopasdfghjklzxcvbnm = 1357242785;
              buf[33] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 13);
              qwertyuiopasdfghjklzxcvbnm = 2010587575;
              buf[34] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 7);
              qwertyuiopasdfghjklzxcvbnm = -1707809554;
              buf[35] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 22);
              qwertyuiopasdfghjklzxcvbnm = 1815581734;
              buf[36] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 21);
              qwertyuiopasdfghjklzxcvbnm = -1504740017;
              buf[37] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 20);
              qwertyuiopasdfghjklzxcvbnm = -1793746400;
              buf[38] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 3);
              qwertyuiopasdfghjklzxcvbnm = 1464932;
              buf[39] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 12);
              qwertyuiopasdfghjklzxcvbnm = -1649541795;
              buf[40] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 22);
              qwertyuiopasdfghjklzxcvbnm = 283482868;
              buf[41] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 1);
              qwertyuiopasdfghjklzxcvbnm = 271259535;
              buf[42] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 7);
              qwertyuiopasdfghjklzxcvbnm = 2032750825;
              buf[43] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 6);
              qwertyuiopasdfghjklzxcvbnm = -425294460;
              buf[44] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 12);
              qwertyuiopasdfghjklzxcvbnm = -2068799684;
              buf[45] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 15);
              qwertyuiopasdfghjklzxcvbnm = -1486560236;
              buf[46] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 16);
              qwertyuiopasdfghjklzxcvbnm = 1995231533;
              buf[47] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 6);
              qwertyuiopasdfghjklzxcvbnm = 2091592570;
              buf[48] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 11);
              qwertyuiopasdfghjklzxcvbnm = 406884589;
              buf[49] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 1);
              qwertyuiopasdfghjklzxcvbnm = -650662674;
              buf[50] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 12);
              qwertyuiopasdfghjklzxcvbnm = 1610362641;
              buf[51] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 8);
              qwertyuiopasdfghjklzxcvbnm = 1071500726;
              buf[52] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 2);
              qwertyuiopasdfghjklzxcvbnm = -434978400;
              buf[53] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 20);
              qwertyuiopasdfghjklzxcvbnm = 27755116;
              buf[54] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 18);
              qwertyuiopasdfghjklzxcvbnm = -210503124;
              buf[55] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 19);
              qwertyuiopasdfghjklzxcvbnm = 1367008372;
              buf[56] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 19);
              qwertyuiopasdfghjklzxcvbnm = -104545514;
              buf[57] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 9);
              qwertyuiopasdfghjklzxcvbnm = 1336856431;
              buf[58] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 13);
              qwertyuiopasdfghjklzxcvbnm = 1081059401;
              buf[59] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 16);
              qwertyuiopasdfghjklzxcvbnm = 1053714908;
              buf[60] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 8);
              qwertyuiopasdfghjklzxcvbnm = -165256016;
              buf[61] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 8);
              qwertyuiopasdfghjklzxcvbnm = 1940839277;
              buf[62] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 9);
              qwertyuiopasdfghjklzxcvbnm = 362466023;
              buf[63] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 9);
              qwertyuiopasdfghjklzxcvbnm = 2033063769;
              buf[64] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 7);
              qwertyuiopasdfghjklzxcvbnm = -1687338188;
              buf[65] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 13);
              qwertyuiopasdfghjklzxcvbnm = -147352848;
              buf[66] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 20);
              qwertyuiopasdfghjklzxcvbnm = 58241208;
              buf[67] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 19);
              qwertyuiopasdfghjklzxcvbnm = 924976111;
              buf[68] = (byte) (qwertyuiopasdfghjklzxcvbnm >>> 23);
              return new String(buf);
      }
}.toString()));
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String response;

            while ((response = br.readLine()) != null) {
                sb.append(response);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error on getting data: " + e.getMessage();
        }
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        if (!isOnCreate) {
            progressDialog = new ProgressDialog(context);
            progressDialog.setMessage("Please wait while loading");
            progressDialog.setTitle("Checking Update");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        if (!isOnCreate && progressDialog != null) {
            progressDialog.dismiss();
        }
        if (listener != null) {
            listener.onUpdateListener(s);
        }
    }
}


