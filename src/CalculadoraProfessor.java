import java.util.Scanner;

public class CalculadoraProfessor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Escreva o valor do raio");
        double raio = scan.nextDouble();
        double area = pi * (raio * raio);

        System.out.print("O valor da area é " + area);
        scan.close();


    }
}
