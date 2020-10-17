package ISP_CORRETO;

import ISP_CORRETO.interfaces.ICadastroCliente;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClienteNovo implements ICadastroCliente {

    private String nome;
    private String cpf;
    private String email;

    public ClienteNovo(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
