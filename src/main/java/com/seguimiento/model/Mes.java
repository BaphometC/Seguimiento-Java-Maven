package com.seguimiento.model;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name = "mes")
public class Mes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private int año;
    @OneToMany(mappedBy = "mes")
	private List<Suscripcion> suscripciones;

    public long getIdMes() {
        return id;
    }

    public void setIdMes(long idMes) {
        this.id = idMes;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
