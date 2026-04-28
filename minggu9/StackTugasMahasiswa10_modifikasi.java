package minggu9;

public class StackTugasMahasiswa10_modifikasi {
    Mahasiswa10_modifikasi[] stack;
    int top;
    int size;

    public StackTugasMahasiswa10_modifikasi(int size) {
        this.size = size;
        stack = new Mahasiswa10_modifikasi[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa10_modifikasi mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh!, Tidak bisa menambah tugas lagi.");
        }
    }

    public Mahasiswa10_modifikasi pop() {
        if (!isEmpty()) {
            Mahasiswa10_modifikasi m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong!, Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa10_modifikasi peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas.");
            return null;    
        }
    }

    public Mahasiswa10_modifikasi peekBottom() { // jawaban no 4
        if (!isEmpty()) {
            return stack[0]; 
        } else {
            System.out.println("Stack kosong! Tidak ada tugas.");
            return null;
        }
    }

    public int count() { // jawaban no 5
        return top + 1; 
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" 
                + stack[i].nim + "\t" 
                + stack[i].kelas + "\t" 
                + stack[i].nilai);
        }
        System.out.println();
    }
}