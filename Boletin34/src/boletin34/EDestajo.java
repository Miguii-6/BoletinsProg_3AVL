
package boletin34;

import java.util.GregorianCalendar;

public class EDestajo extends Empregado {
    private int clientesCaptados;
    private double complementoPorCliente;

    public EDestajo(String dni, String nome, String apelidos, GregorianCalendar dataIngreso, int clientesCaptados, double complementoPorCliente) {
        super(dni, nome, apelidos, dataIngreso);
        this.clientesCaptados = clientesCaptados;
        this.complementoPorCliente = complementoPorCliente;
    }

    @Override
    public double calcularSoldo() {
        return this.complementoPorCliente * this.clientesCaptados;
    }

    public int obterClientesCaptados() {
        return this.clientesCaptados;
    }

    public double obterComplementoPorCliente() {
        return this.complementoPorCliente;
    }
}

