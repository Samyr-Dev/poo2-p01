package org.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pagamento {
    private long id;
    private float seguro;
    private List<Locacao> locacao;
    private List<Manutencao> manutencao;
    private float multaDeTransito;
    private float multaDevolucao;
    private Date dataDevolutiva;



    public Pagamento() {
        this.id = 0;
        this.seguro = 123;
        this.locacao =  new ArrayList<>();
        this.manutencao =  new ArrayList<>();
        this.multaDeTransito = 123;
        this.multaDevolucao = 123;
        this.dataDevolutiva =  new Date();
    }

    public Pagamento(long id, float seguro, List<Locacao> locacao, List<Manutencao> manutencao, float multaDeTransito, float multaDevolucao, Date dataDevolutiva) {
        this.id = 0;
        this.seguro = 123;
        this.locacao =  new ArrayList<>();
        this.manutencao =  new ArrayList<>();
        this.multaDeTransito = 123;
        this.multaDevolucao = 123;
        this.dataDevolutiva =  new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getSeguro() {
        return seguro;
    }

    public void setSeguro(float seguro) {
        this.seguro = seguro;
    }

    public List<Locacao> getLocacao() {
        return locacao;
    }

    public void setLocacao(List<Locacao> locacao) {
        this.locacao = locacao;
    }

    public List<Manutencao> getManutencao() {
        return manutencao;
    }

    public void setManutencao(List<Manutencao> manutencao) {
        this.manutencao = manutencao;
    }

    public float getMultaDeTransito() {
        return multaDeTransito;
    }

    public void setMultaDeTransito(float multaDeTransito) {
        this.multaDeTransito = multaDeTransito;
    }

    public float getMultaDevolucao() {
        return multaDevolucao;
    }

    public void setMultaDevolucao(float multaDevolucao) {
        this.multaDevolucao = multaDevolucao;
    }

    public Date getDataDevolutiva() {
        return dataDevolutiva;
    }

    public void setDataDevolutiva(Date dataDevolutiva) {
        this.dataDevolutiva = dataDevolutiva;
    }
}
