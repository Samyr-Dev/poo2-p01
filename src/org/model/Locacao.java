package org.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Locacao
{
    private long id;
    private List<Veiculo> veiculos;
    private float valorLocacao;
    private List<Modelo> modelo;
    private Date dataLocacao;
    private Date dataLImite;
    private int qtdVeiculo;

    public Locacao() {
        this.id = 0;
        this.veiculos =  new ArrayList<>();
        this.valorLocacao = 0;
        this.modelo =  new ArrayList<>();
        this.dataLocacao = new Date();
        this.dataLImite =  new Date();
        this.qtdVeiculo = 12;
    }

    public Locacao(long id, List<Veiculo> veiculos, float valorLocacao, List<Modelo> modelo, Date dataLocacao, Date dataLImite, int qtdVeiculo) {
        this.id = 0;
        this.veiculos =  new ArrayList<>();
        this.valorLocacao = 0;
        this.modelo =  new ArrayList<>();
        this.dataLocacao = new Date();
        this.dataLImite =  new Date();
        this.qtdVeiculo = 12;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public List<Modelo> getModelo() {
        return modelo;
    }

    public void setModelo(List<Modelo> modelo) {
        this.modelo = modelo;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataLImite() {
        return dataLImite;
    }

    public void setDataLImite(Date dataLImite) {
        this.dataLImite = dataLImite;
    }

    public int getQtdVeiculo() {
        return qtdVeiculo;
    }

    public void setQtdVeiculo(int qtdVeiculo) {
        this.qtdVeiculo = qtdVeiculo;
    }
}
