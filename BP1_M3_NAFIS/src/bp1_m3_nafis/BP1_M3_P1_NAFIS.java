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
public class BP1_M3_P1_NAFIS { 
  public static void main (String [] args) {
      Scanner input = new Scanner (System.in);
      String hari = null;
      int angka;
      System.out.print("Masukan angka (1-7) : ");
      hari = input.nextLine();
      angka = Integer.parseInt(hari);
      if(angka == 1)
          hari="SENIN";
      else if(angka == 2)
          hari="SELASA";
      else if (angka == 3)
          hari="RABU";
      else if (angka == 4)
          hari="KAMIS";
      else if (angka == 5)
          hari="JUMAT";
      else if (angka == 6)
          hari="SABTU";
      else if (angka == 7)
          hari="MINGGU";
      else
          hari="Angka yang anda masukan salah!";
      System.out.print("Angka yang anda masukan adalah : "+angka
      + " yang mewakili hari : "+hari);
          
          
  }  
}
