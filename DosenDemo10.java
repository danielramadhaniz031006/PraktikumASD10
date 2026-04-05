package praktikum5;

import java.util.Scanner;

public class DosenDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen10 list = new DataDosen10();
        int pilihan;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting Ascending (Bubble Sort)");
            System.out.println("4. Sorting Descending (Selection/Insertion Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    if (list.idx < 10) {
                        System.out.println("Masukkan Data Dosen ke-" + (list.idx + 1));
                        System.out.print("Kode      : ");
                        String kode = sc.nextLine();
                        System.out.print("Nama      : ");
                        String nama = sc.nextLine();
                        System.out.print("Jenis Kelamin (L/P): ");
                        char jk = sc.nextLine().charAt(0);
                        boolean gender = (jk == 'L' || jk == 'l');
                        System.out.print("Usia      : ");
                        int usia = sc.nextInt();
                        
                        Dosen10 dsn = new Dosen10(kode, nama, gender, usia);
                        list.tambah(dsn);
                    } else {
                        System.out.println("Data sudah penuh (Maks 10).");
                    }
                    break;
                case 2:
                    System.out.println("\n=== DATA DOSEN ===");
                    list.tampil();
                    break;
                case 3:
                    list.SortingASC();
                    list.tampil();
                    break;
                case 4:
                    list.sortingDSC(); 
                    list.tampil();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}