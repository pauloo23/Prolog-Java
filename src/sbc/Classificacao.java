/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbc;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import org.jpl7.*;
import static sbc.Inicio.nome;

/**
 *
 * @author paulo
 */
public class Classificacao extends javax.swing.JFrame {
    
     static String asserts;

     
    public Classificacao(String asserts) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        baixa = new javax.swing.JRadioButton();
        alta = new javax.swing.JRadioButton();
        indiferente = new javax.swing.JRadioButton();
        saber = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sbc/images/classificação.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel2.setText("Sistemas Baseados em Conhecimento");

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
        jButton2.setLabel("Ver Resultados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Que tipo de classificação da platforma IMDB pretende?");

        baixa.setText("Baixa");
        baixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baixaActionPerformed(evt);
            }
        });

        alta.setText("Alta");

        indiferente.setText("Indiferente");
        indiferente.setToolTipText("");

        saber.setText("Saber mais");
        saber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(indiferente)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(baixa)
                                .addContainerGap(454, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(alta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saber, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(baixa)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alta)
                            .addComponent(saber, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(indiferente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String con = "consult('bc.pl')";
        Query query = new Query(con);
        System.out.println(query.hasSolution() ? "ok" : "erro");
        
        
        if(baixa.isSelected() ||  alta.isSelected() || indiferente.isSelected()) {
        
               if (baixa.isSelected()){
                 String classificacao = "baixa";
                 this.asserts += "assert(fact("+classificacao+")),obtem(P).";
                 
                 System.out.println(asserts);
                Query query_exec = new Query(asserts);
      
                String solucao =  query_exec.oneSolution().get("P").toString();
                
                solucao = solucao.replace("[", "");
                solucao = solucao.replace("|", "\n");
                solucao = solucao.replace("]", "");
                solucao = solucao.replace("(", "");
                solucao = solucao.replace("'", "");
                solucao = solucao.replace(",", "");
                solucao = solucao.replace(")", "");
                solucao = solucao.replace("_1", "");
                solucao = solucao.replace(",", "");
                

                if(0 != solucao.length()) {
                     JFrame frame = new JFrame("Apresentar resultado");
                        JOptionPane.showMessageDialog(frame,nome + ", " + "a(s) nossa(s) solução(ões) sugerida(s):  " + solucao);
                } else { 
                    showMessageDialog(null, "Nenhum resultado encontrado.");
                }
        
                System.out.println(solucao);
                             }
        
     
        
         if (alta.isSelected()){
                 String classificacao = "alta";
                 this.asserts += "assert(fact("+classificacao+")),obtem(P).";
                 
                 System.out.println(asserts);
                 Query query_exec = new Query(asserts);
      
                String solucao =  query_exec.oneSolution().get("P").toString();
                System.out.println(solucao);
                
                solucao = solucao.replace("[", "");
                solucao = solucao.replace("|", "\n");
                solucao = solucao.replace("]", "");
                solucao = solucao.replace("(", "");
                solucao = solucao.replace("'", "");
                solucao = solucao.replace(",", "");
                solucao = solucao.replace(")", "");
                solucao = solucao.replace("_1", "");
                solucao = solucao.replace(",", "");
                
                
        

                if(0 != solucao.length()) {
                     JFrame frame = new JFrame("Apresentar resultado");
                     JOptionPane.showMessageDialog(frame,nome + ", " + "a(s) nossa(s) solução(ões) sugerida(s): " + solucao);
                } else { 
                    showMessageDialog(null, "Nenhum resultado encontrado.");
                }
        
                System.out.println(solucao);
                             }
        
         if (indiferente.isSelected()){
                
                   this.asserts += "assert(fact(baixa)), assert(fact(alta)),obtem(P).";
                 
                 System.out.println(asserts);
                 Query query_exec = new Query(asserts);
      
                String solucao =  query_exec.oneSolution().get("P").toString();
                
                solucao = solucao.replace("[", "");
                solucao = solucao.replace("|", "\n");
                solucao = solucao.replace("]", "");
                solucao = solucao.replace("(", "");
                solucao = solucao.replace("'", "");
                solucao = solucao.replace(",", "");
                solucao = solucao.replace(")", "");
                solucao = solucao.replace("_1", "");
                solucao = solucao.replace(",", "");
                solucao = solucao.replace(",", "");
                System.out.println(solucao);
        

                if(0 != solucao.length()) {
                     JFrame frame = new JFrame("Apresentar resultado");
                     JOptionPane.showMessageDialog(frame, nome + ", " + "a(s) nossa(s) solução(ões) sugerida(s): " + solucao);
                } else { 
                    showMessageDialog(null, "Nenhum resultado encontrado.");
                }
        
                System.out.println(solucao);
                             }
       
        
                                     }
       else {
        JOptionPane.showMessageDialog(new JFrame(), "É necessário responder à pergunta antes de prosseguir!","Erro", JOptionPane.ERROR_MESSAGE);
        }     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void baixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baixaActionPerformed

    private void saberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saberActionPerformed
        JOptionPane optionPane = new JOptionPane();
        optionPane.setMessage("Com base nas classificações na plataforma IMDB, considerá-mos uma pontuação baixa abaixo de 7.5 e uma pontuação alta acima desse valor");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog(null, "Saber mais");
        dialog.setVisible(true);
    }//GEN-LAST:event_saberActionPerformed

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
            java.util.logging.Logger.getLogger(Classificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Classificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Classificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Classificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Classificacao(asserts).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton alta;
    private javax.swing.JRadioButton baixa;
    private javax.swing.JRadioButton indiferente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton saber;
    // End of variables declaration//GEN-END:variables
}
