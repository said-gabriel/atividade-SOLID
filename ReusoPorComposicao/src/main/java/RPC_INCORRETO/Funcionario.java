package RPC_INCORRETO;

public class Funcionario extends Pessoa {

    private String cargo;
    private String setor;

    public Funcionario(String cargo, String setor, String nome, String cpf) {
        super(nome, cpf);
        this.cargo = cargo;
        this.setor = setor;
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

}
