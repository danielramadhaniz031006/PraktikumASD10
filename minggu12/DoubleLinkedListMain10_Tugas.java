package minggu12;

import java.util.Scanner;

public class DoubleLinkedListMain10_Tugas {

    public static Mahasiswa10_Tugas inputMahasiswa(Scanner scan) {

        System.out.print("Masukkan NIM : ");
        String nim = scan.nextLine();

        System.out.print("Masukkan Nama : ");
        String nama = scan.nextLine();

        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();

        System.out.print("Masukkan IPK : ");
        double ipk = scan.nextDouble();
        scan.nextLine();

        return new Mahasiswa10_Tugas(
                nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        DoubleLinkedList10_Tugas list =
                new DoubleLinkedList10_Tugas();

        list.addLast(
                new Mahasiswa10_Tugas(
                        "123001",
                        "Harry",
                        "1A",
                        3.76));

        list.addLast(
                new Mahasiswa10_Tugas(
                        "123002",
                        "Potter",
                        "1B",
                        3.55));

        list.print();

        System.out.println(
                "\nJumlah data : "
                        + list.size());

        System.out.println(
                "\nData pertama");
        list.getFirst();

        System.out.println(
                "\nData terakhir");
        list.getLast();

        System.out.println(
                "\nData index ke-1");
        list.getIndex(1);

    }
}