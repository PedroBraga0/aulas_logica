package OPERADORESAtribuição.java;

import java.util.Scanner;

public class Gastofamiliar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor da conta de luz abaixo :$");
        double ContadeLuz = entrada.nextDouble();

        System.out.println("Informe o valor da conta de agua : ");
        double ContadeAgua = entrada.nextDouble();

        System.out.println("Informe o valor da conta de telefone :");
        double ContadeTelefone = entrada.nextDouble();

        System.out.println("Informe o valor da escola do filho : ");
        double EscoladoFilho = entrada.nextDouble();

        System.out.println("Informe o valor da fatura do cartão : ");
        double FaturadoCartão = entrada.nextDouble();

        System.out.println("Informe o valor do gasto com supermercado : ");
        double GastocomSupermercado = entrada.nextDouble();

        Double SomaTotal;
        SomaTotal = ContadeLuz;
        SomaTotal += ContadeAgua;
        SomaTotal += ContadeTelefone;
        SomaTotal += EscoladoFilho;
        SomaTotal += FaturadoCartão;
        SomaTotal += GastocomSupermercado;

        System.out.println("Soma total : " + SomaTotal );

    }
}
