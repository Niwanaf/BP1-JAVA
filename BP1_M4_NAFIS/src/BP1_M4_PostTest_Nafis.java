/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Nafis
 */
public class BP1_M4_PostTest_Nafis {
    public static void main(String[]args){
        
        /*Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan jumlah angka ganjil: ");
        int batas = input.nextInt();
        int angka = 1;
        int jumlah = 0;
        
        while(true){
            if (angka % 2 == 1){
                System.out.print(angka + " ");
                jumlah++;
                
                if (jumlah == batas) break;
            }angka++;
        }
        
        int sum = 0;
        for (int i=0; i<=batas; i++){
            sum = sum+angka;
        }
        System.out.println("\nHasil Penambahan = "+sum);
        
    }*/
        
        Scanner input = new Scanner(System.in);
        int bil = 0;
        int batas;
        int sum = 0;
        System.out.print("Masukan batas bilangan : ");
        batas = Integer.parseInt(input.nextLine());
        do{
            System.out.println(" "+bil);
            bil++;
            if (bil%2 == 1){
                sum= sum+bil;
            }
        }while(bil <= batas);
        System.out.println("Jumlah = "+sum);
    }
}
