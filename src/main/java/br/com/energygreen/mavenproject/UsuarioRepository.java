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
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioRepository {

    private Connection connection;

    public UsuarioRepository() {
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
        
    public boolean verificarCPFExistente(String cpf) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/energygreen", "root", "m6230ghz");
            String query = "SELECT * FROM usuario WHERE cpf = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            boolean cpfExistente = rs.next();
            rs.close();
            stmt.close();
            conn.close();
            return cpfExistente;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; // Tratar exceções de conexão com o banco de dados adequadamente
        }
    } 

    public void addUser(Usuario usuario) {
        String sql = "INSERT INTO usuario (cpf, nome, senha, email, telefone, usertype) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(2, usuario.getCpf());
            statement.setString(1, usuario.getNome());
            statement.setString(3, usuario.getSenha());
            statement.setString(5, usuario.getEmail());
            statement.setString(4, usuario.getTelefone());
            statement.setString(6, usuario.getUsertype());                    
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}