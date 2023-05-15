
package com.miguel.app;

import com.clases.herencias.Entrenador;
import com.clases.herencias.Futbolista;
import com.clases.herencias.Masajista;
import com.clases.herencias.Seleccionador;
import com.clases.herencias.SelecionFutbol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Aplicacion {
    
    public class Metodos{
        public static ArrayList engadir(SelecionFutbol obj,ArrayList<SelecionFutbol> lista){
            lista.add(obj);
            return lista;
        }
        
        public static void show(ArrayList<SelecionFutbol> lista){
            for (SelecionFutbol selecionFutbol : lista) {
                System.out.println(selecionFutbol + " ");
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SelecionFutbol> lista = new ArrayList<>();
        SelecionFutbol obj1 = new Entrenador(10,"Pepe","Fernandez",28);
        SelecionFutbol obj2 = new Futbolista(11,"Samuel","Mariño",22,6,"Barcelona");
        SelecionFutbol obj3 = new Masajista(12,"Jorge","Ruiz",45,"Dra Masajista",7);
        SelecionFutbol obj4 = new Seleccionador(13,"Cristiam","Martinez",33);
        Metodos.engadir(obj1, lista);
        Metodos.engadir(obj2, lista);
        Metodos.engadir(obj3, lista);
        Metodos.engadir(obj4, lista);
        
        obj1.concentrar();
       
        
        Metodos.show(lista);
        
        
        
        int [] numeros = {5,2,1,4,3};
        int aux = 0;
        
         for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
            
        }
         System.out.println("\n-----");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]== 8) {
                aux = numeros[i];
                numeros[i] = numeros[1];
                numeros[1]= aux;
            }
            
        }
        System.out.println("-----");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
            
        }
        
        
      
         System.out.println("\n-----");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
            
        }
        
        
        Arrays.sort(numeros);
        
     
        System.out.println("\n-----");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
            
        }
        
        Scanner sc = new Scanner(System.in);
        
        int [] numeros2 = new int[5];
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Introduce un numero");
            numeros2[i] = sc.nextInt();
            
        }
        
       
        
        System.out.println("\n-----");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros2[i]+" ");
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
    
    
    
    
    
    
}
