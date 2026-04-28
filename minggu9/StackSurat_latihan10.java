package minggu9;

public class StackSurat_latihan10 {
    Surat_latihan10[] stack;
    int top;
    int size;

    public StackSurat_latihan10(int size) {
        this.size = size;
        stack = new Surat_latihan10[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat_latihan10 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Surat tidak bisa ditambahkan.");
        }
    }

    public Surat_latihan10 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }

    public Surat_latihan10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}