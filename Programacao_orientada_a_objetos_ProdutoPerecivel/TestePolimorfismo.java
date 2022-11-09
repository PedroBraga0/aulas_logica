package Programacao_orientada_a_objetos_ProdutoPerecivel;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Produto mercado = new Produto();
        mercado.setNome("LEITE");
        mercado.ProdutoNaoPerecivel();
        mercado.setDescrição("O PRODUTO É CAMISINHA EXTRA SUPER MEGA GG ");
        mercado.setDataDeVencimento("22/03/2023");
       mercado.ProdutoPerecivel();
    }

}
