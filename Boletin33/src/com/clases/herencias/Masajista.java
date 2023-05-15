
package com.clases.herencias;

public class Masajista extends SelecionFutbol{
    private String titulacion;
    private Integer anosExperiencia;

    public Masajista(Integer id, String nombre, String apellidos, Integer edad,String titulacion,Integer anos) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anos;
    }
    
    
    public void darMasaje(){
        System.out.println("Masajeando");
    }

    @Override
    public String toString() {
        return super.toString() + "Masajista{" + "titulacion=" + titulacion + ", aniosExperiencia=" + anosExperiencia + '}';
    }
    
}
