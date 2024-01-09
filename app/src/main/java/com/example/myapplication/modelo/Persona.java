package com.example.myapplication.modelo;

import android.widget.Button;
import android.widget.RadioButton;

public class Persona {
    // Campos de datos directos
    private int id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String dni;
    private String sexo;
    private String correo;
    private String profesion;

    // Campos de la interfaz de usuario
    private Button btnGuardar;
    private Button btnSalir;
    private Button btnVerLista;
    private RadioButton radioMale;
    private RadioButton radioFemale;

    // Constructor para datos directos
    public Persona(int id, String nombre, String apellido, String fechaNacimiento, String dni, String sexo, String correo, String profesion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
        this.correo = correo;
        this.profesion = profesion;
    }

    // Constructor para elementos de la interfaz de usuario
    public Persona(int id, Button btnGuardar, Button btnSalir, Button btnVerLista, RadioButton radioMale, RadioButton radioFemale) {
        this.id = id;
        this.btnGuardar = btnGuardar;
        this.btnSalir = btnSalir;
        this.btnVerLista = btnVerLista;
        this.radioMale = radioMale;
        this.radioFemale = radioFemale;
    }

    // Métodos getter y setter para cada campo

    // Métodos getter y setter para id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Métodos getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Métodos getter y setter para fecha de nacimiento
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos getter y setter para DNI
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Métodos getter y setter para sexo
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // Métodos getter y setter para correo
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Métodos getter y setter para profesión
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    // Métodos getter y setter para botón de guardar
    public Button getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(Button btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    // Métodos getter y setter para botón de salir
    public Button getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(Button btnSalir) {
        this.btnSalir = btnSalir;
    }

    // Métodos getter y setter para botón de ver lista
    public Button getBtnVerLista() {
        return btnVerLista;
    }

    public void setBtnVerLista(Button btnVerLista) {
        this.btnVerLista = btnVerLista;
    }

    // Métodos getter y setter para botón de radio masculino
    public RadioButton getRadioMale() {
        return radioMale;
    }

    public void setRadioMale(RadioButton radioMale) {
        this.radioMale = radioMale;
    }

    // Métodos getter y setter para botón de radio femenino
    public RadioButton getRadioFemale() {
        return radioFemale;
    }

    public void setRadioFemale(RadioButton radioFemale) {
        this.radioFemale = radioFemale;
    }
}
