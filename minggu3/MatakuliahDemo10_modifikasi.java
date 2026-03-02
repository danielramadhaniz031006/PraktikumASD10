package minggu3;

import java.util.Scanner;

public class MatakuliahDemo10_modifikasi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Matakuliah10[] arrayMatakuliah = new Matakuliah10[3];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {

            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

            System.out.print("Kode : ");
            kode = sc.nextLine();

            System.out.print("Nama : ");
            nama = sc.nextLine();

            System.out.print("SKS  : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);

            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            System.out.println("---------------------------");

            arrayMatakuliah[i] = new Matakuliah10(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n=== DATA MATAKULIAH ===");

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayMatakuliah[i].nama);
            System.out.println("SKS        : " + arrayMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayMatakuliah[i].jumlahJam);
            System.out.println("---------------------------");
        }

        sc.close();
    }
}