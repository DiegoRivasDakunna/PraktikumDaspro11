package Pertemuan12;

import java.util.Scanner;

public class AplikasiPemesananKafeKampus11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        // Tampilkan daftar menu kafe
        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        // Fitur pencarian menu menggunakan linear search
        System.out.print("\nIngin cek harga menu terlebih dahulu? Masukkan nama menu (atau '-' untuk lewati): ");
        String cariMenu = Diego.nextLine();

        if (!cariMenu.equals("-")) {
            int idxCari = cariIndeksMenu(menu, cariMenu);
            if (idxCari != -1) {
                System.out.println("Menu \"" + menu[idxCari] + "\" tersedia dengan harga Rp" + harga[idxCari]);
            } else {
                System.out.println("Maaf, menu \"" + cariMenu + "\" tidak tersedia.");
            }
        }

        // Fitur pemesanan
        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlahItem = Diego.nextInt();
        Diego.nextLine(); // bersihkan newline

        if (jumlahItem <= 0) {
            System.out.println("Jumlah item harus lebih dari 0.");
            Diego.close();
            return;
        }

        // Array 1 dimensi terpisah untuk menyimpan pesanan dan harga tiap item
        String[] daftarPesanan = new String[jumlahItem];
        int[] hargaPesanan = new int[jumlahItem];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahItem; i++) {
            int idxDitemukan = -1;
            while (idxDitemukan == -1) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String namaPesanan = Diego.nextLine();

                idxDitemukan = cariIndeksMenu(menu, namaPesanan);
                if (idxDitemukan == -1) {
                    System.out.println("Menu tidak tersedia! Silakan masukkan nama menu yang valid.");
                }
            }

            daftarPesanan[i] = menu[idxDitemukan];
            hargaPesanan[i] = harga[idxDitemukan];
            totalBiaya += hargaPesanan[i];
        }

        // Tampilkan daftar pesanan beserta total biaya
        System.out.println("\n=== RINGKASAN PESANAN ===");
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println((i + 1) + ". " + daftarPesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("-----------------------------");
        System.out.println("Total Biaya : Rp" + totalBiaya);

        Diego.close();
    }

    // Metode linear search untuk mencari nama menu (case-insensitive)
    public static int cariIndeksMenu(String[] daftarMenu, String target) {
        for (int i = 0; i < daftarMenu.length; i++) {
            if (daftarMenu[i].equalsIgnoreCase(target.trim())) {
                return i;
            }
        }
        return -1;
}
}