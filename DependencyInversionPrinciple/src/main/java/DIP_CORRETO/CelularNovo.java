package DIP_CORRETO;

import DIP_CORRETO.interfaces.IIntermediarioBotao;

public class CelularNovo implements IIntermediarioBotao {

    public String estadoAtual;

    public CelularNovo() {
        this.estadoAtual = "desbloqueado";
    }

    @Override
    public void ligar() {
        this.estadoAtual = "desbloqueado";
    }

    @Override
    public void desligar() {
        this.estadoAtual = "bloqueado";
    }

    public String getEstadoAtual() {
        return this.estadoAtual;
    }

}
