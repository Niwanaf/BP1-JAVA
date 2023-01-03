/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1_m3_nafis;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Nafis
 */
public class BP1_M3_P2_NAFIS {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String hari = null;
        int angka;
        hari = JOptionPane.showInputDialog("Masukan angka (1-7) : ");
        angka = Integer.parseInt(hari);
        switch (angka) {
            case 1: hari="SENIN"; break;
            case 2: hari="SELASA"; break;
            case 3: hari="RABU"; break;
            case 4: hari="KAMIS"; break;
            case 5: hari="JUMAT"; break;
            case 6: hari="SABTU"; break;
            case 7: hari="MINGGU"; break;
            default : hari="Angka yang anda masukan salah : ";break;
        }
        JOptionPane.showMessageDialog(null, "Angka yang anda masukan adalah : "+angka
            + " yang mewakili hari  "+hari);
    }
    
    
}
