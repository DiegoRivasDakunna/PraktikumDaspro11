package Pertemuan12;

import java.util.Scanner;

public class ArrayNilai11 {
    public static void main(String[] args) {
       int[] nilaiAkhir = new int[10];
        Scanner Diego = new Scanner(System.in);

        // Langkah ke-4: Tetap menggunakan for loop agar bisa mengisi elemen array & memakai indeks i
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = Diego.nextInt();
        }

        // Langkah ke-5: Diubah ke foreach loop (dengan counter manual untuk nomor mahasiswa)
        int nomor = 1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + nomor + ": " + nilai + " (" + status + ")");
            nomor++;
        }

        Diego.close();
}
}
