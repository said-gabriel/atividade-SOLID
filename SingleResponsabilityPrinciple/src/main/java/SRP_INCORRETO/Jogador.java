package SRP_INCORRETO;

public class Jogador {

    private String nome;
    private String posicao;

    public Jogador(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public void fazerGol() {
        System.out.printf("\nGol realizado!");
    }

    public void fazerFalta() {
        System.out.printf("\nFalta realizada!");
    }

    public void pedirTempo() {
        System.out.printf("\nTempo pedido!");
    }

    public void realizarSubstituicao() {
        System.out.printf("\nSubstituição relizada!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

}
