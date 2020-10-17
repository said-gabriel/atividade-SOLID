package Principal;

import OCP_CORRETO.CarteiraNovo;
import OCP_CORRETO.PagamentoBoleto;
import OCP_CORRETO.PagamentoCartaoCredito;
import OCP_INCORRETO.Carteira;
import OCP_INCORRETO.Pagamento;

public class main {

    public static void main(String[] args) {

        //maneira incorreta
        Carteira carteira1 = new Carteira(200, "cartao credito");
        Carteira carteira2 = new Carteira(500, "dinheiro");

        Pagamento p1 = new Pagamento();
        p1.getCarteira().add(carteira1);
        p1.getCarteira().add(carteira2);

        p1.pagamentoBoleto("cartao credito", 100);
        p1.pagamentoBoleto("dinheiro", 150);

        System.out.printf("Maneira incorreta: \n");
        for (Carteira k : p1.getCarteira()) {
            System.out.printf("Saldo " + k.getTipo() + ": " + k.getSaldo() + "\n");
        }
        //maneira correta
        CarteiraNovo carteira1Novo = new CarteiraNovo(200, "cartao credito");
        CarteiraNovo carteira2Novo = new CarteiraNovo(500, "dinheiro");

        PagamentoBoleto pagBoleto = new PagamentoBoleto();
        pagBoleto.pagar(carteira2Novo, 150);

        PagamentoCartaoCredito pagBoleto2 = new PagamentoCartaoCredito();
        pagBoleto2.pagar(carteira1Novo, 100);

        System.out.printf("\nManeira correta: \n");
        System.out.printf("Saldo " + carteira1Novo.getTipo() + ": " + carteira1Novo.getSaldo()
                + "\nSaldo " + carteira2Novo.getTipo() + ": " + carteira2Novo.getSaldo());

    }

}
