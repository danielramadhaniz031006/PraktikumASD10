package minggu11;

import java.util.Scanner;

public class MainAntrian10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueAntrian10 q = new QueueAntrian10();
        int pilih;

        do {
            System.out.println("\n=== ANTRIAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Lihat Depan & Belakang");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM      : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama     : ");
                    String nama = sc.nextLine();

                    System.out.print("Jurusan  : ");
                    String jurusan = sc.nextLine();

                    q.enqueue(new MahasiswaAntrian10(nim, nama, jurusan));
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.print();
                    break;

                case 4:
                    q.peekFront();
                    q.peekRear();
                    break;

                case 5:
                    q.jumlah();
                    break;

                case 6:
                    q.clear();
                    break;
            }

        } while (pilih != 0);
    }
}