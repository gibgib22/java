
package jobsheet7;

import java.util.Scanner;

public class latihan2 {
    public static void main (String [] args){
        String identitas = "DIVANA ANGGITA PUTRI/XRPL7/11";
        System.out.println("identitas : " +identitas);
        
    System.out.println("\nSaran Resep dari Bahan Milik Anda");
     Scanner scanner = new Scanner (System.in);
             
        System.out.println("barang pertama: ");
        System.out.println("1. pisang");
        System.out.println("2. telur");
        System.out.print("masukan nomer pilihan anda :");
        int bahan1 = scanner.nextInt ();
        
    if (bahan1 == 1 || bahan1 == 2){
        System.out.println("bahan ke dua:");
            if(bahan1 == 1){
                System.out.println("1. susu");
                System.out.println("2. minyak goreng");
                System.out.println("3. tepung");
            }else {
                System.out.println("1. minyak goreng");
                System.out.println("2. roti");
                System.out.println("3. mentega");
            }
    System.out.println("Masukan nomer pilihan anda: ");
    int bahan2 = scanner.nextInt();
     
    } else { 
        System.out.println("Mohon maaf pilihan anda tidak dapat ditemukan" + "anda dapat memilih resep lagi");
        }
        int bahan2 = scanner.nextInt();
        if(bahan2 >= 1 && bahan2 <= 3){
            if (bahan1 == 1)
                switch (bahan2){
                    case 1 :System.out.println("Anda dapat membuat pancake banana"); break;
                    case 2 :System.out.println("Anda dapat membuat milkshake banana"); break;
                    case 3 :System.out.println("Anda dapat membuat pisang goreng");
                }
            else 
                switch (bahan2){
                    case 1 :System.out.println("Anda dapat membuat roti goreng");
                    case 2 :System.out.println("Anda dapat membuat sandwich telur");
                    case 3 :System.out.println("Anda dapat membuat telur goreng atau rebus");
                }
        }
        else {System.out.println("Mohon maaf pilihan anda tidak di temukan " + "Anda dapat memilih resep kembali");}
    } 
}
