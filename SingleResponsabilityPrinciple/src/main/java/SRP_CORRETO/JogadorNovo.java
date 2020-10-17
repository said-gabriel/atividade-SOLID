package SRP_CORRETO;

public class JogadorNovo {

    private PessoaNovo pessoa;
    private String posicao;

    public JogadorNovo(PessoaNovo pessoa, String posicao) {
        this.pessoa = pessoa;
        this.posicao = posicao;
    }

    public PessoaNovo getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaNovo pessoa) {
        this.pessoa = pessoa;
    }

    public void fazerGol() {
        System.out.printf("\nGol realizado!");
    }

    public void fazerFalta() {
        System.out.printf("\nFalta realizada!");
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

}
