package com.elizeu;

public class CartaoCredito {

    private String N_Cartao;
    private String DataVencimento;
    private int cvv;
    private Cliente cliente;
    private int limite;
    public float valorT;
    private String nCartao;

    public CartaoCredito(String nome){
        cliente = new Cliente();
        cliente.setNome(nome);
    }

    public CartaoCredito(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int setLimite(int limite) {
        this.limite = limite;
        return limite;
    }

    public int getLimite() {
        return limite;
    }

    public void setNumberCart(String nCartao){
        this.nCartao = nCartao;
    }

    public String getNumberCart(){
        return nCartao;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getCvv() {
        return cvv;
    }

    public float limiteAtual(float valorT, int limite){
        this.valorT = valorT;
        return limite - valorT;
    }

    public void validarlimite(int limite,float valorT){
        if (valorT > limite){
            System.out.print("LIMITE INDISPONIVEL !");
        }
        else{
            System.out.println("Valor total da compra: R$ " + valorT);
            System.out.print("\nLIMITE ATUAL: R$ " + (limite - valorT));
        }
    }
    public void infoCartao(String nCartao,String DataVencimento,int cvv){
        this.nCartao = nCartao;
        this.DataVencimento = DataVencimento;
        this.cvv = cvv;
        System.out.println("Nº carton: " + nCartao + " VENC: " + DataVencimento);
        System.out.println("CVV: " + cvv);
    }
}