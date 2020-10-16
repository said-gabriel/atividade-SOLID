package DIP_INCORRETO;

public class Computador {
    private Botao botao;
    private String estadoAtual;
    
    public Computador(){
       this.botao = new Botao();
       this.estadoAtual = "desligado";
    }
    
    private void desligar(){
        this.setEstadoAtual("desligado");
    }
    
    private void ligar(){
        this.setEstadoAtual("ligado");
    }
    
    public void pressionarBotao(){
        if(botao.isStatus()){
            this.desligar();
        }else{
            this.ligar();
        }
    }

    public String getEstadoAtual() {
        return estadoAtual;
    }

    private void setEstadoAtual(String estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
    
    
}
