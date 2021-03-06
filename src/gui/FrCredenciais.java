/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import classes.DBOperacoes;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago B
 */
public class FrCredenciais extends javax.swing.JFrame {

    /**
     * Creates new form FrCredenciais
     */
    public FrCredenciais() throws ClassNotFoundException, SQLException {
        initComponents();
        objOperacoes = new DBOperacoes();
        TblInformacoes.setModel(objOperacoes.RetornaDados());        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblInformacoes = new javax.swing.JTable();
        BtnFechar = new javax.swing.JButton();
        BtnNovaCredencial = new javax.swing.JButton();
        BtnApagarRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Credenciais");

        TblInformacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome Credencial", "Usuário", "Senha", "Data atualização"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TblInformacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblInformacoesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblInformacoes);

        BtnFechar.setText("Sair");
        BtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFecharActionPerformed(evt);
            }
        });

        BtnNovaCredencial.setText("Novo");
        BtnNovaCredencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovaCredencialActionPerformed(evt);
            }
        });

        BtnApagarRegistro.setText("Apagar registro");
        BtnApagarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApagarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnApagarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnNovaCredencial, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnFechar)
                    .addComponent(BtnNovaCredencial)
                    .addComponent(BtnApagarRegistro))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnFecharActionPerformed

    private void BtnNovaCredencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovaCredencialActionPerformed
        try {
            // TODO add your handling code here:
            
            if(objGravarCredencial == null){
               objGravarCredencial = new FrCadCredencial();
               objGravarCredencial.setLocationRelativeTo(null);
               objGravarCredencial.setVisible(true);   
               objGravarCredencial.setResizable(false);
           }
           else{
               objGravarCredencial.setLocationRelativeTo(null);
               objGravarCredencial.setVisible(true);   
               objGravarCredencial.setResizable(false);
           }

           objGravarCredencial.enviarDados(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrCredenciais.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FrCredenciais.class.getName()).log(Level.SEVERE, null, ex);
        }
        objGravarCredencial.setVisible(true);
    }//GEN-LAST:event_BtnNovaCredencialActionPerformed

    private void TblInformacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblInformacoesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TblInformacoesMouseClicked

    private void BtnApagarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApagarRegistroActionPerformed
        // TODO add your handling code here:
        System.out.println(TblInformacoes.getSelectedRow());
        System.out.println(TblInformacoes.getValueAt(TblInformacoes.getSelectedRow(), 0));
        if (objOperacoes.deleteDadosCredenciais(Integer.valueOf(TblInformacoes.getValueAt(TblInformacoes.getSelectedRow(), 0).toString())))
        {
            JOptionPane.showMessageDialog(null,"Dados apagados inseridos com sucesso !","Informação",JOptionPane.INFORMATION_MESSAGE); 
            try 
            {
                atualizaGrid(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FrCredenciais.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FrCredenciais.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BtnApagarRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
  /*  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
     /*   try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrCredenciais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCredenciais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCredenciais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCredenciais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
     /*   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCredenciais().setVisible(true);
            }
        });
    }*/
    
    public void atualizaGrid(boolean status) throws ClassNotFoundException, SQLException{
        if (status){
           // objOperacoes.atualizaInformacao();
            TblInformacoes.setModel(objOperacoes.RetornaDados());
            //TblInformacoes.revalidate();
        }
    }

    public DBOperacoes objOperacoes;
    public FrCadCredencial objGravarCredencial;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApagarRegistro;
    private javax.swing.JButton BtnFechar;
    private javax.swing.JButton BtnNovaCredencial;
    private javax.swing.JTable TblInformacoes;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
