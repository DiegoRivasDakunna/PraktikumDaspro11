package Pertemuan12;

import java.util.Scanner;

public class SearchNilai11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        // 1. Input banyaknya elemen array nilai
        System.out.print("Masukkan banyaknya elemen array: ");
        int jumlah = Diego.nextInt();

        int[] nilai = new int[jumlah];

        // 2. Input isi setiap elemen array
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + " (indeks " + i + "): ");
            nilai[i] = Diego.nextInt();
        }

        // 3. Input nilai (key) yang ingin dicari
        System.out.print("Masukkan nilai (key) yang ingin dicari: ");
        int key = Diego.nextInt();

        // 4. Pencarian linear search
        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan di dalam array.");
        }

        Diego.close();
    }
}