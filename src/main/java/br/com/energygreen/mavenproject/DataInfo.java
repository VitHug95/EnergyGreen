/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.energygreen.mavenproject;

/**
 *
 * @author vitoralmeida
 */
public class DataInfo {
    private static DataInfo instancia;
    private Usuario usuarioLogado;

    private DataInfo() {
        // Construtor privado para evitar instanciação externa
    }

    public static DataInfo getInstance() {
        if (instancia == null) {
            instancia = new DataInfo();
        }
        return instancia;
    }

    // Métodos e atributos da classe

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

}
