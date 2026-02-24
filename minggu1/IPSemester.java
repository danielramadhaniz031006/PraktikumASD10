package minggu1;

import java.util.Scanner;

public class IPSemester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] mk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 3, 2, 3, 2, 2, 2, 2};

        double[] nilaiAngka = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] bobot = new double[8];

        System.out.println("==============================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================================");

        for (int i = 0; i < mk.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                bobot[i] = 4.00;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobot[i] = 3.50;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobot[i] = 3.00;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobot[i] = 2.50;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobot[i] = 2.00;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobot[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobot[i] = 0.00;
            }
        }

        System.out.println("==============================================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("==============================================");
        System.out.printf("%-40s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double total = 0;
        int totalSks = 0;

        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                    mk[i], nilaiAngka[i], nilaiHuruf[i], bobot[i]);

            total += bobot[i] * sks[i];
            totalSks += sks[i];
        }

        double ip = total / totalSks;

        System.out.println("==============================================");
        System.out.printf("IP : %.2f\n", ip);
        System.out.println("==============================================");

        sc.close();
}
}