package minggu2;

public class Latihan1 {
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public Latihan1() {
    }

    public Latihan1(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode MK   : " + kodeMK);
        System.out.println("Nama      : " + nama);
        System.out.println("SKS       : " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("--------------------------");
    }

    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    public void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam bertambah. Total jam sekarang: " + jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
        } else {
            jumlahJam -= jam;
            System.out.println("Jam berkurang. Total jam sekarang: " + jumlahJam);
        }
}
}