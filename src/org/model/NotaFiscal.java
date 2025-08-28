package org.model;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

    private long id;
    private List<Locacao> locacao;
    private List<Cliente> cliente;
    private List<Pagamento> pagamento;

    public NotaFiscal() {
        this.id = 0;
        this.locacao =  new ArrayList<>();
        this.cliente =  new ArrayList<>();
        this.pagamento =  new ArrayList<>();
    }

    public NotaFiscal(long id, List<Locacao> locacao, List<Cliente> cliente, List<Pagamento> pagamento) {
        this.id = 0;
        this.locacao =  new ArrayList<>();
        this.cliente =  new ArrayList<>();
        this.pagamento =  new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Locacao> getLocacao() {
        return locacao;
    }

    public void setLocacao(List<Locacao> locacao) {
        this.locacao = locacao;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public List<Pagamento> getPagamento() {
        return pagamento;
    }

    public void setPagamento(List<Pagamento> pagamento) {
        this.pagamento = pagamento;
    }


}
