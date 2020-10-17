package DIP_CORRETO;

import DIP_CORRETO.interfaces.IIntermediarioBotao;

public class BotaoNovo {

    public BotaoNovo() {

    }

    public void pressionarBotao(IIntermediarioBotao botao) {
        if (botao instanceof ComputadorNovo) {
            if (botao.getEstadoAtual() == "ligado") {
                botao.desligar(); //a funcao desligar determina o que ocorre com o computador quando o botao for falso
            } else {
                botao.ligar();//a funcao ligar determina o que ocorre com o computador quando o botao for verdadeiro
            }
        } else if (botao instanceof CelularNovo) {
            if (botao.getEstadoAtual() == "bloqueado") {
                botao.ligar();//a funcao ligar determina o que ocorre com o celular quando o botao for verdadeiro 

            } else {
                botao.desligar(); //a funcao desligar determina o que ocorre com o celular quando o botao for falso
            }
        }
    }

}
