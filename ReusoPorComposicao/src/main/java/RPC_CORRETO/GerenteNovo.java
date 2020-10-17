package RPC_CORRETO;

public class GerenteNovo {

    private String area;
    private String setor;
    private PessoaNovo pessoa;

    public GerenteNovo(String area, String setor, PessoaNovo pessoa) {
        this.area = area;
        this.setor = setor;
        this.pessoa = pessoa;
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

    public PessoaNovo getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaNovo pessoa) {
        this.pessoa = pessoa;
    }

}
