package Pertemuan12;

import java.util.Arrays;

public class ArrayBilangan11 {
   public static void main(String[] args) {
        int[] bil = new int[4];

        // Isi elemen array sesuai parameter unik (P = 11)
        bil[0] = 11;
        bil[1] = 19;
        bil[2] = -5;
        bil[3] = 31;

        // Tampilkan menggunakan perulangan for
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        // Tampilkan menggunakan foreach loop
        for (int nilai : bil) {
            System.out.println(nilai);
        }

        // Tampilkan menggunakan Arrays.toString()
        System.out.println(Arrays.toString(bil));
}
}
