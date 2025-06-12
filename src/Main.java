import Dados.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
    Gerente[] gerentes = new Gerente[100];
    Funcionario[] funcionarios = new Funcionario[100];
    Cliente[] clientes = new Cliente[100];
    Empresa[] empresas = new Empresa[100];
    Reserva[] reservas = new Reserva[100];
    Casa[] casas = new Casa[100];
    Hotel[] hoteis = new Hotel[100];
    gerentes[0] = new Gerente("", "", 0, "", "", 0);
    funcionarios[0] = new Funcionario("", "", 0, "", "", 0);
    clientes[0] = new Cliente("", "", 0, "", "", "");
    empresas[0] = new Empresa("", "");
    casas[0] = new Casa(empresas[0], "", "", "", 0);
    hoteis[0] = new Hotel(empresas[0], "", "", "", 0);
    reservas[0] = new Reserva(hoteis[0], clientes[0], gerentes[0], "", "");

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
        "Bem-vindo!!!\nSe for um gerente, pressione 1.\nSe for um funcionário, pressione 2."));

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
                JOptionPane.showMessageDialog(null, "E-mail não encontrado.");
                break;
            }
            boolean logadoGerente = true;
            while (logadoGerente) {
                int funcoes = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opção:\n" +
                    "1. Fazer Reserva\n" +
                    "2. Registrar Empresa\n" +
                    "3. Registrar Cliente\n" +
                    "4. Registrar Funcionário\n" +
                    "5. Registrar Gerente\n" +
                    "6. Registrar Acomodação\n" +
                    "7. Logout"));

                switch (funcoes) {
                    case 1:
                        gerente.newReserva(reservas, casas, hoteis, clientes, gerentes);
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
                        int tipoAcomodacao = Integer.parseInt(JOptionPane.showInputDialog(
                            "Qual tipo de acomodação deseja cadastrar?\n" +
                            "1. Casa\n" +
                            "2. Hotel"));
                                if (tipoAcomodacao == 1) {
                                    gerente.newCasa(casas, empresas);
                                } else if (tipoAcomodacao == 2) {
                                    gerente.newHotel(hoteis, empresas);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Tipo inválido.");
                                }
                        break;
                            
                    case 7:
                        logadoGerente = false;
                        JOptionPane.showMessageDialog(null, "Logout realizado.");
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
                JOptionPane.showMessageDialog(null, "E-mail não encontrado.");
                break;
            }
            boolean logadoFuncionario = true;
            while (logadoFuncionario) {
                int funcoesFuncionario = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opção:\n" +
                    "1. Fazer Reserva\n" +
                    "2. Registrar Empresa\n" +
                    "3. Registrar Cliente\n" +
                    "4. Registrar Acomodação\n" +
                    "5. Logout"));

                switch (funcoesFuncionario) {
                    case 1:
                        funcionario.newReserva(reservas, casas, hoteis, clientes, funcionarios);
                        break;
                    case 2:
                        funcionario.newEmpresa(empresas);
                        break;
                    case 3:
                        funcionario.newCliente(clientes);
                        break;
                    case 4:
                        int tipoAcomodacao = Integer.parseInt(JOptionPane.showInputDialog(
                            "Qual tipo de acomodação deseja cadastrar?\n" +
                            "1. Casa\n" +
                            "2. Hotel"));
                        if (tipoAcomodacao == 1) {
                            funcionario.newCasa(casas, empresas);
                        } else if (tipoAcomodacao == 2) {
                            funcionario.newHotel(hoteis, empresas);
                        } else {
                            JOptionPane.showMessageDialog(null, "Tipo inválido.");
                        }
                        break;
                    case 5:
                        logadoFuncionario = false;
                        JOptionPane.showMessageDialog(null, "Logout realizado.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
            }
            break;

        default:
            JOptionPane.showMessageDialog(null, "Tipo de usuário inválido.");
    }
}
}
}