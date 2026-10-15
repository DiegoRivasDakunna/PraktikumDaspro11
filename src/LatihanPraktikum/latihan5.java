package LatihanPraktikum;

import java.util.Scanner;

public class latihan5 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        // Deklarasi variabel
        String jalurMasuk;
        double nilaiUjian;

        System.out.println("=== SELEKSI PENEMPATAN KELAS SMA HARAPAN BANGSA ===");
        
        // Input jalur masuk
        System.out.print("Masukkan jalur masuk (p = Prestasi, r = Reguler): ");
        jalurMasuk = Diego.nextLine();

        // Input nilai ujian masuk
        System.out.print("Masukkan nilai ujian masuk (0 - 100): ");
        nilaiUjian = Diego.nextDouble();

        System.out.println("\n----------------------------------");
        System.out.println("========== HASIL SELEKSI =========");

        // STRUKTUR NESTED IF (If Bersarang)
        if (jalurMasuk.equalsIgnoreCase("p")) {
            // Logika untuk JALUR PRESTASI
            if (nilaiUjian >= 85) {
                System.out.println("Status : LULUS");
                System.out.println("Kelas  : Kelas Unggulan (Jalur Prestasi)");
            } else if (nilaiUjian >= 75) {
                System.out.println("Status : LULUS");
                System.out.println("Kelas  : Kelas Reguler A (Jalur Prestasi)");
            } else {
                System.out.println("Status : TIDAK LULUS");
                System.out.println("Alasan : Nilai kurang dari standar minimum (75)");
            }
            
        } else if (jalurMasuk.equalsIgnoreCase("r")) {
            // Logika untuk JALUR REGULER
            if (nilaiUjian >= 80) {
                System.out.println("Status : LULUS");
                System.out.println("Kelas  : Kelas Reguler A (Jalur Reguler)");
            } else if (nilaiUjian >= 60) {
                System.out.println("Status : LULUS");
                System.out.println("Kelas  : Kelas Reguler B (Jalur Reguler)");
            } else {
                System.out.println("Status : TIDAK LULUS");
                System.out.println("Alasan : Nilai kurang dari standar minimum (60)");
            }
            
        } else {
            // Jika input jalur masuk salah
            System.out.println("Error: Pilihan jalur masuk tidak valid! Gunakan 'p' atau 'r'.");
        }

        System.out.println("----------------------------------");
        Diego.close();
    }
    
}
