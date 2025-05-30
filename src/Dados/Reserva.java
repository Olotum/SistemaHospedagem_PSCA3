package Dados;

public class Reserva {
    private Locacao locacao;
    private Cliente cliente;
    private  Funcionario funcionario;
    private String entrada;
    private String saida;

    public Reserva(Locacao locacao, Cliente cliente, Funcionario funcionario, String entrada, String saida) {
        this.locacao = locacao;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.entrada = entrada;
        this.saida = saida;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }
}
