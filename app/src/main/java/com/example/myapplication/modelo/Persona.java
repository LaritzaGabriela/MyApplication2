package com.example.myapplication.modelo;

import android.widget.Button;
import android.widget.RadioButton;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String dni;
    private String sexo;
    private String correo;
    private String profesion;
    private Button btnGuardar, btnSalir, btnVerLista;
    private RadioButton radioMale, radioFemale;

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
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Button getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(Button btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public Button getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(Button btnSalir) {
        this.btnSalir = btnSalir;
    }

    public Button getBtnVerLista() {
        return btnVerLista;
    }

    public void setBtnVerLista(Button btnVerLista) {
        this.btnVerLista = btnVerLista;
    }

    public RadioButton getRadioMale() {
        return radioMale;
    }

    public void setRadioMale(RadioButton radioMale) {
        this.radioMale = radioMale;
    }

    public RadioButton getRadioFemale() {
        return radioFemale;
    }

    public void setRadioFemale(RadioButton radioFemale) {
        this.radioFemale = radioFemale;
    }
}
