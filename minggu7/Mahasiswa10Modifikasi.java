package minggu7;
    
public class Mahasiswa10Modifikasi {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa10Modifikasi() {
    }

    public Mahasiswa10Modifikasi(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }
    
    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}