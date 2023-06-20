/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.energygreen.mavenproject;

/**
 *
 * @author vitoralmeida
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistroRepository {

    private Connection connection;

    public RegistroRepository() {
        // Configurar a conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/energygreen";
        String username = "root";
        String password = "m6230ghz";

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addRegis(Registro registro) {
        String sql = "INSERT INTO registro (kwh, mes, ano, regiao, contaBruta, contaDesconto, economia) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1, registro.getKwh());
            statement.setInt(2, registro.getMes());
            statement.setString(4, registro.getRegiao());
            statement.setDouble(5, registro.getContaBruta());
            statement.setDouble(6, registro.getContaDesconto());
            statement.setDouble(7, registro.getEconomia());
            statement.setInt(3, registro.getAno());
            //statement.setString(8, usuario.getCpf());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}