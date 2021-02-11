package jobsheet9;

import java.util.Scanner;

public class luas {

    public static int segitiga(int alas, int tinggi) {
        int luas;
        
        luas = (alas*tinggi)/2;
        
        System.out.println("LUAS SEGITIGA : " + luas);
        
        return luas;
    }
    public static void main (String[]args){
        int a,b;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukan alas : ");
        a = input.nextInt();
        
        System.out.print("masukan tinggi : ");
        b = input.nextInt();
        
        segitiga(a,b);
    }

}
