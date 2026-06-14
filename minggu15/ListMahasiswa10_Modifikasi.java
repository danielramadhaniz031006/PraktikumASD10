package minggu15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMahasiswa10_Modifikasi {

    List<Mahasiswa10_Modifikasi> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa10_Modifikasi... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa10_Modifikasi mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.forEach(mhs -> {
            System.out.println(mhs);
        });
    }

    // Binary Search
    public int binarySearch(String nim) {
        Collections.sort(mahasiswas);

        Mahasiswa10_Modifikasi key =
                new Mahasiswa10_Modifikasi(nim, "", "");

        return Collections.binarySearch(mahasiswas, key);
    }

    // Sorting Ascending
    public void sortAscending() {
        Collections.sort(mahasiswas);
    }

    // Sorting Descending
    public void sortDescending() {
        Collections.sort(mahasiswas, Collections.reverseOrder());
    }

    public static void main(String[] args) {

        ListMahasiswa10_Modifikasi lm =
                new ListMahasiswa10_Modifikasi();

        Mahasiswa10_Modifikasi m =
                new Mahasiswa10_Modifikasi(
                        "201234",
                        "Noureen",
                        "021xx1");

        Mahasiswa10_Modifikasi m1 =
                new Mahasiswa10_Modifikasi(
                        "201235",
                        "Akhleema",
                        "021xx2");

        Mahasiswa10_Modifikasi m2 =
                new Mahasiswa10_Modifikasi(
                        "201236",
                        "Shannum",
                        "021xx3");

        lm.tambah(m, m1, m2);

        System.out.println("Data Awal");
        lm.tampil();

        int index = lm.binarySearch("201235");

        lm.update(index,
                new Mahasiswa10_Modifikasi(
                        "201235",
                        "Akhleema Lela",
                        "021xx2"));

        System.out.println("\nSetelah Update (Binary Search)");
        lm.tampil();

        System.out.println("\nSorting Ascending");
        lm.sortAscending();
        lm.tampil();

        System.out.println("\nSorting Descending");
        lm.sortDescending();
        lm.tampil();
    }
}