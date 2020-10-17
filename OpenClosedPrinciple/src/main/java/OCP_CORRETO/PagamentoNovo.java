package OCP_CORRETO;

public abstract class PagamentoNovo {

    private CarteiraNovo carteira;

    public abstract void pagar(CarteiraNovo carteira, double valor);

    public CarteiraNovo getCarteira() {
        return carteira;
    }

    public void setCarteira(CarteiraNovo carteira) {
        this.carteira = carteira;
    }

}
