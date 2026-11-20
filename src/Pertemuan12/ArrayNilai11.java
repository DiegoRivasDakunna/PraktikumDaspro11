package Pertemuan12;

import java.util.Scanner;

public class ArrayNilai11 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner Diego = new Scanner(System.in);

        // Input 10 nilai mahasiswa ke dalam array
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = Diego.nextInt();
        }

        // Tampilkan hanya mahasiswa yang lulus (nilai > 70)
        System.out.println("\n=== Daftar Mahasiswa Lulus ===");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
            }
        }

        Diego.close();
}
}
