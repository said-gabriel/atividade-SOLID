package DRY1_INCORRETO;

public class Gerente {

    private String nome;
    private String cpf;
    private String setor;

    public Gerente(String nome, String cpf, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

}
