package com.elizeu;


import java.util.*;

public class Sistema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        CartaoCredito cartões[] = new CartaoCredito [2];
        cartões[0] = new CartaoCredito("Elizeu");
        cartões[1] = new CartaoCredito("Elizeu");
        Conta conta = new Conta();

        cliente.setNome("Elizeu");
        conta.setAgencia("0231");
        conta.setCC("2813891-9");
        System.out.println(cliente.getNome());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Conta: " + conta.getCC());

        CartaoCredito cartao = new CartaoCredito(cliente);
        cartao.infoCartao("12341 412 4144","19/25",123);

        cliente.setNome("\nJulio");
        conta.setAgencia("0134");
        conta.setCC("286565-9");
        System.out.println(cliente.getNome());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Conta: " + conta.getCC());

        cartao.infoCartao("19941 412 5144","21/25",153);

        /*System.out.print("\nValor: ");
        float valorComp = scanner.nextInt();

        System.out.print("Quantidade: ");
        int qntd = scanner.nextInt();

        float valorT = cliente.comprar(valorComp,qntd);

        cartao.validarlimite(qntdLimite,valorT);*/

    }
}
