package br.com.thiagolvz.sistemaadocaopets.controller;

import br.com.thiagolvz.sistemaadocaopets.model.entities.Pet;

import java.util.List;

public class MenuController {
    private FormularioController formularioController = new FormularioController();
    private CadastroController cadastroController = new CadastroController();
    private ArquivoController arquivoController = new ArquivoController();

    public void menu(Integer opcao) {
        switch (opcao) {
            case 1:
                List<String> respostas = formularioController.exibirFormulario();
                Pet pet = cadastroController.cadastro(respostas);
                arquivoController.salvarPet(pet);
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
