package com.example.myapplication.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDConexion extends SQLiteOpenHelper {

    private static final String BD_NAME = "dbcodea";
    private static final int BD_VERSION = 1;

    public BDConexion(Context context) {
        super(context, BD_NAME, null, BD_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(BDManager.TABLA_PERSONA_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + BDManager.TABLA_PERSONA);
        onCreate(sqLiteDatabase);
    }
}
