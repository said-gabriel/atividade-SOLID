package DIP_INCORRETO;

public class Botao {
    private boolean status;
    
    public Botao(){
        this.status = false;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
