package LatihanPraktikum;

public class latihan9 {
    public static void main(String[] args) {
        // 1. Perulangan menaik (Increment) dari 1 sampai 5
        System.out.println("=== Perulangan Menaik (1 - 5) ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterasi ke-" + i);
        }

        // 2. Perulangan menurun (Decrement) dari 5 sampai 1
        System.out.println("\n=== Perulangan Menurun (5 - 1) ===");
        for (int i = 5; i >= 1; i--) {
            System.out.println("Hitung mundur: " + i);
        }

        // 3. Perulangan dengan kelipatan tertentu (Bilangan Genap)
        System.out.println("\n=== Bilangan Genap (2 - 10) ===");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Pindah baris
    }
}

    

