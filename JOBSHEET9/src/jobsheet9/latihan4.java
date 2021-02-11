
package jobsheet9;

import java.util.Scanner;

public class latihan4 {
    public static int hitung (int jarak, int waktu){
        int hasil;
        hasil = jarak / waktu;
        System.out.print ("kecepatan : " + hasil+ "km/jam");
        return hasil;
        
    }
    public static void main(String[] args){
        int input1, input2;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan jarak : ");
        input1 = scan.nextInt();
        
        System.out.println("Masukkan waktu jarak tempuh: ");
        input2 = scan.nextInt();
        
        hitung(input1,input2);
          
    }
    
}
