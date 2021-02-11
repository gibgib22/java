
package jobsheet7;

import java.util.Scanner;

public class cobapercabangan {
    public static void main (String[]args){
        String identitas = "Divana Anggita Putri / XRPL7 / 11";
        System.out.println("identitas : " + identitas);
Scanner Scanner = new Scanner (System.in);
    int a;
    Scanner baca = new Scanner (System.in);
    System.out.print(" masukan angka yang akan di uji : ");
    a = baca.nextInt();
     if (a < 5) {
             System.out.println(" lf..1");
             System.out.println("nilai a kurang dari lima");
     }
     if (a==5) {
              System.out.println(" If..2");
              System.out.println("nilai a sama dengan 5");
     }
     if (a > 5) {
              System.out.println(" If..3");
              System.out.println("nilai a lebih dari 5");
     }
     
     System.out.println("isi variabel a : " +a);
     
     System.out.println("\nlf..ELSE..if..ELSE.. 1");
     if (a < 5) 
    {   System.out.println("isi variabel a : " +a);
        System.out.println("nilai a kurang dari 5");
    } else  System.out.println("nilai a lebih dari sama dengan 5");
    {
         System.out.println("nilai a sama dengan 5");
    }
    System.out.println("\nlf..ELSE IF..ELSE..1");
    if (a < 5){
            System.out.println("nilai a kurang dari 5");
        } else if(a == 5) {
        System.out.println("nilai a sama dengan 5");
        } else 
            System.out.println("nilai a lebih dari 5");
    
    System.out.println("\nlf..ELSE IF..ELSE..2");
    if(a < 2){
        System.out.println("nilai a kurang dari 2");
    } else if (a < 4) {
        System.out.println("niali a kurang dari 4");
    } else if (a < 6) {
        System.out.println("nilai a kurang dari 6");
    } else if (a == 6) {
        System.out.println("nilai a sama dengan 6");
    } else {
        System.out.println("nilai a sama dengan 6");
    }
    
    System.out.println("\nNested IF");
    if (a < 7) {
        System.out.println("nilai a kurang dari 7");
        if (a > 2)
            System.out.println("nilai a lebih dari 2");
        if (a < 4)
            System.out.println("nilai a lebih dari 4");
    }
    
    System.out.println("\nSWITCH CASE");
    switch (a) {
            case 1 : System.out.println("nilai a => 1"); break;
            case 2 : System.out.println("nilai a => 2"); break;
            case 3 : 
            case 4 : System.out.println("nilai a => 3 atau 4"); break;
            case 5 : System.out.println("nilai a => 5"); break; 
            default : System.out.println("nilai yang bukan di antara 1-5");
    }
    
    int nilai;
        System.out.print("\nNilai anda?");
        nilai = Scanner.nextInt();
        
        String grade = (nilai < 75) ? "belum komprten" : "kompeten" ;
        System.out.println(nilai + " => " + grade);
    }
}
