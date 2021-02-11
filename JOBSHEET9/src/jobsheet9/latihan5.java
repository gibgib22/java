package jobsheet9;

import java.util.Scanner;

public class latihan5 {

    public static int terbesar(int a, int b, int c) {
        int hitunglah, hitunglah2;
        int hitunglah3 = 0;
        if (a > b && (a > c)) {
            System.out.println("nilai terbesar pertama: " + a);
            hitunglah = a;
            if (b > c) {
                System.out.println("nilai terbesar kedua: " + b);
                hitunglah2 = b;
            } else if (c > b) {
                System.out.println("nilai terbesar kedua: " + c);
                hitunglah2 = c;
            }
        } else if (b > a && (b > c)) {
            System.out.println("nilai terbesar pertama: " + b);
            hitunglah = b;
            if (a > c) {
                System.out.println("nilai terbesar kedua: " + a);
                hitunglah2 = a;
            } else if (c > a) {
                System.out.println("nilai terbesar kedua: " + c);
                hitunglah2 = c;
            }
        } else {
            System.out.println("nilai terbesar pertama: " + c);
            hitunglah = c;
            if (a > c) {
                System.out.println("nilai terbesar kedua: " + a);
                hitunglah2 = a;
            } else if (c > a) {
                System.out.println("nilai terbesar kedua: " + c);
                hitunglah2 = c;
            }
        }
        return hitunglah;

    }

    public static void main(String[] args) {
        int bil1, bil2, bil3;
        Scanner div = new Scanner(System.in);

        System.out.println("masukkan bilangan I : ");
        bil1 = div.nextInt();

        System.out.println("masukkan bilangan II : ");
        bil2 = div.nextInt();

        System.out.println("masukkan bilangan III : ");
        bil3 = div.nextInt();

        int hasilakhir = terbesar(bil1, bil2, bil3);
       System.out.println("hasil yang paling besar: "+ hasilakhir);
    }
}
