package Dados;
import javax.swing.JOptionPane;
public interface NewCliente {
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


}
