package Principal;

import DIP_CORRETO.BotaoNovo;
import DIP_CORRETO.CelularNovo;
import DIP_CORRETO.ComputadorNovo;
import DIP_CORRETO.IIntermediarioBotao;
import DIP_INCORRETO.Botao;
import DIP_INCORRETO.Computador;

public class main {

    public static void main(String[] args) {

        /*Maneira errada*/
        Botao botaoErrado = new Botao();
        Computador computador = new Computador();

        //Impressão pré alterações
        System.out.printf("MANEIRA ERRADA: \n--------ESTADO ATUAL COMPUTADOR------\nEstado atual Computador: " + computador.getEstadoAtual());

        computador.pressionarBotao();//PRESSIONANDO O BOTAO DE COMPUTADOR

        //Impressão pós alterações
        System.out.printf("\n ------ESTADO ATUAL PÓS PRESSINAR O BOTAO ------ \nEstado atual Computador: " + computador.getEstadoAtual());

        /*Maneira correta*/
        IIntermediarioBotao computadorBotao = new ComputadorNovo();
        IIntermediarioBotao celularBotao = new CelularNovo();

        //Impressao pré alterações
        System.out.printf("\n\n\nMANEIRA CORRETA: \n--------ESTADO ATUAL COMPUTADOR E CELULAR ------ \nEstado atual Computador: " + computadorBotao.getEstadoAtual()
                + "\n" + "Estado atual Celular: " + celularBotao.getEstadoAtual());

        BotaoNovo botao = new BotaoNovo();

        //Botao exerce seu papel idependente do equipamento
        botao.pressionarBotao(computadorBotao); //PRESSIONANDO O BOTAO DO COMPUTADOR
        botao.pressionarBotao(celularBotao); // PRESSIONANDO O BOTAO DE CELULAR

        //Impressão pós alterações
        System.out.printf("\n ------ESTADO ATUAL PÓS PRESSINAR O BOTAO ------ \nEstado atual Computador: " + computadorBotao.getEstadoAtual()
                + "\n" + "Estado atual Celular: " + celularBotao.getEstadoAtual());

    }

}
