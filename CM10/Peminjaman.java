package CM10;

public class Peminjaman {
    private Mahasiswa mhs;
    private Buku      buku;
    private int       lamaPinjam;
    private int       batasPinjam = 5;
    private int       terlambat;
    private int       denda;

    public Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs        = mhs;
        this.buku       = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda     = terlambat * 2000;
        } else {
            terlambat = 0;
            denda     = 0;
        }
    }

    public Mahasiswa getMhs()   { return mhs; }
    public Buku      getBuku()  { return buku; }
    public int       getDenda() { return denda; }

    public void tampilPeminjaman() {
        System.out.println(
            mhs.getNama() + " | " + buku.getJudul() +
            " | Lama: " + lamaPinjam +
            " | Terlambat: " + terlambat +
            " | Denda: " + denda
        );
    }
}
