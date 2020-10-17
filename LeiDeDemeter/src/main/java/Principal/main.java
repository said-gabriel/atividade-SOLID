package Principal;

import LD_CORRETO.CarrinhoNovo;
import LD_CORRETO.ItemNovo;
import LD_CORRETO.ProdutoNovo;
import LD_INCORRETO.Carrinho;
import LD_INCORRETO.Item;
import LD_INCORRETO.Produto;

public class main {

    public static void main(String[] args) {
        //maneira incorreta

        Produto p1 = new Produto("livro", 10.5);
        Produto p2 = new Produto("lápis", 2.5);

        Item i1 = new Item(50, p1);
        Item i2 = new Item(20, p2);

        Carrinho c1 = new Carrinho("Damian Lillard", "16/10/2020");
        c1.getItens().add(i2);
        c1.getItens().add(i1);

        System.out.printf("Maneira incorreta: ");
        System.out.printf("\nValor total do carrinho: " + c1.calculaValorTotal());

        //maneira correta
        ProdutoNovo p1Novo = new ProdutoNovo("caderno", 10.5);
        ProdutoNovo p2Novo = new ProdutoNovo("notebook", 3000.5);

        ItemNovo i1Novo = new ItemNovo(15, p1Novo);
        ItemNovo i2Novo = new ItemNovo(15, p1Novo);

        CarrinhoNovo c1Novo = new CarrinhoNovo("Guto Nascimento", "16/10/2020");
        c1Novo.getItens().add(i1Novo);
        c1Novo.getItens().add(i2Novo);

        System.out.printf("\nManeira correta: ");
        System.out.printf("\nValor total do carrinho: " + c1Novo.calculaValorTotal());

        //a saida nao representa um problema, e sim a forma como é feito o acesso aos dados das classes
    }

}
