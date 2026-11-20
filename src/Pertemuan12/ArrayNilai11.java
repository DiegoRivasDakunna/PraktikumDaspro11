package Pertemuan12;

import java.util.Scanner;

public class ArrayNilai11 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner Diego = new Scanner(System.in);

        // Menerima input dan mengisi elemen array nilaiAkhir
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = Diego.nextInt();
        }

        // Menampilkan seluruh isi elemen array beserta status kelulusan
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }

        Diego.close();
}
}
