package belajar;

import java.util.Scanner;

public class Belajar {

    public static void main(String[] args) {
       
        // TODO code application logic here
        int harga;
        String pilih, pilih1, pilih2 = "", pilih3, yakin1;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("SELAMAT DATANG DI TOKO KAMI");
            do {
                System.out.println("apa yang sedang anda cari?");
                System.out.println("1.buku");
                System.out.println("2.pakaian");
                System.out.println("3.minuman");
                System.out.println("4.makanan");
                System.out.println("Tuliskan pilihan anda : ");
                pilih = scan.next();

                if (pilih.equals("buku") || pilih.equals("1") || pilih.equals("1.buku")) {
                    System.out.println("apakah anda yakin untuk membeli buku?");
                    System.out.println("jawab ya/tidak");
                    pilih1 = scan.next();
                    if (pilih1.equals("ya") || pilih1.equals("y") || pilih1.equals("Y") || pilih1.equals("YA") || pilih1.equals("iya")) {
                        System.out.println("Harga yang perlu di bayar: RP.300.000");
                        System.out.println("Apakah anda yakin ingin membeli?");
                        System.out.println("jawab yakin atau tidak");
                        System.out.println("masukan jawaban anda: ");
                        yakin1 = scan.next();
                        if (yakin1.equals("yakin") || yakin1.equals("ya") | yakin1.equals("ya")) {
                            do {
                                System.out.println("masukan nominal uang anda: ");
                                int bayar1 = scan.nextInt();
                                harga = bayar1 - 300000;
                                if (bayar1 > 300000) {
                                    System.out.println("kembalian anda : " + harga);
                                    System.out.print("Terima Kasih telah belanja di toko kami");
                                }
                                if (bayar1 == 300000) {
                                    System.out.println("uang anda pas");
                                    System.out.print("Terima Kasih telah belanja di toko kami");
                                }
                                if (bayar1 < 300000) {
                                    System.out.println("uang anda kurang, ketikan ya untuk kembali memamsukan uang");
                                    pilih2 = scan.next();
                                }
                            } while (pilih2.equals("ya") || pilih2.equals("Y"));
                        }
                    }
                }
                if (pilih.equals("pakaian") || pilih.equals("2") || pilih.equals("2.pakaian")) {
                    System.out.println("apakah anda yakin untuk membeli pakaian");
                    System.out.println("jawab ya/tidak");
                    pilih1 = scan.next();
                    if (pilih1.equals("ya") || pilih1.equals("y") || pilih1.equals("Y") || pilih1.equals("YA") || pilih1.equals("iya")) {
                        System.out.println("Harga yang perlu di bayar: RP.250.000");
                        System.out.println("Apakah anda yakin ingin membeli?");
                        System.out.println("jawab yakin atau tidak");
                        System.out.println("masukan jawaban anda: ");
                        yakin1 = scan.next();
                        if (yakin1.equals("yakin") || yakin1.equals("ya") | yakin1.equals("ya")) {
                            do {
                                System.out.println("masukan nominal uang anda: ");
                                int bayar1 = scan.nextInt();
                                harga = bayar1 - 250000;
                                if (bayar1 > 250000) {
                                    System.out.println("kembalian anda : " + harga);
                                    System.out.print("Terima Kasih telah belanja di toko kami");
                                }
                                if (bayar1 == 250000) {
                                    System.out.println("uang anda pas");
                                    System.out.print("Terima Kasih telah belanja di toko kami");
                                }
                                if (bayar1 < 250000) {
                                    System.out.println("uang anda kurang, ketikan ya untuk kembali memamsukan uang");
                                    pilih2 = scan.next();
                                }
                            } while (pilih2.equals("ya") || pilih2.equals("Y"));
                        }
                    }
                } else if (pilih.equals("minuman") || pilih.equals("3") || pilih.equals("3.minuman")) {
                    System.out.println("apakah anda yakin untuk membeli buku?");
                    System.out.println("jawab ya/tidak");
                    pilih1 = scan.next();
                    if (pilih1.equals("ya") || pilih1.equals("y") || pilih1.equals("Y") || pilih1.equals("YA") || pilih1.equals("iya")) {
                        System.out.println("Harga yang perlu di bayar: RP.300.000");
                        System.out.println("Apakah anda yakin ingin membeli?");
                        System.out.println("jawab yakin atau tidak");
                        System.out.println("masukan jawaban anda: ");
                        yakin1 = scan.next();
                        if (yakin1.equals("yakin") || yakin1.equals("ya") | yakin1.equals("ya")) {
                            do {
                                System.out.println("masukan nominal uang anda: ");
                                int bayar1 = scan.nextInt();
                                harga = bayar1 - 50000;
                                if (bayar1 > 50000) {
                                    System.out.println("kembalian anda : " + harga);
                                    System.out.print("Terima Kasih telah belanja di toko kami");
                                }
                                if (bayar1 == 50000) {
                                    System.out.println("uang anda pas");
                                    System.out.print("Terima Kasih telah belanja di toko kami");
                                }
                                if (bayar1 < 50000) {
                                    System.out.println("uang anda kurang, ketikan ya untuk kembali memamsukan uang");
                                    pilih2 = scan.next();
                                }
                            } while (pilih2.equals("ya") || pilih2.equals("Y"));
                        }
                    }
                }
                if (pilih.equals("makanan") || pilih.equals("4") || pilih.equals("4.makanan")) {
                    System.out.println("apakah anda yakin untuk membeli buku?");
                    System.out.println("jawab ya/tidak");
                    pilih1 = scan.next();
                    if (pilih1.equals("ya") || pilih1.equals("y") || pilih1.equals("Y") || pilih1.equals("YA") || pilih1.equals("iya")) {
                        System.out.println("Harga yang perlu di bayar: RP.300.000");
                        System.out.println("Apakah anda yakin ingin membeli?");
                        System.out.println("jawab yakin atau tidak");
                        System.out.println("masukan jawaban anda: ");
                        yakin1 = scan.next();
                        if (yakin1.equals("yakin") || yakin1.equals("ya") | yakin1.equals("ya")) {
                            do {
                                System.out.println("masukan nominal uang anda: ");
                                int bayar1 = scan.nextInt();
                                harga = bayar1 - 100000;
                                if (bayar1 > 100000) {
                                    System.out.println("kembalian anda : " + harga);
                                    System.out.print("Terima Kasih telah belanja di toko kami");
                                }
                                if (bayar1 == 100000) {
                                    System.out.println("uang anda pas");
                                    System.out.print("Terima Kasih telah belanja di toko kami");
                                }
                                if (bayar1 < 100000) {
                                    System.out.println("uang anda kurang, ketikan ya untuk kembali memamsukan uang");
                                    pilih2 = scan.next();
                                }
                            } while (pilih2.equals("ya") || pilih2.equals("Y"));
                        }
                    }
                }
                System.out.println("Apa ingin memilih barang lain:  ");
                pilih3 = scan.next();
            } while (pilih3.equals("ya"));

        } while (pilih.equals("ya"));

        System.out.println("TERIMA KASIH");
    }

}
