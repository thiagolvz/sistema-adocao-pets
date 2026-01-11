package br.com.thiagolvz.sistemaadocaopets;

import br.com.thiagolvz.sistemaadocaopets.view.MenuView;

public class Main {
    public static void main(String[] args) {
        MenuView menuView = new MenuView();
        menuView.exibirMenu();
        menuView.lerOpcao();

    }
}
