|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020255 |
| Nama | Daniel Ramadhani Zulkarnain |
| Kelas | TI - 1F |
| Repository | [link] () |


Hasil Praktikum 1 :


<img width="515" height="765" alt="image" src="https://github.com/user-attachments/assets/9802639c-2d6c-479e-b4ad-467942762cf7" />


14.2.2 Jawaban Percobaan 
1. Proses pencarian pada Binary Search Tree (BST) lebih efektif dibandingkan Binary Tree biasa karena BST memiliki aturan penyimpanan data yang terstruktur, yaitu nilai yang lebih kecil dari parent diletakkan di sebelah kiri dan nilai yang lebih besar diletakkan di sebelah kanan. Dengan aturan tersebut, ketika mencari data program tidak perlu memeriksa seluruh node satu per satu, melainkan hanya mengikuti jalur tertentu sesuai hasil perbandingan data yang dicari. Sedangkan pada Binary Tree biasa tidak terdapat aturan seperti itu sehingga pencarian sering kali harus memeriksa semua node yang ada. Oleh karena itu, pencarian pada BST lebih cepat dan lebih efisien.

2. Atribut left dan right pada class Node digunakan untuk menyimpan hubungan antara satu node dengan node lainnya di dalam tree. Atribut left berfungsi untuk menunjuk node anak kiri, sedangkan atribut right berfungsi untuk menunjuk node anak kanan. Dengan adanya kedua atribut tersebut, setiap node dapat saling terhubung sehingga membentuk struktur Binary Tree atau Binary Search Tree. Tanpa atribut left dan right, node tidak akan memiliki hubungan dengan node lainnya sehingga struktur tree tidak dapat dibentuk.

3. Jabawan 
   3a. Atribut root pada class BinaryTree digunakan sebagai titik awal atau akar dari sebuah tree. Seluruh proses yang              dilakukan pada tree seperti penambahan data, pencarian data, traversal, maupun penghapusan data selalu dimulai dari          root. Root juga berfungsi sebagai penghubung utama untuk mengakses seluruh node yang terdapat di dalam tree. Oleh            karena itu, atribut root memiliki peran yang sangat penting dalam struktur Binary Tree. 

   3b. Ketika objek BinaryTree pertama kali dibuat, nilai dari root adalah null. Hal ini menunjukkan bahwa tree masih kosong        dan belum memiliki node sama sekali. Nilai null digunakan sebagai tanda bahwa belum ada data yang dimasukkan ke dalam        tree. Setelah node pertama ditambahkan, node tersebut akan langsung menjadi root.

4. Ketika tree masih dalam keadaan kosong dan sebuah node baru akan ditambahkan, program akan melakukan pengecekan menggunakan method isEmpty(). Jika hasilnya menunjukkan bahwa tree kosong, maka node baru tersebut akan langsung dimasukkan dan dijadikan sebagai root. Hal ini terjadi karena pada kondisi tree kosong belum ada node lain yang dapat dijadikan parent ataupun child. Dengan demikian node pertama yang ditambahkan akan menjadi akar utama dari tree.

5. Potongan program pada method add() digunakan untuk menentukan posisi node baru yang akan dimasukkan ke dalam Binary Search Tree sesuai aturan BST. Pada bagian parent = current, program menyimpan node saat ini sebagai parent sebelum berpindah ke node berikutnya. Selanjutnya program membandingkan nilai IPK mahasiswa baru dengan IPK pada node saat ini. Jika nilai IPK lebih kecil, maka program akan bergerak ke node sebelah kiri dengan perintah current = current.left. Apabila posisi kiri masih kosong (current == null), maka node baru akan ditempatkan pada parent.left. Sebaliknya jika nilai IPK lebih besar atau sama, program akan bergerak ke node kanan menggunakan current = current.right. Jika posisi kanan kosong, node baru akan diletakkan pada parent.right. Proses ini dilakukan berulang sampai ditemukan posisi kosong yang sesuai sehingga susunan BST tetap terjaga.

6. Ketika method delete() menghapus sebuah node yang memiliki dua anak, proses penghapusan dilakukan dengan mencari node pengganti terlebih dahulu agar struktur BST tetap benar. Langkah pertama adalah mencari node yang akan dihapus. Setelah node ditemukan, program akan memanggil method getSuccessor() untuk mencari successor. Successor merupakan node dengan nilai terkecil pada subtree sebelah kanan dari node yang akan dihapus. Setelah successor ditemukan, posisi node yang akan dihapus digantikan oleh successor tersebut. Selanjutnya hubungan child dari node lama akan dipindahkan ke successor. Method getSuccessor() sangat membantu karena dapat menentukan node pengganti yang tepat sehingga aturan Binary Search Tree tetap terjaga dan struktur tree tidak rusak setelah proses penghapusan dilakukan.
