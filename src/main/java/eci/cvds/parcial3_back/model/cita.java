package eci.cvds.parcial3_back.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

@Document(collection = "citas")
public class Cita {
    @Id
    @NotNull
    private String id;
    @NotNull
    private LocalDateTime fecha;
    @NotNull
    private Espe especialidad;
    @NotNull
    private String nombreDoctor;
    @NotNull
    private String ubicacion;
    @NotNull
    private boolean estado;
    @NotNull
    private Usuario usuario;

    public Cita() {
    }

    public Cita(String id,LocalDateTime fecha, Espe especialidad, String nombreDoctor, String ubicacion, boolean estado, Usuario usuario) {
        this.id = id;
        this.fecha = fecha;
        this.especialidad = especialidad;
        this.nombreDoctor = nombreDoctor;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.usuario = usuario;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Espe getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Espe especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}