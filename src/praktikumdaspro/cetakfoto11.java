//Nama:Diego Rivas Dakunna
//No.Absen:11
//kelas:TI-1E
//NIM:264107020103
package praktikumdaspro;

import java.util.Scanner;

public class cetakfoto11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        int P = 11;
        int hargaperlembarkode1 = 3000 + (P % 4) * 500;
        int hargaperlembarkode2 = 5000 + (P % 4) * 500;
        int hargaperlembarkode3 = 15000 + (P % 4) * 500;
        
        String kode1;
        String kode2;
        String kode3;
        
        System.out.println("masukkan kode anda kode1/kode2/kode3");
        kode1 = Diego.nextLine();
        kode2 = Diego.nextLine();
        kode3 = Diego.nextLine();
        
        // Perbaikan pada pengecekan String menggunakan .equals()
        if (kode1.equalsIgnoreCase("kode1")) {
            System.out.println("harga yang anda harus bayar adalah " + hargaperlembarkode1);
        } else if (kode2.equalsIgnoreCase("kode2")) {
            System.out.println("harga yang anda harus bayar adalah " + hargaperlembarkode2);
        } else if (kode3.equalsIgnoreCase("kode3")) {
            System.out.println("harga yang anda harus bayar adalah " + hargaperlembarkode3);
        } else {
            System.out.println("kode tidak dikenal");
        }
        
        Diego.close();
    }
    
    }
