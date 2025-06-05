package Dados;

public class Gerente extends Pessoa implements fazerReserva{
    private String cargo;
    private String salario;

    public Gerente(String nome, String cpf, int idade, String email, String cargo, String salario) {
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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
