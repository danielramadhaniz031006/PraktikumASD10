package minggu9;

public class StackTugasMahasiswa10_percobaan2 { 
    Mahasiswa10_percobaan2[] stack;
    int top;
    int size;

    public StackTugasMahasiswa10_percobaan2(int size) {
        this.size = size;
        stack = new Mahasiswa10_percobaan2[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa10_percobaan2 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh!, Tidak bisa menambah tugas lagi.");
        }
    }

    public Mahasiswa10_percobaan2 pop() {
        if (!isEmpty()) {
            Mahasiswa10_percobaan2 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong!, Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa10_percobaan2 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas.");
            return null;    
        }
    }

    public Mahasiswa10_percobaan2 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas.");
            return null;
        }
    }

    public int count() {
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

    // =========================
    // percobaan 2 (method baru)
    // =========================
    public String konversiDesimalKeBiner(int nilai) { 
        StackKonversi_percobaan2 stack = new StackKonversi_percobaan2(); 
        
        while (nilai > 0) {
            int sisa = nilai % 2; 
            stack.push(sisa);     
            nilai = nilai / 2;    
        }

        String biner = ""; 

        while (!stack.isEmpty()) {
            biner += stack.pop(); 
        }

        return biner; 
    }
}