package OCP_INCORRETO;

public class Carteira {

    private double saldo;
    private String tipo;

    public Carteira(double saldo, String tipo) {
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
