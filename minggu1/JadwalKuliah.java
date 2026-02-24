package minggu1;

import java.util.Scanner;

public class JadwalKuliah {

    static Scanner sc = new Scanner(System.in);

    static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nInput Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n================= DATA JADWAL =================");
        System.out.printf("%-25s %-20s %-15s %-15s\n",
                "Nama MK", "Ruang", "Hari", "Jam");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-15s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    static void cariHari(String[][] jadwal, int n) {
        System.out.print("\nMasukkan hari yang dicari: ");
        String hari = sc.nextLine();

        System.out.println("\nJadwal pada hari " + hari + ":");

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    static void cariMataKuliah(String[][] jadwal, int n) {
        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String mk = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("Ditemukan:");
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Hari  : " + jadwal[i][2]);
                System.out.println("Jam   : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);
        tampilSemua(jadwal, n);
        cariHari(jadwal, n);
        cariMataKuliah(jadwal, n);

        sc.close();
}
}