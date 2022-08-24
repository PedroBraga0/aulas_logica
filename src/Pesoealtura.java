import java.util.Scanner;

public class Pesoealtura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o valor peso: ");
        Double valorPeso = scanner.nextDouble();


        Scanner scanner2 = new Scanner(System.in);
        System.out.print("digite o valor altura: ");
        Double valorAltura = scanner2.nextDouble();

        Double resultado = valorPeso / (valorAltura * valorAltura);

        System.out.println("seu imc :" + resultado);
        System.out.println("MENOR QUE 18,5 MAGREZA");
        System.out.println("ENTRE 18,5 E 24,9 NORMAL");
        System.out.println("ENTRE 25,0 E 29,9 SOBREPESO");
        System.out.println("MAIOR QUE 40,0 OBESIDADE GRAVE");
    }
}
