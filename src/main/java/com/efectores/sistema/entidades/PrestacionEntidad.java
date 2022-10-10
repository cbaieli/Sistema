
package com.efectores.sistema.entidades;

public class PrestacionEntidad {
    private String id;
    private String nombre;

    public PrestacionEntidad() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "PrestacionEntidad{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
