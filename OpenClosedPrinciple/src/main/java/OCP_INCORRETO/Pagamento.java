package OCP_INCORRETO;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pagamento {

    private ArrayList<Carteira> carteira;

    public Pagamento() {
        this.carteira = new ArrayList<>();
    }

    public void pagamentoCartao(String tipo, double valor) {
        if (carteira != null) {
            for (Carteira k : carteira) {
                if (k.getTipo() == "cartao credito" && k.getSaldo() > valor) {
                    double x = k.getSaldo() - valor;
                    k.setSaldo(x);
                } else {
                    try {
                        throw new Exception("Tipo inexistente ou saldo indisponível!");
                    } catch (Exception ex) {
                        Logger.getLogger(Pagamento.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } else {
            try {
                throw new Exception("Carteira vazia");
            } catch (Exception ex) {
                Logger.getLogger(Pagamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void pagamentoBoleto(String tipo, double valor) {
        if (carteira != null) {
            for (Carteira k : carteira) {
                if (k.getTipo() == "dinheiro" && k.getSaldo() > valor) {
                    double x = k.getSaldo() - valor;
                    k.setSaldo(x);
                } else {
                    try {
                        throw new Exception("Tipo inexistente ou saldo indisponível!");
                    } catch (Exception ex) {
                        Logger.getLogger(Pagamento.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } else {
            try {
                throw new Exception("Carteira vazia");
            } catch (Exception ex) {
                Logger.getLogger(Pagamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ArrayList<Carteira> getCarteira() {
        return carteira;
    }

    public void setCarteira(ArrayList<Carteira> carteira) {
        this.carteira = carteira;
    }

}
