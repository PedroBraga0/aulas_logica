package _tipo4_primitivo;

import java.util.Scanner;

public class NumeroAoQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ler número
        System.out.println("Digite o número");
        int numero = scanner.nextInt();

        // Quadrado do numero
        int numeroaoquadrado = numero * numero ;
        System.out.print (numero + " * "+  numero + " = " + numeroaoquadrado );

        scanner.close();
    }
}
