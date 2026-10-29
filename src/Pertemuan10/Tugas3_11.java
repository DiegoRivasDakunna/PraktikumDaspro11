package Pertemuan10;

import java.util.Scanner;

public class Tugas3_11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = Diego.nextInt();

        if (jumlahToko <= 0) {
            System.out.println("Jumlah toko minimal harus 1.");
        } else {
            int totalBarangSeluruhToko = 0;
            int barangTerbanyak = -1;
            int tokoTerbaik = 0;

            // Outer loop untuk setiap toko
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("\n--- Toko " + i + " ---");
                System.out.print("Masukkan jumlah pelanggan: ");
                int jumlahPelanggan = Diego.nextInt();

                int totalBarangToko = 0;

                // Inner loop untuk setiap pelanggan di toko tersebut
                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("  Jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                    int jumlahBarang = Diego.nextInt();

                    // Akumulasi total barang per pelanggan ke total barang toko
                    totalBarangToko += jumlahBarang;
                }

                // Menampilkan rekap untuk toko saat ini
                System.out.println("Toko " + i + " -> pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

                // Akumulasi total barang seluruh toko
                totalBarangSeluruhToko += totalBarangToko;

                // Menentukan toko dengan barang terbanyak (jika sama, ambil nomor paling kecil karena menggunakan operator >)
                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbaik = i;
                }
            }

            // Menampilkan hasil akhir rekapitulasi
            System.out.println("\n======================================");
            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        }

        Diego.close();
}
}