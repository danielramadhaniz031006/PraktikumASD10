package CM10;

import java.util.Scanner;

public class SistemPeminjaman {

    static Mahasiswa[] dataMahasiswa = {
        new Mahasiswa("22001", "Andi",  "Teknik Informatika"),
        new Mahasiswa("22002", "Budi",  "Teknik Informatika"),
        new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
    };

    static Buku[] dataBuku = {
        new Buku("B001", "Algoritma",   2020),
        new Buku("B002", "Basis Data",  2019),
        new Buku("B003", "Pemrograman", 2021),
        new Buku("B004", "Fisika",      2024)
    };

    static Peminjaman[] dataPeminjaman = {
        new Peminjaman(dataMahasiswa[0], dataBuku[0], 7),
        new Peminjaman(dataMahasiswa[1], dataBuku[1], 3),
        new Peminjaman(dataMahasiswa[2], dataBuku[2], 10),
        new Peminjaman(dataMahasiswa[2], dataBuku[3], 6),
        new Peminjaman(dataMahasiswa[0], dataBuku[1], 4)
    };

    static void tampilkanMahasiswa() {
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa m : dataMahasiswa) m.tampilMahasiswa();
    }

    static void tampilkanBuku() {
        System.out.println("\nDaftar Buku:");
        for (Buku b : dataBuku) b.tampilBuku();
    }

    static void tampilkanPeminjaman() {
        System.out.println("\nData Peminjaman:");
        for (Peminjaman p : dataPeminjaman) p.tampilPeminjaman();
    }

    static void urutkanBerdasarkanDenda() {
        Peminjaman[] sorted = dataPeminjaman.clone();
        int n = sorted.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (sorted[j].getDenda() < sorted[j + 1].getDenda()) {
                    Peminjaman temp = sorted[j];
                    sorted[j]       = sorted[j + 1];
                    sorted[j + 1]   = temp;
                }
            }
        }
        System.out.println("\nSetelah diurutkan (Denda terbesar):");
        for (Peminjaman p : sorted) p.tampilPeminjaman();
    }

    static void cariBerdasarkanNIM(String nim) {
        System.out.println("\nHasil pencarian NIM: " + nim);
        boolean ditemukan = false;
        for (Peminjaman p : dataPeminjaman) {
            if (p.getMhs().getNim().equals(nim)) {
                p.tampilPeminjaman();
                ditemukan = true;
            }
        }
        if (!ditemukan)
            System.out.println("Data peminjaman dengan NIM " + nim + " tidak ditemukan.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = Integer.parseInt(scanner.nextLine().trim());
            switch (pilih) {
                case 1: tampilkanMahasiswa();      break;
                case 2: tampilkanBuku();           break;
                case 3: tampilkanPeminjaman();     break;
                case 4: urutkanBerdasarkanDenda(); break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    cariBerdasarkanNIM(scanner.nextLine().trim());
                    break;
                case 0: System.out.println("Terima kasih. Program selesai."); break;
                default: System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilih != 0);
        scanner.close();
    }
}
