package _16_java_2;

import java.util.Scanner;

public class ValorProduto {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("digite o valor do produto desejado:");
        double valorProduto = valor.nextDouble();

        System.out.println("informe a quantidade que deseja:");
        int quantidadedoproduto = valor.nextInt();

        double subtotal = valorProduto * quantidadedoproduto;
        double desconto = subtotal * 0.9;

        if (quantidadedoproduto > 10) {
            System.out.println(" foi inserido 10% no valor total " + desconto);

        } else {
            System.out.println(" valorproduto " + subtotal);
        }


    }
}

