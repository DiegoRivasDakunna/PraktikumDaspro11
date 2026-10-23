package Pertemuan9;

import java.util.Scanner;

public class Tugas1_11 {
   public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        
        // Harga tiket per lembar (contoh: Rp 50.000)
        final int HARGA_TIKET = 50000;
        
        System.out.print("Masukkan jumlah pelanggan: ");
        int jumlahPelanggan = Diego.nextInt();
        
        int totalSemuaTiket = 0;
        double grandTotalBayar = 0;

        // Menggunakan perulangan 'for' untuk memproses setiap pelanggan
        for (int i = 1; i <= jumlahPelanggan; i++) {
            System.out.println("\n--- Pelanggan ke-" + i + " ---");
            int jumlahTiket = 0;

            // Validasi input tiket menggunakan perulangan agar meminta input ulang jika tidak valid
            while (true) {
                System.out.print("Masukkan jumlah tiket yang dibeli: ");
                jumlahTiket = Diego.nextInt();

                // Validasi: jumlah tiket tidak boleh negatif atau melebihi batas wajar (misal max 10 tiket per transaksi)
                if (jumlahTiket < 0 || jumlahTiket > 10) {
                    System.out.println("Input tidak valid! Jumlah tiket harus antara 0 dan 10. Silakan coba lagi.");
                    continue; // Mengabaikan input dan meminta input ulang
                }
                break; // Keluar dari loop validasi jika input valid
            }

            // Menghitung total bayar per pelanggan
            double totalBayarPelanggan = jumlahTiket * HARGA_TIKET;
            
            // Contoh diskon jika membeli lebih dari 4 tiket
            if (jumlahTiket > 4) {
                double diskon = 0.10 * totalBayarPelanggan; // Diskon 10%
                totalBayarPelanggan -= diskon;
                System.out.println("Selamat! Anda mendapatkan diskon 10%.");
            }

            System.out.println("Total bayar pelanggan ke-" + i + ": Rp " + (long) totalBayarPelanggan);

            // Akumulasi total keseluruhan
            totalSemuaTiket += jumlahTiket;
            grandTotalBayar += totalBayarPelanggan;
        }

        // Menampilkan ringkasan akhir
        System.out.println("\n=================================");
        System.out.println("TOTAL RINGKASAN PENJUALLAN TIKET");
        System.out.println("=================================");
        System.out.println("Total tiket terjual  : " + totalSemuaTiket + " tiket");
        System.out.println("Total pendapatan     : Rp " + (long) grandTotalBayar);

        Diego.close();
    } 
}

