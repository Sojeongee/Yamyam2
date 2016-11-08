/**
 * Author: Ravi Tamada
 * URL: www.androidhive.info
 * twitter: http://twitter.com/ravitamada
 * */
package dongguk.yamyam.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.HashMap;

public class SQLiteDataHandler extends SQLiteOpenHelper {

    private static final String TAG = SQLiteDataHandler.class.getSimpleName();

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "android_api";

    // Login table name
    private static final String TABLE_UPSO = "upso";

    // Login Table Columns names
    private static final String KEY_ROWID = "id";
    private static final String CRTFC_UPSO_MGT_SNO = "crtfc_upso_mgt_sno";
    private static final String UPSO_SNO = "upso_sno";
    private static final String UPSO_NM = "upso_nm";
    private static final String CGG_CODE = "cgg_code";
    private static final String CGG_CODE_NM = "cgg_code_nm";
    private static final String COB_CODE_NM = "cob_code_nm";
    private static final String BIZCND_CODE_NM = "bizcnd_code_nm";
    private static final String OWNER_NM = "owner_nm";
    private static final String CRTFC_GBN = "crtfc_gbn";
    private static final String CRTFC_GBN_NM = "crtfc_gbn_nm";
    private static final String CRTFC_CHR_NM = "crtfc_chr_nm";
    private static final String CRTFC_CHR_ID = "crtfc_chr_id";
    private static final String MAP_INDICT_YN = "map_indict_yn";
    private static final String CRTFC_CLASS = "crtfc_class";
    private static final String Y_DNTS = "y_dnts";
    private static final String X_CNTS = "x_cnts";
    private static final String TEL_NO = "tel_no";
    private static final String RDN_DETAIL_ADDR = "rdn_detail_addr";
    private static final String RDN_ADDR_CODE = "rdn_addr_code";
    private static final String RDN_CODE_NM = "rdn_code_nm";
    private static final String BIZCND_CODE = "bizcnd_code";
    private static final String COB_CODE = "cob_code";
    private static final String CRTFC_SNO = "crtfc_sno";
    private static final String CRT_TIME = "crt_time";
    private static final String UPD_TIME = "upd_time";
    private static final String FOOD_MENU = "food_menu";
    private static final String GNT_NO = "gnt_no";
    private static final String CRTFC_YN = "crtfc_yn";

    public SQLiteDataHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_UPSO_TABLE = "CREATE TABLE " + TABLE_UPSO + "("
                + KEY_ROWID + " INTEGER PRIMARY KEY," + CRTFC_UPSO_MGT_SNO + " TEXT,"
                + UPSO_SNO + " TEXT," + UPSO_NM + " TEXT,"
                + CGG_CODE + " TEXT" + CGG_CODE_NM + " TEXT,"+ COB_CODE_NM + " TEXT,"
                + BIZCND_CODE_NM + " TEXT,"+ OWNER_NM + " TEXT,"+ CRTFC_GBN + " TEXT,"
                + CRTFC_GBN_NM + " TEXT,"+ CRTFC_CHR_NM + " TEXT,"+ CRTFC_CHR_ID + " TEXT,"
                + MAP_INDICT_YN + " CRTFC_CLASS,"+ CRTFC_CLASS + " TEXT,"+ Y_DNTS + " TEXT,"
                + X_CNTS + " TEXT,"+ TEL_NO + " TEXT,"+ RDN_DETAIL_ADDR + " TEXT,"
                + RDN_ADDR_CODE + " TEXT,"+ RDN_CODE_NM + " TEXT,"+ BIZCND_CODE + " TEXT,"
                + COB_CODE + " TEXT,"+ CRTFC_SNO + " TEXT," + CRT_TIME + " TEXT,"+ UPD_TIME
                + " TEXT,"+ FOOD_MENU + " TEXT," + GNT_NO + " TEXT,"+ CRTFC_YN + " TEXT,"+ ")";
        db.execSQL(CREATE_UPSO_TABLE);

