package Pertemuan12;

import java.util.Scanner;
import java.util.Arrays;

public class SearchNilai11 {
    public static void main(String[] args) {
        Scanner Diego = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int jumlah = Diego.nextInt();

        int[] nilai = new int[jumlah];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = Diego.nextInt();
        }

        System.out.print("Masukkan nilai (key) yang ingin dicari: ");
        int key = Diego.nextInt();

        int indeksDitemukan = -1;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                indeksDitemukan = i;
                break;
            }
        }

        System.out.println();
        if (indeksDitemukan != -1) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + indeksDitemukan);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan: nilai " + key
                    + " tidak terdapat pada data array " + Arrays.toString(nilai) + ".");
        }

        Diego.close();
    }
}