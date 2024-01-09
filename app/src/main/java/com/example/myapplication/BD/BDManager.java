package com.example.myapplication.BD;

import android.content.Context;

import android.database.SQLException;
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
    public static final String TABLA_PERSONA_CREATE ="create table persona(_id integer not null, nombre text not null, apellido text not null,fecha_de_nacimiento text not null, dni text not null, sexo text not null,correo text not null, profesion text not null);";


    private BDConexion conexion;
    private SQLiteDatabase basededatos;

    public BDManager(Context context) {
        conexion = new BDConexion(context);
    }
    public BDManager open()throws SQLException{
        basededatos= conexion.getWritableDatabase();
        return this;
    }
    public void close(){
        conexion.close();
    }
}
