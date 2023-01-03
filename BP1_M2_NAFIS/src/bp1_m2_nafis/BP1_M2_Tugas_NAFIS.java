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
public class BP1_M2_Tugas_NAFIS {
    public static void main(String[] args){
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
         String tugas1, tugas2, tugas3, nim, nama, jurusan, kelas, matkul;
         int jumlah = 0;
         int rata = 0;
         
         
        nim = JOptionPane.showInputDialog("Masukan Nim anda : ");
        nama = JOptionPane.showInputDialog("Masukan Nama Anda : ");
        jurusan = JOptionPane.showInputDialog("Masukan Jurusan Anda : ");
        kelas = JOptionPane.showInputDialog("Masukan kelas Anda : ");
        matkul = JOptionPane.showInputDialog("Masukan Matkul : ");
        
        tugas1 = JOptionPane.showInputDialog("Nilai Kalkulus : ");
        int tugas1Int = Integer.parseInt(tugas1);
        tugas2 = JOptionPane.showInputDialog("Nilai Basis Data : ");
        int  tugas2Int = Integer.parseInt(tugas2);
        tugas3 = JOptionPane.showInputDialog("Nilai Pemrograman 1 : ");
        int  tugas3Int = Integer.parseInt(tugas3);
        
        jumlah = tugas1Int + tugas2Int + tugas3Int;
        
        rata = jumlah/3;
        
        JOptionPane.showMessageDialog(null, "NIM = "+ nim +
                "\nNama = "+ nama +
                "\nJurusan = "+jurusan +
                "\nKelas = "+kelas +
                "\nMata Kuliah" + matkul +
                "\nNilai rata-rata = "+rata);
        
    }
}
