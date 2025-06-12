package Dados;

public class Hotel extends Acomodacao{
    private int numeroDoQuarto;
    private String tipo;


    public Hotel(Empresa empresa, String endereco, String nome, String tipo, int numeroDoQuarto) {
        super(empresa, endereco, nome);
        this.numeroDoQuarto = numeroDoQuarto;
        this.tipo = tipo;
    }


    public int getnumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setnumeroDoQuarto(int numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}


