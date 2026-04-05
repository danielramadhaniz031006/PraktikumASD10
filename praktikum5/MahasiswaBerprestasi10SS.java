package praktikum5;
class MahasiswaBerprestasi10SS {
    Mahasiswa10SS listMhs[] = new Mahasiswa10SS[5];
    int idx;

    void tambah(Mahasiswa10SS m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa10SS m : listMhs) {
            m.tampilInformasi();
            System.out.println("---------------------------------------");
        }
    }

void selectionSort() {
    for (int i = 0; i < listMhs.length - 1; i++) {
        int idxMin = i;

        for (int j = i + 1; j < listMhs.length; j++) {
            if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                idxMin = j;
            }
        }

        Mahasiswa10SS tmp = listMhs[idxMin];
        listMhs[idxMin] = listMhs[i];
        listMhs[i] = tmp;
    }
}
}