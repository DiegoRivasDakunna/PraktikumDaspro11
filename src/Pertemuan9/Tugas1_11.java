package Pertemuan9;

import java.util.Scanner;

public class Tugas1_11 {
    /**
 * Nilai P: 11
 * Harga Tiket = 40000 + (11 mod 6) * 2000 = Rp 50000
 * Syarat Diskon 1 = Lebih dari 3 + (11 mod 3) = 5 tiket, Diskon: (8 + (11 mod 5))% = 9%
 * Syarat Diskon 2 = Lebih dari 8 + (11 mod 4) = 11 tiket, Diskon: (15 + (11 mod 4))% = 18%
 */
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        
        int totalTiketTerjual = 0;
        double totalPenjualanHarian = 0;
        double hargaTiket = 50000;
        
        // Batas dan diskon sesuai parameter unik P = 11
        int batasDiskon1 = 5;  // 3 + (11 mod 3)
        double diskon1 = 0.09; // 9% -> (8 + (11 mod 5))%
        
        int batasDiskon2 = 11; // 8 + (11 mod 4)
        double diskon2 = 0.18; // 18% -> (15 + (11 mod 4))%

        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");
        System.out.println("Ketik '0' atau ketik negatif untuk mengakhiri transaksi hari ini.\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan (0 untuk keluar): ");
            int jumlahTiket = Diego.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan angka yang benar (>= 0).\n");
                continue;
            }

            double hargaTotal = jumlahTiket * hargaTiket;
            double diskon = 0;

            // Pengecekan diskon berdasarkan ketentuan parameter unik
            if (jumlahTiket > batasDiskon2) {
                diskon = diskon2; // Diskon 18% untuk > 11 tiket
            } else if (jumlahTiket > batasDiskon1) {
                diskon = diskon1; // Diskon 9% untuk > 5 tiket
            }

            double totalBayar = hargaTotal - (hargaTotal * diskon);

            // Akumulasi data harian
            totalTiketTerjual += jumlahTiket;
            totalPenjualanHarian += totalBayar;

            System.out.println("Diskon yang didapat: " + (int)(diskon * 100) + "%");
            System.out.println("Total harga untuk pelanggan ini: Rp " + totalBayar);
            System.out.println("--------------------------------------------------");
        }

        System.out.println("\n=== REKAPITULASI PENJUALAN TIKET HARI INI ===");
        System.out.println("Total keseluruhan tiket terjual : " + totalTiketTerjual + " tiket");
        System.out.println("Total pendapatan penjualan      : Rp " + totalPenjualanHarian);

        Diego.close();
    }
}
