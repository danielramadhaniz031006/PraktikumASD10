package CM2_10;

import java.util.Scanner;

public class MainRoyalDelish10_CM2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoubleLinkedListPembeli10_CM2 antrian =
                new DoubleLinkedListPembeli10_CM2();

        DoubleLinkedListPesanan10_CM2 pesanan =
                new DoubleLinkedListPesanan10_CM2();

        int pilih;

        do {
            System.out.println("==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");

            System.out.println(
            "1. Tambah Antrian");

            System.out.println(
            "2. Cetak Antrian");

            System.out.println(
            "3. Hapus Antrian dan Pesan");

            System.out.println(
            "4. Laporan Pesanan");

            System.out.println(
            "0. Keluar");

            System.out.print(
            "Pilih menu : ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print(
                    "Nama Pembeli : ");

                    String nama =
                            sc.nextLine();

                    System.out.print(
                    "No HP        : ");

                    String hp =
                            sc.nextLine();

                    Pembeli10_CM2 p =
                            new Pembeli10_CM2(
                                    nama, hp);

                    antrian.tambahAntrian(p);

                    break;

                case 2:

                    antrian.tampil();

                    break;

                case 3:

                    NodePembeli10_CM2 pembeli =
                            antrian.hapusDepan();

                    if (pembeli == null) {

                        System.out.println(
                        "Antrian kosong");

                    } else {

                        System.out.print(
                        "Kode Pesanan   : ");

                        int kode =
                                sc.nextInt();

                        sc.nextLine();

                        System.out.print(
                        "Nama Pesanan   : ");

                        String namaPesanan =
                                sc.nextLine();

                        System.out.print(
                        "Harga          : ");

                        int harga =
                                sc.nextInt();

                        Pesanan10_CM2 ps =
                                new Pesanan10_CM2(
                                        kode,
                                        namaPesanan,
                                        harga);

                        pesanan.tambah(ps);

                        System.out.println(
                        pembeli.data.namaPembeli
                        + " telah memesan "
                        + namaPesanan);
                    }

                    break;

                case 4:

                    pesanan.tampilLaporan();

                    break;

                case 0:

                    System.out.println(
                    "Program selesai");

                    break;

                default:

                    System.out.println(
                    "Menu tidak tersedia");
            }

        } while (pilih != 0);

    }
}