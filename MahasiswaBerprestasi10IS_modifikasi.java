package praktikum5;

public class MahasiswaBerprestasi10IS_modifikasi {
    Mahasiswa10IS listMhs[] = new Mahasiswa10IS[5];
    int idx;

    void tambah(Mahasiswa10IS m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("---------------------------------------");
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Mahasiswa10IS temp = listMhs[i]; 
            
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}