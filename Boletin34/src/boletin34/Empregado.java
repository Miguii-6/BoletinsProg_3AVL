

package boletin34;
import java.util.GregorianCalendar;

public abstract class Empregado {
    protected String dni;
    protected String nome;
    protected String apelidos;
    protected GregorianCalendar dataIngreso;

    public Empregado(String dni, String nome, String apelidos, GregorianCalendar dataIngreso) {
        this.dni = dni;
        this.nome = nome;
        this.apelidos = apelidos;
        this.dataIngreso = dataIngreso;
    }

    public abstract double calcularSoldo();

    public String obterDni() {
        return this.dni;
    }

    public String obterNome() {
        return this.nome;
    }

    public String obterApelidos() {
        return this.apelidos;
    }

    public GregorianCalendar obterDataIngreso() {
        return this.dataIngreso;
    }
}
