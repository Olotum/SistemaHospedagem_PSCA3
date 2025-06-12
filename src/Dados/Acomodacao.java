package Dados;

public class Acomodacao  {
    private Empresa empresa;
    private String endereco;
    private String nome;


    public Acomodacao(Empresa empresa, String endereco, String nome) {
        this.empresa = empresa;
        this.endereco = endereco;
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
