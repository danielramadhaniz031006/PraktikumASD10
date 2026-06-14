package minggu15;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class LoopCollection10_Modifikasi {
    public static void main(String[] args) {

        Stack<String> fruits = new Stack<>();

        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");

        // Menampilkan isi stack
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        // Mengubah elemen terakhir menjadi Strawberry
        fruits.set(fruits.size() - 1, "Strawberry");

        System.out.println("\nSetelah elemen terakhir diubah:");
        System.out.println(fruits);

        // Menambahkan 3 elemen baru
        fruits.add("Mango");
        fruits.add("guava");
        fruits.add("avocado");

        System.out.println("\nSebelum sorting:");
        System.out.println(fruits);

        // Sorting
        Collections.sort(fruits);

        System.out.println("\nSetelah sorting:");
        System.out.println(fruits);

        // Iterator
        System.out.println("\nMenggunakan Iterator:");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }

        // Stream
        System.out.println("\n\nMenggunakan Stream:");
        fruits.stream().forEach(e -> System.out.printf("%s ", e));

        // For biasa
        System.out.println("\n\nMenggunakan For Index:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}