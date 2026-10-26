package com.hachimakidev.biblioapp.model;

import com.google.gson.annotations.SerializedName;

public class User {

    private String rut;
    private String nombre;
    private String email;
    private int edad;

    @SerializedName(
        value = "puede_solicitar_prestamos",
        alternate = {"puedeSolicitarPrestamos"}
    )
    private boolean puedeSolicitarPrestamos;

    public User() {
    }

    public User(String rut, String nombre, String email, int edad, boolean puedeSolicitarPrestamos) {
        this.rut = rut;
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.puedeSolicitarPrestamos = puedeSolicitarPrestamos;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isPuedeSolicitarPrestamos() {
        return puedeSolicitarPrestamos;
    }

    public void setPuedeSolicitarPrestamos(boolean puedeSolicitarPrestamos) {
        this.puedeSolicitarPrestamos = puedeSolicitarPrestamos;
    }
}