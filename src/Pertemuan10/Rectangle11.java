package Pertemuan10;

import java.util.Scanner;

public class Rectangle11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah baris dan kolom
        System.out.print("Masukkan jumlah baris: ");
        int baris = Diego.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = Diego.nextInt();

        // Nested loop (Perulangan bersarang)
        // Outer loop untuk mengatur baris
        for (int i = 1; i <= baris; i++) {
            // Inner loop untuk mengatur kolom
            for (int j = 1; j <= kolom; j++) {
                System.out.print("#"); // Mengubah * menjadi # sesuai modifikasi
            }
            // Pindah ke baris baru setelah inner loop selesai dalam satu baris
            System.out.println();
        }

        // Menutup objek Scanner (Gunakan sc.close() sesuai nama objek yang dideklarasikan)
        Diego.close();
}
}
