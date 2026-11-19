package LatihanPraktikum;

import java.util.Scanner;

public class latihan10 {
    public static void main(String[] args) {
        // 1. Perulangan menaik (Increment) dari 1 sampai 5
        System.out.println("=== Perulangan Menaik (1 - 5) ===");
        int i = 1; // Inisialisasi di luar loop
        while (i <= 5) { // Pengecekan kondisi di awal
            System.out.println("Iterasi ke-" + i);
            i++; // Update variabel di dalam badan loop
        }

        // 2. Perulangan menurun (Decrement) dari 5 sampai 1
        System.out.println("\n=== Perulangan Menurun (5 - 1) ===");
        int mundur = 5;
        while (mundur >= 1) {
            System.out.println("Hitung mundur: " + mundur);
            mundur--;
        }

        // 3. Perulangan dengan kelipatan tertentu (Bilangan Genap)
        System.out.println("\n=== Bilangan Genap (2 - 10) ===");
        int genap = 2;
        while (genap <= 10) {
            System.out.print(genap + " ");
            genap += 2;
        }
        System.out.println();

        // 4. Perulangan berbasis kondisi input (berhenti jika memasukkan 0)
        System.out.println("\n=== Input Angka (Ketik 0 untuk berhenti) ===");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        while (angka != 0) {
            System.out.println("Anda memasukkan: " + angka);
            System.out.print("Masukkan angka lagi (0 untuk keluar): ");
            angka = input.nextInt();
        }
        System.out.println("Program input selesai.");
        input.close();
    }
}
