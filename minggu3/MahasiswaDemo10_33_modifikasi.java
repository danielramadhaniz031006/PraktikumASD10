package minggu3;

import java.util.Scanner;

class Mahasiswa10 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    void cetakInfo() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("-------------------------------");
    }


    public class MahasiswaDemo10_33_modofokasi {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Mahasiswa10[] arrayOfMahasiswa = new Mahasiswa10[3];

            for (int i = 0; i < 3; i++) {
                arrayOfMahasiswa[i] = new Mahasiswa10();

                System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
                System.out.print("NIM   : ");
                arrayOfMahasiswa[i].nim = sc.nextLine();
                System.out.print("Nama  : ");
                arrayOfMahasiswa[i].nama = sc.nextLine();
                System.out.print("Kelas : ");
                arrayOfMahasiswa[i].kelas = sc.nextLine();
                System.out.print("IPK   : ");
                arrayOfMahasiswa[i].ipk = Float.parseFloat(sc.nextLine());
                System.out.println("-------------------------------");
            }

            System.out.println("\n=== DATA MAHASISWA ===");

            for (int i = 0; i < 3; i++) {
                System.out.println("Data Mahasiswa ke-" + (i + 1));
                arrayOfMahasiswa[i].cetakInfo();
            }

}
}