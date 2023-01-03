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
public class BP1_M2_PostTest_NAFIS {

    /**
     *
     * @param args
     */
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        String n1,n2,n3;
        int n1Int, n2Int, n3Int;
        
        System.out.print("Masukan nilai 1 : ");
        int no1 = input.nextInt();
        System.out.print("Masukan nilai 2 : ");
        int no2 = input.nextInt();
        System.out.print("Masukan nilai 3 : ");
        int no3 = input.nextInt();
        
        System.out.println("Hasil Tambah = "+(no1+no2+no3));
        System.out.println("Hasil Kurang = "+(no1-no2-no3));
        System.out.println("Hasil Kali = "+(no1*no2*no3));
        
        
    }
    
}
