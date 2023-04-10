package br.newtonpaiva;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private Massa massa;
    private Double valor;
    private ArrayList<Ingrediente> lista;
    private Double valorTotal;


    public void calculaValor(Massa massa) {
        valorTotal = massa.getValor() + lista.size()*2;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ArrayList<Ingrediente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Ingrediente> lista) {
        this.lista = lista;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
