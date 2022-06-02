package com.seguimiento.model;

import javax.persistence.*;

@Entity
@Table(name = "suscripcion")
public class Suscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fechaInicio;
    private String duracion;
    private String ciclo;
    private String diasRecordatorio;
    private String tipoMoneda;

    public Suscripcion() {
        //
    }

    public Suscripcion(
        String fechaInicio,
        String duracion,
        String ciclo,
        String diasRecordatorio,
        String tipoMoneda
    ) {
        super();
        this.fechaInicio = fechaInicio;
        this.duracion = duracion;
        this.ciclo = ciclo;
        this.diasRecordatorio = diasRecordatorio;
        this.tipoMoneda = tipoMoneda;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getCiclo() {
        return ciclo;
    }
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getDiasRecordatorio() {
        return diasRecordatorio;
    }
    public void setDiasRecordatorio(String diasRecordatorio) {
        this.diasRecordatorio = diasRecordatorio;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }
    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
}
