package Pertemuan10;

import java.util.Scanner;

public class Star11 {
    public static void main(String[] args) {
        // Deklarasi objek Scanner untuk menerima input dari keyboard
        Scanner Diego = new Scanner(System.in);
        
        // Meminta pengguna memasukkan nilai n
        System.out.print("Masukkan nilai n = ");
        int n = Diego.nextInt();
        
        // Perulangan FOR untuk mencetak karakter '*' sebanyak n kali secara mendatar
        for (int i = 1; i <= n; i+=2) {
            System.out.print("*");
        }
        
        // Pindah ke baris baru setelah perulangan selesai
        System.out.println();
        
        // Menutup objek Scanner
        Diego.close();
    }
}
