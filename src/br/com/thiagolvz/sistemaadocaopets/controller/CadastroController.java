package br.com.thiagolvz.sistemaadocaopets.controller;

import br.com.thiagolvz.sistemaadocaopets.model.entities.Pet;

import java.util.List;

public class CadastroController {


    public void cadastro(List<String> respostas) {

        if (respostas.get(0).trim().split(" ").length < 2) {
            throw new IllegalArgumentException("O nome deve conter nome e sobrenome.");
        }

        Pet pet = new Pet();

        pet.setNomeCompleto(respostas.get(0));
        pet.setTipo(respostas.get(1));
        pet.setSexo(respostas.get(2));
        pet.setEndereço(respostas.get(3));
        pet.setIdade(Integer.parseInt(respostas.get(4)));
        pet.setPeso(Double.parseDouble(respostas.get(5)));
        pet.setRaca(respostas.get(6));
    }
}
