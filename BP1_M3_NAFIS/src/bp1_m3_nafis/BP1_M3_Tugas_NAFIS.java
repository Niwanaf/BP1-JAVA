/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1_m3_nafis;

import java.util.Scanner;

/**
 *
 * @author Nafis
 */
public class BP1_M3_Tugas_NAFIS {
     public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        String NIM, Nama, jk, jurusan, kelas, matkul, nt1, nt2, nt3;
        int total;
        float rata;
        String ket = null;
        
        System.out.print("Masukan NIM : ");
        NIM = input.nextLine();
        System.out.print("Masukan Nama : ");
        Nama = input.nextLine();
        System.out.print("Masukan Jenis Kelamin : ");
        jk = input.nextLine();
        System.out.print("Masukan Jurusan : ");
        jurusan = input.nextLine();
        System.out.print("Masukan Kelas : ");
        kelas = input.nextLine();
        System.out.print("Masukan Mata Kuliah : ");
        matkul = input.nextLine();
        System.out.print("Masukan Nilai 1 : ");
        nt1 = input.nextLine();
        int nt1Int = Integer.parseInt(nt1);
        System.out.print("Masukan Nilai 2 : ");
        nt2 = input.nextLine();
        int nt2Int = Integer.parseInt(nt2);
        System.out.print("Masukan Nilai 3 : ");
        nt3 = input.nextLine();
        int nt3Int = Integer.parseInt(nt3);
        
        total = nt1Int+nt2Int+nt3Int;
        rata = total/3;
        
        
        if (rata >=0 && rata <=40)
            ket = "Buruk";
        else if (rata >=41 && rata <=60)
           ket = "Kurang";
        else if (rata >=61 && rata<=70)
           ket = "Cukup";
        else if (rata >=71 && rata <=90)
           ket = "Baik";
        else if (rata >=91 && rata <=100)
           ket = "Sangat Baik";
        else 
          ket = "apa-apaan ini!!1";
       
        System.out.println("NIM : "+NIM);
        System.out.println("Nama : "+Nama);
        System.out.println("Jenis Kelamin : "+jk);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("Kelas : "+kelas);
        System.out.println("Mata Kuliah : "+matkul);
        System.out.println("Nilai rerata : "+rata);
        System.out.println("Keterangan : "+ket);
     }
}
