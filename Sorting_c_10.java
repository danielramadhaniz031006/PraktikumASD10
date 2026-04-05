package praktikum5;

class Sorting_c_10 {
    int data[];       
    int jumData;      

    Sorting_c_10(int Data[], int jmlData) {
        jumData = jmlData;
        data = new int[jmlData];

        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void insertionSort() {
        for (int i = 1; i < jumData; i++) {
            int temp = data[i];
            int j = i;
            while (j > 0 && data[j - 1] > temp) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
    }

    
    void tampil() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}