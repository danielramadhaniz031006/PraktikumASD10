package praktikum5;

public class SortingMain_c_10 {
    public static void main(String[] args) {
       
        int c[] = {40, 10, 4, 9, 3};
        
        Sorting_c_10 dataurut3 = new Sorting_c_10(c, c.length);
        
        System.out.println("\nData Awal:");
        dataurut3.tampil();
        
        dataurut3.insertionSort();
        
        System.out.println("Data Setelah Insertion Sort:");
        dataurut3.tampil();
    }
}