package comecando;

public class PrecoMedioBombom {
    public static void main(String[] args) {
        System.out.print("Calcular media de Valores");

        // Armazenamento de três valores
        Integer bombom1 = 5;
        Integer bombom2 = 8;
        Integer bombom3 = 12;

        // calculo da media
        Integer somadosValores = bombom1 + bombom2 + bombom3;
        Integer quantidadedebombons = 3;
        Integer mediabonbons = somadosValores / quantidadedebombons;

        // imprimir o resultado
        System.out.println("\"Sistema de Calculo de Media \"");
        System.out.println("Bombom1: " + bombom1);
        System.out.println("Bombom2: " + bombom2);
        System.out.println("Bombom3: " + bombom3);
        System.out.println("\nMedia dos bombons:\n" + mediabonbons);

    }
}
