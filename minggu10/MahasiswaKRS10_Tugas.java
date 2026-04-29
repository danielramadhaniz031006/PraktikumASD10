package minggu10;

public class MahasiswaKRS10_Tugas {
    String nim, nama, prodi, kelas;

    public MahasiswaKRS10_Tugas(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + "-" + nama + "-" + prodi + "-" + kelas);
    }
}