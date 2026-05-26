package minggu14;

public class BinaryTree10_Tugas {

    Node10_Tugas root;

    public BinaryTree10_Tugas() {
        root = null;
    }

    public Node10_Tugas addRekursif(Node10_Tugas current,
                                     Mahasiswa10_Tugas mahasiswa) {

        if (current == null) {
            return new Node10_Tugas(mahasiswa);
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left =
                    addRekursif(current.left, mahasiswa);
        }

        else {
            current.right =
                    addRekursif(current.right, mahasiswa);
        }

        return current;
    }

    public void cariMinIPK() {

        Node10_Tugas current = root;

        while (current.left != null) {
            current = current.left;
        }

        System.out.println("IPK terkecil:");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {

        Node10_Tugas current = root;

        while (current.right != null) {
            current = current.right;
        }

        System.out.println("IPK terbesar:");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(
            Node10_Tugas node,
            double ipkBatas) {

        if (node != null) {

            tampilMahasiswaIPKdiAtas(
                    node.left,
                    ipkBatas);

            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }

            tampilMahasiswaIPKdiAtas(
                    node.right,
                    ipkBatas);
        }
    }
}