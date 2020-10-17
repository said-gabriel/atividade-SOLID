package Principal;

import DRY1_CORRETO.ClienteNovo;
import DRY1_CORRETO.GerenteNovo;
import DRY1_CORRETO.PessoaNovo;
import DRY1_INCORRETO.Cliente;
import DRY1_INCORRETO.Gerente;
import DRY2_CORRETO.CalculaNovo;
import DRY2_CORRETO.ItemNovo;
import DRY2_CORRETO.ProdutoNovo;
import DRY2_INCORRETO.Calcula;
import DRY2_INCORRETO.Item;
import DRY2_INCORRETO.Produto;

public class Principal {

    public static void main(String[] args) {
        //EXEMPLO 1

        //maneira incorreta
        Cliente cliente = new Cliente("Kobe Bryant", "123.456.789-89", "Magic Johnson, numero 45, Bairro Jordan Liberty");
        Gerente gerente = new Gerente("Giannis Antetokounmpo", "159.753.852-79", "C");

        //maneira correta
        ClienteNovo clienteCorreto = new ClienteNovo("Rua James Harden, numero 65, Bairro LeBronJames", new PessoaNovo("Caruso", "741.852.857-99"));
        GerenteNovo gerenteCorreto = new GerenteNovo("A", new PessoaNovo("Stephen Curry", "957.789.361-11"));

        //EXEMPLO 2
        
        //maneira incorreta
        Produto produto = new Produto("Sabonete", 20.0);
        Item item = new Item(produto, 20);
        Calcula calculador = new Calcula();

        System.out.printf("O valor total do Item é: " + calculador.calculaValorTotal(item.getProduto().getPreco(), item.getQuantidade()));

        //maneira correta
        ProdutoNovo produtoNovo = new ProdutoNovo("Bola", 10.0);
        ItemNovo itemNovo = new ItemNovo(produtoNovo, 20);
        CalculaNovo calculadorNovo = new CalculaNovo();

        System.out.printf("\nO valor total do Item é: " + calculadorNovo.calculaValorTotal(itemNovo));

    }

}
