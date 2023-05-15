
package com.clases.herencias;

public class Entrenador extends SelecionFutbol {
    private Integer idFederacion;

    public Entrenador(Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        idFederacion = id;
    }

    
    
    public void planificarEntrenamiento(){
        System.out.println("planificando");
    }

    @Override
    public String toString() {
        return super.toString() + "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    
    
}
