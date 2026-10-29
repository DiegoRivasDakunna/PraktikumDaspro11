package Pertemuan10;

import java.util.Scanner;

public class NilaiKelompok11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok: ");
        int jumlahKelompok = Diego.nextInt();
        System.out.print("Masukkan jumlah penilai : ");
        int jumlahPenilai = Diego.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            // Outer loop untuk memproses setiap kelompok
            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                double totalNilai = 0;

                // Inner loop untuk menerima nilai dari setiap penilai
                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print("   Nilai dari Penilai " + j + ": ");
                        nilai = Diego.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("   Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    
                    totalNilai += nilai;
                }

                // Hitung rata-rata nilai kelompok
                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + ": nilai rata-rata = " + rataNilai);

                // Cek apakah rata-rata ini merupakan yang tertinggi
                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }

                nomorKelompok++;
            }

            System.out.println("==============================");
            System.out.println("Kelompok terbaik : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }

        Diego.close();
}
}
