package br.com.thiagolvz.sistemaadocaopets.view;

import java.util.Scanner;

public class MenuView {

    public void exibirMenu() {
        System.out.println("--------- MENU ---------");
        System.out.println("1. Cadastrar um novo pet");
        System.out.println("2. Alterar os dados do pet cadastrado");
        System.out.println("3. Deletar um pet cadastrado");
        System.out.println("4. Listar todos os pets cadastrados");
        System.out.println("5. Listar pets por algum critério (idade, nome, raça)");
        System.out.println("6. Sair");
    }

    public int lerOpcao() {
        Scanner sc = new Scanner(System.in);
        Integer opcao = -1;
        
        while ((opcao <= 0) || (opcao > 6)) {
            System.out.print("Digite uma opção: ");

            try {
                opcao = sc.nextInt();

                if ((opcao <= 0) || (opcao > 6)) {
                    System.out.println("Opção inválida.");
                    exibirMenu();
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Digite apenas números.");
                sc.nextLine();
                exibirMenu();
            }
        }

        return opcao;
    }

}
