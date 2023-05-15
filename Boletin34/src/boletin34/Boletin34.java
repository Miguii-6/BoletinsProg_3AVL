
package boletin34;

import java.util.GregorianCalendar;

public class Boletin34 {

    public static void main(String[] args) {
        ListaEmpleados lista = new ListaEmpleados();
        
        GregorianCalendar dataIngreso1 = new GregorianCalendar(2020, 10, 15);
        EContratado empregado1 = new EContratado("12345678A", "Pepito", "Perez", dataIngreso1, 1000);
        lista.engadirEmpregado(empregado1);
        
        GregorianCalendar dataIngreso2 = new GregorianCalendar(2015, 3, 1);
        EContratado empregado2 = new EContratado("87654321B", "Juanita", "Gonzalez", dataIngreso2, 1500);
        lista.engadirEmpregado(empregado2);
        
        GregorianCalendar dataIngreso3 = new GregorianCalendar(2010, 6, 23);
        EDestajo empregado3 = new EDestajo("999888777C", "Pedro", "Rodriguez", dataIngreso3, 50, 5);
        lista.engadirEmpregado(empregado3);
        
        double soldoTotal = lista.calcularSoldoTotal();
        System.out.println("O soldo total dos empregados é: " + soldoTotal);
    }
    }
    

