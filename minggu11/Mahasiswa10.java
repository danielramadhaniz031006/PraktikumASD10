package minggu11;

public class Mahasiswa10 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa10() {
    }

    Mahasiswa10(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.printf("%-15s %-15s %-10s %.1f%n", nama, nim, kelas, ipk);
    }
}