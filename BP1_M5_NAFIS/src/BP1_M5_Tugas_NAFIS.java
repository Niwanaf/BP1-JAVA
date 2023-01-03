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

public class BP1_M5_Tugas_NAFIS {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String karyawan[][];
        int jumlah;
        System.out.println("SLIP GAJI KARYAWAN");
        System.out.println("NAFIS IHSAN WIGUNA");
        System.out.println("20210910028");
        System.out.println("Masukan Jumlah Karyawan : ");
        jumlah = Integer.parseInt(input.nextLine());
        karyawan = new String[jumlah][15];
        for (int i = 0; i<jumlah; i++) {
            System.out.println("\nData Karyawan ke-"+(i+1));
            System.out.println("NIK     : ");
            karyawan[i][0]=input.nextLine();
            System.out.println("Nama    : ");
            karyawan[i][1]=input.nextLine();
            System.out.println("Alamat : ");
            karyawan[i][2]=input.nextLine();
            System.out.println("Golongan   : ");
            karyawan[i][3]=input.nextLine();
            System.out.println("Jabatan  : ");
            karyawan[i][4]=input.nextLine();
            System.out.println("Gaji   : ");
            karyawan[i][5]=input.nextLine();
    }
        System.out.println("\nNo. \tNIK \tNama \tAlamat \tGolongan \tJabatan \tGaji\n");
        for (int i=0; i<jumlah; i++) {
            System.out.println((i+1)+"\t"+karyawan[i][0]
                    +"\t"+karyawan[i][1]+"\t"+karyawan[i][2]
                    +"\t"+karyawan[i][3]+"\t"+karyawan[i][4]+"\t"+karyawan[i][5]);
        }
    }
}
