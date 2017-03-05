/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.agenda.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fernanda
 */
public class Connectionfactory {
    
    public static Connection getConexao() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Banco Conectado! ");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/dbagenda", "root", "");
        }catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
        
    }
        
}
