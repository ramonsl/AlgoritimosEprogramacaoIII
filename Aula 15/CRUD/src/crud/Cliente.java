package crud;

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
    
}
