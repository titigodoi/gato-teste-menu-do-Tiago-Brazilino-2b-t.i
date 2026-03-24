import java.util.Scanner;

class Gato {
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public void saudacao() {
        System.out.println("Miau! Eu sou " + nome);
    }

    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Cor: " + cor;
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setCor(String cor) { this.cor = cor; }
}

class Validacoes {

    public static boolean nomeValido(String nome) {
        return nome != null && nome.length() >= 2;
    }

    public static boolean idadeValida(int idade) {
        return idade >= 0 && idade <= 30;
    }

    public static boolean corValida(String cor) {
        return cor != null && !cor.isEmpty();
    }

    public static String mensagemErroNome(String nome) {
        return "Nome inválido!";
    }

    public static String mensagemErroIdade(int idade) {
        return "Idade inválida!";
    }

    public static String mensagemErroCor(String cor) {
        return "Cor inválida!";
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Gato gato = new Gato("Clebin", 2, "Branco");

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
        System.out.println("\n=== Menu de Acesso ===");
        System.out.println("1. Mostrar dados do gato");
        System.out.println("2. Alterar nome");
        System.out.println("3. Alterar idade");
        System.out.println("4. Mostrar saudação");
        System.out.println("5. Alterar cor");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner) {
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
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
            System.out.println("Erro: digite um número inteiro válido!");
        }
    }

    public static void alterarCor(Gato gato, Scanner scanner) {
        System.out.print("Digite a nova cor: ");
        String novaCor = scanner.nextLine();
        if (Validacoes.corValida(novaCor)) {
            gato.setCor(novaCor);
            System.out.println("Cor alterada com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroCor(novaCor));
        }
    }
}