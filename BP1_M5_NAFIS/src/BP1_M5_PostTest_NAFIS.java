/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nafis
 */
import java.util.Scanner;

public class BP1_M5_PostTest_NAFIS {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String mahasiswa[][];
        int jumlah;
        
        System.out.println("DATA NILAI MAHASISWA");
        System.out.println("SISTEM INFORMASI");
        System.out.println("FKOM UNIKU");
        System.out.println("Masukan Jumlah Data : ");
        jumlah = Integer.parseInt(input.nextLine());
        mahasiswa = new String[jumlah][15];
        for (int i = 0; i<jumlah; i++) {
            System.out.println("\nData mahasiswa ke-"+(i+1));
            System.out.println("NIM     : ");
            mahasiswa[i][0]=input.nextLine();
            System.out.println("Nama    : ");
            mahasiswa[i][1]=input.nextLine();
            System.out.println("Jurusan : ");
            mahasiswa[i][2]=input.nextLine();
            System.out.println("Kelas   : ");
            mahasiswa[i][3]=input.nextLine();
            System.out.println("Matkul  : ");
            mahasiswa[i][4]=input.nextLine();
            System.out.println("Nilai Tugas 1   : ");
            mahasiswa[i][5]=input.nextLine();
            System.out.println("Nilai Tugas 2   : ");
            mahasiswa[i][6]=input.nextLine();
            System.out.println("Nilai Tugas 3   : ");
            mahasiswa[i][7]=input.nextLine();
            
            // Rata- rata nilai tugas Individu
            mahasiswa[i][8] = String.valueOf((Double.parseDouble(mahasiswa[i][5])
            +Double.parseDouble(mahasiswa[i][6])
            +Double.parseDouble(mahasiswa[i][7]))/3);
            System.out.println("Rata-rata Nilai Tugas Individu : "+mahasiswa[i][8]);
            
            System.out.println("Nilai Kelompok  : ");
            mahasiswa[i][9]=input.nextLine();
            System.out.println("Nilai Quiz      : ");
            mahasiswa[i][10]=input.nextLine();
            System.out.println("Nilai UTS       : ");
            mahasiswa[i][11]=input.nextLine();
            System.out.println("Nilai UAS       : ");
            mahasiswa[i][12]=input.nextLine();
            
            // Nilai Akhir
            mahasiswa[i][13] = String.valueOf((Double.parseDouble(mahasiswa[i][8])
            +Double.parseDouble(mahasiswa[i][9]) + (2.5*Double.parseDouble(mahasiswa[i][11]))
            +(3.5*Double.parseDouble(mahasiswa[i][12])))/8);
            System.out.println("Nilai Akhir : "+mahasiswa[i][13]);
        }
        System.out.println("\nNo. \tNIM \tNama \tJurusan \tKelas \tMatkul \tNilai Akhir\n");
        for (int i=0; i<jumlah; i++) {
            System.out.println((i+1)+"\t"+mahasiswa[i][0]
                    +"\t"+mahasiswa[i][1]+"\t"+mahasiswa[i][2]
                    +"\t"+mahasiswa[i][3]+"\t"+mahasiswa[i][4]+"\t"+mahasiswa[i][13]);
        }
  
    }
}
