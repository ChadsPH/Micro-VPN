package com.chaddevz.micro.util;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by: KervzCodes
 * Date Crated: 08/10/2020
 * Project: SocksHttp-master (ENGLISH)
 **/
import io.michaelrocks.paranoid.Obfuscate;

@Obfuscate
public class ConfigUtil {

    Context context;

    public static final String abcdefghijklmnopqrstuvwxyz = (new Object() {
	  int jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw;
      public String toString() {
              byte[] buf = new byte[307];
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -376523065;
              buf[0] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1466850626;
              buf[1] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 10);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1126675672;
              buf[2] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -651759040;
              buf[3] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1002792013;
              buf[4] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -38990134;
              buf[5] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 1);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 299589194;
              buf[6] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2011708761;
              buf[7] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 7);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 922835254;
              buf[8] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1747667738;
              buf[9] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 227455830;
              buf[10] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1190616228;
              buf[11] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1446065798;
              buf[12] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 9);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 811125546;
              buf[13] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 3);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 943282599;
              buf[14] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 15);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1424048167;
              buf[15] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 59254501;
              buf[16] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 4);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1571590671;
              buf[17] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 5);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1996711354;
              buf[18] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 542792819;
              buf[19] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1592229296;
              buf[20] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 62262964;
              buf[21] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 15);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1398763955;
              buf[22] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -345047119;
              buf[23] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1306532982;
              buf[24] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1997434780;
              buf[25] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 57355735;
              buf[26] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1847069801;
              buf[27] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1071396648;
              buf[28] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1976366914;
              buf[29] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 11);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1499892976;
              buf[30] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 60396395;
              buf[31] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 552502890;
              buf[32] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 17);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 190574260;
              buf[33] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1730820460;
              buf[34] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2123968568;
              buf[35] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -937003252;
              buf[36] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -27510117;
              buf[37] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 7);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 912215482;
              buf[38] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -618543794;
              buf[39] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 982840105;
              buf[40] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 3);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1320793619;
              buf[41] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 15);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 973056124;
              buf[42] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 23);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1105722560;
              buf[43] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1595420131;
              buf[44] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 5);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 209021122;
              buf[45] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -146066561;
              buf[46] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 11);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1973961700;
              buf[47] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -904832787;
              buf[48] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 6);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1399531567;
              buf[49] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 9);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1373265222;
              buf[50] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -820106329;
              buf[51] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 3);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1462800672;
              buf[52] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 5);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 937086701;
              buf[53] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 210177395;
              buf[54] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 5);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1788829175;
              buf[55] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 6);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1162649697;
              buf[56] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 11);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2027778593;
              buf[57] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -692368308;
              buf[58] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -545809305;
              buf[59] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2100074066;
              buf[60] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1574629141;
              buf[61] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1500884731;
              buf[62] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 10);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1148979570;
              buf[63] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 23);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 773515591;
              buf[64] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1278790461;
              buf[65] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 1);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -932966981;
              buf[66] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -55626472;
              buf[67] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 7);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1620300276;
              buf[68] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 13);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2054803954;
              buf[69] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -571228903;
              buf[70] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1582412557;
              buf[71] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1998611607;
              buf[72] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 113175553;
              buf[73] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 188638896;
              buf[74] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 4);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2008988372;
              buf[75] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1987620066;
              buf[76] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -824434561;
              buf[77] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 17);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -555526771;
              buf[78] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 11);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1986025584;
              buf[79] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 6);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1356234049;
              buf[80] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1941549366;
              buf[81] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 10);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1240455792;
              buf[82] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2124739;
              buf[83] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1238214649;
              buf[84] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 10);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1949430771;
              buf[85] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 437558025;
              buf[86] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 3);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1871110540;
              buf[87] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 37026609;
              buf[88] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 15);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1580185849;
              buf[89] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1132698081;
              buf[90] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 4);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 469959759;
              buf[91] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1772122415;
              buf[92] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 385099208;
              buf[93] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1984336323;
              buf[94] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 897141650;
              buf[95] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -891068002;
              buf[96] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1417257230;
              buf[97] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 10);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1382260464;
              buf[98] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 124258464;
              buf[99] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 24746063;
              buf[100] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 6);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1271652278;
              buf[101] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -178399110;
              buf[102] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 6);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1014956279;
              buf[103] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 51093494;
              buf[104] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 141564706;
              buf[105] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1587419886;
              buf[106] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1168365280;
              buf[107] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1628348972;
              buf[108] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 664284087;
              buf[109] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -753381358;
              buf[110] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 424333436;
              buf[111] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 9);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1487242859;
              buf[112] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 10);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1962886007;
              buf[113] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 3);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -901675282;
              buf[114] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 1);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1630326103;
              buf[115] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 5);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1632109141;
              buf[116] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1726354437;
              buf[117] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 12);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 954638565;
              buf[118] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 12);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1548404558;
              buf[119] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 15);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1268740974;
              buf[120] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 148203547;
              buf[121] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 17);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 193107521;
              buf[122] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 4);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1568371249;
              buf[123] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 5);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1688678941;
              buf[124] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 7);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 371942166;
              buf[125] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 711370957;
              buf[126] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 1);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -305656651;
              buf[127] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -211535441;
              buf[128] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2109324273;
              buf[129] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 10);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -543241073;
              buf[130] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 5);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1597053512;
              buf[131] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 819979732;
              buf[132] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 17);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -447029850;
              buf[133] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 9);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1067637522;
              buf[134] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 1);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1763796431;
              buf[135] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -33760416;
              buf[136] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 3);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 363901368;
              buf[137] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 860257539;
              buf[138] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 12);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 213129700;
              buf[139] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1958127371;
              buf[140] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1390215341;
              buf[141] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 17);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -288288979;
              buf[142] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 5);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1593347193;
              buf[143] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1307793422;
              buf[144] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 13);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 606884296;
              buf[145] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 362645854;
              buf[146] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1899602380;
              buf[147] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 12);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -554551020;
              buf[148] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 7);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2085435533;
              buf[149] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 4);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -398141480;
              buf[150] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 9);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -995903064;
              buf[151] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 11);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 231126421;
              buf[152] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 7);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1141899325;
              buf[153] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 23);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1595160241;
              buf[154] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 4);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1586697768;
              buf[155] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 4);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1267979778;
              buf[156] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 611201730;
              buf[157] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 7);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1610586435;
              buf[158] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 6);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 163181626;
              buf[159] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 15);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1305522107;
              buf[160] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1768844024;
              buf[161] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1353239860;
              buf[162] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 1);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1366081705;
              buf[163] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 13);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 551304988;
              buf[164] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2014495234;
              buf[165] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 9);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 745815535;
              buf[166] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 258689413;
              buf[167] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1601734364;
              buf[168] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 1);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1418935811;
              buf[169] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 11);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1642481250;
              buf[170] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -325312671;
              buf[171] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1967278595;
              buf[172] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 10);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1008000926;
              buf[173] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 9);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 158150526;
              buf[174] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1577706988;
              buf[175] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 12);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1295673235;
              buf[176] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1298909949;
              buf[177] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1743599062;
              buf[178] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1517162912;
              buf[179] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 419586548;
              buf[180] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 780303949;
              buf[181] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2109631953;
              buf[182] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 572818246;
              buf[183] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 3);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 797315814;
              buf[184] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 12);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1933990975;
              buf[185] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -24442705;
              buf[186] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 11);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1035429512;
              buf[187] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 4);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2096212847;
              buf[188] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1417246071;
              buf[189] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 12);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 615547015;
              buf[190] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 15);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1653415006;
              buf[191] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 13);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1636616705;
              buf[192] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -884145053;
              buf[193] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 13);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -332059896;
              buf[194] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1807587286;
              buf[195] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 109916581;
              buf[196] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1567222005;
              buf[197] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 12);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -707944061;
              buf[198] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 10);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -436290878;
              buf[199] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 1);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1292983251;
              buf[200] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -754381247;
              buf[201] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2092934801;
              buf[202] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1175202774;
              buf[203] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 13);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1512702786;
              buf[204] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1344671947;
              buf[205] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 12);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2025071846;
              buf[206] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 15);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1392352160;
              buf[207] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 588002702;
              buf[208] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1232261901;
              buf[209] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -585772251;
              buf[210] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1367800261;
              buf[211] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 376665015;
              buf[212] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 11);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1048463972;
              buf[213] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1481431312;
              buf[214] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1804898821;
              buf[215] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1591243426;
              buf[216] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -662500400;
              buf[217] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1999526279;
              buf[218] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 941018849;
              buf[219] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 5);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -584006761;
              buf[220] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 15);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1456365869;
              buf[221] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 752553634;
              buf[222] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 11);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 594239330;
              buf[223] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2089358141;
              buf[224] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 1);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -143036813;
              buf[225] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -53604158;
              buf[226] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 17);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2048960019;
              buf[227] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 4);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -96771663;
              buf[228] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 11);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 696570624;
              buf[229] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2031260291;
              buf[230] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1412002622;
              buf[231] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 12);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1913628580;
              buf[232] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 6);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1458106576;
              buf[233] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 1);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1486723179;
              buf[234] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 6);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 408039811;
              buf[235] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -475163880;
              buf[236] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1015191769;
              buf[237] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 1);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 417313731;
              buf[238] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 17);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1907375789;
              buf[239] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -562612189;
              buf[240] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 7);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 202780844;
              buf[241] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 7);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 220391850;
              buf[242] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2115642853;
              buf[243] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2106197220;
              buf[244] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -321474617;
              buf[245] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 17);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 407316437;
              buf[246] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 47984108;
              buf[247] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 17);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1460217144;
              buf[248] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 6);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1669389493;
              buf[249] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2021576886;
              buf[250] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 9);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1123194947;
              buf[251] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 6);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -862399666;
              buf[252] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 302528365;
              buf[253] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 7);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 190799443;
              buf[254] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -765225081;
              buf[255] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 375962683;
              buf[256] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2145398001;
              buf[257] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 3);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1961659546;
              buf[258] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 13);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1871806620;
              buf[259] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -311831681;
              buf[260] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 23485837;
              buf[261] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -355919454;
              buf[262] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 2);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1091016217;
              buf[263] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 4);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1400075346;
              buf[264] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 21);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2048632613;
              buf[265] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 6);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 40377748;
              buf[266] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1637032617;
              buf[267] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2077411777;
              buf[268] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 9);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 214446811;
              buf[269] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 17);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1957077929;
              buf[270] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1989953386;
              buf[271] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 4);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -902858094;
              buf[272] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1795221099;
              buf[273] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -686209819;
              buf[274] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 14);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2083564424;
              buf[275] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 19);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1731450269;
              buf[276] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1709023446;
              buf[277] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 10);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1042213570;
              buf[278] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 1);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1916167331;
              buf[279] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1399473736;
              buf[280] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 4);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1710415150;
              buf[281] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -265218545;
              buf[282] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 15);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2062065340;
              buf[283] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -926531592;
              buf[284] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 12);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1640399753;
              buf[285] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 12);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1821878182;
              buf[286] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 6);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 105078540;
              buf[287] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -968221520;
              buf[288] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 710303103;
              buf[289] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 12);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1820948784;
              buf[290] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 16);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 485611422;
              buf[291] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 22);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1802935120;
              buf[292] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1591309138;
              buf[293] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 5);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2112849499;
              buf[294] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 8);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2023908544;
              buf[295] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2100588848;
              buf[296] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 1);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 509707574;
              buf[297] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 10);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1345164076;
              buf[298] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 10);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1009881478;
              buf[299] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 10);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1905779580;
              buf[300] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 18);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -2027575746;
              buf[301] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 20);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1156587806;
              buf[302] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 23);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1706306489;
              buf[303] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 11);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = -1716963940;
              buf[304] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 7);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 1489664621;
              buf[305] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 17);
              jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw = 2034231651;
              buf[306] = (byte) (jchdjsjsjsjjjshehdnnxncbxbdhshshwjjw >>> 24);
              return new String(buf);
      }
}.toString());

    public ConfigUtil(Context context) {
        this.context = context;
    }

    public String getVersion() {
        try {
            String version = getJSONConfig().getString("Version");
            return version;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

	public String geNote()
    {
        try {
            String releaseNote = getJSONConfig().getString("ReleaseNotes");
            return releaseNote;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public JSONArray getServersArray() {
        try {
            if (getJSONConfig() != null) {
                JSONArray array = getJSONConfig().getJSONArray("Servers");
                return array;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

	public ArrayList getNetworkSSLArray(ArrayList arraylist) {
		try {
			if (getJSONConfig() != null) {
				JSONArray array = getJSONConfig().getJSONArray("Networks");
				JSONArray jarr2 = array.getJSONObject(0).getJSONArray("SSL");
				for (int i = 0; i < jarr2.length(); i++)
				{
					JSONObject obj = jarr2.getJSONObject(i);
					arraylist.add(obj.getString("Name"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList getNetworkSSHArray(ArrayList arraylist) {
		try {
			if (getJSONConfig() != null) {
				JSONArray array = getJSONConfig().getJSONArray("Networks");
				JSONArray jarr2 = array.getJSONObject(0).getJSONArray("SSH");
				for (int i = 0; i < jarr2.length(); i++)
				{
					JSONObject obj = jarr2.getJSONObject(i);
					arraylist.add(obj.getString("Name"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


    public JSONArray getNetworksArray() {
        try {
            if (getJSONConfig() != null) {
                JSONArray array = getJSONConfig().getJSONArray("Networks");
                return array;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean versionCompare(String NewVersion, String OldVersion) {
        String[] vals1 = NewVersion.split("\\.");
        String[] vals2 = OldVersion.split("\\.");
        int i = 0;

        // set index to first non-equal ordinal or length of shortest version string
        while (i < vals1.length && i < vals2.length && vals1[i].equals(vals2[i])) {
            i++;
        }
        // compare first non-equal ordinal number
        if (i < vals1.length && i < vals2.length) {
            int diff = Integer.valueOf(vals1[i]).compareTo(Integer.valueOf(vals2[i]));
            return Integer.signum(diff) > 0;
        }

        // the strings are equal or one string is a substring of the other
        // e.g. "1.2.3" = "1.2.3" or "1.2.3" < "1.2.3.4"
        return Integer.signum(vals1.length - vals2.length) > 0;
    }

    private JSONObject getJSONConfig() {
        try {
            File file = new File(context.getFilesDir(), "Config.json");
            if (file.exists()) {
                String json_file = readStream(new FileInputStream(file));
                String json = AESCrypt.decrypt(abcdefghijklmnopqrstuvwxyz, json_file);
                return new JSONObject(json);
            } else {
                InputStream inputStream = context.getAssets().open("config/config.json");
                String json = AESCrypt.decrypt(abcdefghijklmnopqrstuvwxyz, readStream(inputStream));
                return new JSONObject(json);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private String readStream(InputStream in)
    {
        StringBuilder sb = new StringBuilder();
        try {
            Reader reader = new BufferedReader(new InputStreamReader(in));
            char[] buff = new char[1024];
            while (true) {
                int read = reader.read(buff, 0, buff.length);
                if (read <= 0) {
                    break;
                }
                sb.append(buff, 0, read);
            }
        } catch (Exception e) {

        }
        return sb.toString();
    }
}


