package Pertemuan10;

import java.util.Scanner;

public class Tugas2_11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = Diego.nextInt();

        int jumlahSeluruhAngka = 0; // Variabel untuk menghitung total jumlah seluruh angka pada tabel

        System.out.println("\nTabel Perkalian " + n + " x " + n + ":");

        // Outer loop untuk mengatur baris
        for (int i = 1; i <= n; i++) {
            // Inner loop untuk mengatur kolom
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                // Menggunakan printf("%4d", hasil) agar angka tersusun rapi dan rata kanan
                System.out.printf("%4d", hasil);
                
                // Menjumlahkan setiap hasil perkalian ke total keseluruhan
                jumlahSeluruhAngka += hasil;
            }
            // Pindah ke baris baru setelah satu baris kolom selesai dicetak
            System.out.println();
        }

        System.out.println("========================================");
        System.out.println("Jumlah seluruh angka: " + jumlahSeluruhAngka);

        Diego.close();
}
}