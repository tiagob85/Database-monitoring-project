/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tiago B
 */
public class DBOperacoes {
    
    Connection connection;
    ConexaoBanco objConexao;
    PreparedStatement pst;
    DefaultTableModel modelo = null;
    
    public DBOperacoes() throws ClassNotFoundException, SQLException{
        objConexao = new ConexaoBanco();
        this.connection = objConexao.getConnectionSQLite();
        modelo = new DefaultTableModel();        
    }//Construtor
    
    /**
     * Insert
     */
    public boolean insertDadosCredenciais(Credencial credencial){
        boolean condicao = true;
        String sqlInsert = "INSERT INTO credenciais ( nome, usuario, senha)VALUES ( ?, ?, ?);";
        
        try 
        {
            pst = connection.prepareStatement(sqlInsert);
            pst.setString(1, credencial.getNome());
            pst.setString(2, credencial.getUsuario());
            pst.setString(3, credencial.getSenha());
            pst.executeUpdate();
        } catch (SQLException ex) {
            condicao = false;
            Logger.getLogger(DBOperacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return condicao;
    }
    /**
     * Update
     */
    
    /**
     * Delete
     */
    public boolean deleteDadosCredenciais(int codigo){
        boolean condicao = true;
        String sqlInsert = "delete from credenciais where id = ? ";
        
        try {
            pst = connection.prepareStatement(sqlInsert);
            pst.setInt(1, codigo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            condicao = false;
            Logger.getLogger(DBOperacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return condicao;
    }
    
    /**
     * List
     */
    public DefaultTableModel RetornaDados() throws ClassNotFoundException, SQLException{
        
        String sql = "select id, nome, usuario, senha, dataatualizacao FROM credenciais";
        String[] nomeColunas = {"Id","Nome", "Usuário", "Senha", "Data Atualização"};
        
        //Apaga as informações antes de 
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }        
        
        modelo.setColumnIdentifiers(nomeColunas);
        
        Statement stmt = connection.createStatement();
        
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next())
        {
            //System.out.println(rs.getInt("id")+" "+rs.getString("nomeide")+" "+rs.getString("nomeprocesso"));
            modelo.addRow(new Object[]{String.valueOf(rs.getInt("id")),rs.getString("nome"),rs.getString("usuario"),
                                        rs.getString("senha"),rs.getString("dataatualizacao")});
        }

        return modelo;
    }//metodo RetornaDados    
    

    /**
     * Retorna informações para alimentar o Combobox
     */
    
    public List<String> retornaCredencialCombo() throws ClassNotFoundException, SQLException{
        
        List listacredencial = new ArrayList();
        
        int contador = 1;
            
        String sql = "select nome from credenciais order by id";
        
        Statement stmt = connection.createStatement();
        
        ResultSet rs = stmt.executeQuery(sql);
        
        listacredencial.add("Selecione a credencial");
        
        while(rs.next()){
            listacredencial.add(rs.getString("nome"));            
        }
        
        return listacredencial;
    }//Metodo retornaIde;
    /**
     * Retorna informações
     */
    
    public String[] retornaCredencial(String nomecredencial) throws SQLException{
        String[] credencial  = new String[2];
        String usuario = null;
        String senha = null;
        
        String sqlRetorna = "select usuario, senha from credenciais where nome = '"+nomecredencial+"' ";
        
        PreparedStatement p = connection.prepareStatement(sqlRetorna);
        
        //p.setString(1, nomecredencial);
        
        ResultSet rs = p.executeQuery();
        
        while(rs.next()){
            usuario = rs.getString("usuario");
            senha = rs.getString("senha");
        }
        
        System.out.println("Saida : "+usuario +" - "+ senha);
        
        
        credencial[0] = usuario;
        credencial[1] = senha;
        
        return credencial;
    }
    
    /**
     * Atualiza informações na grade de dados.
     */
    public void atualizaInformacao(){
        modelo.fireTableDataChanged();
    }
    
}//Classe DBOperacoes
