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
                    System.out.print("Masukkan baris (1-4): ");
                    baris = Diego.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = Diego.nextInt();
                    Diego.nextLine();

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
                        System.out.print(penonton[i][j] + "\t");
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
