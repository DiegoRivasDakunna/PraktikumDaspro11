package Pertemuan10;

import java.util.Scanner;

public class Rectangle11 {
    public static void main(String[] args) {
        // Deklarasi objek Scanner untuk menerima input dari keyboard
        Scanner sc = new Scanner(System.in);
        
        // Meminta pengguna memasukkan jumlah baris dan kolom
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();
        
        // Nested loop (Perulangan bersarang)
        // Outer loop untuk mengatur baris
        for (int i = 1; i <= baris; i++) {
            // Inner loop untuk mengatur kolom (mencetak bintang ke samping)
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            // Pindah ke baris baru setelah inner loop selesai dalam satu baris
            System.out.println();
        }
        
        // Menutup objek Scanner
        sc.close();
}
}
