package minggu7;
    
    public class MahasiswaBS10 {
        String nim;
        String nama;
        String kelas;
        double ipk;

    public MahasiswaBS10() {
    }

    public MahasiswaBS10(String nm, String name, String kls, double ip) {
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