/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1_m2_nafis;


import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Nafis
 */
public class BP1_M2_P4_NAFIS {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        
        String panjang, lebar;
        int luas = 0;
        
        panjang = JOptionPane.showInputDialog("Panjang Persegi Panjang : ");
        int panjangInt = Integer.parseInt(panjang);
        lebar = JOptionPane.showInputDialog("Lebar persegi panjang : ");
        int  lebarInt = Integer.parseInt(lebar);
        
        luas = panjangInt * lebarInt;
        
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang adalah = "+luas);
    }
    
}
