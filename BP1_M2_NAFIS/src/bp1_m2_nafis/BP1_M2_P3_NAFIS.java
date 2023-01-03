/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1_m2_nafis;

import java.util.Scanner;

/**
 *
 * @author Nafis
 */
public class BP1_M2_P3_NAFIS {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String nama,mk,prodi,fak,univ;
        
        System.out.print("Nama anda : ");
        nama = input.nextLine();
        System.out.print("Mata Kuliah : ");
        mk = input.nextLine();
        System.out.print("Program Studi : ");
        prodi = input.nextLine();
        System.out.print("Fakultas : ");
        fak = input.nextLine();
        System.out.print("Universitas : ");
        univ = input.nextLine();
        
        System.out.println("Data Anda");
        System.out.println("Nama : " +nama);
        System.out.println("Mata Kuliah : "+mk);
        System.out.println("Program Studi : "+prodi);
        System.out.println("Fakultas : "+fak);
        System.out.println("Universitas : " +univ);
             
    }
    
}
