|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020255 |
| Nama | Daniel Ramadhani Zulkarnain |
| Kelas | TI - 1F |
| Repository | [link] () |


* Hasil Praktikum 1 :
<img width="386" height="124" alt="image" src="https://github.com/user-attachments/assets/c9321015-162c-44b9-9cec-073fc6a812e1" />

Jawaban Untuk Pertanyaan 16.2.3
1. Karena ArrayList dibuat tanpa menggunakan generic type:
   **List l = new ArrayList();**
   Akibatnya ArrayList tersebut bertipe Object, sehingga dapat menyimpan berbagai jenis data seperti Integer, String, dan
   tipe data lainnya dalam satu collection

   
2, 3, 4,

<img width="337" height="129" alt="image" src="https://github.com/user-attachments/assets/5bed93bf-ab59-4f21-974c-b03990cc5d6b" />


5. dapat dijelaskan bahwa method push() pada LinkedList menambahkan elemen baru di bagian awal (head) list. Oleh karena itu,    elemen "Mei-mei" yang ditambahkan menjadi elemen pertama dalam LinkedList.

   Method getFirst() digunakan untuk mengambil elemen pertama, sedangkan getLast() digunakan untuk mengambil elemen
   terakhir. Setelah penambahan "Mei-mei", jumlah elemen bertambah dari 5 menjadi 6, tetapi elemen terakhir tetap "Al-Qarni".

   Sebelum push():
   [My kid, Akhleema, Shannum, Uwais, Al-Qarni]

   Sesudah push("Mei-mei"):
   [Mei-mei, My kid, Akhleema, Shannum, Uwais, Al-Qarni]


* Hasil Praktikum 2 :
<img width="389" height="103" alt="image" src="https://github.com/user-attachments/assets/bac6bc2d-773b-435a-b2af-d0add95ac5ea" />

Jawaban Untuk Pertanyaan 16.3.3
1. push() digunakan untuk menambahkan elemen ke puncak/top stack sehingga sesuai konsep LIFO.
    add() adalah method umum dari List/Vector untuk menambahkan elemen ke akhir list.
    Pada Stack, keduanya bisa terlihat menambah ke bagian akhir, tetapi push() lebih spesifik untuk operasi stack
2. Baris 43–44 menambahkan "Melon" dan "Durian" setelah stack dikosongkan oleh while (!fruits.empty()).
    Jika baris itu dihapus, maka setelah stack habis dipop, isi fruits tetap kosong. Akibatnya, bagian iterator(), stream(),     dan for biasa tidak menampilkan apa pun karena tidak ada elemen yang bisa diproses.
3. Baris tersebut memakai Iterator untuk menelusuri isi Stack satu per satu.
    Alurnya:
    - fruits.iterator() membuat objek iterator
    - it.hasNext() mengecek apakah masih ada elemen
    - it.next() mengambil elemen berikutnya
    - System.out.printf() menampilkan elemen tersebut
    Jadi, fungsinya adalah menampilkan isi collection dengan iterator.
4. Jika hanya deklarasinya yang diubah menjadi:
    **List<String> fruits = new Stack<>();**

    maka objek Stack tetap bisa dibuat karena Stack merupakan turunan dari List.
    Tetapi method khusus Stack seperti push(), pop(), dan empty() tidak bisa dipanggil lewat reference List, sehingga
    program akan error pada baris yang memakai method tersebut.
    Hal ini terjadi karena tipe referensi-nya List, bukan Stack.
5, 6.
<img width="334" height="242" alt="image" src="https://github.com/user-attachments/assets/b857b923-5098-47c6-886f-e3e84fdba836" />


* Hasil Praktikum 3 :
<img width="323" height="121" alt="image" src="https://github.com/user-attachments/assets/a61086d6-b2aa-4e60-ad86-92be2ecdd5e1" />

Jawaban Untuk Pertanyaan 16.4.3
1. Fungsi tambah() menggunakan konsep Varargs (Variable Arguments), yaitu fitur Java yang memungkinkan sebuah method
   menerima jumlah argumen yang tidak terbatas dengan tipe data yang sama.
    Contoh:
    **public void tambah(Mahasiswa10... mahasiswa)**

    Kelebihan:
    - Dapat menerima banyak objek sekaligus.
    - Kode lebih ringkas dan fleksibel.
    - Tidak perlu membuat array secara manual.
    - Memudahkan pemanggilan method dengan jumlah parameter yang berbeda-beda.
  
2, 3.
<img width="330" height="241" alt="image" src="https://github.com/user-attachments/assets/6d461cbc-22a7-4083-9efd-be94f369a0aa" />



* Hasil Tugas 16.5 :
  - Menu Awal dan Penambahan Data
    



