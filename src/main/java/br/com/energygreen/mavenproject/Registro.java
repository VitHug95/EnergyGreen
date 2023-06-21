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
    private int mes;
    private int ano;
    private String regiao;
    private double contaBruta;
    private double contaDesconto;
    private double economia;
    private String cpf;

    public Registro(double kwh, int mes, int ano, String regiao, double contaBruta, double contaDesconto, double economia, String cpf) {
        this.kwh = kwh;
        this.mes = mes;
        this.regiao = regiao;
        this.contaBruta = contaBruta;
        this.contaDesconto = contaDesconto;
        this.economia = economia;
        this.ano = ano;
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

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
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

    public void setMes(int mes) {
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
