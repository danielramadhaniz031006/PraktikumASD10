package minggu7;

import java.util.Scanner;

public class MahasiswaDemo10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10();

        System.out.println("---------------------------------------------");
        System.out.println("Input Data Mahasiswa");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("------------------------");

            list.tambah(new Mahasiswa10(nim, nama, kelas, ipk));
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("\nData Mahasiswa setelah di sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("---------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan sequential searching");
        int posisi = list.sequentialSearching(cari);

        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}