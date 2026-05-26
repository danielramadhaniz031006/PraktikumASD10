package minggu14;

public class BinaryTreeArray10_Praktikum2 {

    Mahasiswa10_Praktikum2[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray10_Praktikum2() {

        dataMahasiswa = new Mahasiswa10_Praktikum2[10];
    }

    void populateData(Mahasiswa10_Praktikum2 dataMhs[], int idxLast) {

        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {

        if (idxStart <= idxLast) {

            if (dataMahasiswa[idxStart] != null) {

                traverseInOrder(2 * idxStart + 1);

                dataMahasiswa[idxStart].tampilInformasi();

                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}