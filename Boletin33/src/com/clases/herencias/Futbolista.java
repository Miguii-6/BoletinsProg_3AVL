
package com.clases.herencias;

public class Futbolista extends SelecionFutbol{
    private Integer dorsal;
    private String demarcacion;

    public Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer dorsal,String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

   
    

    
    public void entrevista(){
        System.out.println("soy entrevistado");
    }
}
