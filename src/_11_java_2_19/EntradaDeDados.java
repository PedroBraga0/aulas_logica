package _11_java_2_19;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = entrada.nextLine();

        System.out.println("Peso: ");
        int peso = entrada.nextInt();

        System.out.println("Altura : ");
        Double altura = entrada.nextDouble();

        double imc = peso / (altura + altura);

        System.out.println("IMC de " + nome + ":" + imc);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal");
        } else if (imc < 25) {
            System.out.println("Peso ideal ");

        } else if (imc <= 30) {
            System.out.println("Acima do peso ");
        } else if (imc < 40) {
        } else {
            System.out.println("Obesidade grau 3");
            System.out.println("Muito cuidado com o seu peso!");
        }

    }

}


