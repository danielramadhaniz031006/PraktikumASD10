package minggu15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList; // MODIFIKASI NO 2
import java.util.Queue;      // MODIFIKASI NO 2
import java.util.Scanner;

public class SistemNilai10 {

    static ArrayList<DataMahasiswa10> mahasiswa = new ArrayList<>();
    static ArrayList<DataMataKuliah10> matkul = new ArrayList<>();
    static ArrayList<DataNilai10> daftarNilai = new ArrayList<>();

    // MODIFIKASI NO 2
    // Queue untuk menghapus mahasiswa berdasarkan FIFO
    static Queue<DataMahasiswa10> antrianHapus = new LinkedList<>();
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        mahasiswa.add(new DataMahasiswa10("20001", "Thalhah", "021xxx"));
        mahasiswa.add(new DataMahasiswa10("20002", "Zubair", "021xxx"));
        mahasiswa.add(new DataMahasiswa10("20003", "Abdur-Rahman", "021xxx"));
        mahasiswa.add(new DataMahasiswa10("20004", "Sa'ad", "021xxx"));
        mahasiswa.add(new DataMahasiswa10("20005", "Sa'id", "021xxx"));
        mahasiswa.add(new DataMahasiswa10("20006", "Ubaidah", "021xxx"));

        matkul.add(new DataMataKuliah10("00001", "Internet of Things", 3));
        matkul.add(new DataMataKuliah10("00002", "Algoritma dan Struktur Data", 2));
        matkul.add(new DataMataKuliah10("00003", "Algoritma dan Pemrograman", 2));
        matkul.add(new DataMataKuliah10("00004", "Praktikum Algoritma dan Struktur Data", 3));
        matkul.add(new DataMataKuliah10("00005", "Praktikum Algoritma dan Pemrograman", 3));

        int pilih;

        do {
            menu();
            pilih = Integer.parseInt(sc.nextLine());

            switch (pilih) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilai();
                    break;
                case 4:
                    urutNilai();
                    break;
                case 5:
                    hapusMahasiswaQueue();
                    break;
                case 6:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 6);
    }

    static void menu() {
        System.out.println("************************************************");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("************************************************");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Hapus Data Mahasiswa (Queue)");
        System.out.println("6. Keluar");
        System.out.println("************************************************");
        System.out.print("Pilih      : ");
    }

    static void inputNilai() {

        System.out.println("Masukan data");

        System.out.print("Kode    : ");
        String kode = sc.nextLine();

        System.out.print("Nilai   : ");
        double nilai = Double.parseDouble(sc.nextLine());

        System.out.println();
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("************************************************");

        System.out.printf("%-10s %-15s %-10s\n",
                "NIM", "Nama", "Telf");

        for (DataMahasiswa10 m : mahasiswa) {
            System.out.printf("%-10s %-15s %-10s\n",
                    m.nim, m.nama, m.telp);
        }

        System.out.print("Pilih mahasiswa by nim: ");
        String nim = sc.nextLine();

        System.out.println();
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("************************************************");

        System.out.printf("%-8s %-40s %-5s\n",
                "Kode", "Mata Kuliah", "SKS");

        for (DataMataKuliah10 mk : matkul) {
            System.out.printf("%-8s %-40s %-5d\n",
                    mk.kode, mk.namaMK, mk.sks);
        }

        System.out.print("Pilih MK by kode: ");
        String kodeMK = sc.nextLine();

        DataMahasiswa10 mhs = null;
        DataMataKuliah10 mk = null;

        for (DataMahasiswa10 m : mahasiswa) {
            if (m.nim.equals(nim)) {
                mhs = m;
                break;
            }
        }

        for (DataMataKuliah10 m : matkul) {
            if (m.kode.equals(kodeMK)) {
                mk = m;
                break;
            }
        }

        daftarNilai.add(new DataNilai10(mhs, mk, nilai));
    }

    static void tampilNilai() {

        System.out.println();
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("************************************************");

        System.out.printf("%-10s %-15s %-40s %-5s %-8s\n",
                "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");

        for (DataNilai10 n : daftarNilai) {

            System.out.printf("%-10s %-15s %-40s %-5d %-8.2f\n",
                    n.mahasiswa.nim,
                    n.mahasiswa.nama,
                    n.matkul.namaMK,
                    n.matkul.sks,
                    n.nilai);
        }
    }

    static void cariNilai() {

        System.out.println();
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("************************************************");

        System.out.printf("%-10s %-15s %-40s %-5s %-8s\n",
                "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");

        for (DataNilai10 n : daftarNilai) {
            System.out.printf("%-10s %-15s %-40s %-5d %-8.2f\n",
                    n.mahasiswa.nim,
                    n.mahasiswa.nama,
                    n.matkul.namaMK,
                    n.matkul.sks,
                    n.nilai);
        }

        System.out.print("Masukkan data mahasiswa[nim] : ");
        String nim = sc.nextLine();

        int totalSKS = 0;

        System.out.printf("%-10s %-15s %-40s %-5s %-8s\n",
                "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");

        for (DataNilai10 n : daftarNilai) {

            if (n.mahasiswa.nim.equals(nim)) {

                System.out.printf("%-10s %-15s %-40s %-5d %-8.2f\n",
                        n.mahasiswa.nim,
                        n.mahasiswa.nama,
                        n.matkul.namaMK,
                        n.matkul.sks,
                        n.nilai);

                totalSKS += n.matkul.sks;
            }
        }

        System.out.println("Total SKS " + totalSKS + " telah diambil.");
    }

    static void urutNilai() {

    daftarNilai.sort(
            Comparator.comparingDouble((DataNilai10 n) -> n.nilai)
    );

    System.out.println();
    System.out.println("DAFTAR NILAI MAHASISWA");
    System.out.println("************************************************");

    System.out.printf("%-10s %-15s %-40s %-5s %-8s\n",
            "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");

    for (DataNilai10 n : daftarNilai) {

        System.out.printf("%-10s %-15s %-40s %-5d %-8.2f\n",
                n.mahasiswa.nim,
                n.mahasiswa.nama,
                n.matkul.namaMK,
                n.matkul.sks,
                n.nilai);
    }
}

// =====================================================
// MODIFIKASI NO 2
// Hapus data mahasiswa menggunakan Queue (FIFO)
// =====================================================
static void hapusMahasiswaQueue() {

    if (mahasiswa.isEmpty()) {
        System.out.println("Data mahasiswa kosong!");
        return;
    }

    for (DataMahasiswa10 m : mahasiswa) {
        antrianHapus.offer(m);
    }

    DataMahasiswa10 hapus = antrianHapus.poll();

    mahasiswa.remove(hapus);

    System.out.println("\n=================================");
    System.out.println("HAPUS DATA MAHASISWA (QUEUE)");
    System.out.println("=================================");
    System.out.println("NIM  : " + hapus.nim);
    System.out.println("Nama : " + hapus.nama);
    System.out.println("Telp : " + hapus.telp);

    antrianHapus.clear();
}

}