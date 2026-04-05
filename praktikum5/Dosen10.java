package praktikum5;

public class Dosen10 {
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    public Dosen10(String kode, String nama, boolean jk, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jk;
        this.usia = usia;
    }

    public void tampil() {
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia           : " + usia);
        System.out.println("-----------------------------------");
    }
}