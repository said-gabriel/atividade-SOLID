package LD_INCORRETO;

public class Item {

    public double quantidade;
    public Produto produto;

    public Item(double quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
