package minggu2;

public class DeklarasiCAM {

    String nim;
    String nama;
    String kelas;
    double ipk;

    public void tampilkanInformasi() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
        System.out.println("Kinerja : " + nilaiKinerja(ipk));
        System.out.println("--------------------------");
    }

    public void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    public void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
            System.out.println("IPK berhasil diupdate menjadi: " + ipk);
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    public String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Baik";
        } else if (ipk >= 2.0) {
            return "Cukup";
        } else {
            return "Kurang";
        }
}
}