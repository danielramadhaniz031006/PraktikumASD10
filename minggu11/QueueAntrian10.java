package minggu11;

public class QueueAntrian10 {
    NodeAntrian10 front, rear;
    int size = 0;
    int max = 10;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    void enqueue(MahasiswaAntrian10 data) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }

        NodeAntrian10 baru = new NodeAntrian10(data);

        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }

        size++;
        System.out.println(data.nama + " masuk antrian");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Memanggil : " + front.data.nama);
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
    }

    void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan : ");
            front.data.tampil();
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir : ");
            rear.data.tampil();
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            NodeAntrian10 temp = front;
            System.out.println("Daftar Antrian:");
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }

    void jumlah() {
        System.out.println("Jumlah mahasiswa mengantre : " + size);
    }
}