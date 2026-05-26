package minggu14;

public class BinaryTreeArray10_Tugas {

    Mahasiswa10_Tugas[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray10_Tugas() {
        dataMahasiswa = new Mahasiswa10_Tugas[10];
        idxLast = -1;
    }

    public void add(Mahasiswa10_Tugas data) {

        idxLast++;

        if (idxLast < dataMahasiswa.length) {
            dataMahasiswa[idxLast] = data;
        }
    }

    public void traversePreOrder(int idxStart) {

        if (idxStart <= idxLast) {

            if (dataMahasiswa[idxStart] != null) {

                dataMahasiswa[idxStart].tampilInformasi();

                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }


    public static void main(String[] args) {

        BinaryTree10_Tugas bst = new BinaryTree10_Tugas();

        bst.root = bst.addRekursif(
                bst.root,
                new Mahasiswa10_Tugas(
                        "244160121",
                        "Ali",
                        "A",
                        3.57));

        bst.root = bst.addRekursif(
                bst.root,
                new Mahasiswa10_Tugas(
                        "244160221",
                        "Badar",
                        "B",
                        3.85));

        bst.root = bst.addRekursif(
                bst.root,
                new Mahasiswa10_Tugas(
                        "244160185",
                        "Candra",
                        "C",
                        3.21));

        bst.root = bst.addRekursif(
                bst.root,
                new Mahasiswa10_Tugas(
                        "244160220",
                        "Dewi",
                        "B",
                        3.54));

        bst.root = bst.addRekursif(
                bst.root,
                new Mahasiswa10_Tugas(
                        "244160131",
                        "Devi",
                        "A",
                        3.72));

        bst.root = bst.addRekursif(
                bst.root,
                new Mahasiswa10_Tugas(
                        "244160205",
                        "Ehsan",
                        "D",
                        3.37));

        bst.root = bst.addRekursif(
                bst.root,
                new Mahasiswa10_Tugas(
                        "244160170",
                        "Fizi",
                        "B",
                        3.46));

        System.out.println("\nIPK terkecil:");
        bst.cariMinIPK();

        System.out.println("\nIPK terbesar:");
        bst.cariMaxIPK();

        System.out.println("\nMahasiswa dengan IPK di atas 3.50:");
        bst.tampilMahasiswaIPKdiAtas(
                bst.root,
                3.50);

        BinaryTreeArray10_Tugas bta =
                new BinaryTreeArray10_Tugas();

        bta.add(new Mahasiswa10_Tugas(
                "244160121",
                "Ali",
                "A",
                3.57));

        bta.add(new Mahasiswa10_Tugas(
                "244160185",
                "Candra",
                "C",
                3.21));

        bta.add(new Mahasiswa10_Tugas(
                "244160221",
                "Badar",
                "B",
                3.85));

        System.out.println("\nPreOrder Traversal:");

        bta.traversePreOrder(0);
    }
}