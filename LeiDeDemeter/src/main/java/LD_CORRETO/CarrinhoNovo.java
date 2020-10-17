package LD_CORRETO;

import java.util.ArrayList;

public class CarrinhoNovo {

    private String cliente;
    private String data;
    private ArrayList<ItemNovo> itens;

    public CarrinhoNovo(String cliente, String data) {
        this.cliente = cliente;
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public double calculaValorTotal() {
        if (itens != null) {
            double total = 0;
            for (ItemNovo k : itens) {
                total = +k.valorTotal();
            }
            return total;
        } else {
            throw new RuntimeException("Lista de itens vazia!");
        }
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<ItemNovo> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemNovo> itens) {
        this.itens = itens;
    }

}
