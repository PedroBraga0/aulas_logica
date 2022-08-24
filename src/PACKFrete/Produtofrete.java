package PACKFrete;

import java.util.Scanner;

public class Produtofrete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorfrete = 15;

        System.out.println("valor do produto : ");
        double valorproduto = entrada.nextDouble();

        if (valorproduto < 100) {
            System.out.println("valor do produto com frete:" + (valorproduto + valorfrete));
        } else {
            System.out.println("valor total do produto" + valorproduto);
        }
        entrada.close();
    }
}
