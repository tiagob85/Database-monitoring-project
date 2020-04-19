/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tiago B
 */
public class ConexaoBanco {
    
    String IpBanco;
    String PortaBanco;
    String FbCaminhoBanco;
    String User;
    String Password;
    String MyBanco;
    
    public ConexaoBanco()
    {
    }//Construtor
    
    /**
     * Setar informações do banco para a conexão.
     */
    public void setInfoFirebird(String ip, String porta,String caminho, String user, String password){
        this.IpBanco = ip;
        this.PortaBanco = porta;
        this.FbCaminhoBanco = caminho;
        this.User = user;
        this.Password = password;
    }
    
    
    /**
     * Processo de conexão ao banco de dados.
     */
    public Connection getConnectionFirebird() throws ClassNotFoundException, SQLException{
        Class.forName("org.firebirdsql.jdbc.FBDriver");
        //return DriverManager.getConnection("jdbc:firebirdsql:localhost/3050:C:/Projetos/dbfirebird/BDSGR.FDB", "sysdba","masterkey");     
        return DriverManager.getConnection("jdbc:firebirdsql:"+this.IpBanco+"/"+this.PortaBanco+":"+this.FbCaminhoBanco, this.User,this.Password);             
    }

    
    /**
     * Saida de status de conexao ao banco.
     */
    
    public int ConexaoFirebird() throws ClassNotFoundException{
        int status = 0;
        
        try 
        {
            getConnectionFirebird();
            status = 1;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return status;
    }
    
}
