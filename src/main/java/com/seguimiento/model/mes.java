package com.seguimiento.model;

@Entity
@Table(name = "mes")
public class mes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMes;
    private String nombre;
    private int año;

    public int getIdMes() {
        return idMes;
    }

    public void setIdMes(int idMes) {
        this.idMes = idMes;
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
