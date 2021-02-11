package jobsheet;
        import java.util.Scanner;
public class datadiri {
     public static void main(String[] args) {
       //deklarasi
       String nama, alamat, ttl;
       int usia, tinggi;
             
       //membuat Scanner baru
       Scanner baca = new Scanner (System.in);       
       
        //input
      System.out.println("== data diri siswa ==");
      System.out.print("input nama = ");
      nama = baca.nextLine();
      System.out.print("input alamat = ");
      alamat = baca.nextLine();
      System.out.print("input ttl = ");
      ttl = baca.nextLine();
      System.out.println("input usia = ");
      usia = baca.nextInt();
      System.out.println("input tinggi = ");
      tinggi = baca.nextInt();
      
      
      
}
}
