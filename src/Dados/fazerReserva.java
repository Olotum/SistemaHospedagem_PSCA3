package Dados;

import javax.swing.*;

public interface fazerReserva {

    public default Reserva fazerReserva(Acomodacao acomodacao,Cliente cliente, Pessoa pessoa){
        String entrada = JOptionPane.showInputDialog("Data de entrada:");
        String saida = JOptionPane.showInputDialog("Data de saída:");
        Reserva reserva = new Reserva(acomodacao, cliente, pessoa, entrada, saida);

        return reserva;
    }
}
