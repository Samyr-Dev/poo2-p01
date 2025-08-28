package org.model;

import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private long id;
    private Cliente cliente;
    private List<Locacao> locacao;
    private Pagamento pagamento;
    private String clausulas;

    public Contrato() {
        this.id = 0;
        this.cliente = new Cliente();
        this.locacao = new ArrayList<>();
        this.pagamento = new Pagamento();
        this.clausulas = "";
    }

    public Contrato(long id, Cliente cliente, List<Locacao> locacao, Pagamento pagamento, String clausulas) {
        this.id = 0;
        this.cliente = new Cliente();
        this.locacao = new ArrayList<>();
        this.pagamento = new Pagamento();
        this.clausulas = "";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Locacao> getLocacao() {
        return locacao;
    }

    public void setLocacao(List<Locacao> locacao) {
        this.locacao = locacao;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public String getClausulas() {
        return clausulas;
    }

    public void setClausulas(String clausulas) {
        this.clausulas = clausulas;
    }
}
