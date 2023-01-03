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
public class BP1_M4_P3_NAFIS {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int bil = 1;
        int batas;
        System.out.print("Masukan batas bilangan : ");
        batas = Integer.parseInt(input.nextLine());
        do{
            System.out.println(" "+bil);
            bil++;
        }while(bil <= batas);
    }
}
