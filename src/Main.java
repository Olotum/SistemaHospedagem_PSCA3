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
        String emailBusca;
        boolean encontrado;

        int cadastro;
        while (true) {
            int tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo!!! \nSe for um gerente, precione 1. \nSe não, precione 2."));
            switch (tipoUsuario) {
                case 1:
                    Gerente gerente = null;
                    emailBusca = JOptionPane.showInputDialog("Digite seu e-mail:");
                    encontrado = false;

                    for (Gerente gerenteTemp : gerentes) {
                        if (gerenteTemp != null && gerenteTemp.getEmail().equalsIgnoreCase(emailBusca)) {
                            gerente = gerenteTemp; // Define o gerente como usuário logado
                            encontrado = true;
                            JOptionPane.showMessageDialog(null, "Login realizado com sucesso! Bem-vindo, " + gerente.getNome());
                            break;
                        }
                    }

                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "E-mail não encontrado. Verifique e tente novamente.");
                    }
                    int funcoes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Escolha uma opção:\n " +
                                    "1. Fazer Reserva.\n " +
                                    "2. Registrar Empresa \n " +
                                    "3. Registrar Cliente.\n " +
                                    "4. Registrar Funcionario (Caso seja Gerernte).\n " +
                                    "5. Registrar Gerente (Caso seja Gerernte).\n " +
                                    "6. Sair."));
                    switch (funcoes) {
                        case 1:
                        case 2:
                        case 3:

                            gerente.newCliente();


                    }

            case 2:
                Funcionario funcionario;
                emailBusca = JOptionPane.showInputDialog("Digite seu e-mail:");
                encontrado = false;

                for (Funcionario funcionarioTemp : funcionarios) {
                    if (funcionarioTemp != null && funcionarioTemp.getEmail().equalsIgnoreCase(emailBusca)) {
                        funcionario = funcionarioTemp; // Define o gerente como usuário logado
                        encontrado = true;
                        JOptionPane.showMessageDialog(null, "Login realizado com sucesso! Bem-vindo, " + funcionario.getNome());
                        break;
                    }
                }

                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "E-mail não encontrado. Verifique e tente novamente.");
                }
                break;
            }

        }


    }
}

        /*Gerente gerente = new Gerente("jo", "1", 1, "sad", "asd", 1.1);
        Cliente cliente = gerente.newCliente();
        Empresa empresa = new Empresa("sla", "adsa");
        Casa casa = new Casa(empresa, "sda", "das", "dsa", 1, "dsa");
        Reserva reserva = gerente.fazerReserva(casa, cliente, gerente);
        System.out.println(reserva);*/
