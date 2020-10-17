package DRY2_CORRETO;

public class ItemNovo {

    private ProdutoNovo produto;
    private int quantidade;

    public ItemNovo(ProdutoNovo produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ProdutoNovo getProduto() {
        return produto;
    }

    public void setProduto(ProdutoNovo produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
