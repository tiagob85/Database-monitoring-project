/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import classes.ConexaoBanco;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author Tiago B
 */
public class FrPrincipal extends javax.swing.JFrame {
    String nome;
    /**
     * Creates new form FrPrincipal
     */
    public FrPrincipal() {
        initComponents();
    //    f = new JFrame("frame");
       // IniciaFrame();
        setTitle("Monitoramento de conexão");
        objFrConexao = new FrNovaConexao();
    }
    
    
    public void IniciaFrame(String nomedoframe){
        setLayout(null);
        // create a internal frame 
        internal = new JInternalFrame(nomedoframe, true, false, true, true); 
        try {
            internal.setClosed(true);
            internal.setSize(600, 900);
            internal.setBounds(100, 0, 0, 0);
            internal.setResizable(false);
            internal.setClosable(true);
            internal.setMaximizable(false);
            internal.setSelected(true);
            //Determina a dimensão do frame interno.
            internal.setPreferredSize(new java.awt.Dimension(800,200));
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//metodo inicia Frame

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JDesktop.setToolTipText("teste");
        JDesktop.setName("Teste"); // NOI18N

        javax.swing.GroupLayout JDesktopLayout = new javax.swing.GroupLayout(JDesktop);
        JDesktop.setLayout(JDesktopLayout);
        JDesktopLayout.setHorizontalGroup(
            JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1554, Short.MAX_VALUE)
        );
        JDesktopLayout.setVerticalGroup(
            JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );

        jMenu1.setText("Opções");

        jMenuItem1.setText("Nova conexão");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Credenciais");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktop)
        );

        JDesktop.getAccessibleContext().setAccessibleName("Teste");
        JDesktop.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here: 
        if(objFrConexao == null){
            objFrConexao = new FrNovaConexao();
            objFrConexao.setLocationRelativeTo(null);
            objFrConexao.setVisible(true);   
            objFrConexao.setResizable(false);
        }
        else{
            objFrConexao.setLocationRelativeTo(null);
            objFrConexao.setVisible(true);   
            objFrConexao.setResizable(false);
        }
        
        objFrConexao.enviaDados(this);
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        objCredenciais = new FrCredenciais();
        objCredenciais.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
   // public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrPrincipal().setVisible(true);
            }
        });
    }*/
    
    public void criaInternalFrame(String nomedaconexao, int idbanco, String descricao, String porta, String ip, String usuario, String senha){
    //Adicionando frame interno.              
        contador = contador+1;
        IniciaFrame(nomedaconexao);
        /*
        *********Criar componentes***********
        */
        JPanel painel = new JPanel(); 
        painel.setLayout(null);
        painel.setSize(700, 500);
 
        //Label
        JLabel labelStatus = new JLabel("Status"); 
        labelStatus.setText("Status :");
        Font font = new Font("Arial",Font.BOLD, 15);
        labelStatus.setFont(font);
        labelStatus.setBounds(10, 5, 200, 50);
        
        JLabel labelStatusConexao = new JLabel("Status Conexao"); 
        labelStatusConexao.setText("Conectado");
        Font fontConexao = new Font("Arial",Font.BOLD, 20);
        labelStatusConexao.setFont(fontConexao);
        labelStatusConexao.setBounds(90, 20, 200, 50);        
        
        // create a Button 
        JButton buttonConexao = new JButton("Conectar");     
        buttonConexao.addActionListener(new ActionListener() 
        {
            protected int status = 1;
            @Override
            public void actionPerformed(ActionEvent e) 
            {                
                if(status == 1)
                {
                    buttonConexao.setText("Desconectar");
                    status = 0;
                    obj = new ConexaoBanco();
                   // obj.setInfoDB("10.0.0.9", "3306", "testedb", "root", "123456789", 2);
                    obj.setInfoDB(ip, porta, descricao, usuario, senha, idbanco);
                    
                    TimerTask repeatedTask = new TimerTask() 
                    {
                        @Override
                        public void run() {
                            //labelStatus.setText("Hora : "+new Date());
                            try {
                                if(obj.TesteConexao()){                                
                                    labelStatusConexao.setText(obj.getMessageStatus());
                                    labelStatusConexao.setForeground(Color.GREEN);
                                }
                                else
                                {
                                    labelStatusConexao.setText(obj.getMessageStatus());
                                    labelStatusConexao.setForeground(Color.RED);
                                }
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(FrPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    };
                    Timer timer = new Timer("Timer");

                    long delay  = 1000L;
                    long period = 1000L;
                    timer.scheduleAtFixedRate(repeatedTask, delay, period);
                
                }  
                else{
                    buttonConexao.setText("Conectar");
                    try 
                    {
                        obj.Desconectar();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(FrPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(FrPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        buttonConexao.setBounds(10, 125, 270, 40);

        /*
        ***Adicionar componentes no panel*****
        */
        
        // add label and button to panel
        painel.add(labelStatus);        
        painel.add(labelStatusConexao);
        painel.add(buttonConexao); 
     //   painel.add(toogleConectado);
       
        // add panel to internal frame 
        internal.add(painel); 
        
            //Initial position of frame in screen.
        internal.setBounds(500, 200, 300, 200);
            // set visibility internal frame 
        internal.setVisible(true);         

        // add internal frame to frame      
       // add(internal);       
        JDesktop.add(internal);
        
    }//metodo criaInternalFrame.
    
    public void recebeDados(String nomedaconexao, int idbanco, String descricao, String porta, String ip, String usuario, String senha){
        nome = nomedaconexao;
        criaInternalFrame(nomedaconexao, idbanco, descricao, porta, ip, usuario, senha);
        System.out.println(nome);
    }
    
    public String getDados(){
        return nome;
    }
    
    public FrCredenciais objCredenciais;
    public FrNovaConexao objFrConexao;
    String NomeForm = "";
    ConexaoBanco obj;
    public JInternalFrame internal;
    int contador = 0;
    public Frame f;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDesktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
