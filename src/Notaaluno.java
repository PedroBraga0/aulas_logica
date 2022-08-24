import java.util.Scanner;

public class Notaaluno {

    static final Integer AlunoPassou = 70;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota do Aluno:");
        double Nota = scanner.nextInt();

        System.out.println("Informe a segunda nota :");
        double Nota2 = scanner.nextInt();

        double media = (Nota + Nota2) / 2 ;
        Boolean Aluno = Nota >= AlunoPassou;

        System.out.println("Media do aluno " + media);

        if (Aluno) {
            System.out.println("Sim,ele(a) esta aprovado burro . ");
        } else {
            System.out.println(" Não! Ele(a) está reprovado.");



        }
        scanner.close();

    }
}