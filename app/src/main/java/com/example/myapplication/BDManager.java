package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


public class BDManager {
    public static final String TABLA_PERSONA = "persona";
    public static final String ID_PERSONA = "_id";
    public static final String NOMBRE_PERSONA = "nombre";
    public static final String APELLIDO_PERSONA = "apellido";
    public static final String FECHANACIMIENTO_PERSONA = "fecha_de_nacimiento";
    public static final String DNI_PERSONA = "dni";
    public static final String SEXO_PERSONA = "sexo";
    public static final String CORREO_PERSONA = "correo";
    public static final String PROFESION_PERSONA = "profesion";
    public static final String TABLA_PERSONA_CREATE =
            "create table " + TABLA_PERSONA + " (" +
                    ID_PERSONA + " integer not null, " +
                    NOMBRE_PERSONA + " text not null, " +
                    APELLIDO_PERSONA + " text, " +
                    FECHANACIMIENTO_PERSONA + " text, " +
                    DNI_PERSONA + " text, " +
                    SEXO_PERSONA + " text, " +
                    CORREO_PERSONA + " text, " +
                    PROFESION_PERSONA + " text, " +
                    "primary key (" + ID_PERSONA + "));";
    private BDConexion conexion;
    private SQLiteDatabase basededatos;
    public BDManager(Context context) {
        conexion = new BDConexion(context);
    }
    public BDManager open()throws
}
