/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbc;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class Preferidostwo extends javax.swing.JFrame {
   static String asserts;
    /**
     * Creates new form Preferidostwo
     */
    public Preferidostwo(String asserts) {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cavaleiro = new javax.swing.JRadioButton();
        lista = new javax.swing.JRadioButton();
        senhor = new javax.swing.JRadioButton();
        vida = new javax.swing.JRadioButton();
        silencio = new javax.swing.JRadioButton();
        resgate = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sbc/images/resultado.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sbc/images/Sair.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sbc/images/next.png"))); // NOI18N
        jButton2.setText("Seguinte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cavaleiro.setText("O Cavaleiros das Trevas");
        cavaleiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cavaleiroActionPerformed(evt);
            }
        });

        lista.setText("A Lista de Schindler");

        senhor.setText("O Senhor dos Anéis");

        vida.setText("A vida é bela");

        silencio.setText("O silêncio dos inocentes");

        resgate.setText("O resgate do soldado Ryan");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel2.setText("Sistemas Baseados em Conhecimento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lista)
                            .addComponent(cavaleiro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(silencio)
                            .addComponent(vida))
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(senhor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resgate)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vida)
                            .addComponent(cavaleiro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lista)
                            .addComponent(silencio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senhor)
                            .addComponent(resgate))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (cavaleiro.isSelected() || lista.isSelected() || resgate.isSelected() || senhor.isSelected() || silencio.isSelected() || vida.isSelected()) {
            if (cavaleiro.isSelected()){

                this.asserts += "assert(fact(accao)), assert(fact(drama)), assert(fact(thriller)), assert(fact(crime)),";

                System.out.println(asserts);
                Classificacao classificacao = new Classificacao(asserts);
                classificacao.setVisible(true);
                this.dispose();
            }
            if (lista.isSelected()){

                this.asserts += "assert(fact(drama)), assert(fact(biografia)),";

                System.out.println(asserts);
                Classificacao classificacao = new Classificacao(asserts);
                classificacao.setVisible(true);
                this.dispose();
            }
            if (resgate.isSelected()){

                this.asserts += "assert(fact(drama)), assert(fact(guerra)),";

                System.out.println(asserts);
                Classificacao classificacao = new Classificacao(asserts);
                classificacao.setVisible(true);
                this.dispose();
            }
            if (senhor.isSelected()){

                this.asserts += "assert(fact(drama)), assert(fact(accao)), assert(fact(aventura)),";

                System.out.println(asserts);
                Classificacao classificacao = new Classificacao(asserts);
                classificacao.setVisible(true);
                this.dispose();
            }
            if (silencio.isSelected()){

                this.asserts += "assert(fact(drama)), assert(fact(crime)), assert(fact(thriller)),";

                System.out.println(asserts);
                Classificacao classificacao = new Classificacao(asserts);
                classificacao.setVisible(true);
                this.dispose();
            }
            if (vida.isSelected()){

                this.asserts += "assert(fact(drama)), assert(fact(comedia)), assert(fact(romance)),";

                System.out.println(asserts);
                Classificacao classificacao = new Classificacao(asserts);
                classificacao.setVisible(true);
                this.dispose();
            }
            
            
        }  else {
            JOptionPane.showMessageDialog(new JFrame(), "É necessário responder à pergunta antes de prosseguir!","Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void cavaleiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cavaleiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cavaleiroActionPerformed

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
            java.util.logging.Logger.getLogger(Preferidostwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preferidostwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preferidostwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preferidostwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preferidostwo(asserts).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton cavaleiro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton lista;
    private javax.swing.JRadioButton resgate;
    private javax.swing.JRadioButton senhor;
    private javax.swing.JRadioButton silencio;
    private javax.swing.JRadioButton vida;
    // End of variables declaration//GEN-END:variables
}