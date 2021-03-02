/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 *
 * @author User
 */
public class Ligacao {
    
    private String outputFile = "exp.txt";
    private String myprologFile = "";
    private ArrayList<String> destino;
    BufferedReader reader;
    String line;
    String replace;
    String replaces;
    String[] array;

    public Ligacao(String prologFile) {
        myprologFile = "consult('" + prologFile + "')";
        org.jpl7.Query prologQuery = new org.jpl7.Query(myprologFile);
        if (prologQuery.hasSolution()) {
            System.out.println("ficheiro " + prologFile + " carregado com sucesso");
        } else {
            System.out.println("!!ERRO! ficheiro " + prologFile + " não carregado!! Erro!");
        }
        prologQuery.close();
    }

    public String[] getResult() throws IOException {
        try {
            this.reader = new BufferedReader(new FileReader(outputFile));
            this.line = reader.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
            replace = line.replace("[", "");
            replaces = replace.replace("]", "");
            array = replaces.split(",");
        reader.close();
        return array;
    }

    public ImageIcon getImagem(){
        ImageIcon destino =new ImageIcon("Imagens/"+array[0]+".jpg"); 
        return destino; 
    }
    
}
