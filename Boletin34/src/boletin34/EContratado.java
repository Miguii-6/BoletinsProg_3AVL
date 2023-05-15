
package boletin34;

import java.util.GregorianCalendar;

public class EContratado extends Empregado {
    private double soldoBasico;

    public EContratado(String dni, String nome, String apelidos, GregorianCalendar dataIngreso, double soldoBasico) {
        super(dni, nome, apelidos, dataIngreso);
        this.soldoBasico = soldoBasico;
    }

    @Override
    public double calcularSoldo() {
        double porcentaxe = calcularPorcentaxe();
        return this.soldoBasico * (1 + porcentaxe / 100);
    }

    private double calcularPorcentaxe() {
        int anosTraballados = calcularAnosTraballados();
        if (anosTraballados <= 3) {
            return 5;
        } else if (anosTraballados <= 7) {
            return 10;
        } else if (anosTraballados <= 15) {
            return 15;
        } else {
            return 20;
        }
    }

    private int calcularAnosTraballados() {
        GregorianCalendar hoxe = new GregorianCalendar();
        int anos = hoxe.get(GregorianCalendar.YEAR) - this.dataIngreso.get(GregorianCalendar.YEAR);
        int meses = hoxe.get(GregorianCalendar.MONTH) - this.dataIngreso.get(GregorianCalendar.MONTH);
        int dias = hoxe.get(GregorianCalendar.DAY_OF_MONTH) - this.dataIngreso.get(GregorianCalendar.DAY_OF_MONTH);
        if (dias < 0) {
            meses--;
        }
        if (meses < 0) {
            anos--;
        }
        return anos;
    }
}

