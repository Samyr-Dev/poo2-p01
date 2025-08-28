package org.model;

import java.util.List;

public class Categoria {

    private long id;
    private String nome;
    private float valorLocacao;
    private List<Modelo> modelo;

    public Categoria() {
        this.id = 1;
        this.nome = "";
        this.valorLocacao = 45;
        this.modelo = modelo;
    }

    public Categoria(long id, String nome, float valorLocacao, List<Modelo> modelo) {
        this.id = id;
        this.nome = nome;
        this.valorLocacao = valorLocacao;
        this.modelo = modelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
