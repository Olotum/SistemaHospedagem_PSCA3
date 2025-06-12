package Dados;

public class Gerente extends Pessoa implements RegistrosGerente{
    private String cargo;
    private double salario;
    

    public Gerente(String nome, String cpf, int idade, String email, String cargo, double salario) {
        super(nome, cpf, idade, email);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
