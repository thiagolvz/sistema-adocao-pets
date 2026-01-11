package br.com.thiagolvz.sistemaadocaopets.controller;

import java.io.*;

public class FormularioController {
    private static final String FORMULARIO_PATH = "/formulario.txt";

    public void lerArquivo() {
        InputStream is = getClass().getResourceAsStream(FORMULARIO_PATH);

        if (is == null) {
            System.err.println("Arquivo formulario.txt não encontrado no resources.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
