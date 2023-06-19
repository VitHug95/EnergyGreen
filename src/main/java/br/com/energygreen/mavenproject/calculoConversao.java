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
    
    public calculoConversao (double consumoMensal, double fatorConversao) {
        this.consumoMensal = consumoMensal;
        this.tarifaEnergia = 0.85; //tarifaEnergia ;
        this.fatorConversao = fatorConversao; //fatorConversao;
    }

    public double calcularEconomia() {
        double economia = consumoMensal * tarifaEnergia * fatorConversao;
        return economia;
    }
    
    public double calcularTarifaComum(){
        double tarifaComum = consumoMensal * tarifaEnergia;
        return tarifaComum;
    }

    public double calculoConversao() {
        double tarifaDesconto = (consumoMensal * tarifaEnergia) - calcularEconomia();
        return tarifaDesconto;
    }
    
}

    
