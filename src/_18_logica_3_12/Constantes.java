package _18_logica_3_12;

import java.util.Scanner;

public class Constantes {

    static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // final integer  idademinimaparatirarcarteira = 18

        System.out.println("Informe a idade:");
        Integer idade = scanner.nextInt();

        Boolean podetirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;

        if (podetirarCarteira) {
            System.out.println("Sim,ele(a) pode tirar carteira. ");
        } else {
            System.out.println(" Não! Ele(a)não pode tirar carteira.");
        }

        scanner.close();

    }
}
