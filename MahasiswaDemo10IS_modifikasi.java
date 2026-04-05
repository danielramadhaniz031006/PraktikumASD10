package praktikum5;

public class MahasiswaDemo10IS_modifikasi {
    public static void main(String[] args) {
        MahasiswaBerprestasi10IS_modifikasi list = new MahasiswaBerprestasi10IS_modifikasi();

        list.tambah(new Mahasiswa10IS("123", "Zidan", "2A", 3.2));
        list.tambah(new Mahasiswa10IS("124", "Ayu", "2A", 3.5));
        list.tambah(new Mahasiswa10IS("125", "Sofi", "2A", 3.1));
        list.tambah(new Mahasiswa10IS("126", "Sita", "2A", 3.9));
        list.tambah(new Mahasiswa10IS("127", "Miki", "2A", 3.7));

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah di sorting bedasarkan IPK (DESC) : ");
        list.insertionSort();
        list.tampil();
    }
}