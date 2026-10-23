package Pertemuan9;

import java.util.Scanner;

public class Tugas2_11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        
        int jenis, durasi;
        int total = 0;
        
        // Tarif berdasarkan parameter unik P = 11
        int tarifMobil = 3750;
        int tarifMotor = 2750;

        System.out.println("=== PROGRAM PERHITUNGAN TARIF PARKIR ===");
        System.out.println("Kode Kendaraan:");
        System.out.println("1 = Mobil");
        System.out.println("2 = Motor");
        System.out.println("0 = Keluar / Selesai\n");

        do {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = Diego.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = Diego.nextInt();

                if (jenis == 1) {
                    total += durasi * tarifMobil;
                } else if (jenis == 2) {
                    total += durasi * tarifMotor;
                }
            } else if (jenis != 0) {
                System.out.println("Kode kendaraan tidak valid! Masukkan pilihan 1, 2, atau 0.");
            }

            System.out.println("--------------------------------------------------");
        } while (jenis != 0);

        System.out.println("\n=== REKAPITULASI PARKIR HARI INI ===");
        System.out.println("Total pendapatan parkir: Rp " + total);

        Diego.close();
    }
}
