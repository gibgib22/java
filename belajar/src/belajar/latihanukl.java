package belajar;

import java.util.Scanner;

public class latihanukl {
    public static void main(String[] args) {
        int j,i,n,dap;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("masukan jumlah data yang akan di uji =");
        j = scan.nextInt();
        
        int array[] = new int [j];
        
        System.out.println("\nMasukan" + j + "Bilangan Intiger");
        System.out.println("===========================================");
        for(i = 0; i < j; i++){
            System.out.println("Bilangan ke-" + (i+1) + "=" );
            array[i]=scan.nextInt();
        }
        System.out.println("Bilangan sebelum di urutkan : ");
        for (int a=0;a<j;a++){
            System.out.println(array[a]+"");
        }
        
        for (i=0;i<(j-1);i++)
        {
            for (n=0;n<(j-i-1);n++)
            {
                if (array[n] > array[n+1])
                {
                    dap = array[n];
                    array[n] = array[n+1];
                    array[n+1] = dap;
                }
            }
        }
        System.out.print("\nBilangan Setelah diurutkan        :");
            for(i=0;i<j; i++)
                System.out.print(array[i] +" ");
                System.out.print("\n");
    }
    
}
