import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import org.jpl7.Query;
import org.jpl7.Term;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author margaridapinto
 */
public class Preferidos extends javax.swing.JFrame {

    static String asserts;
    DefaultTableModel modelo;

    /**
     * Creates new form Resultado
     */
    public Preferidos(String asserts) throws FileNotFoundException, IOException {
        initComponents();
        this.asserts = asserts;
        this.setSize(2000, 2000);

        // Não permite o redimensionamento da janela
        this.setResizable(false);

        // Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        Object colunas[] = {"Tipo", "Género", "Nome", "Ano", "Avaliação"};
        Object linhas[][] = {};
        modelo = new DefaultTableModel(linhas, colunas);
        jTable1.setModel(modelo);

        Query q1 = new Query(asserts + ", obtem(P)");

        String solucao = q1.oneSolution().get("P").toString();

        solucao = solucao.replace("[", "");
        solucao = solucao.replace("|", "");
        solucao = solucao.replace("]", "");
        solucao = solucao.replace("(", "");
        solucao = solucao.replace("'", "");
        solucao = solucao.replace(")", "");

        if (q1.hasMoreElements()) {
            String resto = "";
            for (int i = 0; i < q1.toString().length(); i += 5) {
                String[] nome = new String[]{solucao};
                String[] tipo = new String[]{solucao};
                String[] ano = new String[]{solucao};
                String[] avaliacao = new String[]{solucao};
                String[] generos = new String[]{solucao};
                if (i == 0) {
                    int j = i+1;
                    nome = solucao.split("Tipo:");
                    System.out.println("Nome:" + nome[i]);
                    tipo = nome[j].split("Ano:");
                    System.out.println("Tipo:" + tipo[i]);
                    ano = tipo[j].split("Generos:");
                    System.out.println("Ano:" + ano[i]);
                    generos = ano[j].split("IMDb:");
                    System.out.println("Generos:" + generos[i]);
                    avaliacao = generos[j].split("., ,");
                    System.out.println("Avaliação:" + avaliacao[i]);
                    modelo.addRow(new String[]{tipo[i], ano[i], nome[i], generos[i], avaliacao[i]});
                    jTextArea1.setText("Tipo:" + tipo[0] + "Ano:" + ano[0] + "Nome:" + nome[0] + "Generos:" + generos[0] + "Avaliação" + avaliacao[0]);
                    resto = generos[1].split("., ,")[j];
                } else {
                    int j = i+1;
                    nome = resto.split("Tipo:");
//                    System.out.println("Nome:" + nome[i]);
                    tipo = nome[j].split("Ano:");
  //                  System.out.println("Tipo:" + tipo[i]);
                    ano = tipo[j].split("Generos:");
    //                System.out.println("Ano:" + ano[i]);
                    generos = ano[j].split("IMDb:");
      //              System.out.println("Generos:" + generos[i]);
                    avaliacao = generos[j].split("., ,");
        //            System.out.println("Avaliação:" + avaliacao[i]);
                    modelo.addRow(new String[]{tipo[i], ano[i], nome[i], generos[i], avaliacao[i]});
                    jTextArea1.setText("Tipo:" + tipo[i] + "Ano:" + ano[i] + "Nome:" + nome[i] + "Generos:" + generos[i] + "Avaliação" + avaliacao[i]);
                    resto = generos[1].split("., ,")[j];
                }
            }
        }

        StringBuilder sb;

        BufferedReader br = new BufferedReader(new FileReader("exps.txt"));
        try {
            sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);

        } finally {
            br.close();
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("As nossas sugestões para ti:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Género", "Nome", "Ano", "Avaliação"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Agora diverte-te!");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aaaaaaa.png"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main1(String args[]) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Resultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
