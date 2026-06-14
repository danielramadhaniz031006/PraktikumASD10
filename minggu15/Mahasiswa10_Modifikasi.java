package minggu15;

public class Mahasiswa10_Modifikasi implements Comparable<Mahasiswa10_Modifikasi> {

    String nim;
    String nama;
    String notelp;

    public Mahasiswa10_Modifikasi() {
    }

    public Mahasiswa10_Modifikasi(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{"
                + "nim=" + nim
                + ", nama=" + nama
                + ", notelp=" + notelp
                + '}';
    }

    @Override
    public int compareTo(Mahasiswa10_Modifikasi o) {
        return this.nim.compareTo(o.nim);
    }
}