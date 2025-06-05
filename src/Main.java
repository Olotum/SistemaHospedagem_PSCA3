import Dados.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("jo", "1", 1, "sad", "asd", 1.1);
        Cliente cliente = gerente.newCliente();
        Empresa empresa = new Empresa("sla", "adsa");
        Casa casa = new Casa(empresa, "sda", "das", "dsa", 1, "dsa");
        Reserva reserva = gerente.fazerReserva(casa, cliente, gerente);
        System.out.println(reserva);

    }
}