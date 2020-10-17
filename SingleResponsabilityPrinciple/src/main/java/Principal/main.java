package Principal;

import SRP_CORRETO.JogadorNovo;
import SRP_CORRETO.PessoaNovo;
import SRP_CORRETO.TecnicoNovo;
import SRP_INCORRETO.Jogador;

public class main {

    public static void main(String[] args) {
        //maneira incorreta
        Jogador ribamar = new Jogador("Ribamar", "Atacante");

        System.out.printf("Maneira incorreta: \n");
        
        System.out.printf("\nAções Jogador:\n");
        ribamar.fazerFalta();
        ribamar.fazerGol();
        ribamar.pedirTempo();//um jogador normalmente não realiza um pedido de tempo
        ribamar.realizarSubstituicao();//um jogador normalmente não realiza substituição

        //maneira correta
        System.out.printf("\n\nManeira correta: \n");

        PessoaNovo p1 = new PessoaNovo("Vanderlei Luxemburgo");
        TecnicoNovo tec = new TecnicoNovo(p1);
        PessoaNovo p2 = new PessoaNovo("Mbappe");
        JogadorNovo jg = new JogadorNovo(p2, "Ponta Direita");

        System.out.printf("\nAções Jogador: \n");
        //ações de jogador
        jg.fazerFalta();
        jg.fazerGol();

        System.out.printf("\n\nAções Técnico: \n");
        //ações do tecnico
        tec.pedirTempo();
        tec.realizarSubstituicao();

    }

}
