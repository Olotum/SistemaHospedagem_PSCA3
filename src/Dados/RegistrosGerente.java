package Dados;
import javax.swing.JOptionPane;
public interface RegistrosGerente extends Registros {
    default Gerente newGerente(Gerente[] gerentes) {
        String cpf = JOptionPane.showInputDialog("Digite o CPF:");
        String email = JOptionPane.showInputDialog("Digite o email:");

        // Verificar se já existe
        for (Gerente g : gerentes) {
            if (g != null && (g.getCpf().equals(cpf) || g.getEmail().equalsIgnoreCase(email))) {
                JOptionPane.showMessageDialog(null, "Já existe um gerente com este CPF ou email.");
                return null;
            }
        }

        String nome = JOptionPane.showInputDialog("Digite o nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        String cargo = JOptionPane.showInputDialog("Digite o cargo:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));

        int confirmar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar este gerente?");
        if (confirmar == JOptionPane.YES_OPTION) {
            Gerente novo = new Gerente(nome, cpf, idade, email, cargo, salario);

            // Adiciona na próxima posição livre
            for (int i = 0; i < gerentes.length; i++) {
                if (gerentes[i] == null) {
                    gerentes[i] = novo;
                    JOptionPane.showMessageDialog(null, "Gerente cadastrado com sucesso!");
                    return novo;
                }
            }

            JOptionPane.showMessageDialog(null, "Lista de gerentes cheia!");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
        }

        return null;
    }

    default  Funcionario newFuncionario(Funcionario[] funcionarios) {
        String cpf = JOptionPane.showInputDialog("Digite o CPF:");
        String email = JOptionPane.showInputDialog("Digite o email:");

        // Verificar se já existe
        for (Funcionario f : funcionarios) {
            if (f != null && (f.getCpf().equals(cpf) || f.getEmail().equalsIgnoreCase(email))) {
                JOptionPane.showMessageDialog(null, "Já existe um funcionário com este CPF ou email.");
                return null;
            }
        }

        String nome = JOptionPane.showInputDialog("Digite o nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        String cargo = JOptionPane.showInputDialog("Digite o cargo:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));

        int confirmar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar este funcionário?");
        if (confirmar == JOptionPane.YES_OPTION) {
            Funcionario novo = new Funcionario(nome, cpf, idade, email, cargo, salario);

            // Adiciona na próxima posição livre
            for (int i = 0; i < funcionarios.length; i++) {
                if (funcionarios[i] == null) {
                    funcionarios[i] = novo;
                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
                    return novo;
                }
            }

            JOptionPane.showMessageDialog(null, "Lista de funcionários cheia!");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
        }

        return null;
    }
    
}
