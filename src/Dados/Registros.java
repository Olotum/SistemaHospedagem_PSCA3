package Dados;
import javax.swing.JOptionPane;
public interface Registros {
    default Cliente newCliente(Cliente[] clientes) {
        String cpf = JOptionPane.showInputDialog("Digite o CPF:");
        String email = JOptionPane.showInputDialog("Digite o email:");

        // Verificar se já existe cliente com esse CPF ou email
        for (Cliente c : clientes) {
            if (c != null && (c.getCpf().equals(cpf) || c.getEmail().equalsIgnoreCase(email))) {
                JOptionPane.showMessageDialog(null, "Já existe um cliente com este CPF ou email.");
                return null;
            }
        }

        String nome = JOptionPane.showInputDialog("Digite o nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        String nacionalidade = JOptionPane.showInputDialog("Digite a nacionalidade:");
        String nivel = JOptionPane.showInputDialog("Digite o nível:");

        int confirmar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar este cliente?");
        if (confirmar == JOptionPane.YES_OPTION) {
            Cliente novo = new Cliente(nome, cpf, idade, email, nacionalidade, nivel);

            // Adiciona na próxima posição livre
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i] == null) {
                    clientes[i] = novo;
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                    return novo;
                }
            }

            JOptionPane.showMessageDialog(null, "Lista de clientes cheia!");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
        }

        return null;
    }

    default  Acomodacao newAcomodacao(Acomodacao[] acomodacoes, Empresa[] empresas) {
        String cnpj = JOptionPane.showInputDialog("Digite o CNPJ da empresa:");

        // Buscar a empresa pelo CNPJ
        Empresa empresaEncontrada = null;
        for (Empresa e : empresas) {
            if (e != null && e.getCnpj().equals(cnpj)) {
                empresaEncontrada = e;
                break;
            }
        }

        if (empresaEncontrada == null) {
            JOptionPane.showMessageDialog(null, "Empresa com esse CNPJ não encontrada.");
            return null;
        }

        // Dados da acomodação
        String nome = JOptionPane.showInputDialog("Digite o nome da acomodação:");
        String endereco = JOptionPane.showInputDialog("Digite o endereço:");
        String tipo = JOptionPane.showInputDialog("Digite o tipo da acomodação:");

        int confirmar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar esta acomodação?");
        if (confirmar == JOptionPane.YES_OPTION) {
            Acomodacao nova = new Acomodacao(empresaEncontrada, endereco, nome, tipo);

            // Adicionar na primeira posição nula
            for (int i = 0; i < acomodacoes.length; i++) {
                if (acomodacoes[i] == null) {
                    acomodacoes[i] = nova;
                    JOptionPane.showMessageDialog(null, "Acomodação cadastrada com sucesso!");
                    return nova;
                }
            }

            JOptionPane.showMessageDialog(null, "Lista de acomodações cheia!");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
        }

        return null;
    }
    default Empresa newEmpresa(Empresa[] empresas) {
        String cnpj = JOptionPane.showInputDialog("Digite o CNPJ:");

        // Verificar se já existe empresa com esse CNPJ
        for (Empresa e : empresas) {
            if (e != null && e.getCnpj().equals(cnpj)) {
                JOptionPane.showMessageDialog(null, "Já existe uma empresa com este CNPJ.");
                return null;
            }
        }

        String nome = JOptionPane.showInputDialog("Digite o nome da empresa:");

        int confirmar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar esta empresa?");
        if (confirmar == JOptionPane.YES_OPTION) {
            Empresa nova = new Empresa(nome, cnpj);

            // Adiciona na próxima posição livre
            for (int i = 0; i < empresas.length; i++) {
                if (empresas[i] == null) {
                    empresas[i] = nova;
                    JOptionPane.showMessageDialog(null, "Empresa cadastrada com sucesso!");
                    return nova;
                }
            }

            JOptionPane.showMessageDialog(null, "Lista de empresas cheia!");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
        }

        return null;
    }

    default Reserva newReserva(Reserva[] reservas, Acomodacao[] acomodacoes, Cliente[] clientes, Pessoa[] pessoas) {
        // Buscar acomodação
        String nomeAcomodacao = JOptionPane.showInputDialog("Digite o nome da acomodação:");
        Acomodacao acomodacaoSelecionada = null;
        for (Acomodacao a : acomodacoes) {
            if (a != null && a.getNome().equalsIgnoreCase(nomeAcomodacao)) {
                acomodacaoSelecionada = a;
                break;
            }
        }
        if (acomodacaoSelecionada == null) {
            JOptionPane.showMessageDialog(null, "Acomodação não encontrada.");
            return null;
        }

        // Buscar cliente
        String cpfCliente = JOptionPane.showInputDialog("Digite o CPF do cliente:");
        Cliente clienteSelecionado = null;
        for (Cliente c : clientes) {
            if (c != null && c.getCpf().equals(cpfCliente)) {
                clienteSelecionado = c;
                break;
            }
        }
        if (clienteSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
            return null;
        }

        // Buscar pessoa (hóspede)
        String cpfPessoa = JOptionPane.showInputDialog("Digite o CPF da pessoa hospedada:");
        Pessoa pessoaSelecionada = null;
        for (Pessoa p : pessoas) {
            if (p != null && p.getCpf().equals(cpfPessoa)) {
                pessoaSelecionada = p;
                break;
            }
        }
        if (pessoaSelecionada == null) {
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
            return null;
        }

        // Informações de reserva
        String entrada = JOptionPane.showInputDialog("Digite a data de entrada (ex: 12/06/2025):");
        String saida = JOptionPane.showInputDialog("Digite a data de saída (ex: 14/06/2025):");

        int confirmar = JOptionPane.showConfirmDialog(null, "Deseja confirmar a reserva?");
        if (confirmar == JOptionPane.YES_OPTION) {
            Reserva novaReserva = new Reserva(acomodacaoSelecionada, clienteSelecionado, pessoaSelecionada, entrada, saida);

            // Adicionar na primeira posição livre
            for (int i = 0; i < reservas.length; i++) {
                if (reservas[i] == null) {
                    reservas[i] = novaReserva;
                    JOptionPane.showMessageDialog(null, "Reserva cadastrada com sucesso!");
                    return novaReserva;
                }
            }

            JOptionPane.showMessageDialog(null, "Lista de reservas cheia!");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro de reserva cancelado.");
        }

        return null;
    }



}
