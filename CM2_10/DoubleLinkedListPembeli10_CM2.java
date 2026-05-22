package CM2_10;

public class DoubleLinkedListPembeli10_CM2 {

    NodePembeli10_CM2 head;
    NodePembeli10_CM2 tail;

    int nomor = 1;

    public void tambahAntrian(Pembeli10_CM2 p) {

        NodePembeli10_CM2 baru =
                new NodePembeli10_CM2(
                        tail,
                        nomor,
                        p,
                        null);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }

        System.out.println(
                "Antrian berhasil ditambahkan dengan nomor: "
                        + nomor);

        nomor++;
    }

    public void tampil() {

        if (head == null) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");

        System.out.printf("%-15s %-15s %-15s\n",
                "No Antrian",
                "Nama",
                "No HP");

        NodePembeli10_CM2 tmp = head;

        while (tmp != null) {

            System.out.printf("%-15d %-15s %-15s\n",
                    tmp.noAntrian,
                    tmp.data.namaPembeli,
                    tmp.data.noHp);

            tmp = tmp.next;
        }
    }

    public NodePembeli10_CM2 hapusDepan() {

        if (head == null) {
            return null;
        }

        NodePembeli10_CM2 keluar = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return keluar;
    }
}