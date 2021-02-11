package jobsheet6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan8 {
    public static void main ( String[]args ){
       BufferedReader data = new BufferedReader (new InputStreamReader(System.in));
        String x = " ";
        int hitungluas = 0;
        System.out.println("---Luas Persegi---");
        System.out.print("masukan nilai sisi : ");
        
try {
    x = data.readLine();
    int angka = Integer.parseInt(x);
    hitungluas = angka * angka;
} catch (IOException | NumberFormatException e) {
    System.out.println("error");
    
} System.out.println("luas persegi dengan sisi " + x + "adalah "+ hitungluas);
    }
}
