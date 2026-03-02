package minggu3;

import java.util.Scanner;

public class MatakuliahDemo10_modifikasi_234 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah10[] arrayMatakuliah = new Matakuliah10[jumlah];

        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < jumlah; i++) {

            System.out.println("\nMasukkan Data Matakuliah ke-" + (i + 1));

            System.out.print("Kode : ");
            kode = sc.nextLine();

            System.out.print("Nama : ");
            nama = sc.nextLine();

            System.out.print("SKS : ");
            sks = Integer.parseInt(sc.nextLine());

            System.out.print("Jumlah Jam : ");
            jumlahJam = Integer.parseInt(sc.nextLine());

            arrayMatakuliah[i] = new Matakuliah10(kode, nama, sks, jumlahJam);
        }

        
        System.out.println("\n=== DATA MATAKULIAH ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode : " + arrayMatakuliah[i].kode);
            System.out.println("Nama : " + arrayMatakuliah[i].nama);
            System.out.println("SKS : " + arrayMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayMatakuliah[i].jumlahJam);
            System.out.println("---------------------------");
        }

    }
}