package br.com.thiagolvz.sistemaadocaopets.controller;

import br.com.thiagolvz.sistemaadocaopets.model.entities.Pet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ArquivoController {

    private static final String PASTA = "petsCadastrados";

    public void salvarPet(Pet pet) {
        criarPastaSeNaoExistir();

        String nomeArquivo = gerarNomeArquivo();
        File arquivo = new File(PASTA + File.separator + nomeArquivo);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {

            writer.write("1 - " + (pet.getNomeCompleto()));
            writer.newLine();

            writer.write("2 - " + (pet.getTipo()));
            writer.newLine();

            writer.write("3 - " + (pet.getSexo()));
            writer.newLine();

            writer.write("4 - " + (pet.getEndereco().getRua()));
            writer.write(", " + (pet.getEndereco().getNumero()));
            writer.write(", " + (pet.getEndereco().getCidade()));
            writer.newLine();

            writer.write("5 - " + formatarIdade(pet.getIdade()));
            writer.newLine();

            writer.write("6 - " + pet.getPeso());
            writer.write("kg");
            writer.newLine();

            writer.write("7 - " + pet.getRaca());

        } catch (IOException e) {
            throw new RuntimeException("Erro ao salvar o arquivo do pet.");
        }
    }

    private void criarPastaSeNaoExistir() {
        File pasta = new File(PASTA);
        if (!pasta.exists()) {
            pasta.mkdir();
        }
    }

    private String gerarNomeArquivo(Pet pet) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");

        String dataHora = LocalDateTime.now().format(formatter);

        String nomeSemEspacos = pet.getNomeCompleto()
                .replace(" ", "")
                .toUpperCase();

        return dataHora + nomeSemEspacos + ".TXT";
    }

    private String dataAtual() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return LocalDateTime.now().format(formatter);
    }

    private String formatarIdade(double idade) {
        if (idade < 1) {
            int meses = (int) Math.round(idade * 12);
            return meses + " meses";
        } else {
            if (idade == Math.floor(idade)) {
                return (int) idade + " anos";
            }
            return idade + " anos";
        }
    }
}
