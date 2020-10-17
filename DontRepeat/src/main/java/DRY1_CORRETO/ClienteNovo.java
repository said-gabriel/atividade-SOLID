package DRY1_CORRETO;

public class ClienteNovo {

    private String endereco;
    private PessoaNovo pessoa;

    public ClienteNovo(String endereco, PessoaNovo pessoa) {
        this.endereco = endereco;
        this.pessoa = pessoa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public PessoaNovo getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaNovo pessoa) {
        this.pessoa = pessoa;
    }

}
