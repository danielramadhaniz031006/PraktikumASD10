package minggu11;

import java.util.Scanner;

public class SLLMain10_modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList10_modifikasi sll = new SingleLinkedList10_modifikasi();

        System.out.print("NIM   : ");
        String nim = sc.nextLine();

        System.out.print("Nama  : ");
        String nama = sc.nextLine();

        System.out.print("Kelas : ");
        String kelas = sc.nextLine();

        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();

        Mahasiswa10_modifikasi mhs = new Mahasiswa10_modifikasi(nim, nama, kelas, ipk);

        sll.addFirst(mhs);
        sll.print();
    }
}