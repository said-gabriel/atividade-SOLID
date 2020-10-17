package DRY1_CORRETO;

public class GerenteNovo {

    private String setor;
    private PessoaNovo pessoa;

    public GerenteNovo(String setor, PessoaNovo pessoa) {
        this.setor = setor;
        this.pessoa = pessoa;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public PessoaNovo getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaNovo pessoa) {
        this.pessoa = pessoa;
    }

}
