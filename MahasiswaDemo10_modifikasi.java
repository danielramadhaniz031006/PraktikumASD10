package praktikum5;

import java.util.Scanner;

public class MahasiswaDemo10_modifikasi {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi10_modifikasi list = new MahasiswaBerprestasi10_modifikasi();

        System.out.print("Masukkan jumlah mahasiswa yang akan diinput: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            list.tambah(new Mahasiswa10_modifikasi(nim, nama, kelas, ipk));
        }

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("\nData Mahasiswa setelah di sorting bedasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    }
}
