package br.com.thiagolvz.sistemaadocaopets.controller;

import br.com.thiagolvz.sistemaadocaopets.model.constants.ValoresPadrao;
import br.com.thiagolvz.sistemaadocaopets.model.entities.Endereco;
import br.com.thiagolvz.sistemaadocaopets.model.entities.Pet;
import br.com.thiagolvz.sistemaadocaopets.model.entities.enums.Sexo;
import br.com.thiagolvz.sistemaadocaopets.model.entities.enums.Tipo;
import static br.com.thiagolvz.sistemaadocaopets.model.constants.ValoresPadrao.*;

import java.util.List;

public class CadastroController {

    public Pet cadastro(List<String> respostas) {

        Pet pet = new Pet();

        String nomeCompleto = respostas.get(0);

        if (nomeCompleto == null || nomeCompleto.trim().isEmpty()) {
            pet.setNomeCompleto(NAO_INFORMADO_TEXTO);
        } else {
            nomeCompleto = nomeCompleto.trim();

            if (nomeCompleto.split(" ").length < 2) {
                throw new IllegalArgumentException("O nome deve conter nome e sobrenome.");
            }

            if (!nomeCompleto.matches("^[A-Za-zÀ-ÿ ]+$")) {
                throw new IllegalArgumentException("O nome não pode conter caracteres especiais.");
            }

            pet.setNomeCompleto(nomeCompleto);
        }

        try {
            String tipoStr = respostas.get(1).trim().toUpperCase();
            pet.setTipo(Tipo.valueOf(tipoStr));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Tipo inválido. Use: Cachorro ou Gato.");
        }

        try {
            String sexoStr = respostas.get(2).trim().toUpperCase();
            pet.setSexo(Sexo.valueOf(sexoStr));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Sexo inválido. Use: Macho ou Fêmea.");
        }

        // endereço
        String rua = respostas.get(5);
        String numero = respostas.get(3);
        String cidade = respostas.get(4);

        Endereco endereco = new Endereco();

        if (numero == null || numero.trim().isEmpty()) {
            endereco.setNumero(NAO_INFORMADO_TEXTO);
        } else {
            endereco.setNumero(numero);
        }
        endereco.setCidade(cidade);
        endereco.setRua(rua);
        pet.setEndereco(endereco);

        String idadeStr = respostas.get(6);

        if (idadeStr == null || idadeStr.trim().isEmpty()) {
            pet.setIdade(NAO_INFORMADO_DOUBLE);
        } else {
            try {
                idadeStr = idadeStr.trim().replace(",", ".");
                double idade = Double.parseDouble(idadeStr);

                if (idade <= 0 || idade > 20) {
                    throw new IllegalArgumentException("Idade inválida.");
                }

                pet.setIdade(idade);

            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Idade inválida. Digite apenas números.");
            }
        }

        String pesoStr = respostas.get(7);

        if (pesoStr == null || pesoStr.trim().isEmpty()) {
            pet.setPeso(NAO_INFORMADO_DOUBLE);
        } else {
            try {
                pesoStr = pesoStr.trim().replace(",", ".");
                double peso = Double.parseDouble(pesoStr);

                if (peso < 0.5 || peso > 60) {
                    throw new IllegalArgumentException("Peso deve estar entre 0.5kg e 60kg.");
                }

                pet.setPeso(peso);

            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Peso inválido. Digite apenas números.");
            }
        }

        String racaStr = respostas.get(8);

        if (racaStr == null || racaStr.trim().isEmpty()) {
            pet.setRaca(NAO_INFORMADO_TEXTO);
        } else if (!racaStr.matches("^[A-Za-zÀ-ÿ ]+$")) {
            throw new IllegalArgumentException("Raça não pode conter números ou caracteres especiais.");
        } else {
            pet.setRaca(racaStr.trim());
        }

        return pet;

    }
}
