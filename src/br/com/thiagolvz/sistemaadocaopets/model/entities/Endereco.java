package br.com.thiagolvz.sistemaadocaopets.model.entities;

public class Endereco {
    private String numero;
    private String cidade;
    private String rua;

    public Endereco(String cidade, String numero, String rua) {
        this.cidade = cidade;
        this.numero = numero;
        this.rua = rua;
    }

    public Endereco() {
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}


