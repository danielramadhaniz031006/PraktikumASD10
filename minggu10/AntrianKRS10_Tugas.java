package minggu10;

public class AntrianKRS10_Tugas {
    MahasiswaKRS10_Tugas[] data;
    int front, rear, size, max;
    int sudahDilayani = 0;
    final int MAX_DILAYANI = 30;

    public AntrianKRS10_Tugas(int max) {
        this.max = max;
        data = new MahasiswaKRS10_Tugas[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void tambahAntrian(MahasiswaKRS10_Tugas mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk antrian");
    }

    public void panggil2Mahasiswa() {
        for (int i = 0; i < 2; i++) {
            if (!isEmpty() && sudahDilayani < MAX_DILAYANI) {
                System.out.print("Diproses: ");
                data[front].tampilkanData();
                front = (front + 1) % max;
                size--;
                sudahDilayani++;
            }
        }
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Kosong");
            return;
        }
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void tampil2Depan() {
        for (int i = 0; i < 2 && i < size; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void tampilBelakang() {
        if (!isEmpty()) {
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getSudahDilayani() {
        return sudahDilayani;
    }

    public int getBelumDilayani() {
        return MAX_DILAYANI - sudahDilayani;
    }
}