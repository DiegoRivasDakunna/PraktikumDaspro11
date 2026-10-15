package LatihanPraktikum;

import java.util.Scanner;

public class latihan6 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        // Deklarasi variabel menu
        int menuUtama, subMenu;

        System.out.println("=== SELAMAT DATANG DI LAYANAN DIGITAL ===");
        System.out.println("Pilih Kategori Layanan:");
        System.out.println("1. Informasi Pulsa & Internet");
        System.out.println("2. Pembelian Paket Data");
        System.out.println("3. Bantuan / Call Center");
        System.out.print("Masukkan pilihan Anda (1-3): ");
        menuUtama = Diego.nextInt();

        System.out.println("\n----------------------------------------");

        // STRUKTUR SWITCH-CASE UTAMA
        switch (menuUtama) {
            case 1:
                System.out.println(">> Anda memilih: Informasi Pulsa & Internet");
                System.out.println("1. Cek Sisa Pulsa");
                System.out.println("2. Cek Kuota Internet");
                System.out.print("Pilih sub-menu (1-2): ");
                subMenu = Diego.nextInt();

                // NESTED SWITCH-CASE (Switch di dalam Switch)
                switch (subMenu) {
                    case 1:
                        System.out.println("Sisa pulsa Anda saat ini adalah: Rp 45.000");
                        break;
                    case 2:
                        System.out.println("Sisa kuota internet Anda: 12.5 GB (Berlaku hingga 25 Nov)");
                        break;
                    default:
                        System.out.println("Sub-menu tidak valid!");
                }
                break;

            case 2:
                System.out.println(">> Anda memilih: Pembelian Paket Data");
                System.out.println("1. Paket Internet Harian (2GB - Rp 5.000)");
                System.out.println("2. Paket Internet Bulanan (15GB - Rp 60.000)");
                System.out.print("Pilih sub-menu (1-2): ");
                subMenu = Diego.nextInt();

                // NESTED SWITCH-CASE
                switch (subMenu) {
                    case 1:
                        System.out.println("Berhasil! Paket Harian 2GB telah aktif.");
                        break;
                    case 2:
                        System.out.println("Berhasil! Paket Bulanan 15GB telah aktif.");
                        break;
                    default:
                        System.out.println("Sub-menu tidak valid!");
                }
                break;

            case 3:
                System.out.println(">> Anda memilih: Bantuan / Call Center");
                System.out.println("Mohon tunggu sebentar, panggilan Anda sedang diteruskan ke petugas...");
                break;

            default:
                System.out.println("Pilihan menu utama tidak valid! Silakan coba lagi.");
                break;
        }

        System.out.println("----------------------------------------");
        Diego.close();
    }
    
}
