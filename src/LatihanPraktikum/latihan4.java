package LatihanPraktikum;

import java.util.Scanner;

public class latihan4 {
        public static void main(String[] args) {
        // Membuat objek Scanner untuk input data
        Scanner Diego = new Scanner(System.in);

        // Deklarasi Variabel
        String nama, statusMember, metodeBayar;
        double totalBelanja, diskon = 0, besarDiskon, totalBayar;

        // Header
        System.out.println("=== KASIR ELEKTRONIK BERKAH ===");

        // Input dari Pengguna
        System.out.print("Masukkan Nama Pembeli           : ");
        nama = Diego.nextLine();

        System.out.print("Apakah punya Member (Ya/Tidak)  : ");
        statusMember = Diego.nextLine();

        System.out.print("Metode Pembayaran (QRIS/Cash)   : ");
        metodeBayar = Diego.nextLine();

        System.out.print("Masukkan Total Belanja (Rp)     : ");
        totalBelanja = Diego.nextDouble();

        // STRUKTUR NESTED IF (If Bersarang)

        // 1. Pengecekan Utama: Apakah Pelanggan Member?
        if (statusMember.equalsIgnoreCase("Ya")) {
            
            // Sub-cabang 1: Pengecekan Metode Pembayaran
            if (metodeBayar.equalsIgnoreCase("QRIS")) {
                
                // Sub-cabang 2: Pengecekan Total Belanja untuk Member + QRIS
                if (totalBelanja > 1000000) {
                    diskon = 25; // 25%
                } else {
                    diskon = 15; // 15%
                }

            } else { // Jika Metode Pembayaran Cash/Transfer
                
                // Sub-cabang 2: Pengecekan Total Belanja untuk Member + Cash
                if (totalBelanja > 1000000) {
                    diskon = 20; // 20%
                } else {
                    diskon = 10; // 10%
                }

            }

        } else { 
            // 2. Jika Pelanggan BUKAN Member (Tidak)
            if (totalBelanja > 1500000) {
                diskon = 5;  // 5%
            } else {
                diskon = 0;  // Tidak dapat diskon
            }
        }

        // Perhitungan Matematika
        besarDiskon = totalBelanja * (diskon / 100);
        totalBayar = totalBelanja - besarDiskon;

        // Tampilan Struk Pembayaran
        System.out.println("\n--- STRUK PEMBAYARAN ---");
        System.out.println("Nama Pembeli       : " + nama);
        System.out.println("Status Member      : " + statusMember);
        System.out.println("Metode Pembayaran  : " + metodeBayar);
        System.out.printf("Total Belanja      : Rp %,.2f\n", totalBelanja);
        System.out.println("Diskon             : " + (int)diskon + "%");
        System.out.printf("Jumlah Potongan    : Rp %,.2f\n", besarDiskon);
        System.out.println("------------------------------------------");
        System.out.printf("Total Bayar        : Rp %,.2f\n", totalBayar);

        // Menutup scanner
        Diego.close();
    }
    
}
