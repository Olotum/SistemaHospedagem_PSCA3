package Dados;

public class Funcionario extends Pessoa implements Registros {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, int idade, String email, String cargo, double salario) {
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}


