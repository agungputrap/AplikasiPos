package com.example.android.aplikasipos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by agungputrap on 11/19/2015.
 */
public class DatabaseWrapper extends SQLiteOpenHelper {
    public static final String CUSTOMERS = "customers";
    public static final String CUSTOMER_ID = "id";
    public static final String CUSTOMER_FNAME = "fname";
    public static final String CUSTOMER_LNAME = "lname";
    public static final String CUSTOMER_GROUP = "group";
    public static final String CUSTOMER_EMAIL = "email";
    public static final String CUSTOMER_SAJALAN = "sa_jalan";
    public static final String CUSTOMER_SAKOTA = "sa_kota";
    public static final String CUSTOMER_SAPROVINSI = "sa_provinsi";
    public static final String CUSTOMER_SAKODEPOS = "sa_kodepos";
    public static final String CUSTOMER_SANEGARA = "sa_negara";
    public static final String CUSTOMER_BAJALAN = "ba_jalan";
    public static final String CUSTOMER_BAKOTA = "ba_kota";
    public static final String CUSTOMER_BAPROVINSI = "ba_provinsi";
    public static final String CUSTOMER_BAKODEPOS = "ba_kodepos";
    public static final String CUSTOMER_BANEGARA = "ba_negara";

    public static final String DATABASE_NAME = "customers.db";
    public static final int DATABASE_VERSION = 1;

    private static final String DATABASE_CREATE = "create table " +CUSTOMERS+"("+CUSTOMER_ID+" integer primary key autoincrement, "+ CUSTOMER_FNAME+ " text,"+CUSTOMER_LNAME+" text,"+ CUSTOMER_EMAIL+ " text,"+CUSTOMER_GROUP+" text,"+ CUSTOMER_SAJALAN+ " text,"+CUSTOMER_SAKOTA+" text,"+ CUSTOMER_SAPROVINSI+ " text,"+CUSTOMER_SAKODEPOS+" integer,"+ CUSTOMER_SANEGARA+ " text,"+ CUSTOMER_BAJALAN+ " text,"+CUSTOMER_BAKOTA+" text,"+ CUSTOMER_BAPROVINSI+ " text,"+CUSTOMER_BAKODEPOS+" integer,"+ CUSTOMER_BANEGARA+ " text);";

    public DatabaseWrapper(Context context) {
        super (context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + CUSTOMERS);
        onCreate(db);
    }

}
