package org.model;

public class Veiculo {
    private long id;
    private int KmRodado;
    private int anoFabricacao;
    private String placa;
    private String chasse;
    private String cor;
    private String renavam;
    private Modelo modelo;
    private Enum status;

    public Veiculo() {
        this.id = 1;
        this.KmRodado = 12;
        this.anoFabricacao = 2024;
        this.placa = "";
        this.chasse = "";
        this.cor = "";
        this.renavam = "";
        this.modelo = new Modelo();
        this.status = status;
    }

    public Veiculo(long id, int kmRodado, int anoFabricacao, String placa, String chasse, String cor, String renavam, Modelo modelo, Enum status) {
        this.id = 1;
        this.KmRodado = 12;
        this.anoFabricacao = 2024;
        this.placa = "";
        this.chasse = "";
        this.cor = "";
        this.renavam = "";
        this.modelo = new Modelo();
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getKmRodado() {
        return KmRodado;
    }

    public void setKmRodado(int kmRodado) {
        KmRodado = kmRodado;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChasse() {
        return chasse;
    }

    public void setChasse(String chasse) {
        this.chasse = chasse;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }
}
