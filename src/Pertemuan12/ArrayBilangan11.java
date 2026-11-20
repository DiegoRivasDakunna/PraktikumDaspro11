package Pertemuan12;

import java.util.Arrays;

public class ArrayBilangan11 {
    public static void main(String[] args) {
        // 2. Buat array bertipe integer dengan nama bil berkapasitas 4 elemen
        int[] bil = new int[4];

        // 3. Isi masing-masing elemen array bil dengan angka 5, 13, -7, 17
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        // 4. Tampilkan seluruh isi elemennya ke layar menggunakan perulangan for
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        // 5. Tampilkan juga isi array menggunakan foreach loop
        for (int nilai : bil) {
            System.out.println(nilai);
        }

        // Tampilkan isi array menggunakan Arrays.toString()
        System.out.println(Arrays.toString(bil));
}
}
