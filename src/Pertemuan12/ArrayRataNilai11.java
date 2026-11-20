package Pertemuan12;

import java.util.Scanner;

public class ArrayRataNilai11 {
        public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        // Menerima jumlah elemen array dari pengguna
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = Diego.nextInt();

        // Validasi agar jumlah elemen minimal 1 sehingga aman mengakses indeks 0
        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            Diego.close();
            return;
        }

        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        double rata2;

        // Input nilai dan hitung total
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = Diego.nextInt();
            total += nilaiMhs[i];
        }

        // Hitung rata-rata
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);

        // Cari nilai tertinggi dan terendah
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
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        // Tentukan predikat kelas
        String predikat;
        if (rata2 >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rata2 >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }
        System.out.println("Predikat kelas: " + predikat);

        Diego.close();
    }
}

