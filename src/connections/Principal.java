/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import classes.ConexaoBanco;
import gui.FrPrincipal;
import java.sql.SQLException;

/**
 *
 * @author Tiago B
 */
public class Principal {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Painel de conexões !");
        FrPrincipal obj = new FrPrincipal();
        obj.setVisible(true);
    }
    
}
