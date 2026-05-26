|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020255 |
| Nama | Daniel Ramadhani Zulkarnain |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/danielramadhaniz031006/PraktikumASD10/tree/43ef1911bf4083aa84d871067fa9ca76e76a2f6d/minggu12) |


Hasil Praktikum 1 :

<img width="139" height="232" alt="image" src="https://github.com/user-attachments/assets/2048f7ef-a658-48a7-a7df-ff72cffa23a6" />


<img width="132" height="149" alt="image" src="https://github.com/user-attachments/assets/d6b23ffd-8223-4a28-9093-2527609f592a" />


Jawaban 12.2.3
1. Perbedaannya :
   - Single Linked List lebih hemat memori karena hanya memiliki satu pointer.
   - Double Linked List membutuhkan memori lebih besar karena memiliki dua pointer, tetapi lebih fleksibel untuk proses
     penyisipan dan penghapusan node.
2. Fungsinya :
   - next digunakan untuk menyimpan alamat node berikutnya. Fungsinya saat traversal maju dari head menuju tail.
   - prev digunakan untuk menyimpan alamat node sebelumnya. Fungsinya saat traversal mundur dari tail menuju head.
3. Fungsinya adalah menginisialisasi linked list dalam keadaan kosong. Nilai head dan tail dibuat null karena belum ada node    yang tersimpan pada linked list.
4. Karena saat linked list kosong dan node pertama ditambahkan, node tersebut menjadi satu-satunya node dalam linked list.
   Oleh karena itu:
   - head harus menunjuk node pertama.
   - tail juga harus menunjuk node terakhir.
   Karena hanya ada satu node, maka node pertama dan terakhir adalah node yang sama.
5. Hasil :


   <img width="116" height="91" alt="image" src="https://github.com/user-attachments/assets/be298158-b744-4683-93a9-f938ae174fa5" />


6. Hasil :


   <img width="122" height="349" alt="image" src="https://github.com/user-attachments/assets/89789fa1-9b58-4817-a594-d79dc6f790f2" />

         
Hasil Praktikum 2 :

<img width="188" height="265" alt="image" src="https://github.com/user-attachments/assets/9fbfcfe0-330f-4cf6-a0ea-1f9df9437015" />


Jawaban 12.3.3
1. fungsi statement penghapusan node :
   - head = head.next;
     Berfungsi untuk memindahkan head ke node berikutnya setelah node pertama dihapus. Dengan demikian, node kedua akan
     menjadi node pertama yang baru pada linked list.
   - head.prev = null;
     Berfungsi untuk menghapus hubungan node baru dengan node sebelumnya. Karena head sekarang menjadi node pertama, maka
     node tersebut tidak boleh memiliki node sebelumnya (prev harus bernilai null).
2. Hasil :

   
   <img width="186" height="268" alt="image" src="https://github.com/user-attachments/assets/2ea3b03c-5192-4829-b767-6ca201b6e895" />


Hasil Tugas 12.5 :

<img width="101" height="272" alt="image" src="https://github.com/user-attachments/assets/99e0b02d-f8f5-4d9a-899a-47cce53bae74" />
