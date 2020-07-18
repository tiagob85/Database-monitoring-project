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
    String DescricaoDB;
    String User;
    String Password;
    String MessageStatus;
    int IdBanco;
    String NomeBanco;
    String UrlBanco;
    
    public ConexaoBanco()
    {
    }//Construtor
    
    /***
     * Id do banco:
     * 1 - Firebird
     * 2 - MySQL
     * 3 - Oracle
     */

    /**
     * Setar variavel da classe.
     */
    
    public String getMessageStatus(){
        return MessageStatus;
    }

    public void setMessageStatus(String MessageStatus) {
        this.MessageStatus = MessageStatus;
    }

    /**
     * Setar informações do banco para a conexão.
     */
    public void setInfoDB(String ip, String porta, String descricaobanco, String user, String password, int codigobanco) {
        this.IpBanco = ip;
        this.PortaBanco = porta;
        this.DescricaoDB = descricaobanco;
        this.User = user;
        this.Password = password;
        this.IdBanco = codigobanco;
    }
    
    /**
     * Processo de conexão ao banco de dados.
     */
    
    /**
     * Banco Firebird
     */    
    public Connection getConnectionFirebird() throws ClassNotFoundException, SQLException{
        Class.forName("org.firebirdsql.jdbc.FBDriver");
        //return DriverManager.getConnection("jdbc:firebirdsql:localhost/3050:C:/Projetos/dbfirebird/BDSGR.FDB", "sysdba","masterkey");     
        return DriverManager.getConnection("jdbc:firebirdsql:"+this.IpBanco+"/"+this.PortaBanco+":"+this.DescricaoDB, this.User, this.Password);             
    }
    
    /**
     * Banco MySQL
     */
    public Connection getConnectionMySQL() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        //return DriverManager.getConnection("jdbc:mysql://10.0.0.9:3306/testedb", "root", "123456789");
        return DriverManager.getConnection("jdbc:mysql://"+this.IpBanco+":"+this.PortaBanco+"/"+this.DescricaoDB+"", this.User, this.Password);
    }  
    
    /**
     * Banco Oracle
     */    
    public Connection getConnectionOracle() throws ClassNotFoundException, SQLException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "tech2020");
        return DriverManager.getConnection("jdbc:oracle:thin:@"+this.IpBanco+":"+this.PortaBanco+":"+this.DescricaoDB+"",this.User, this.Password);
    }
    
    /**
     * Banco SQLite -- Salvar credenciais
     */
    public Connection getConnectionSQLite() throws ClassNotFoundException, SQLException{
        Class.forName("org.sqlite.JDBC");
        return DriverManager.getConnection("jdbc:sqlite:C:\\Projetos\\dbsqlite\\dbcredencial.db");
    }
    
    /**
     * Saida de status de conexao ao banco.
     */
    /**
     * Metodo teste
     */
    /***
     * Id do banco:
     * 1 - Firebird
     * 2 - MySQL
     * 3 - Oracle
     */
    public boolean TesteConexao() throws ClassNotFoundException{
        boolean status = false;
        
        switch(this.IdBanco){
            case 1 :
            {
                try 
                {
                    getConnectionFirebird();
                    status = true;
                    //this.MessageStatus = "Conectado ao banco Firebird ";
                    setMessageStatus("Conectado");
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
                    setMessageStatus("Não conectado");
                }                
            }break;
            case 2:
            {
                try
                {
                    getConnectionMySQL();
                    status = true;
                    //this.MessageStatus = "Conectado ao banco MySQL"; 
                    setMessageStatus("Conectado");
                }catch(SQLException ex)
                {
                    Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
                    setMessageStatus("Não conectado");
                }                
            }break;
            case 3:
            {
                try{
                    getConnectionOracle();
                    status = true;
                    //this.MessageStatus = "Conectado ao banco Oracle";
                    setMessageStatus("Conectado");
                }catch(SQLException ex){
                    Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
                    setMessageStatus("Não conectado");
                }                
            }
        }
        
        return status;
    }
    
    public void Desconectar() throws ClassNotFoundException, SQLException{
        getConnectionMySQL().close();
        if(getConnectionMySQL().isClosed())
        {
            System.out.println("Desconectado");
        }
    }
    
}
