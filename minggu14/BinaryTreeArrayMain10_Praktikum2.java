package minggu14;

public class BinaryTreeArrayMain10_Praktikum2 {

    public static void main(String[] args) {

        BinaryTreeArray10_Praktikum2 bta =
                new BinaryTreeArray10_Praktikum2();

        Mahasiswa10_Praktikum2 mhs1 =
                new Mahasiswa10_Praktikum2(
                        "244160121",
                        "Ali",
                        "A",
                        3.57);

        Mahasiswa10_Praktikum2 mhs2 =
                new Mahasiswa10_Praktikum2(
                        "244160185",
                        "Candra",
                        "C",
                        3.41);

        Mahasiswa10_Praktikum2 mhs3 =
                new Mahasiswa10_Praktikum2(
                        "244160221",
                        "Badar",
                        "B",
                        3.75);

        Mahasiswa10_Praktikum2 mhs4 =
                new Mahasiswa10_Praktikum2(
                        "244160220",
                        "Dewi",
                        "B",
                        3.35);

        Mahasiswa10_Praktikum2 mhs5 =
                new Mahasiswa10_Praktikum2(
                        "244160131",
                        "Devi",
                        "A",
                        3.48);

        Mahasiswa10_Praktikum2 mhs6 =
                new Mahasiswa10_Praktikum2(
                        "244160205",
                        "Ehsan",
                        "D",
                        3.61);

        Mahasiswa10_Praktikum2 mhs7 =
                new Mahasiswa10_Praktikum2(
                        "244160170",
                        "Fizi",
                        "B",
                        3.86);

        Mahasiswa10_Praktikum2[] dataMahasiswas = {
                mhs1,
                mhs2,
                mhs3,
                mhs4,
                mhs5,
                mhs6,
                mhs7,
                null,
                null,
                null
        };

        int idxLast = 6;

        bta.populateData(
                dataMahasiswas,
                idxLast);

        System.out.println(
                "\nInorder Traversal Mahasiswa:");

        bta.traverseInOrder(0);

    }
}