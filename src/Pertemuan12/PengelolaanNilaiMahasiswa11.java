package Pertemuan12;

import java.util.Scanner;

public class PengelolaanNilaiMahasiswa11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        // 1. Memasukkan banyaknya nilai mahasiswa yang akan diinput
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = Diego.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            Diego.close();
            return;
        }

        int[] nilaiMhs = new int[jumlah];
        int total = 0;

        // 2. Memasukkan setiap nilai mahasiswa satu per satu
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = Diego.nextInt();
            total += nilaiMhs[i];
        }

        // 3. Menghitung nilai rata-rata, tertinggi, dan terendah
        double rata2 = (double) total / nilaiMhs.length;
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        // 4. Menampilkan seluruh nilai beserta status kelulusan (> 70 LULUS)
        System.out.println("\n=== Daftar Nilai & Status Kelulusan ===");
        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + " (" + status + ")");
        }

        // 5. Menampilkan ringkasan rata-rata, nilai tertinggi, dan terendah
        System.out.println("\n=== Ringkasan Nilai ===");
        System.out.println("Rata-rata       : " + rata2);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);

        Diego.close();
}
}