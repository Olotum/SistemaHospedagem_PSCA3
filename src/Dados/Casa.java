package Dados;

public class Casa extends Acomodacao{
    private int numeroDeQuartos;
    private String tipo;

    public Casa(Empresa empresa, String endereco, String nome, String tipo, int numeroDeQuartos, String tipo1) {
        super(empresa, endereco, nome, tipo);
        this.numeroDeQuartos = numeroDeQuartos;
        this.tipo = tipo1;
    }

    public int getNumeroDeQuartos() {
        return numeroDeQuartos;
    }

    public void setNumeroDeQuartos(int numeroDeQuartos) {
        this.numeroDeQuartos = numeroDeQuartos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
