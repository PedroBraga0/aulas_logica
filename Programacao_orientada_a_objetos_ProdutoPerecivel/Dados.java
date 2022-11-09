package Programacao_orientada_a_objetos_ProdutoPerecivel;

public class Dados {
    String descrição;

    public void imprimaAdescricaoDoProduto(){
        System.out.println("A DESCRIÇÃO DO SEU PRODUTO ");
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

}
