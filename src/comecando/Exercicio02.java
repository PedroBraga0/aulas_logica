package comecando;

import java.util.Scanner;

public class Exercicio02 {
    public static void main (String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculo do indice de massa corporal");

        System.out.println("Digite seu peso (em kg): ");
        Double peso = scanner.nextDouble();

        System.out.println("Digite sua altura (em metros): ");
        Double altura = scanner.nextDouble();

        Double alturaAoQuadrado = altura + altura;

        Double indiceMassaCorporal = peso / alturaAoQuadrado;

        System.out.println("Seu IMC é: " + indiceMassaCorporal);

        scanner.close();

    }
}
