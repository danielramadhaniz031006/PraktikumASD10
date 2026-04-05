package praktikum5;

public class SortingMain_b_10 {
    public static void main(String[] args) {
        int b[] = {30, 20, 2, 8, 14};
        Sorting_b_10 dataurut2 = new Sorting_b_10(b, b.length);
        
        System.out.println("\nData Awal:");
        dataurut2.tampil();
        
        dataurut2.selectionSort();
        
        System.out.println("Data Setelah Selection Sort:");
        dataurut2.tampil();
    } 
} 