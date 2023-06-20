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

public class EmpresaRepository {

    private Connection connection;

    public EmpresaRepository() {
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

    public void addEmpresa(Empresa empresa) {
        String sql = "INSERT INTO empresa (cnpj, nome, email, telefone) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, empresa.getCnpj());
            statement.setString(2, empresa.getNome());
            statement.setString(3, empresa.getEmail());
            statement.setString(4, empresa.getTelefone());                   
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}