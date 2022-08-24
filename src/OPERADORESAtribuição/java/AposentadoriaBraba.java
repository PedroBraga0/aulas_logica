package OPERADORESAtribuição.java;

import java.util.Scanner;

public class AposentadoriaBraba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a idade da Pessoa");
        double idade = entrada.nextDouble();

        System.out.println("quantidade de tempo que essa pessoa contribuiu com a previdência :");
        double tempoprevidencia = entrada.nextDouble();

        if (idade >= 55 && tempoprevidencia >= 25) {


            System.out.println("Voce pode se aposentar otário!");
        }else {
            System.out.println("voce não pode se aposentar burro!");
        }
    }
}
