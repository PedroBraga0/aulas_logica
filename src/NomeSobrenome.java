import java.util.Scanner;

public class NomeSobrenome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome");
        String nome = scanner.nextLine();

        System.out.println("Sobrenome");
        String sobrenome = scanner.nextLine();

        String nomecompleto = nome + " " + sobrenome;
        System.out.println("Nome completo: " + nomecompleto);
        scanner.close();

    }
}
