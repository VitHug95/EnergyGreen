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
    
    private int kwh;
    private String mes;
    private String regiao;
    private int contaBruta;
    private int contaDesconto;
    private int economia;

    public Registro(int kwh, String mes, String regiao, int contaBruta, int contaDesconto, int economia) {
        this.kwh = kwh;
        this.mes = mes;
        this.regiao = regiao;
        this.contaBruta = contaBruta;
        this.contaDesconto = contaDesconto;
        this.economia = economia;
    }

    public int getKwh() {
        return kwh;
    }

    public String getMes() {
        return mes;
    }

    public String getRegiao() {
        return regiao;
    }

    public int getContaBruta() {
        return contaBruta;
    }

    public int getContaDesconto() {
        return contaDesconto;
    }

    public int getEconomia() {
        return economia;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setContaBruta(int contaBruta) {
        this.contaBruta = contaBruta;
    }

    public void setContaDesconto(int contaDesconto) {
        this.contaDesconto = contaDesconto;
    }

    public void setEconomia(int economia) {
        this.economia = economia;
    }
    
    
    
}
