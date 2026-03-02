package minggu3;

import java.util.Scanner;

public class DosenDemo10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Dosen10[] arrayOfDosen = new Dosen10[3];

        for (int i = 0; i < 3; i++) {

            System.out.println("Masukkan Data Dosen ke-" + (i+1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine();
            Boolean jenisKelamin = jk.equalsIgnoreCase("Pria");

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen10(kode, nama, jenisKelamin, usia);

            System.out.println("-------------------------------------");
        }

        DataDosen10 data = new DataDosen10();

        data.dataSemuaDosen(arrayOfDosen);
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        data.infoDosenPalingTua(arrayOfDosen);
        data.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
}
}