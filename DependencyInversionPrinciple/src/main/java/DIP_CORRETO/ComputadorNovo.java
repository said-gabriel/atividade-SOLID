package DIP_CORRETO;

import DIP_CORRETO.interfaces.IIntermediarioBotao;

public class ComputadorNovo implements IIntermediarioBotao {

    public String estadoAtual;

    public ComputadorNovo() {
        this.estadoAtual = "desligado";
    }

    @Override
    public void ligar() {
        this.estadoAtual = "ligado";
    }

    @Override
    public void desligar() {
        this.estadoAtual = "desligado";
    }

    public String getEstadoAtual() {
        return this.estadoAtual;
    }

}
