package belajar;

import java.util.Scanner;

public class NewClass1 {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("jumlah data yang akan di input kan : ");
        int lenght = input.nextInt();
        
        //batas array
        int data [] = new int [lenght];
        
        //masukan data
        System.out.println("------MASUKAN DATA------");
        for (int a = 0; a < lenght; a++){
            data[a]=input.nextInt();
        }
    }
}
