package jobsheet6;

import java.util.Scanner;


public class latihan7 {
    public static void main (String[] args) {
        Scanner masukan = new Scanner (System.in);
        int nilai;
        System.out.print("masukkan nilai akhir PBO : ");
        nilai = masukan.nextInt();
        if (nilai < 70){
        System.out.println("siswa tidak lulus");}
        else{
        System.out.println("siswa lulus");}
    }
}
