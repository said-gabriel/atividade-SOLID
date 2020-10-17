package LD_INCORRETO;

import java.util.ArrayList;

public class Carrinho {

    private String cliente;
    private String data;
    private ArrayList<Item> itens;

    public Carrinho(String cliente, String data) {
        this.cliente = cliente;
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public double calculaValorTotal() {
        if (itens != null) {
            double total = 0;
            for (Item k : itens) {
                total = +k.getQuantidade() * k.getProduto().getPreco();
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

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

}
