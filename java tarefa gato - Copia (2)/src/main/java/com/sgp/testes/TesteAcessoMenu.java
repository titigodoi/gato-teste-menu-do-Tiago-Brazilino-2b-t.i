package com.sgp.testes;

import java.util.Scanner;

import com.sgp.modelos.Gato;
import com.sgp.util.Validacoes;

public class TesteAcessoMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gato gato = new Gato("Maquinhos", "Branco", 3);
        int opcao;

        do {

            imprimirMenu();
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(gato.toString());
                    break;
                case 2:
                    alterarNome(gato, scanner);
                    break;
                case 3:
                    alterarIdade(gato, scanner);
                    break;
                case 4:
                    gato.saudacao();
                    break;
                case 5:
                    alterarCor(gato, scanner);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu do Gato ===");
        System.out.println("1. Mostrar dados do gato");
        System.out.println("2. Alterar nome");
        System.out.println("3. Alterar idade");
        System.out.println("4. Mostrar saudação");
        System.out.println("5. Alterar cor");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Digite um número válido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarNome(Gato gato, Scanner scanner) {
        System.out.print("Digite o novo nome: ");
        String novoNome = scanner.nextLine();

        if (Validacoes.nomeValido(novoNome)) {
            gato.setNome(novoNome);
            System.out.println("Nome alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroNome(novoNome));
        }
    }

    public static void alterarIdade(Gato gato, Scanner scanner) {
        System.out.print("Digite a nova idade: ");
        try {
            int novaIdade = Integer.parseInt(scanner.nextLine());

            if (Validacoes.idadeValida(novaIdade)) {
                gato.setIdade(novaIdade);
                System.out.println("Idade alterada com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroIdade(novaIdade));
            }

        } catch (NumberFormatException e) {
            System.out.println("Digite um número inteiro válido!");
        }
    }

    public static void alterarCor(Gato gato, Scanner scanner) {
        System.out.print("Digite a nova cor: ");
        String novaCor = scanner.nextLine();

        if (Validacoes.nomeValido(novaCor)) {
            gato.setCor(novaCor);
            System.out.println("Cor alterada com sucesso!");
        } else {
            System.out.println("Cor inválida!");
        }
    }
}