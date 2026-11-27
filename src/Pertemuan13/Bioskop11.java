package Pertemuan13;

public class Bioskop11 {
    public static void main(String[] args) {
        // Langkah 2: Deklarasi array String penonton (4 baris dan 2 kolom)
        String[][] penonton = new String[4][2];

        // Langkah 3: Isi setiap elemen array
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        // Langkah 4: Tampilkan semua isi elemen
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        // Pertanyaan 6: Tampilkan panjang baris dan panjang tiap baris menggunakan for loop
        System.out.println(penonton.length);
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + penonton[i].length);
        }
    }
}