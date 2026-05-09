package minggu11;

public class SingleLinkedList10_modifikasi {
    NodeMahasiswa10_modifikasi head;
    NodeMahasiswa10_modifikasi tail;

    boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa10_modifikasi tmp = head;
            System.out.println("Isi Linked List :");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void addFirst(Mahasiswa10_modifikasi input) {
        NodeMahasiswa10_modifikasi ndInput = new NodeMahasiswa10_modifikasi(input, null);

        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
}