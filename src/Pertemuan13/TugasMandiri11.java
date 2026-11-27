package Pertemuan13;

import java.util.Scanner;

public class TugasMandiri11 {
    public class SurveiKepuasan {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);
        
        // a. Menyimpan hasil survei ke dalam array 2 dimensi
        // Baris = 10 responden, Kolom = 6 pertanyaan
        int[][] survey = new int[10][6];
        
        System.out.println("=== INPUT DATA SURVEI KEPUASAN PELANGGAN ===");
        System.out.println("Masukkan nilai (1-5) untuk setiap pertanyaan:\n");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("  Pertanyaan " + (j + 1) + " : ");
                survey[i][j] = Diego.nextInt();
                
                // Validasi sederhana (opsional)
                while (survey[i][j] < 1 || survey[i][j] > 5) {
                    System.out.print("  Nilai harus 1-5! Ulangi: ");
                    survey[i][j] = Diego.nextInt();
                }
            }
            System.out.println();
        }
        
        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\n=== RATA-RATA SETIAP RESPONDEN ===");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            double rata = total / 6.0;
            System.out.printf("Responden %2d : %.2f\n", (i + 1), rata);
        }
        
        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\n=== RATA-RATA SETIAP PERTANYAAN ===");
        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            double rata = total / 10.0;
            System.out.printf("Pertanyaan %d : %.2f\n", (j + 1), rata);
        }
        
        // d. Menampilkan nilai rata-rata secara keseluruhan
        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        double totalAll = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalAll += survey[i][j];
            }
        }
        double rataAll = totalAll / 60.0;   // 10 responden × 6 pertanyaan = 60
        System.out.printf("Rata-rata keseluruhan : %.2f\n", rataAll);
        
        Diego.close();
    }
}
}
