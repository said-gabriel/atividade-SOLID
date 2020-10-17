package Principal;

import RPC_CORRETO.GerenteNovo;
import RPC_CORRETO.PessoaNovo;
import RPC_INCORRETO.Funcionario;
import RPC_INCORRETO.Gerente;
import RPC_INCORRETO.Pessoa;

public class main {

    
    public static void main(String[] args) {
        //maneira incorreta
        Pessoa p1 = new Gerente("C", "Marmore", "Soren Bjergsen", "849.591.144-55");
        Pessoa p2 = new Funcionario("Cozinheiro", "Cozinha", "Felipe Gonçalves", "777.777.888-99");
        
        //maneira correta
        GerenteNovo g1 = new GerenteNovo("K", "Estoque", new PessoaNovo("JackeyLove", "888.777.555-99"));
        GerenteNovo g2 = new GerenteNovo("B", "Limpeza", new PessoaNovo("ShowMaker", "852.111.193-22"));
    }
    
}
