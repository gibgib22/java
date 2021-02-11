
package jobsheet6;
import java.util.Scanner;
public class membuatkalkulator {
 public static void main(String[]args){
     //TODO code application logic here
     int a, b, kali, kurang, bagi, tambah;
     Scanner baca = new Scanner (System.in);
     System.out.print("masukan angka 1: ");
     a = baca.nextInt();
     System.out.print("masukan angka 2: ");
     b = baca.nextInt();
     kali = a * b;
     tambah = a + b;
     bagi = a / b;
     kurang = a - b;
     
System.out.println("hasil penjumlahan angka 1 dan anngka 2 adalah :" +tambah);
System.out.println("hasil pengurangan angka 1 dan angka 2 adalah: " +kurang);
System.out.println("hasil pembagian angka 1 dan angka 2 adalah: " +bagi);
System.out.println("hasil perkalian angka 1 dan angka 2 adalah: " +kali);
}    
}