import Dados.*;
import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Gerente[] gerentes = new Gerente[100];
    Funcionario[] funcionarios = new Funcionario[100];
    Cliente[] clientes = new Cliente[100];
    Empresa[] empresas = new Empresa[100];
    Reserva[] reservas = new Reserva[100];
    Acomodacao[] acomodacaos = new Acomodacao[100];
    gerentes[0] = new Gerente("", "", 0, "", "", 0);
    funcionarios[0] = new Funcionario("", "", 0, "", "", 0);
    clientes[0] = new Cliente("", "", 0, "", "", "");
    empresas[0] = new Empresa("", "");
    acomodacaos[0] = new Acomodacao(empresas[0], "", "", "");
    reservas[0] = new Reserva(acomodacaos[0], clientes[0], gerentes[0], "", "");

    String emailBusca;
    boolean encontrado;

    // Verifica se há pelo menos um gerente cadastrado
    while (gerentes[0] == null) {
        JOptionPane.showMessageDialog(null, "Nenhum gerente encontrado. É necessário cadastrar um gerente antes de continuar.");
        Gerente novoGerente = new Gerente("", "", 0, "", "", 0).newGerente(gerentes);
        gerentes[0] = novoGerente;
        JOptionPane.showMessageDialog(null, "Gerente cadastrado com sucesso!");
    } 
    while (gerentes[0] != null) {
        int tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog(
            "Bem vindo!!! \nSe for um gerente, pressione 1. \nSe não, pressione 2."));

        switch (tipoUsuario) {
            case 1:
                Gerente gerente = null;
                emailBusca = JOptionPane.showInputDialog("Digite seu e-mail:");
                encontrado = false;

                for (Gerente gerenteTemp : gerentes) {
                    if (gerenteTemp != null && gerenteTemp.getEmail().equalsIgnoreCase(emailBusca)) {
                        gerente = gerenteTemp;
                        encontrado = true;
                        JOptionPane.showMessageDialog(null, "Login realizado com sucesso! Bem-vindo, " + gerente.getNome());
                        break;
                    }
                }

                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "E-mail não encontrado. Verifique e tente novamente.");
                }

                if (encontrado) {
                    int funcoes = Integer.parseInt(JOptionPane.showInputDialog(
                        "Escolha uma opção:\n " +
                        "1. Fazer Reserva.\n " +
                        "2. Registrar Empresa \n " +
                        "3. Registrar Cliente.\n " +
                        "4. Registrar Funcionario.\n " +
                        "5. Registrar Gerente.\n " +
                        "6. Sair."));

                    switch (funcoes) {
                        case 1:
                            gerente.newReserva(reservas, acomodacaos, clientes, gerentes);
                            break;
                        case 2:
                            gerente.newEmpresa(empresas);
                            break;
                        case 3:
                            gerente.newCliente(clientes);
                            break;
                        case 4:
                            gerente.newFuncionario(funcionarios);
                            break;
                        case 5:
                            gerente.newGerente(gerentes);
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, "Saindo...");
                            System.exit(0);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida.");
                    }
                }
                break;

            case 2:
    Funcionario funcionario = null;
    emailBusca = JOptionPane.showInputDialog("Digite seu e-mail:");
    encontrado = false;

    for (Funcionario funcionarioTemp : funcionarios) {
        if (funcionarioTemp != null && funcionarioTemp.getEmail().equalsIgnoreCase(emailBusca)) {
            funcionario = funcionarioTemp;
            encontrado = true;
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso! Bem-vindo, " + funcionario.getNome());
            break;
        }
    }

    if (!encontrado) {
        JOptionPane.showMessageDialog(null, "E-mail não encontrado. Verifique e tente novamente.");
    } else {
        int funcoesFuncionario = Integer.parseInt(JOptionPane.showInputDialog(
            "Escolha uma opção:\n" +
            "1. Fazer Reserva\n" +
            "2. Registrar Empresa\n" +
            "3. Registrar Cliente\n" +
            "4. Sair"));

        switch (funcoesFuncionario) {
            case 1:
                funcionario.newReserva(reservas, acomodacaos, clientes, gerentes); // Assumindo que funcionário usa o mesmo método do gerente
                break;
            case 2:
                funcionario.newEmpresa(empresas);
                break;
            case 3:
                funcionario.newCliente(clientes);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Saindo...");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }
    break;
}
    }
}
}