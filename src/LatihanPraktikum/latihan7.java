package LatihanPraktikum;

import java.util.Scanner;

public class latihan7 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        // Deklarasi variabel
        char genre;
        int pilihanFilm, jumlahTiket;
        int harga = 0;
        String namaFilm = "";

        System.out.println("=== BIOSKOP CINEMA XXI-MINI ===");
        System.out.println("Pilih Genre Film:");
        System.out.println("A. Action");
        System.out.println("B. Horror");
        System.out.println("C. Animation");
        System.out.print("Masukkan pilihan genre (A/B/C): ");
        
        // Membaca input karakter pertama
        genre = Diego.next().charAt(0);

        System.out.println("\n----------------------------------------");

        // SWITCH-CASE UTAMA (BERDASARKAN GENRE)
        switch (Character.toUpperCase(genre)) {
            case 'A':
                System.out.println(">> Genre: Action");
                System.out.println("1. Mission: Impossible (Rp 45.000)");
                System.out.println("2. John Wick 4 (Rp 50.000)");
                System.out.print("Pilih nomor film (1-2): ");
                pilihanFilm = Diego.nextInt();

                // NESTED SWITCH-CASE UNTUK ACTION
                switch (pilihanFilm) {
                    case 1:
                        namaFilm = "Mission: Impossible";
                        harga = 45000;
                        break;
                    case 2:
                        namaFilm = "John Wick 4";
                        harga = 50000;
                        break;
                    default:
                        System.out.println("Pilihan film tidak valid!");
                        Diego.close();
                        return; // Menghentikan program jika salah
                }
                break;

            case 'B':
                System.out.println(">> Genre: Horror");
                System.out.println("1. The Conjuring (Rp 40.000)");
                System.out.println("2. Pengabdi Setan (Rp 35.000)");
                System.out.print("Pilih nomor film (1-2): ");
                pilihanFilm = Diego.nextInt();

                // NESTED SWITCH-CASE UNTUK HORROR
                switch (pilihanFilm) {
                    case 1:
                        namaFilm = "The Conjuring";
                        harga = 40000;
                        break;
                    case 2:
                        namaFilm = "Pengabdi Setan";
                        harga = 35000;
                        break;
                    default:
                        System.out.println("Pilihan film tidak valid!");
                        Diego.close();
                        return;
                }
                break;

            case 'C':
                System.out.println(">> Genre: Animation");
                System.out.println("1. Inside Out 2 (Rp 40.000)");
                System.out.println("2. Toy Story (Rp 35.000)");
                System.out.print("Pilih nomor film (1-2): ");
                pilihanFilm = Diego.nextInt();

                // NESTED SWITCH-CASE UNTUK ANIMATION
                switch (pilihanFilm) {
                    case 1:
                        namaFilm = "Inside Out 2";
                        harga = 40000;
                        break;
                    case 2:
                        namaFilm = "Toy Story";
                        harga = 35000;
                        break;
                    default:
                        System.out.println("Pilihan film tidak valid!");
                        Diego.close();
                        return;
                }
                break;

            default:
                System.out.println("Pilihan genre tidak valid! Silakan masukkan A, B, atau C.");
                Diego.close();
                return;
        }

        // Input Jumlah Tiket
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        jumlahTiket = Diego.nextInt();

        // Hitung total harga
        int totalHarga = harga * jumlahTiket;

        // Cetak Struk Pembelian
        System.out.println("\n----------------------------------------");
        System.out.println("========== STRUK PEMESANAN TIKET =======");
        System.out.println("Film terpilih : " + namaFilm);
        System.out.println("Harga satuan  : Rp " + harga);
        System.out.println("Jumlah tiket  : " + jumlahTiket);
        System.out.println("Total Bayar   : Rp " + totalHarga);
        System.out.println("----------------------------------------");

        Diego.close();
    }
    
}
