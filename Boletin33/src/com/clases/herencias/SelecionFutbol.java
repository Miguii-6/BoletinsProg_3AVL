
package com.clases.herencias;

import com.clases.interfaz.IntegranteSeleccionFutbol;

public abstract class SelecionFutbol implements IntegranteSeleccionFutbol {
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;

    public SelecionFutbol(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "SelecionFutbol{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
   

    @Override
    public void concentrar() {
        System.out.println("Concentración");
    }

    @Override
    public void viajar() {
        System.out.println("Viajo");
    }

    @Override
    public void entrenar() {
        System.out.println("Entreno");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juego el partido");
    }
    
}
