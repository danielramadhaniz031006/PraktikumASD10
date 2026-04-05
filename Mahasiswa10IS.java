package praktikum5;

public class Mahasiswa10IS {
        String nim;
        String nama;
        String kelas;
        double ipk;

    public Mahasiswa10IS() {
    }

    public Mahasiswa10IS(String nm, String name, String kls, double ip) {
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