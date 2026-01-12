package br.com.thiagolvz.sistemaadocaopets;

import br.com.thiagolvz.sistemaadocaopets.controller.MenuController;
import br.com.thiagolvz.sistemaadocaopets.view.MenuView;

public class Main {
    public static void main(String[] args) {

        MenuView menuView = new MenuView();
        MenuController menuController = new MenuController();

        menuView.exibirMenu();
        int opcao = menuView.lerOpcao();
        menuController.menu(opcao);

    }
}
