package Dados;
import javax.swing.JOptionPane;
public interface NewPessoa {
    public default Cliente newCliente(){
        String nome = JOptionPane.showInputDialog(
                "Digite o nome:");
        String cpf = JOptionPane.showInputDialog(
                "Digite o CPF:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a idade:"));
        String email = JOptionPane.showInputDialog(
                "Digite o email:");
        String nacionalidade = JOptionPane.showInputDialog(
                "Digite a nacionalidade:");
        String nivel = JOptionPane.showInputDialog(
                "Digite o nivel:");

        Cliente cliente = new Cliente(nome, cpf,idade,email,nacionalidade,nivel);
        return cliente;
    }
    public default Funcionario newFuncionario(){
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

}
