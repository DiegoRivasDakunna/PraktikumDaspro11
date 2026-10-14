package LatihanPraktikum;

import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        // Deklarasi variabel
        String nama;
        double kehadiran;
        double nilaiUjian;

        // Tampilan Header
        System.out.println("=== SISTEM PENILAIAN KURSUS PEMROGRAMAN ===");
        
        // Input Data
        System.out.print("Masukkan Nama Peserta       : ");
        nama = Diego.nextLine();

        System.out.print("Masukkan Persentase Kehadiran (%): ");
        kehadiran = Diego.nextDouble();

        System.out.print("Masukkan Nilai Ujian Akhir  : ");
        nilaiUjian = Diego.nextDouble();

        System.out.println("\n--- HASIL EVALUASI ---");
        System.out.println("Nama Peserta       : " + nama);
        System.out.println("Kehadiran          : " + kehadiran + "%");
        System.out.println("Nilai Ujian        : " + nilaiUjian);

        // STRUKTUR NESTED IF (If Bersarang)
        
        // 1. Cek Syarat Kehadiran Terlebih Dahulu (Minimal 75%)
        if (kehadiran >= 75) {
            
            // 2. Jika kehadiran memenuhi, lakukan pengecekan nilai (Nested If di dalam)
            if (nilaiUjian >= 85) {
                System.out.println("Status Kelulusan   : Lulus dengan Pujian (Cumlaude)");
                System.out.println("Sertifikat & Bonus : Sertifikat Emas & Voucher Diskon Kursus Lanjutan 50%");
            } 
            else if (nilaiUjian >= 70) {
                System.out.println("Status Kelulusan   : Lulus");
                System.out.println("Sertifikat & Bonus : Sertifikat Perak");
            } 
            else if (nilaiUjian >= 60) {
                System.out.println("Status Kelulusan   : Lulus Bersyarat (Harus mengikuti remedi tugas)");
                System.out.println("Sertifikat & Bonus : Sertifikat Perunggu");
            } 
            else {
                System.out.println("Status Kelulusan   : Tidak Lulus");
                System.out.println("Sertifikat & Bonus : Tidak ada");
            }

        } else {
            // Jika kehadiran kurang dari 75%
            System.out.println("Status Kelulusan   : Tidak Lulus (Kehadiran kurang dari 75%)");
            System.out.println("Sertifikat & Bonus : Tidak ada");
        }

        // Menutup scanner
        Diego.close();
    }
    
}
