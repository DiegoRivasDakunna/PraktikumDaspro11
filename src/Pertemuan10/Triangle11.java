package Pertemuan10;

import java.util.Scanner;

public class Triangle11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = Diego.nextInt();
        
        System.out.println("\n--- Segitiga Siku-Siku ---");
        // Perbaikan Percobaan 3: Inisialisasi i = 1 dan penambahan System.out.println()
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Berfungsi untuk pindah baris setelah inner loop selesai
            i++;
        }
        
        System.out.println("\n--- Segitiga Terbalik ---");
        // Langkah 8: Nested WHILE untuk segitiga terbalik (variabel i cukup di-assign ulang tanpa deklarasi int)
        i = n;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Berfungsi untuk pindah baris
            i--;
        }
        
        Diego.close();
}
}
