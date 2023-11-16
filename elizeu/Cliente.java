package com.elizeu;

public class Cliente {

    private int cod;
    private String nome;
    public float valor;
    public int quantidade;
    private CartaoCredito[] cartoes;


    private  static int contador = 1;

    public Cliente(){
        cartoes = new CartaoCredito[2];
        cod = contador;
        contador++;
    }

    public static int getContador(){
        return contador;
    }

    public static void setContador(int contador){
        Cliente.contador = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod(){
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public float comprar(float valor,int quantidade){
        this.valor = valor;
        this.quantidade = quantidade;
        return valor*quantidade;

    }


}
