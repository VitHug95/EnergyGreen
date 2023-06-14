/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.energygreen.mavenproject;

/**
 *
 * @author vitoralmeida
 */
public class calculoConversao {
    
    private final double consumoMensal;
    private final double tarifaEnergia;
    private final double fatorConversao;

    public calculoConversao (double consumoMensal, double tarifaEnergia, double fatorConversao) {
        this.consumoMensal = consumoMensal;
        this.tarifaEnergia = tarifaEnergia;
        this.fatorConversao = fatorConversao;
    }

    public double calcularEconomia() {
        double economia = consumoMensal * tarifaEnergia * fatorConversao;
        return economia;
    }
}
