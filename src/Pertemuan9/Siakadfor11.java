package Pertemuan9;

import java.util.Scanner;

public class Siakadfor11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        
        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        int batasMahasiswa = 9; // 8 + (11 mod 5)
        double batasKelulusan = 55; // 55 + (11 mod 11)

        for (int i = 1; i <= batasMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = Diego.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            // Perhitungan mahasiswa lulus dan tidak lulus (Modifikasi Pertanyaan 4)
            if (nilai >= batasKelulusan) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        System.out.println("\n--- Hasil Rekapitulasi ---");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus (>= " + (int)batasKelulusan + "): " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus (< " + (int)batasKelulusan + "): " + jumlahTidakLulus);

        Diego.close();
    }
}
