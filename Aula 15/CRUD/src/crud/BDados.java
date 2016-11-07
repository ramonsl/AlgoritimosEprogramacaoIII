/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author ramon
 */
public class BDados {
    
    public void criarBanco(){
        
        try {
            Connection c = null;
            Statement stmp = null ;
            //PreparedStatement pesquisar ...
            Class.forName("org.sqlite.JDBC");// carregar o drive 
            c = DriverManager.getConnection("jdbc:sqlite:MeuBanco.db");
            System.out.println("Conectado");
            stmp = c.createStatement();
            String sql = "CREATE TABLE CLIENTE"+
                    "( ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
                    + "NOME TEXT NOT NULL,"
                    + "FONE CHAR(13) NOT NULL,"
                    + "EMAIL TEXT NOT NULL)";
            stmp.executeUpdate(sql);
            stmp.close();
            c.close();
            JOptionPane.showMessageDialog(null, sql);
            
        } catch (Exception ex) {
            Logger.getLogger(BDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
