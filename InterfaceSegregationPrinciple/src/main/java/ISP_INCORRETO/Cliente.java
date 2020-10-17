package ISP_INCORRETO;

import ISP_INCORRETO.interfaces.ICadastro;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente implements ICadastro {

    private String nome;
    private String email;
    private String cpf;

    public Cliente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void validar() {
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.printf("\nValidação concluída");
            }
        }
        System.out.printf("\nErro no formato de email");
    }

    @Override
    public void salvar() {
        if (getNome() != null && getCpf() != null && getEmail() != null) {
            System.out.printf("\nDados salvos no banco de dados com sucesso!");
        } else {
            System.out.printf("\nDados vazios!");
        }
    }

    @Override
    public void enviarEmail() {
        System.out.printf("\nEmail enviado com sucesso!");
    }

}
