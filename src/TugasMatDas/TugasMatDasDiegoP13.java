package TugasMatDas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TugasMatDasDiegoP13 {

    // Fungsi menghitung faktorial
    public static long factorial(int n) {
        long hasil = 1;
        for (int i = 2; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    // Fungsi menghitung jumlah string berbeda
    public static long hitungStringBerbeda(String s) {
        int n = s.length();
        
        // Hitung frekuensi setiap karakter
        Map<Character, Integer> frekuensi = new HashMap<>();
        for (char c : s.toCharArray()) {
            frekuensi.put(c, frekuensi.getOrDefault(c, 0) + 1);
        }

        // Hitung n! / (f1! * f2! * ... * fk!)
        long hasil = factorial(n);
        for (int f : frekuensi.values()) {
            hasil /= factorial(f);
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String s = input.nextLine();

        long jumlah = hitungStringBerbeda(s);
        System.out.println("Jumlah string berbeda yang bisa dibuat: " + jumlah);

        input.close();
    }
}