package minggu14;

public class Mahasiswa10_Praktikum2 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa10_Praktikum2() {

    }

    public Mahasiswa10_Praktikum2(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(
                "NIM: " + nim +
                " Nama: " + nama +
                " Kelas: " + kelas +
                " IPK: " + ipk
        );
    }
}