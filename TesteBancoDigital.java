package Orientação_objeto_BancoDigital_1;

import java.util.Scanner;

public class TesteBancoDigital {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBEM VINDO AO BANCO DO SÁBIO");
        System.out.println("\n----------------------------");

        System.out.println("QUAL CONTA DESEJA ESCOLHER:");

        ContaSimples simples = new ContaSimples(20000);
        ContaPoupanca poupanca = new ContaPoupanca(600, 6600);
        ContaCorrente corrente = new ContaCorrente(55000.0, 550000.0);

        String[] contas = new String[]{"CONTA CORRENTE", "CONTA POUPANÇA", "CONTA SIMPLES"};
        for (int i = 0; i < contas.length; i++) {
            System.out.println("[" + i + "]" + contas[i]);
        }
        System.out.println("ESCOLHA ABAIXO SUA CONTA DESEJADA: ");
        Integer posicaoContaEscolhida = scanner.nextInt();
        scanner.nextLine();

        switch (posicaoContaEscolhida) {
            case 0:
                corrente.imprimirOsaldoelimitedaContaCorrente();
                break;

            case 1:
                poupanca.imprimiroSaldoeoRendimentodaConta();
                break;

            case 2:
                simples.imprimiroSaldo();
                break;
        }


    }

}




