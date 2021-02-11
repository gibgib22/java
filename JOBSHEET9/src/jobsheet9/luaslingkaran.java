package jobsheet9;

import java.util.Scanner;

public class luaslingkaran {
    public static double luas(double r){
        double phi = 3.14;
        double hasil;
  
        hasil = phi*r*r;
        
        System.out.println("luas lingkaran adalah :" + hasil );
      return hasil;  
    }
    public static void main (String[]args){
        double jarijari,luas;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("masukan jari jari: ");
        jarijari = scan.nextDouble();
        
        luas (jarijari);
        
    }
    
}
