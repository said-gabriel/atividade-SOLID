package RPC_CORRETO;

public class FuncionarioNovo {

    private String cargo;
    private String setor;
    private PessoaNovo pessoa;

    public FuncionarioNovo(String cargo, String setor, PessoaNovo pessoa) {
        this.cargo = cargo;
        this.setor = setor;
        this.pessoa = pessoa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
