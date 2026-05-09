package minggu11;

public class MahasiswaAntrian10 {
    String nim, nama, jurusan;

    MahasiswaAntrian10(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    void tampil() {
        System.out.println(nim + " | " + nama + " | " + jurusan);
    }
}