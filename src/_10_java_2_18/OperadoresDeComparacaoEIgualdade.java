package _10_java_2_18;

public class OperadoresDeComparacaoEIgualdade {
    public static void main(String[] args) {
        // Comparação : > (maior),>= (maior ou igual), < (menor), <= ( menor ou igual)
        // igualdade: == (igual) e != (diferente)

        int a = 10;
        int b = 5;
        int c = 2;

        boolean maior = b > a;
        System.out.println(" b > a : " + maior );

        boolean maiorouIgual = b >= a ;
        System.out.println("b >= a:" + maiorouIgual);

        boolean menor = a>b;
        System.out.println(" a > b : " + menor );

        boolean menorOuIgual = a<= 10;
        System.out.println(" a <= 10: " + menorOuIgual );
        boolean igual = a == b - c;

        boolean diferente = a != c;
        System.out.println("a == c: " + diferente );
        System.out.println("____________________________________");

        boolean bloqueado = false;
        System.out.println(bloqueado);
        bloqueado = !bloqueado;
        System.out.println(bloqueado);

    }
}
