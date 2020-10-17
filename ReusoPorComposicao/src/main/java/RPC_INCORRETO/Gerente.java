package RPC_INCORRETO;

public class Gerente extends Pessoa {

    private String area;
    private String setor;

    public Gerente(String area, String setor, String nome, String cpf) {
        super(nome, cpf);
        this.area = area;
        this.setor = setor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

}
