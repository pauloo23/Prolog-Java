/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbc;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jpl7.*;
/**
 *
 * @author paulo
 */
public class Preferidos extends javax.swing.JFrame {
         static String asserts;
    /**
     * Creates new form Inicio
     */
    public Preferidos(String asserts) {
        initComponents();
        this.asserts = asserts;
        
        this.setResizable(false);

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        parasitas = new javax.swing.JRadioButton();
        mil = new javax.swing.JRadioButton();
        joker = new javax.swing.JRadioButton();
        condenados = new javax.swing.JRadioButton();
        padrinho = new javax.swing.JRadioButton();
        interstellar = new javax.swing.JRadioButton();
        lobo = new javax.swing.JRadioButton();
        vingadores = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sbc/images/resultado.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel2.setText("Sistemas Baseados em Conhecimento");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("De entre os filmes abaixo, selecione os que mais gosta");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sbc/images/Sair.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        parasitas.setText("Parasitas");
        parasitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parasitasActionPerformed(evt);
            }
        });

        mil.setText("1917");

        joker.setText("Joker");
        joker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jokerActionPerformed(evt);
            }
        });

        condenados.setText("Os condenados de Shawshank");

        padrinho.setText("O Padrinho");

        interstellar.setText("Interstellar");
        interstellar.setToolTipText("");

        lobo.setText("O Lobo de Wall Street");
        lobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loboActionPerformed(evt);
            }
        });

        vingadores.setText("Vingadores: Endgame");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sbc/images/next.png"))); // NOI18N
        jButton2.setText("Seguinte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(parasitas)
                                    .addComponent(mil)
                                    .addComponent(joker)
                                    .addComponent(condenados)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(padrinho)
                                            .addGap(139, 139, 139))
                                        .addComponent(interstellar)
                                        .addComponent(lobo)
                                        .addComponent(vingadores))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(30, 30, 30)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(parasitas)
                            .addComponent(padrinho))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mil)
                            .addComponent(interstellar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(joker)
                            .addComponent(lobo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(condenados)
                            .addComponent(vingadores))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void parasitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parasitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parasitasActionPerformed

    private void jokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jokerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jokerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 if (parasitas.isSelected() || mil.isSelected() || joker.isSelected() || condenados.isSelected() || padrinho.isSelected() || interstellar.isSelected() ||
              lobo.isSelected() || vingadores.isSelected()) {
          if (parasitas.isSelected()){
                 
                 this.asserts += "assert(fact(comedia)), assert(fact(drama)), assert(fact(thriller)),";
                 
                 System.out.println(asserts);
                 Preferidostwo preferidostwo = new Preferidostwo(asserts);
                 preferidostwo.setVisible(true);
                 this.dispose();
                             }
          if (mil.isSelected()){
                 
                 this.asserts += "assert(fact(drama)), assert(fact(guerra)),";
                 
                 System.out.println(asserts);
                 Preferidostwo preferidostwo = new Preferidostwo(asserts);
                 preferidostwo.setVisible(true);
                 this.dispose();
                             }
          if (joker.isSelected()){
                 
                 this.asserts += "assert(fact(drama)), assert(fact(crime)), assert(fact(thriller)),";
                 
                 System.out.println(asserts);
                 Preferidostwo preferidostwo = new Preferidostwo(asserts);
                 preferidostwo.setVisible(true);
                 this.dispose();
                             }
          if (condenados.isSelected()){
                 
                 this.asserts += "assert(fact(drama)),";
                 
                 System.out.println(asserts);
                Preferidostwo preferidostwo = new Preferidostwo(asserts);
                 preferidostwo.setVisible(true);
                 this.dispose();
                             }
          if (padrinho.isSelected()){
                 
                 this.asserts += "assert(fact(drama)), assert(fact(crime)),";
                 
                 System.out.println(asserts);
                Preferidostwo preferidostwo = new Preferidostwo(asserts);
                 preferidostwo.setVisible(true);
                 this.dispose();
                             }
          if (interstellar.isSelected()){
                 
                 this.asserts += "assert(fact(drama)), assert(fact(aventura)), assert(fact(ficcao)),";
                 
                 System.out.println(asserts);
                 Preferidostwo preferidostwo = new Preferidostwo(asserts);
                 preferidostwo.setVisible(true);
                 this.dispose();
                             }
          if (lobo.isSelected()){
                 
                 this.asserts += "assert(fact(drama)), assert(fact(biografia)), assert(fact(crime)),";
                 
                 System.out.println(asserts);
                 Preferidostwo preferidostwo = new Preferidostwo(asserts);
                 preferidostwo.setVisible(true);
                 this.dispose();
                             }
           if (vingadores.isSelected()){
                 
                 this.asserts += "assert(fact(drama)), assert(fact(accao)), assert(fact(aventura)), assert(fact(ficcao)),";
                 
                 System.out.println(asserts);
                 Preferidostwo preferidostwo = new Preferidostwo(asserts);
                 preferidostwo.setVisible(true);
                 this.dispose();
                             }
          
 } 
 else {
            JOptionPane.showMessageDialog(new JFrame(), "É necessário responder à pergunta antes de prosseguir!","Erro", JOptionPane.ERROR_MESSAGE);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    private void loboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loboActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Preferidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preferidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preferidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preferidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preferidos(asserts).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton condenados;
    private javax.swing.JRadioButton interstellar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton joker;
    private javax.swing.JRadioButton lobo;
    private javax.swing.JRadioButton mil;
    private javax.swing.JRadioButton padrinho;
    private javax.swing.JRadioButton parasitas;
    private javax.swing.JRadioButton vingadores;
    // End of variables declaration//GEN-END:variables
}














