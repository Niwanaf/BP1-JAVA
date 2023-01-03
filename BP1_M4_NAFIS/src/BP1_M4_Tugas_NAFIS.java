/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Nafis
 */
public class BP1_M4_Tugas_NAFIS {
    public static void main(String[]args){
      Scanner input = new Scanner (System.in);
      String  nim, nama, kelas, jurusan, matkul;
      int batas, nilai_a, nilai_b, nilai_c, rata=0, hasil=0, i;
      System.out.print("Masukan jumlah Mahasiswa : ");
      batas = input.nextInt();
      
      
      for(i=0; i<batas; i++){
          input.nextLine();
          System.out.print("Masukan Nim : ");
          nim=input.nextLine();
          System.out.print("Masukan Nama : ");
          nama=input.nextLine();
          System.out.print("Masukan Kelas : ");
          kelas=input.nextLine();
          System.out.print("Masukan Jurusan : ");
          jurusan=input.nextLine();
          System.out.print("Masukan Mata Kuliah : ");
          matkul=input.nextLine();
          System.out.print("Masukan Nilai ke- 1 : ");
          nilai_a=input.nextInt();
          System.out.print("Masukan Nilai ke- 2 : ");
          nilai_b=input.nextInt();
          System.out.print("Masukan Nilai ke- 3 : ");
          nilai_c=input.nextInt();
          
          hasil=nilai_a+nilai_b+nilai_c;
          rata=hasil/3;
          
          System.out.println("==========Mahasiswa ke-"+(i+1)+"===========");
          System.out.println("Nim mahasiswa ke-"+(i+1)+": "+nim);
          System.out.println("Nama mahasiswa ke-"+(i+1)+": "+nama);
          System.out.println("Kelas mahasiswa ke-"+(i+1)+": "+kelas);
          System.out.println("Jurusan mahasiswa ke-"+(i+1)+": "+jurusan);
          System.out.println("Mata kuliah mahasiswa ke-"+(i+1)+": "+matkul);
          System.out.println("Nilai ke-1 mahasiswa ke-"+(i+1)+": "+nilai_a);
          System.out.println("Nilai ke-2 mahasiswa ke-"+(i+1)+": "+nilai_b);
          System.out.println("Nilai ke-3 mahasiswa ke-"+(i+1)+": "+nilai_c);
          System.out.println("Jumlah nilai mahasiswa ke-"+(i+1)+": "+hasil);
          System.out.println("Nilai rata-rata mahasiswa ke-"+(i+1)+": "+rata);  
          System.out.println("========================\n\n");
          
          
      }
            
 
       
    }  
}
