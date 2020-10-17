package Principal;

import ISP_CORRETO.ClienteNovo;
import ISP_CORRETO.ProdutoNovo;
import ISP_INCORRETO.Cliente;
import ISP_INCORRETO.Produto;

public class main {

    public static void main(String[] args) {

        //maneira errada
        Cliente cliente = new Cliente("Michael Jordan", "jordan23gmail.com", "751.976.585-47");
        Produto produto = new Produto("Aro", "automovel");

        System.out.printf("\nPrimeira forma: \n");
        cliente.enviarEmail();
        cliente.validar();
        cliente.salvar();

        produto.enviarEmail();//produto não tem email
        produto.validar();
        produto.salvar();

        //maneira correta
        ClienteNovo clienteNovo = new ClienteNovo("Scottie Pippen", "pippen33gmail.com", "000.777.33-12");
        ProdutoNovo produtoNovo = new ProdutoNovo("Aro", "automovel");
        System.out.printf("\n\nSegunda forma: \n");
        clienteNovo.enviarEmail();
        clienteNovo.validar();
        clienteNovo.salvar();

        produtoNovo.validar();
        produtoNovo.salvar();

    }

}
