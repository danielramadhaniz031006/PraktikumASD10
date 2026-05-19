package minggu12;

public class DoubleLinkedList10_Praktikum2 {
    Node10_Praktikum2 head;
    Node10_Praktikum2 tail;

    public DoubleLinkedList10_Praktikum2() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa10_Praktikum2 data) {
        Node10_Praktikum2 newNode = new Node10_Praktikum2(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa10_Praktikum2 data) {
        Node10_Praktikum2 newNode = new Node10_Praktikum2(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa10_Praktikum2 data) {
        Node10_Praktikum2 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node10_Praktikum2 newNode = new Node10_Praktikum2(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    // Percobaan 2
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        System.out.println("Data berhasil dihapus.");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Percobaan 2
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        System.out.println("Data berhasil dihapus.");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node10_Praktikum2 current = head;

        while (current != null) {
            current.data.tampil();
            System.out.println("------------------");
            current = current.next;
        }
    }
}   