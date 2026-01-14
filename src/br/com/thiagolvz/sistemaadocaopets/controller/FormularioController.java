package br.com.thiagolvz.sistemaadocaopets.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FormularioController {
    private static final String FORMULARIO_PATH = "/formulario.txt";

    public List<String> exibirFormulario() {
        InputStream is = getClass().getResourceAsStream(FORMULARIO_PATH);

        if (is == null) {
            System.err.println("Arquivo formulario.txt não encontrado no resources.");
            return new ArrayList<>();
        }

        Scanner sc = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {

                String resposta;

                if (line.isBlank()) {
                    continue;
                }

                System.out.println(line);

                //pergunta específica: endereço possui 3 campos
                if (line.toLowerCase().contains("endereço")) {

                    System.out.print("Número da casa: ");
                    resposta = sc.nextLine();
                    respostas.add(resposta);

                    System.out.print("Cidade: ");
                    resposta = sc.nextLine();
                    respostas.add(resposta);

                    System.out.print("Rua: ");
                    resposta = sc.nextLine();
                    respostas.add(resposta);
                } else {
                    System.out.print("> ");
                    resposta = sc.nextLine();
                    respostas.add(resposta);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
        return respostas;
    }

}