        Log.d(TAG, "Database tables created");
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_UPSO);

        // Create tables again
        onCreate(db);
    }

    /**
     * Storing user details in database
     * */
    public void addUpso(String id, String crtfc_upso_mgt_sno, String upso_sno, String upso_nm, String cgg_code,
                        String cgg_code_nm, String cob_code_nm, String bizcnd_code_nm, String owner_nm,
                        String crtfc_gbn, String crtfc_gbn_nm, String crtfc_chr_nm, String crtfc_chr_id,
                        String map_indict_yn, String crtfc_class, String y_dnts, String x_cnts, String tel_no,
                        String rdn_detail_addr, String rdn_addr_code, String rdn_code_nm, String  bizcnd_code,
                        String cob_code, String crtfc_sno, String crt_time, String upd_time, String food_menu,
                        String gnt_no, String crtfc_yn) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ROWID, id);
        values.put(CRTFC_UPSO_MGT_SNO, crtfc_upso_mgt_sno);
        values.put(UPSO_SNO, upso_sno);
        values.put(UPSO_NM, upso_nm);
        values.put(CGG_CODE, cgg_code);
        values.put(CGG_CODE_NM, cgg_code_nm);
        values.put(COB_CODE_NM, cob_code_nm);
        values.put(BIZCND_CODE_NM, bizcnd_code_nm);
        values.put(OWNER_NM, owner_nm);
        values.put(CRTFC_GBN, crtfc_gbn);
        values.put(CRTFC_GBN_NM, crtfc_gbn_nm);
        values.put(CRTFC_CHR_NM, crtfc_chr_nm);
        values.put(CRTFC_CHR_ID, crtfc_chr_id);
        values.put(MAP_INDICT_YN, map_indict_yn);
        values.put(CRTFC_CLASS, crtfc_class);
        values.put(Y_DNTS, y_dnts);
        values.put(X_CNTS, x_cnts);
        values.put(TEL_NO, tel_no);
        values.put(RDN_DETAIL_ADDR, rdn_detail_addr);
        values.put(RDN_ADDR_CODE, rdn_addr_code);
        values.put(RDN_CODE_NM, rdn_code_nm);
        values.put(BIZCND_CODE, bizcnd_code);
        values.put(COB_CODE, cob_code);
        values.put(CRTFC_SNO, crtfc_sno);
        values.put(CRT_TIME, crt_time);
        values.put(UPD_TIME, upd_time);
        values.put(FOOD_MENU, food_menu);
        values.put(GNT_NO, gnt_no);
        values.put(CRTFC_YN, crtfc_yn);

        // Inserting Row
        long iid = db.insert(TABLE_UPSO, null, values);
        db.close(); // Closing database connection

        Log.d(TAG, "New upso inserted into sqlite: " + iid);
    }

    /**
     * Getting user data from database
     * */

    public HashMap<String, String> getUpsoDetails() {
        HashMap<String, String> upso = new HashMap<String, String>();
        String selectQuery = "SELECT  * FROM " + TABLE_UPSO;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        // Move to first row
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            upso.put("id", cursor.getString(1));
            upso.put("crtfc_upso_mgt_sno", cursor.getString(2));
            upso.put("upso_sno", cursor.getString(3));
            upso.put("upso_nm", cursor.getString(4));
            upso.put("cgg_code", cursor.getString(5));
            upso.put("cgg_code_nm", cursor.getString(6));
            upso.put("cob_code_nm", cursor.getString(7));
            upso.put("bizcnd_code_nm", cursor.getString(8));
            upso.put("owner_nm", cursor.getString(9));
            upso.put("crtfc_gbn", cursor.getString(10));
            upso.put("crtfc_gbn_nm", cursor.getString(11));
            upso.put("crtfc_chr_nm", cursor.getString(12));
            upso.put("crtfc_chr_id", cursor.getString(13));
            upso.put("map_indict_yn", cursor.getString(14));
            upso.put("crtfc_class", cursor.getString(15));
            upso.put("y_dnts", cursor.getString(16));
            upso.put("x_cnts", cursor.getString(17));
            upso.put("tel_no", cursor.getString(18));
            upso.put("rdn_detail_addr", cursor.getString(19));
            upso.put("rdn_addr_code", cursor.getString(20));
            upso.put("rdn_code_nm", cursor.getString(21));
            upso.put("bizcnd_code", cursor.getString(22));
            upso.put("cob_code", cursor.getString(23));
            upso.put("crtfc_sno", cursor.getString(24));
            upso.put("crt_time", cursor.getString(25));
            upso.put("upd_time", cursor.getString(26));
            upso.put("food_menu", cursor.getString(27));
            upso.put("gnt_no", cursor.getString(28));
            upso.put("crtfc_yn", cursor.getString(29));
        }
        cursor.close();
        db.close();
        // return upso
        Log.d(TAG, "Fetching upso from Sqlite: " + upso.toString());

        return upso;
    }

    /**
     * Re crate database Delete all tables and create them again
     * */
    public void deleteUpsos() {
        SQLiteDatabase db = this.getWritableDatabase();
        // Delete All Rows
        db.delete(TABLE_UPSO, null, null);
        db.close();

        Log.d(TAG, "Deleted all upso info from sqlite");
    }
}