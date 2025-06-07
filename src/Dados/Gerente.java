package Dados;

import javax.swing.*;

public class Gerente extends Pessoa implements FazerReserva{
    private String cargo;
    private double salario;

    public Gerente newGerente(){
        String nome = JOptionPane.showInputDialog(
                "Digite o nome:");
        String cpf = JOptionPane.showInputDialog(
                "Digite o CPF:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a idade:"));
        String email = JOptionPane.showInputDialog(
                "Digite o email:");
        String cargo = JOptionPane.showInputDialog(
                "Digite o cargor:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o salário:"));

        Gerente gerente = new Gerente(nome, cpf,idade,email,cargo,salario);
        return gerente;
    }
    public Funcionario newFuncionario(){
        String nome = JOptionPane.showInputDialog(
                "Digite o nome:");
        String cpf = JOptionPane.showInputDialog(
                "Digite o CPF:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a idade:"));
        String email = JOptionPane.showInputDialog(
                "Digite o email:");
        String cargo = JOptionPane.showInputDialog(
                "Digite o cargor:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o salário:"));

        Funcionario funcionario = new Funcionario(nome, cpf,idade,email,cargo,salario);
        return funcionario;
    }

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
