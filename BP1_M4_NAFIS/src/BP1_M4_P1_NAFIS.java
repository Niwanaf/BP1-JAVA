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

public class BP1_M4_P1_NAFIS {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int batas;
        System.out.print("Masukan batas nilai: ");
        batas = Integer.parseInt(input.nextLine());
        for (int bil =0; bil<=batas; bil++){
            System.out.println(" "+bil);
        }
    }
}
