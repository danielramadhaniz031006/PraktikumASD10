package CM10;

public class Buku {
    private String kodeBuku;
    private String judul;
    private int    tahunTerbit;

    public Buku(String kode, String judul, int tahun) {
        this.kodeBuku    = kode;
        this.judul       = judul;
        this.tahunTerbit = tahun;
    }

    public String getKodeBuku()    { return kodeBuku; }
    public String getJudul()       { return judul; }
    public int    getTahunTerbit() { return tahunTerbit; }

    public void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}
