package org.example.modelos;


public class Persona {
    public Persona(Integer id, String documento, String nombre, String correro, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.correro = correro;
        this.ubicacion = ubicacion;
    }

    Integer id;
    String documento;
    String nombre;
    String correro;
    Integer ubicacion;

}
