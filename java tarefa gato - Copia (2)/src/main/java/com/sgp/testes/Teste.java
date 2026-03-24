package com.sgp.testes;

import com.sgp.modelos.Gato;

public class Teste {

    public static void main(String[] args) {

        Gato gatoNulo = null;
        imprimirGato(gatoNulo);

        Gato gato = new Gato("Maquinhos", "Branco", 3);
        imprimirGato(gato);

        Gato gatoPadrao = new Gato();
        System.out.println("\nTestando construtor padrão:");
        imprimirGato(gatoPadrao);

        gato.saudacao();

        System.out.println("Nome: " + gato.getNome());

        gato.setNome("Jotinha");
        System.out.println("Nome modificado: " + gato.getNome());

        gato.setIdade(5);
        System.out.println("Gato após modificações: " + gato.toString());

        gato.setCor("Preto");
        System.out.println("Cor modificada: " + gato.getCor());
    }

    public static void imprimirGato(Gato gato) {
        if (gato == null) {
            System.out.println("Gato não inicializado!");
            return;
        }
        System.out.println(gato);
        gato.saudacao();
    }
}