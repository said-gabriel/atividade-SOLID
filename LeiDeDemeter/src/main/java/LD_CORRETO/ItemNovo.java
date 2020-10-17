package LD_CORRETO;

public class ItemNovo {

    private double quantidade;
    private ProdutoNovo produto;

    public ItemNovo(double quantidade, ProdutoNovo produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    double valorTotal() {
        if (produto != null) {
            return produto.getPreco() * getQuantidade();
        } else {
            throw new RuntimeException("Produto vazio!");

        }
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public ProdutoNovo getProduto() {
        return produto;
    }

    public void setProduto(ProdutoNovo produto) {
        this.produto = produto;
    }
}
