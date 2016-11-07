package crud;

import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramon
 */
public class Cliente {
    
    public String nome;
    public String fone;
    public String email;
    
    
    public Cliente (String n, String f, String e){ // construtor
        this.nome = n;
        this.email = e;
        this.fone =f;    
    }
    
    public void mostrar(){
        String msg ="Nome:" +this.nome+ "\n Fone:"+ this.fone+"\n Email "+ this.email;
      
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void insert(){
        
        try {
            BDados bd = new BDados();
            bd.getConnetion();
           bd.stmp = bd.c.createStatement();
           String sql = "INSERT INTO CLIENTE (NOME, FONE, EMAIL)"
                    + "VALUES('"+this.nome+"','"+this.fone+"','"+this.email+"')";
            System.out.println(sql);
            bd.stmp.executeUpdate(sql);
            bd.stmp.close();
   
          JOptionPane.showMessageDialog(null, this.toString());
            
        } catch (Exception ex) {
            Logger.getLogger(BDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
