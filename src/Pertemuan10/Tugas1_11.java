package Pertemuan10;

import java.util.Scanner;

public class Tugas1_11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = Diego.nextInt();

        int totalAngka = 0; // Variabel untuk menghitung total banyaknya angka yang dicetak

        // Outer loop untuk mengatur baris (dari 1 sampai n)
        for (int i = 1; i <= n; i++) {
            // Inner loop untuk mencetak angka dari 1 sampai i pada setiap baris
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totalAngka++; // Menambah hitungan setiap kali angka dicetak
            }
            // Pindah baris setelah inner loop selesai
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + totalAngka);

        Diego.close();
}
}