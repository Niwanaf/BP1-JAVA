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

public class BP1_M5_P2_NAFIS {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String mahasiswa[][];
        int jumlah;
        System.out.println("DATA NILAI MAHASISWA");
        System.out.println("TEKNIK INFORMATIKA");
        System.out.println("FKOM - UNIKU");
        System.out.println("\nMasukan batas nilai: ");
        jumlah = Integer.parseInt(input.nextLine());
        mahasiswa = new String[jumlah][6];
        for(int i =0; i<jumlah; i++){
           System.out.println("Data Mahasiswa ke- "+(i+1));
           System.out.print("NIM : ");
           mahasiswa[i][0]=input.nextLine();
           System.out.print("Nama : ");
           mahasiswa[i][1]=input.nextLine();
           System.out.print("Nilai : ");
           mahasiswa[i][2]=input.nextLine();
        }
        
        System.out.print("\nNo.\tNIM\tNama\tNilai\n");
        for(int i=0; i<jumlah; i++){
            System.out.println((i+1)+"\t"+mahasiswa[i][0]
                    +"\t"+mahasiswa[i][1]+"\t"+mahasiswa[i][2]);
        }
        
    }
    
}
