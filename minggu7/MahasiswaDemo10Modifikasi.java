package minggu7;

import java.util.Scanner;

public class MahasiswaDemo10Modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine(); 

        MahasiswaBerprestasi10Modifikasi list = new MahasiswaBerprestasi10Modifikasi(jumMhs);

        System.out.println("---------------------------------------------");
        System.out.println("Input Data Mahasiswa");
        System.out.println("---------------------------------------------");
        
        for (int i = 0; i < jumMhs; i++) {
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

            list.tambah(new Mahasiswa10Modifikasi(nim, nama, kelas, ipk));
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