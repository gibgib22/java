
package jobsheet9;

import java.util.Scanner;

public class latihan1 {
    public static void hitung(int a, int b)
    {
        System.out.println("Hasil : "+ (a + b));
    }
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukan bilangan I : ");
    int bill = input.nextInt();
    
    System.out.print("masukan bilangan II :");
    int bill2 = input.nextInt();
    
    hitung (bill,bill2);
    } 
}
