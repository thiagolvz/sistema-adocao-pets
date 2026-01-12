package br.com.thiagolvz.sistemaadocaopets.controller;

import java.util.List;

public class MenuController {
    private FormularioController formularioController = new FormularioController();
    private CadastroController cadastroController = new CadastroController();

    public void menu(Integer opcao) {
        switch (opcao) {
            case 1:
                List<String> respostas = formularioController.exibirFormulario();
                cadastroController.cadastro(respostas);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
        }
    }
}
