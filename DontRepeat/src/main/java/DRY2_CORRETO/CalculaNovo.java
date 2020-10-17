package DRY2_CORRETO;

public class CalculaNovo {

    public CalculaNovo() {

    }

    public double calculaValorTotal(ItemNovo item) {
        return item.getQuantidade() * item.getProduto().getPreco();
    }
}
