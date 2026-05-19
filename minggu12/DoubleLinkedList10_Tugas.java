package minggu12;

public class DoubleLinkedList10_Tugas {

    Node10_Tugas head;
    Node10_Tugas tail;
    int size;

    public DoubleLinkedList10_Tugas() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa10_Tugas data) {
        Node10_Tugas newNode = new Node10_Tugas(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa10_Tugas data) {
        Node10_Tugas newNode = new Node10_Tugas(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa10_Tugas data) {
        Node10_Tugas current = head;

        while (current != null &&
                !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }

        Node10_Tugas newNode =
                new Node10_Tugas(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        size++;
    }

    // Nomor 1
    public void add(int index,
                    Mahasiswa10_Tugas data) {

        if (index < 0 || index > size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node10_Tugas current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        Node10_Tugas newNode =
                new Node10_Tugas(data);

        newNode.next = current.next;
        newNode.prev = current;

        current.next.prev = newNode;
        current.next = newNode;

        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println(
                    "Linked List kosong.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println(
                    "Linked List kosong.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
    }

    // Nomor 2
    public void removeAfter(String keyNim) {

        Node10_Tugas current = head;

        while (current != null &&
                !current.data.nim.equals(keyNim)) {

            current = current.next;
        }

        if (current == null ||
                current.next == null) {

            System.out.println(
                    "Data tidak ditemukan");
            return;
        }

        Node10_Tugas hapus =
                current.next;

        current.next = hapus.next;

        if (hapus == tail) {
            tail = current;
        } else {
            hapus.next.prev =
                    current;
        }

        size--;
    }

    // Nomor 3
    public void remove(int index) {

        if (index < 0 ||
                index >= size) {

            System.out.println(
                    "Index tidak valid");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size - 1) {
            removeLast();
            return;
        }

        Node10_Tugas current =
                head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.prev.next =
                current.next;

        current.next.prev =
                current.prev;

        size--;
    }

    // Nomor 4a
    public void getFirst() {

        if (isEmpty()) {
            System.out.println(
                    "Linked List kosong");
            return;
        }

        head.data.tampil();
    }

    // Nomor 4b
    public void getLast() {

        if (isEmpty()) {
            System.out.println(
                    "Linked List kosong");
            return;
        }

        tail.data.tampil();
    }

    // Nomor 4c
    public void getIndex(int index) {

        if (index < 0 ||
                index >= size) {

            System.out.println(
                    "Index tidak valid");
            return;
        }

        Node10_Tugas current =
                head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.data.tampil();
    }

    // Nomor 5
    public int size() {
        return size;
    }

    public void print() {

        if (isEmpty()) {
            System.out.println(
                    "Linked List masih kosong.");
            return;
        }

        Node10_Tugas current =
                head;

        while (current != null) {
            current.data.tampil();
            System.out.println(
                    "---------------");

            current =
                    current.next;
        }
    }
}