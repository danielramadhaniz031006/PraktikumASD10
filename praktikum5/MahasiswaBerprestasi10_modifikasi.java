package praktikum5;

class MahasiswaBerprestasi10_modifikasi {
    Mahasiswa10_modifikasi listMhs[] = new Mahasiswa10_modifikasi[5];
    int idx;

    void tambah(Mahasiswa10_modifikasi m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa10_modifikasi m : listMhs) {
            m.tampilInformasi();
            System.out.println("---------------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa10_modifikasi tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
}