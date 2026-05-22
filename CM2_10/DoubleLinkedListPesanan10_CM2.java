package CM2_10;

public class DoubleLinkedListPesanan10_CM2 {

    NodePesanan10_CM2 head;
    NodePesanan10_CM2 tail;

    public void tambah(Pesanan10_CM2 p) {

        NodePesanan10_CM2 baru =
                new NodePesanan10_CM2(
                        tail,
                        p,
                        null);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }

    public void sortingNama() {

        if (head == null) return;

        boolean tukar;

        do {

            tukar = false;

            NodePesanan10_CM2 current = head;

            while (current.next != null) {

                if (current.data.namaPesanan
                        .compareToIgnoreCase(
                                current.next.data.namaPesanan) > 0) {

                    Pesanan10_CM2 temp =
                            current.data;

                    current.data =
                            current.next.data;

                    current.next.data =
                            temp;

                    tukar = true;
                }

                current = current.next;
            }

        } while (tukar);
    }

    public void tampilLaporan() {

        sortingNama();

        int total = 0;

        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");

        System.out.printf(
                "%-10s %-20s %-10s\n",
                "Kode",
                "Nama Pesanan",
                "Harga");

        NodePesanan10_CM2 tmp = head;

        while (tmp != null) {

            System.out.printf(
                    "%-10d %-20s %-10d\n",
                    tmp.data.kodePesanan,
                    tmp.data.namaPesanan,
                    tmp.data.harga);


            tmp = tmp.next;
        }
    }
}