package OCP_CORRETO;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PagamentoCartaoCredito extends PagamentoNovo {

    public PagamentoCartaoCredito() {

    }

    @Override
    public void pagar(CarteiraNovo carteira, double valor) {
        if (carteira != null) {
            if (carteira.getSaldo() > valor) {
                double x = carteira.getSaldo() - valor;
                carteira.setSaldo(x);
            } else {
                try {
                    throw new Exception("Saldo insuficiente!");
                } catch (Exception ex) {
                    Logger.getLogger(PagamentoBoleto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            try {
                throw new Exception("Carteira vazia");
            } catch (Exception ex) {
                Logger.getLogger(PagamentoBoleto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
