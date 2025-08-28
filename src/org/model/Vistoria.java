package org.model;

import java.util.ArrayList;
import java.util.List;

public class Vistoria {
    private long id;
    private List<Pagamento> pagamento;
    private List<Veiculo> veiculos;
    private float valorManutencao;

    public Vistoria() {
        this.id = 0;
        this.pagamento =  new ArrayList<>();
        this.veiculos =  new ArrayList<>();
        this.valorManutencao = 0;
    }

    public Vistoria(long id, List<Pagamento> pagamento, List<Veiculo> veiculos, float valorManutencao) {
        this.id = 0;
        this.pagamento =  new ArrayList<>();
        this.veiculos =  new ArrayList<>();
        this.valorManutencao = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Pagamento> getPagamento() {
        return pagamento;
    }

    public void setPagamento(List<Pagamento> pagamento) {
        this.pagamento = pagamento;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public float getValorManutencao() {
        return valorManutencao;
    }

    public void setValorManutencao(float valorManutencao) {
        this.valorManutencao = valorManutencao;
    }
}
