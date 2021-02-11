/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class belajar2 {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("-----------------------------");
        System.out.println("-----Masukan Biodata Anda----");
        System.out.print("nama  :  ");
        String nama = input.nextLine();
        System.out.print("Kelas :  ");
        String kelas = input.nextLine();
        System.out.print("Hobi  :  ");
        String hobi = input.nextLine();
        System.out.print("TTl   :  ");
        String TTL = input.nextLine();
        
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("             BIODATA         ");
        System.out.println("NAMA   : " +nama);
    }
}
