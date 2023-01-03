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
public class BP1_M3_PostTest_NAFIS {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        String NIM, Nama, jk, jurusan, kelas, matkul, nt;
        int ket;
        
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
        System.out.print("Masukan Nilai : ");
        nt = input.nextLine();
        ket = Integer.parseInt(nt);
        if (ket >=0 && ket <=50)
           nt = "Kurang";
        else if (ket >=51 && ket<=70)
           nt = "Cukup";
        else if (ket >=71 && ket <=90)
           nt = "Baik";
        else if (ket >=91 && ket <=100)
           nt = "Sangat Baik";
        else 
          nt = "apa-apaan ini!!";
       
        System.out.println("NIM : "+NIM);
        System.out.println("Nama : "+Nama);
        System.out.println("Jenis Kelamin : "+jk);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("Kelas : "+kelas);
        System.out.println("Mata Kuliah : "+matkul);
        System.out.println("Nilai : "+ket);
        System.out.println("Keterangan : "+nt);
        
    }
}
