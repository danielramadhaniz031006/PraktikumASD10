package praktikum5;

class Sorting_b_10 {
    int data[];       
    int jumData;      

    Sorting_b_10(int Data[], int jmlData) {
        jumData = jmlData;
        data = new int[jmlData];

        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void selectionSort() {
        for (int i = 0; i < jumData - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < jumData; j++) {
                if (data[j] < data[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = data[minIdx];
            data[minIdx] = data[i];
            data[i] = temp;
        }
    }
    
    void tampil() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}