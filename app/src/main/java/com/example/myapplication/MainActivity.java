package com.example.myapplication;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.BD.BDManager;

public class MainActivity extends AppCompatActivity {

    private BDManager bdManager;
    private EditText editTextName, editTextApellido, editTextDOB, editTextDNI, editTextEmail, editTextProfesion;
    private RadioGroup radioGroupSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bdManager = new BDManager(getApplicationContext());

        // Inicializa tus elementos de la interfaz de usuario
        editTextName = findViewById(R.id.editTextName);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextDOB = findViewById(R.id.editTextDOB);
        editTextDNI = findViewById(R.id.editTextDNI);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextProfesion = findViewById(R.id.editTextProfesion);
        radioGroupSexo = findViewById(R.id.radioGroupSexo);
        Button btnSalir = findViewById(R.id.btnSalir);
        Button btnGuardar = findViewById(R.id.btnGuardar);
        Button btnVerLista = findViewById(R.id.btnVerLista);

        // Asigna un listener al botón de salir
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();  // Cierra la actividad
            }
        });

        // Asigna un listener al botón de guardar
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardarPersonaEnBD();
                limpiarCampos(); // Limpiar campos después de guardar
            }
        });

        // Asigna un listener al botón de ver lista
        btnVerLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarListaPersonas();
            }
        });
    }

    // Método para guardar la persona en la base de datos
    private void guardarPersonaEnBD() {
        String nombre = editTextName.getText().toString();
        String apellido = editTextApellido.getText().toString();
        String fechaNacimiento = editTextDOB.getText().toString();
        String dni = editTextDNI.getText().toString();
        String correo = editTextEmail.getText().toString();
        String profesion = editTextProfesion.getText().toString();

        // Obtiene el ID del RadioButton seleccionado en el grupo de sexo
        int selectedRadioButtonId = radioGroupSexo.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
        String sexo = selectedRadioButton.getText().toString();

        // Inserta la persona en la base de datos
        long id = bdManager.insertarPersona(nombre, apellido, fechaNacimiento, dni, sexo, correo, profesion);

        if (id != -1) {
            // Éxito al insertar en la base de datos
            mostrarMensaje("Persona guardada con ID: " + id);
        } else {
            // Error al insertar en la base de datos
            mostrarMensaje("Error al guardar la persona en la base de datos");
        }
    }

    // Método para mostrar la lista de personas almacenadas en la base de datos
    private void mostrarListaPersonas() {
        // Obtén todas las personas de la base de datos
        Cursor cursor = bdManager.obtenerTodasLasPersonas();

        // Procesa los resultados
        StringBuilder listaPersonas = new StringBuilder();
        while (cursor.moveToNext()) {
            @SuppressLint("Range") int id = cursor.getInt(cursor.getColumnIndex(BDManager.ID_PERSONA));
            @SuppressLint("Range") String nombre = cursor.getString(cursor.getColumnIndex(BDManager.NOMBRE_PERSONA));
            @SuppressLint("Range") String apellido = cursor.getString(cursor.getColumnIndex(BDManager.APELLIDO_PERSONA));

            // Puedes añadir más campos según tus necesidades

            // Agrega la información al StringBuilder
            listaPersonas.append("ID: ").append(id).append(", Nombre: ").append(nombre).append(", Apellido: ").append(apellido).append("\n");
        }

        // Cierra el cursor después de usarlo
        cursor.close();

        // Muestra la lista en un Toast o donde prefieras
        mostrarMensaje(listaPersonas.toString());
    }

    // Método para limpiar los campos después de guardar
    private void limpiarCampos() {
        editTextName.setText("");
        editTextApellido.setText("");
        editTextDOB.setText("");
        editTextDNI.setText("");
        editTextEmail.setText("");
        editTextProfesion.setText("");
        radioGroupSexo.clearCheck(); // Desmarca el RadioButton seleccionado
    }

    // Método para mostrar mensajes en un Toast
    private void mostrarMensaje(String mensaje) {
        Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();
    }
}
