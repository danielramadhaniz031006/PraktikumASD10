package minggu1;

public class RoyalGarden {

    static int[][] stok = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int[] harga = {75000, 50000, 60000, 10000};

    static int hitungPendapatan(int cabang) {
        int total = 0;
        for (int i = 0; i < stok[cabang].length; i++) {
            total += stok[cabang][i] * harga[i];
        }
        return total;
    }

    static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < stok.length; i++) {

            int pendapatan = hitungPendapatan(i);
            String status = cekStatus(pendapatan);

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println("============================");
        }
}
}