package com.example.myapplication.BD;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.myapplication.modelo.Persona;

public class BDManager {
    // Constantes para la definición de la tabla y sus columnas
    public static final String TABLA_PERSONA = "persona";
    public static final String ID_PERSONA = "_id";
    public static final String NOMBRE_PERSONA = "nombre";
    public static final String APELLIDO_PERSONA = "apellido";
    public static final String FECHANACIMIENTO_PERSONA = "fecha_de_nacimiento";
    public static final String DNI_PERSONA = "dni";
    public static final String SEXO_PERSONA = "sexo";
    public static final String CORREO_PERSONA = "correo";
    public static final String PROFESION_PERSONA = "profesion";
    public static final String TABLA_PERSONA_CREATE = "CREATE TABLE " + TABLA_PERSONA + " ("
            + ID_PERSONA + " INTEGER NOT NULL,"
            + NOMBRE_PERSONA + " TEXT NOT NULL,"
            + APELLIDO_PERSONA + " TEXT NOT NULL,"
            + FECHANACIMIENTO_PERSONA + " TEXT NOT NULL,"
            + DNI_PERSONA + " TEXT NOT NULL,"
            + SEXO_PERSONA + " TEXT NOT NULL,"
            + CORREO_PERSONA + " TEXT NOT NULL,"
            + PROFESION_PERSONA + " TEXT NOT NULL,"
            + "PRIMARY KEY (" + ID_PERSONA + "))";

    private BDConexion conexion;
    private SQLiteDatabase basededatos;

    public BDManager(Context context) {
        // Se recomienda evitar la inicialización directa de la conexión aquí,
        // en su lugar, inicialízala cuando sea necesaria (en el método abrir()).
        conexion = new BDConexion(context);
    }

    public BDManager abrir() throws SQLException {
        // Utiliza el método getWritableDatabase() en lugar de inicializar directamente basededatos aquí.
        basededatos = conexion.getWritableDatabase();
        return this;
    }

    public void cerrar() {
        // Verifica si la base de datos está abierta antes de cerrarla.
        if (basededatos != null && basededatos.isOpen()) {
            conexion.close();
        }
    }

    public boolean insertarPersona(int id, String nombre, String apellido, String fechaNacimiento, String dni, String sexo, String correo, String profesion) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ID_PERSONA, id);
        contentValues.put(NOMBRE_PERSONA, nombre);
        contentValues.put(APELLIDO_PERSONA, apellido);
        contentValues.put(FECHANACIMIENTO_PERSONA, fechaNacimiento);
        contentValues.put(DNI_PERSONA, dni);
        contentValues.put(SEXO_PERSONA, sexo);
        contentValues.put(CORREO_PERSONA, correo);
        contentValues.put(PROFESION_PERSONA, profesion);

        try {
            long resultado = basededatos.insertOrThrow(TABLA_PERSONA, null, contentValues);
            Log.d("insercion:", "Correcta");
            return resultado != -1;
        } catch (SQLException e) {
            Log.e("insercion:", "Error al insertar persona", e);
            return false;
        }
    }

    public boolean insertarModeloPersona(Persona persona) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ID_PERSONA, persona.getId());
        contentValues.put(NOMBRE_PERSONA, persona.getNombre());
        contentValues.put(APELLIDO_PERSONA, persona.getApellido());
        contentValues.put(FECHANACIMIENTO_PERSONA, persona.getFechaNacimiento());
        contentValues.put(DNI_PERSONA, persona.getDni());
        contentValues.put(SEXO_PERSONA, persona.getSexo());
        contentValues.put(CORREO_PERSONA, persona.getCorreo());
        contentValues.put(PROFESION_PERSONA, persona.getProfesion());

        try {
            long resultado = basededatos.insertOrThrow(TABLA_PERSONA, null, contentValues);
            Log.d("insercion:", "Correcta");
            return resultado != -1;
        } catch (SQLException e) {
            Log.e("insercion:", "Error al insertar modelo de persona", e);
            return false;
        }
    }
}
