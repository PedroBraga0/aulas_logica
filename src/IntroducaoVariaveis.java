import java.util.Scanner;

public class IntroducaoVariaveis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Valor do produto: " );
        Double valorProduto = scanner.nextDouble();
        System.out.println("Valor do produto : " + valorProduto );
        Double valorProdutocomFrete = valorProduto + 2;
        System.out.println("Valor do produto com frete : "+ valorProdutocomFrete );
    }
}
