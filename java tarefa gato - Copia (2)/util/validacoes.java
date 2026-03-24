package util;

public class Validacoes {

    private Validacoes(){
        
    }










    public static boolean nomeValido(String nome) {
        return !(
            nome == null ||
            nome.trim().isEmpty() ||
            nome.matches(".*\\d+.*")
        );
    }

    public static String mensagemErroNome(String nome){
        if (nome == null || nome.trim().isEmpty()){
            return "Erro: o nome não pode ser vazio";
        } else if (nome.matches(".*\\d+.*")){
            return "Erro: o nome não pode conter números";
        }
        return "";
    }






















    public static boolean idadeValida(int idade) {
        return idade >= 0 && idade <= 25;
    }

    public static String mensagemErroIdade(int idade){
        if (idade < 0){
            return "Erro: a idade não pode ser negativa";
        } else if (idade > 150){
            return "Erro: idade inválida";
        }
        return "";
    }





















    public static boolean corValida(String cor) {
        return !(
            cor == null ||
            cor.trim().isEmpty() ||
            cor.matches(".*\\d+.*")
        );
    }

    public static String mensagemErroCor(String cor){
        if (cor == null || cor.trim().isEmpty()){
            return "Erro: a cor não pode ser vazia";
        } else if (cor.matches(".*\\d+.*")){
            return "Erro: a cor não pode conter números";
        }
        return "";
    }

}