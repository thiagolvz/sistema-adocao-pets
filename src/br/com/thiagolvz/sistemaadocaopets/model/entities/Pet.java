package br.com.thiagolvz.sistemaadocaopets.model.entities;

import br.com.thiagolvz.sistemaadocaopets.model.entities.enums.Sexo;
import br.com.thiagolvz.sistemaadocaopets.model.entities.enums.Tipo;

public class Pet {
    private String nomeCompleto;
    private Tipo tipo;
    private Sexo sexo;
    private Endereco endereco;
    private Double idade;
    private Double peso;
    private String raca;

    public Pet(Endereco endereco, Double idade, String nomeCompleto, Double peso, String raca, Sexo sexo, Tipo tipo) {
        this.endereco = endereco;
        this.idade = idade;
        this.nomeCompleto = nomeCompleto;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Double getIdade() {
        return idade;
    }

    public void setIdade(Double idade) {
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
