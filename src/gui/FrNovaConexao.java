/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import classes.ConexaoBanco;
import classes.DBOperacoes;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Tiago B
 */
public class FrNovaConexao extends javax.swing.JFrame {

    /**
     * Creates new form FrNovaConexao
     */
    public FrNovaConexao() throws ClassNotFoundException, SQLException {
        initComponents();
        
        objOperacoes = new DBOperacoes();  
        objOperacoes.RetornaDados();
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(objOperacoes.retornaCredencialCombo().toArray());
        CmbCredencial.setModel(defaultComboBox);
        CmbCredencial.setEnabled(false);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtNomeConexao = new javax.swing.JTextField();
        CbNomeBanco = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        TxtIP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtPorta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BtnConfirmar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        TxtSenha = new javax.swing.JPasswordField();
        ChkCarregaCredencial = new javax.swing.JCheckBox();
        CmbCredencial = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova Conexão");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Nome da conexão : ");

        TxtNomeConexao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        CbNomeBanco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CbNomeBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o banco", "Firebird", "MySQL", "Oracle" }));
        CbNomeBanco.setToolTipText("Selecione o banco");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("IP :");

        TxtIP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Porta :");

        TxtPorta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Descrição :");

        TxtDescricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Usuário :");

        TxtUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Senha:");

        BtnConfirmar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        ChkCarregaCredencial.setText("Carregar credenciais");
        ChkCarregaCredencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkCarregaCredencialActionPerformed(evt);
            }
        });

        CmbCredencial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChkCarregaCredencial)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(CbNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtNomeConexao))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(TxtDescricao)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CmbCredencial, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtNomeConexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CbNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TxtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ChkCarregaCredencial)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CmbCredencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCancelar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        // TODO add your handling code here:
        String[] credencial = null;
        credencial = new String[2];
        if(!TxtNomeConexao.getText().equals("")&&!(CbNomeBanco.getSelectedIndex()==0)
                ||!TxtPorta.getText().equals("")&&!TxtIP.getText().equals("")||!TxtDescricao.getText().equals("")
                ||!TxtUsuario.getText().equals("")&&!TxtSenha.getText().equals(""))
        {
            if(frPrincipal != null){
                if(ChkCarregaCredencial.isSelected()){
                    try 
                    {
                        credencial = objOperacoes.retornaCredencial(CmbCredencial.getSelectedItem().toString());
                    } catch (SQLException ex) {
                        Logger.getLogger(FrNovaConexao.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    frPrincipal.recebeDados(TxtNomeConexao.getText(),CbNomeBanco.getSelectedIndex(),TxtDescricao.getText(),TxtPorta.getText(), TxtIP.getText(), credencial[0], credencial[1]);  
                    limpaComponentes();                    
                }
                else
                {
                    frPrincipal.recebeDados(TxtNomeConexao.getText(),CbNomeBanco.getSelectedIndex(),TxtDescricao.getText(),TxtPorta.getText(), TxtIP.getText(), TxtUsuario.getText(), TxtSenha.getText());   
                     limpaComponentes();
                }
                //limpaComponentes();
            }
            this.dispose();
            TxtNomeConexao.setText("");
            CbNomeBanco.setSelectedIndex(0);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Dados incorretos ou não preenchidos !","Erro",JOptionPane.ERROR_MESSAGE); 
            limpaComponentes();
        }
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void ChkCarregaCredencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkCarregaCredencialActionPerformed
        // TODO add your handling code here:
        if(ChkCarregaCredencial.isSelected())
        {
            TxtUsuario.setEnabled(false);
            TxtSenha.setEnabled(false);
            TxtUsuario.setText("");
            TxtSenha.setText("");
            DefaultComboBoxModel defaultComboBox = null;
            try {
                defaultComboBox = new DefaultComboBoxModel(objOperacoes.retornaCredencialCombo().toArray());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FrNovaConexao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FrNovaConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
            CmbCredencial.setModel(defaultComboBox);
            CmbCredencial.setEnabled(true);
        }
        else
        {
            TxtUsuario.setEnabled(true);
            TxtSenha.setEnabled(true);
            CmbCredencial.setEnabled(false);
        }
    }//GEN-LAST:event_ChkCarregaCredencialActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        limpaComponentes();
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    public void verificaChecklist(){
    }
    
    public void limpaComponentes(){
        /** Limpar componentes*/
        TxtNomeConexao.setText("");
        CbNomeBanco.setSelectedIndex(0);
        CmbCredencial.setSelectedIndex(0);
        TxtDescricao.setText("");
        TxtPorta.setText("");
        TxtIP.setText("");
        TxtUsuario.setText("");
        TxtSenha.setText("");        
    }//Limpar componentes
    
    public void enviaDados(FrPrincipal framePrincipal){
        this.frPrincipal = framePrincipal;
    }
    
    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrNovaConexao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrNovaConexao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrNovaConexao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrNovaConexao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
    /*    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrNovaConexao().setVisible(true);
            }
        });
    }*/
    
    DBOperacoes objOperacoes;
    private FrPrincipal frPrincipal;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JComboBox<String> CbNomeBanco;
    private javax.swing.JCheckBox ChkCarregaCredencial;
    private javax.swing.JComboBox<String> CmbCredencial;
    private javax.swing.JTextField TxtDescricao;
    private javax.swing.JTextField TxtIP;
    private javax.swing.JTextField TxtNomeConexao;
    private javax.swing.JTextField TxtPorta;
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

}
