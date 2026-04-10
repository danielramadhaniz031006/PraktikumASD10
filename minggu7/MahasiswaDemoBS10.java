package minggu7;

import java.util.Scanner;

public class MahasiswaDemoBS10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasiBS10 list = new MahasiswaBerprestasiBS10();

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

            list.tambah(new MahasiswaBS10(nim, nama, kelas, ipk));
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

        System.out.println("\nMenggunakan Binary Searching");
        int posisi = list.findBinarySearch(cari, 0, list.listMhs.length - 1);

        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}