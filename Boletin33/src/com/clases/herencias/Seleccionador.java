
package com.clases.herencias;


public class Seleccionador extends SelecionFutbol{
    private Integer idSelec;

    public Seleccionador(Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        idSelec = id;
    }

  
    
   
    public void seleccionarJugador(){
        System.out.println("Seleccionando jugador");
    }

    @Override
    public String toString() {
        return super.toString() + "Seleccionador{" + "idSelec=" + idSelec + '}';
    }
    
    
    
}
