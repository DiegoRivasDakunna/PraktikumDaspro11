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

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        // Tampilkan status kelulusan sekaligus hitung jumlah lulus dan tidak lulus
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
                jumlahLulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (TIDAK LULUS)");
                jumlahTidakLulus++;
            }
        }

        // Tampilkan rekap jumlah di akhir program
        System.out.println("\nJumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);

        Diego.close();
}
}
