package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.myapplication.BD.BDManager;

import android.database.SQLException;

public class MainActivity extends AppCompatActivity {
    private BDManager bdManager; // Aquí declaramos nuestra instancia de BDManager.

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bdManager = new BDManager(getApplicationContext()); // Creamos una instancia de BDManager.

        // Ahora, vamos a abrir la conexión a la base de datos.
        // Cambiamos bdManager.open() a bdManager.abrir() para que sea más claro.
        bdManager.abrir();

        // Vamos a insertar algunas personas en la base de datos.
        bdManager.insertarPersona(1, "Ana", "Suarez", "12/03/1997", "094835098L", "Femenino", "Anas231@gmail.com", "Peluquera");
        bdManager.insertarPersona(2, "Juan", "Perez", "25/08/1990", "102938475T", "Masculino", "juan.perez@gmail.com", "Ingeniero");
        bdManager.insertarPersona(3, "María", "Gomez", "18/06/1985", "765432109X", "Femenino", "maria.gomez@gmail.com", "Doctora");

        // Después de hacer nuestras operaciones, cerramos la conexión a la base de datos.
        // Cambiamos bdManager.close() a bdManager.cerrar() para que sea más claro.
        bdManager.cerrar();
    }
}
