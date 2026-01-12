package br.com.thiagolvz.sistemaadocaopets.model.entities;

public class Pet {
    private String nomeCompleto;
    private String tipo;
    private String sexo;
    private String endereço;
    private Integer idade;
    private Double peso;
    private String raca;


    public Pet(String nomeCompleto, String endereço, Integer idade, Double peso, String raca, String sexo, String tipo) {
        this.nomeCompleto = nomeCompleto;
        this.endereço = endereço;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
        this.sexo = sexo;
        this.tipo = tipo;
    }

    public Pet() {
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
