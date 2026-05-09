package minggu11;

public class SLLMain10_praktikum2 {
    public static void main(String[] args) {

        SingleLinkedList10_praktikum2 sll =
                new SingleLinkedList10_praktikum2();

        Mahasiswa10_praktikum2 mhs1 =
                new Mahasiswa10_praktikum2("21212203", "Dirga", "4D", 3.6);

        Mahasiswa10_praktikum2 mhs2 =
                new Mahasiswa10_praktikum2("24212200", "Alvaro", "1A", 4.0);

        Mahasiswa10_praktikum2 mhs3 =
                new Mahasiswa10_praktikum2("23212201", "Bimon", "2B", 3.8);

        Mahasiswa10_praktikum2 mhs4 =
                new Mahasiswa10_praktikum2("22212202", "Cintia", "3C", 3.5);

        sll.addFirst(mhs1);
        sll.addLast(mhs2);
        sll.insertAt(1, mhs4);
        sll.insertAt(2, mhs3);

        System.out.println("data index 1 :");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : "
                + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}