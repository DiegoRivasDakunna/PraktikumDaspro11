package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner11 {
   public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = Diego.nextInt();
            Diego.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = Diego.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-" + penonton.length + "): ");
                        baris = Diego.nextInt();
                        System.out.print("Masukkan kolom (1-" + penonton[0].length + "): ");
                        kolom = Diego.nextInt();
                        Diego.nextLine();

                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[baris - 1].length) {
                            System.out.println("Nomor baris atau kolom tidak tersedia! Silakan masukkan kembali.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Peringatan: Kursi baris " + baris + " kolom " + kolom +
                                    " sudah terisi oleh " + penonton[baris - 1][kolom - 1] +
                                    "! Silakan pilih baris dan kolom lain.");
                        } else {
                            break;
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = Diego.nextLine();

                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isiKursi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(isiKursi + "\t");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan menu tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }

        Diego.close();
    }
}