package minggu1;

import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===========================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = input.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = input.nextDouble();

        System.out.println("================================");
        System.out.println("================================");

        // Validasi Nilai
        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("nilai tidak valid");
            System.out.println("================================");
            System.out.println("================================");
            return;
        }

        double nilaiAkhir = (0.2 * tugas) +
                            (0.2 * kuis) +
                            (0.3 * uts) +
                            (0.4 * uas);

        String huruf;

        if (nilaiAkhir >= 85) huruf = "A";
        else if (nilaiAkhir >= 80) huruf = "B+";
        else if (nilaiAkhir >= 75) huruf = "B";
        else if (nilaiAkhir >= 70) huruf = "C+";
        else if (nilaiAkhir >= 60) huruf = "C";
        else if (nilaiAkhir >= 50) huruf = "D";
        else huruf = "E";

        System.out.println("nilai akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + huruf);

        System.out.println("================================");
        System.out.println("================================");

        if (huruf.equals("A") || huruf.equals("B+") || huruf.equals("B")
                || huruf.equals("C+") || huruf.equals("C")) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA TIDAK LULUS");
        }

        input.close();
}
}