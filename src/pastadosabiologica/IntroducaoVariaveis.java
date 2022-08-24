package pastadosabiologica;

import java.util.Scanner;

public class IntroducaoVariaveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o valor do produto:");

        Double valorProduto = scanner.nextDouble();

        System.out.println("Valor do produto:" + valorProduto );

        Double valorProdutocomfrete = valorProduto + 2;

        System.out.print("Valor do produto com frete:"+ valorProdutocomfrete);

        scanner.close();
    }
}
