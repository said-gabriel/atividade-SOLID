package SRP_CORRETO;

public class TecnicoNovo {

    private PessoaNovo pessoa;

    public TecnicoNovo(PessoaNovo pessoa) {
        this.pessoa = pessoa;
    }

    public void pedirTempo() {
        System.out.printf("\nTempo pedido!");
    }

    public void realizarSubstituicao() {
        System.out.printf("\nSubstituição relizada!");
    }

}
