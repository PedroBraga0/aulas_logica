package Programacao_orientada_a_objetos_ProdutoPerecivel;

public class Produto extends Dados {
    String nome;
    String DataDeVencimento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeVencimento() {
        return DataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        DataDeVencimento = dataDeVencimento;
    }

    void ProdutoNaoPerecivel() {
        System.out.println("\nO SEU PRODUTO ESCOLHIDO É: " + getNome());
    }

    void ProdutoPerecivel() {
        System.out.println("\nO SEU PRODUTO ESCOLHIDO É: " + getDescrição() + "\nA SUA DATA DE VENCIMENTO É:" + getDataDeVencimento());
    }
}
