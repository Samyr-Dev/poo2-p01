package org.model;

import java.util.Date;

public class Cliente {
    private long id;
    private String nome;
    private String CPF;
    private String RG;
    private Date dataNascimento;
    private String celular;
    private String endereco;
    private String email;

    public Cliente() {
        this.id = 0;
        this.nome = "";
        this.CPF = "";
        this.RG = "";
        this.dataNascimento = new Date();
        this.celular = "";
        this.endereco = "";
        this.email = "";
    }

    public Cliente(long id, String nome, String CPF, String RG, Date dataNascimento, String celular, String endereco, String email) {
        this.id = 0;
        this.nome = "";
        this.CPF = "";
        this.RG = "";
        this.dataNascimento = new Date();
        this.celular = "";
        this.endereco = "";
        this.email = "";
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
