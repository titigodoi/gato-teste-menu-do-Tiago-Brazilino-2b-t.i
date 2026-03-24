package com.sgp.modelo;

public class Gato {

    // Atributos privados
    private String nome;
    private int idade;
    private String cor;

    // Construtor com parâmetros
    public Gato(String nome, int idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    // Construtor padrão
    public Gato(){
        this.nome = "Clebin ";
        this.idade = 2;
        this.cor = "Branco";
    }

    // Método de apresentação
    public void apresentação(){
        System.out.println("Miau miau tropa! beleza! Eu sou " + nome + ", tenho " + idade + " anos e sou da cor " + cor + ", sou um gato zika que sabe falar.");
    }

    // Getters e Setters

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }