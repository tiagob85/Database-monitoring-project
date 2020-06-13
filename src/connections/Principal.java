/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import classes.ConexaoBanco;
import gui.FrPrincipal;

/**
 *
 * @author Tiago B
 */
public class Principal {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Painel de conexões !");
       /* FrPrincipal obj = new FrPrincipal();
        obj.setVisible(true);*/
        ConexaoBanco obj = new ConexaoBanco();
        obj.setInfoDB("10.0.0.9", "3306", "testedb", "root", "123456789", 2);
    //   obj.setInfoDB("localhost", "1521", "xe", "system", "tech2020", 3);
        if(obj.TesteConexao()){
            System.out.println(obj.getMessageStatus());
        }
        else
        {
            System.out.println(obj.getMessageStatus());
        }
    }
    
}
