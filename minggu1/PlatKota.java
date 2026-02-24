package minggu1;

import java.util.Scanner;

public class PlatKota {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] KODE = {'A','B','D','E','F','G','H','L','N','T'};

        String[][] KOTA = {
                {"BANTEN"},
                {"JAKARTA"},
                {"BANDUNG"},
                {"CIREBON"},
                {"BOGOR"},
                {"PEKALONGAN"},
                {"SEMARANG"},
                {"SURABAYA"},
                {"MALANG"},
                {"TEGAL"}
        };

        System.out.print("Masukkan kode plat: ");
        char input = sc.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        for (int i = 0; i < KODE.length; i++) {
            if (input == KODE[i]) {
                System.out.println("Kota: " + KOTA[i][0]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode tidak ditemukan.");
        }

        sc.close();
}
}