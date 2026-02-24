package minggu2;

public class InstalasiObject {
    public static void main(String[] args) {
        DeklarasiCAM mhs1 = new DeklarasiCAM();

        mhs1.nim = "254107020255";
        mhs1.nama = "Daniel Ramadhani Zulkarnain";
        mhs1.kelas = "TI-1F";
        mhs1.ipk = 3.5;

        System.out.println("=== Informasi Awal ===");
        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("TI-1F");
        mhs1.updateIpk(3.8);

        System.out.println("\n=== Informasi Setelah Update ===");
        mhs1.tampilkanInformasi();
}
}