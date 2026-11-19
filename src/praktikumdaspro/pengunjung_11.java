package praktikumdaspro;

import java.util.Scanner;

public class pengunjung_11 {

    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        // ==================== TOKO MAWAR ====================
        System.out.println("=== TOKO MAWAR ===");
        int totalPengunjungMawar = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan jumlah pengunjung hari ke-" + i + ": ");
            int pengunjung = Diego.nextInt();

            totalPengunjungMawar += pengunjung;
            System.out.println("Total pengunjung sampai hari ke-" + i + " = " + totalPengunjungMawar);
        }

        System.out.println("Total keseluruhan pengunjung Toko Mawar: " + totalPengunjungMawar);
        System.out.println();

        // ==================== TOKO MELATI ====================
        System.out.println("=== TOKO MELATI ===");
        int totalPengunjungMelati = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan jumlah pengunjung hari ke-" + i + ": ");
            int pengunjung = Diego.nextInt();

            totalPengunjungMelati += pengunjung;
            System.out.println("Total pengunjung sampai hari ke-" + i + " = " + totalPengunjungMelati);
        }

        System.out.println("Total keseluruhan pengunjung Toko Melati: " + totalPengunjungMelati);

        Diego.close(); // Menutup Scanner agar tidak resource leak
    }
}