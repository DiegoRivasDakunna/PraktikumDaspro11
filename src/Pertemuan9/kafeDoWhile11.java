package Pertemuan9;

import java.util.Scanner;

public class kafeDoWhile11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        
        int kopi, teh, roti;
        int hargaKopi = 11000;
        int hargaTeh = 8000;
        int hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = Diego.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = Diego.nextInt();
            System.out.print("Jumlah teh: ");
            teh = Diego.nextInt();
            System.out.print("Jumlah roti: ");
            roti = Diego.nextInt();

            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);

            Diego.nextLine(); // Membersihkan newline dari buffer
        } while (true);

        System.out.println("Semua transaksi selesai.");
        Diego.close();
    }
}
