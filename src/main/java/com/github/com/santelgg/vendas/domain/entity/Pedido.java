package com.github.com.santelgg.vendas.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {

    private Long ID;

    private Cliente cliente;

    private LocalDate dataPedido;

    private BigDecimal valorTotal;

    //getters and setters


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

}
