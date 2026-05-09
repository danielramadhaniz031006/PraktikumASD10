package minggu11;

public class Mahasiswa10_modifikasi {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa10_modifikasi() {
    }

    Mahasiswa10_modifikasi(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.printf("%-15s %-15s %-10s %.1f%n", nama, nim, kelas, ipk);
    }
}