package minggu11;

public class SingleLinkedList10_praktikum2 {
    NodeMahasiswa10_praktikum2 head;
    NodeMahasiswa10_praktikum2 tail;

    boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa10_praktikum2 tmp = head;
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

    public void addFirst(Mahasiswa10_praktikum2 input) {
        NodeMahasiswa10_praktikum2 ndInput = new NodeMahasiswa10_praktikum2(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa10_praktikum2 input) {
        NodeMahasiswa10_praktikum2 ndInput = new NodeMahasiswa10_praktikum2(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAt(int index, Mahasiswa10_praktikum2 input) {
        if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa10_praktikum2 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa10_praktikum2(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void getData(int index) {
        NodeMahasiswa10_praktikum2 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        NodeMahasiswa10_praktikum2 tmp = head;
        int index = 0;

        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa10_praktikum2 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa10_praktikum2 temp = head;

            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    removeFirst();
                    break;
                } else if (temp.next != null &&
                        temp.next.data.nama.equalsIgnoreCase(key)) {

                    temp.next = temp.next.next;

                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa10_praktikum2 temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}