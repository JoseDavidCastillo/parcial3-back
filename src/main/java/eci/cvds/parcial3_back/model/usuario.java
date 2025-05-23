package eci.cvds.parcial3_back.model;

import jakarta.validation.constraints.NotNull;

public class Usuario {
    @NotNull
    private String correo;
    @NotNull
    private String nombre;
    @NotNull
    private String cedula;

    public Usuario() {
    }

    public Usuario(String correo, String nombre, String cedula) {
        this.correo = correo;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}