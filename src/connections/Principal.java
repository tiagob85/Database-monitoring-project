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
     /*   FrPrincipal obj = new FrPrincipal();
        obj.setVisible(true);*/
        ConexaoBanco obj = new ConexaoBanco();
        obj.setInfoFirebird("localhost", "3052", "C:/Projetos/dbfirebird/BDSGR.FDB", "sysdba", "masterkey");
        if(obj.ConexaoFirebird() == 1){
            System.out.println("Conectado ao banco firebird");
        }
        else{
            System.out.println("Não conectado ao banco firebird");
        }
    }
    
}
