
package boletin34;

import java.util.ArrayList;

public class ListaEmpleados {
    private ArrayList<Empregado> empleados;

    public ListaEmpleados() {
        this.empleados = new ArrayList<>();
    }

    public void engadirEmpregado(Empregado empregado) {
        this.empleados.add(empregado);
    }

    public ArrayList<Empregado> obterEmpregados() {
        return this.empleados;
    }

    public double calcularSoldoTotal() {
        double soldoTotal = 0;
        for (Empregado empregado : this.empleados) {
            soldoTotal += empregado.calcularSoldo();
        }
        return soldoTotal;
    }

    
}
