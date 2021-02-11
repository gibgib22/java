package jobsheet6;
import java.util.Scanner;

public class latihan1 {
    public static void main (String[]args) {
    String Nama, Alamat;
    int Usia, Absen;
 
    Scanner keyboard = new Scanner (System.in) ;
   
    System.out.println("-----------------------------------------");
    System.out.println("### DATA SISWA SMK TELKOM MALANG ###");
    System.out.print("NAMA SISWA: ");
 
    Nama = keyboard.next();
    
    System.out.println(" ALAMAT: ");
    Alamat = keyboard.next();
    
    System.out.print("Absen :");
    Usia = keyboard.nextInt();
    
    System.out.print(" Usia :  ");
    Absen = keyboard.nextInt();

    System.out.println("____________________");
    System.out.println("Nama Siswa : " +Nama);
    System.out.println("Alamat : " + Alamat);
    System.out.println("Absen : " +Usia);
    System.out.println("Usia : " + Absen +"tahun");
    
    }
}
