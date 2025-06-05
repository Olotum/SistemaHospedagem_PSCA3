package Dados;

public class Reserva  {
    private Acomodacao acomodacao;
    private Cliente cliente;
    private  Pessoa pessoa;
    private String entrada;
    private String saida;

    public Reserva(Acomodacao acomodacao, Cliente cliente, Pessoa pessoa, String entrada, String saida) {
        this.acomodacao = acomodacao;
        this.cliente = cliente;
        this.pessoa = pessoa;
        this.entrada = entrada;
        this.saida = saida;
    }

    public Acomodacao getLocacao() {
        return acomodacao;
    }

    public void setLocacao(Acomodacao acomodacao) {
        this.acomodacao = acomodacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pessoa getpessoa() {
        return pessoa;
    }

    public void setpessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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

    @Override
    public String toString() {
        return "Reserva{" +
                "acomodacao=" + acomodacao +
                ", cliente=" + cliente +
                ", pessoa=" + pessoa +
                ", entrada='" + entrada + '\'' +
                ", saida='" + saida + '\'' +
                '}';
    }
}
