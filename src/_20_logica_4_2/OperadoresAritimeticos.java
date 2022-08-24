package _20_logica_4_2;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        Integer adicao = 1 +1;
        System.out.println("Adição:" +adicao );

        Integer subtracao = 1-1;
        System.out.println("sub:" + subtracao);

        Integer multiplicacao = 1*1;
        System.out.println("Multiplicação: " + multiplicacao );

        Integer divisao = 4/2;
        System.out.println("divisão: " + divisao);

        Integer modulo = 7 % 4;
        System.out.println("Modulo:" +modulo);

        Integer procedencia01= 1+1 *5;
        System.out.println("Procedencia 01:" + procedencia01);

        Integer procedencia02= (1+1) *5;
        System.out.println("Procedencia 02:" + procedencia02);

        Integer procedencia03= 5* (1+1);
        System.out.println("Procedencia 03:" + procedencia03);

        Integer procedencia04= 5* (1+1) + 2;
        System.out.println("Procedencia 04:" + procedencia04);

        Integer procedencia05= 5* ((1+1) +2);
        System.out.println("Procedencia 05:" + procedencia05);

        Integer cinco = 5;
        Integer um = 1;

        Integer precendenciaComVariaveis = cinco * (um + um);
        System.out.println(" Precendencia com variáveis:" + precendenciaComVariaveis);





    }
}
