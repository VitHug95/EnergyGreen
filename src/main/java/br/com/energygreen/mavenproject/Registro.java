/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.energygreen.mavenproject;

/**
 *
 * @author vitoralmeida
 */
public class Registro {
    
    private double kwh;
    private String mes;
    private String regiao;
    private double contaBruta;
    private double contaDesconto;
    private double economia;
    private String cpf;

    public Registro(double kwh, String mes, String regiao, double contaBruta, double contaDesconto, double economia, String cpf) {
        this.kwh = kwh;
        this.mes = mes;
        this.regiao = regiao;
        this.contaBruta = contaBruta;
        this.contaDesconto = contaDesconto;
        this.economia = economia;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getKwh() {
        return kwh;
    }

    public String getMes() {
        return mes;
    }

    public String getRegiao() {
        return regiao;
    }

    public double getContaBruta() {
        return contaBruta;
    }

    public double getContaDesconto() {
        return contaDesconto;
    }

    public double getEconomia() {
        return economia;
    }

    public void setKwh(double kwh) {
        this.kwh = kwh;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setContaBruta(double contaBruta) {
        this.contaBruta = contaBruta;
    }

    public void setContaDesconto(double contaDesconto) {
        this.contaDesconto = contaDesconto;
    }

    public void setEconomia(double economia) {
        this.economia = economia;
    }
    
    
    
}
