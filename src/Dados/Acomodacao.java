package dados;

public class Acomodacao  {
    private Empresa empresa;
    private String endereco;
    private String nome;
    private String tipo;


    public Acomodacao(Empresa empresa, String endereco, String nome, String tipo) {
        this.empresa = empresa;
        this.endereco = endereco;
        this.nome = nome;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
