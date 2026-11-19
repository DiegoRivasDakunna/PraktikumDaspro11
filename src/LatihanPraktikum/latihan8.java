package LatihanPraktikum;

import java.util.Scanner;

public class latihan8 {
    public static void main(String[] args) {
         Scanner DiegoInt = new Scanner (System.in);
        Scanner DiegoString = new Scanner (System.in);

        String nama,isi;
        int jumLulus=0,jumTidak=0,jumMaha=0;
        do {
            System.out.print("Ingin mengisi nilai mahasiswa (y/t)");

            isi=DiegoString.nextLine();
            if (isi.equalsIgnoreCase("t")) {
                break;
            }
            jumMaha++;
            System.out.print("Masukkan nama : ");
            nama=DiegoString.nextLine();

            double rataTugas=0,NAflat=0;
            

            while (true) {
                int kumpulTugas=0;
                int kuis=0,uts=0,uas=0,tugas1=0,tugas2=0;
                System.out.println("Masukkan nilai kuis ");
                kuis=DiegoInt.nextInt(); 
                NAflat+=kuis*0.35;
                System.out.println("Masukkan nilai uts ");
                uts=DiegoInt.nextInt();
                NAflat+=uts*0.15;
                System.out.println("Masukkan nilai uas ");
                uas=DiegoInt.nextInt();
                NAflat+=uas*0.3;
                do {
                    System.out.println("Masukkan nilai tugas 1 ");
                    tugas1=DiegoInt.nextInt();
                    if (tugas1<0||tugas1>100) {
                        System.out.println("ulangi input");
                    }
                    kumpulTugas+=tugas1;
                } while (tugas1<0||tugas1>100);
                do {
                    
                    System.out.println("Masukkan nilai tugas 2 ");
                    tugas2=DiegoInt.nextInt();
                    if (tugas2<0||tugas2>100) {
                        System.out.println("ulangi input");
                    }
                    kumpulTugas+=tugas2;
                } while (tugas2<0||tugas2>100);
                rataTugas=kumpulTugas/2;
                NAflat+=rataTugas*0.2;
                    if (NAflat>50) {
                        System.out.println("Lulus");
                        jumLulus++;
                    }else{
                        System.out.println("Tidak lulus");
                        jumTidak++;
                    }
                    
                    System.out.println("Rata rata tugas "+nama+rataTugas);
                    System.out.println("Rata semua nilai : "+NAflat);
                    break;
            }

        } while (isi.equalsIgnoreCase("y"));
        System.out.println("Jumlah MAhasiswa : "+jumMaha);
        System.out.println("Jumlah lulus :"+jumLulus);
        System.out.println("Jumlah tidak lulus : "+jumTidak);
        DiegoInt.close();
        DiegoString.close();
    }
}
    
