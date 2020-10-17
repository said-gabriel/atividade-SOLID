package ISP_CORRETO;

import ISP_CORRETO.interfaces.ICadastroProduto;

public class ProdutoNovo implements ICadastroProduto {

    private String nome;
    private String tipo;

    public ProdutoNovo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void validar() {
        if (getNome().length() > 0 && getTipo().length() > 0) {
            System.out.printf("\nDados validados com sucesso!");
        } else {
            System.out.printf("\nDados inválidos!");
        }
    }

    @Override
    public void salvar() {
        if (getNome() != null && getTipo() != null) {
            System.out.printf("\nDados validados com sucesso!");
        } else {
            System.out.printf("\nDados inválidos!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
