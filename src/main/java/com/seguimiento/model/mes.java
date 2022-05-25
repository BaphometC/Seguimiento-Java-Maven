package com.seguimiento.model;
import javax.persistence.*;
@Entity
@Table(name = "mes")
public class mes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private int año;

    public int getIdMes() {
        return id;
    }

    public void setIdMes(int idMes) {
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
