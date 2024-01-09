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
        // Utiliza la constante TABLA_PERSONA de la clase BDManager en lugar de repetir la cadena
        sqLiteDatabase.execSQL("CREATE TABLE " + BDManager.TABLA_PERSONA + " ("
                + BDManager.ID_PERSONA + " INTEGER PRIMARY KEY,"
                + BDManager.NOMBRE_PERSONA + " TEXT NOT NULL,"
                + BDManager.APELLIDO_PERSONA + " TEXT NOT NULL,"
                + BDManager.FECHANACIMIENTO_PERSONA + " TEXT NOT NULL,"
                + BDManager.DNI_PERSONA + " TEXT NOT NULL,"
                + BDManager.SEXO_PERSONA + " TEXT NOT NULL,"
                + BDManager.CORREO_PERSONA + " TEXT NOT NULL,"
                + BDManager.PROFESION_PERSONA + " TEXT NOT NULL);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        // Elimina la tabla existente y crea una nueva al actualizar la versión de la base de datos
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + BDManager.TABLA_PERSONA);
        onCreate(sqLiteDatabase);
    }
} // José Angel soy mongola porque pensaba que era mas dificil
// emplan que se vieran las tablas de la BD en otra pestaña y tal
// y he hasta llorado y al final no era ni pa tanto :((((. le he ganado a elia en llorica
