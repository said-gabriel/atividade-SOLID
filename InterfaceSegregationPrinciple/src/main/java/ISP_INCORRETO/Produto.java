package ISP_INCORRETO;

import ISP_INCORRETO.interfaces.ICadastro;

public class Produto implements ICadastro {

    private String nome;
    private String tipo;

    public Produto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
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
            System.out.printf("\nDados salvos com sucesso!");
        } else {
            System.out.printf("\nDados salvos!");
        }
    }

    @Override
    public void enviarEmail() {
        System.out.printf("\nProduto não tem email :( ");
    }

}
