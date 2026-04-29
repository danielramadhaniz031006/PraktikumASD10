package minggu10;

import java.util.Scanner;

public class KRSMain10_Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS10_Tugas antrian = new AntrianKRS10_Tugas(10);
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Sudah Dilayani");
            System.out.println("8. Belum Dilayani");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    antrian.tambahAntrian(new MahasiswaKRS10_Tugas(nim,nama,prodi,kelas));
                    break;

                case 2:
                    antrian.panggil2Mahasiswa();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;

                case 4:
                    antrian.tampil2Depan();
                    break;

                case 5:
                    antrian.tampilBelakang();
                    break;

                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;

                case 7:
                    System.out.println("Sudah dilayani: " + antrian.getSudahDilayani());
                    break;

                case 8:
                    System.out.println("Belum dilayani: " + antrian.getBelumDilayani());
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Selesai");
            }

        } while (pilih != 0);
    }
}