package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = Diego.nextLine();
            System.out.print("Masukkan baris: ");
            baris = Diego.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = Diego.nextInt();
            Diego.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            pilihan = Diego.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
            Diego.close();
        }
    }
}
