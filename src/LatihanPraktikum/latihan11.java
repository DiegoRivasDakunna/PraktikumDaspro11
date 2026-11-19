package LatihanPraktikum;

import java.util.Scanner;

public class latihan11 {
    public static void main(String[] args) {
        // 1. Perulangan menaik (Increment) dari 1 sampai 5
        System.out.println("=== Perulangan Menaik (1 - 5) ===");
        int i = 1;
        do {
            System.out.println("Iterasi ke-" + i);
            i++;
        } while (i <= 5); // Jangan lupa titik koma (;) di akhir

        // 2. Perulangan menurun (Decrement) dari 5 sampai 1
        System.out.println("\n=== Perulangan Menurun (5 - 1) ===");
        int mundur = 5;
        do {
            System.out.println("Hitung mundur: " + mundur);
            mundur--;
        } while (mundur >= 1);

        // 3. Perulangan dengan kelipatan tertentu (Bilangan Genap)
        System.out.println("\n=== Bilangan Genap (2 - 10) ===");
        int genap = 2;
        do {
            System.out.print(genap + " ");
            genap += 2;
        } while (genap <= 10);
        System.out.println();

        // 4. Kasus khas do-while: meminta input minimal 1 kali sampai valid (angka > 0)
        System.out.println("\n=== Input Angka Positif ===");
        Scanner input = new Scanner(System.in);
        int angkaPositif;
        do {
            System.out.print("Masukkan angka lebih besar dari 0: ");
            angkaPositif = input.nextInt();
            if (angkaPositif <= 0) {
                System.out.println("Input tidak valid! Coba lagi.");
            }
        } while (angkaPositif <= 0);

        System.out.println("Angka valid diterima: " + angkaPositif);
        input.close();
    }
    
}
