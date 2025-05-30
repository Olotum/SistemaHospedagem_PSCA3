package Dados;

public class Cliente extends Pessoa {
    private String nacionalidade;
    private String nivel;

    public Cliente(String nome, String cpf, int idade, String email, String nacionalidade, String nivel) {
        super(nome, cpf, idade, email);
        this.nacionalidade = nacionalidade;
        this.nivel = nivel;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
