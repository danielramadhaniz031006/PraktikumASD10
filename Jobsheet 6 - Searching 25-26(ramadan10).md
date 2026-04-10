|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020255 |
| Nama | Daniel Ramadhani Zulkarnain |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/danielramadhaniz031006/PraktikumASD10/tree/267139b8ebf3332e516c6bf7f460f62d70d13335/minggu7) |

6.2. Searching/ Pencarian Menggunakan Algoritma Sequential Search

<img width="471" height="716" alt="image" src="https://github.com/user-attachments/assets/52d33f99-367b-4eb1-95d0-fd97dd7ca5fb" />
<img width="433" height="582" alt="image" src="https://github.com/user-attachments/assets/0d2c327c-2d59-46e2-9a21-05a5b578429d" />
<img width="551" height="588" alt="image" src="https://github.com/user-attachments/assets/eae8328d-b63c-431e-be06-59ff453bc0b0" />
<img width="550" height="213" alt="image" src="https://github.com/user-attachments/assets/5a1bbb0f-6648-43b8-a528-0f3a764575f9" />

6.2.3. Jawaban
1. Method tampilPosisi digunakan untuk menampilkan posisi atau indeks dari data mahasiswa yang ditemukan dalam proses
   pencarian. Output dari method ini hanya menunjukkan apakah data ditemukan atau tidak serta berada di indeks ke berapa dalam
   array.

   Sedangkan method tampilDataSearch digunakan untuk menampilkan isi lengkap data mahasiswa yang ditemukan, seperti NIM, nama,
   kelas, dan IPK.

2. Sequential searching adalah metode pencarian data yang dilakukan dengan cara memeriksa setiap elemen dalam array satu per
   satu dari awal hingga akhir sampai data yang dicari ditemukan atau seluruh data telah diperiksa.

3. Sequential searching digunakan ketika:
   -Data belum terurut
   -Jumlah data relatif sedikit
   -Struktur data sederhana seperti array
   -Tidak membutuhkan performa pencarian yang sangat cepat

4. Kelebihan :
   -Mudah diimplementasikan
   -Tidak perlu data dalam keadaan terurut
   -Cocok untuk data kecil

   Kekurangan:
   -Kurang efisien untuk data besar
   -Waktu pencarian lebih lama karena harus mengecek satu per satu
   -Kompleksitas waktu O(n)


6.3. Searching/ Pencarian Menggunakan Algoritma Binary Search

<img width="430" height="725" alt="image" src="https://github.com/user-attachments/assets/d2cfb22c-9bfa-427f-9c8b-47c264a80cac" />
<img width="465" height="579" alt="image" src="https://github.com/user-attachments/assets/58ac2762-2946-4944-9fec-733cbc43c878" />
<img width="649" height="821" alt="image" src="https://github.com/user-attachments/assets/06a0594a-fafc-4059-90bd-44522f2cc1f2" />

6.3.3. Jawaban
1. mid = (left + right) / 2;
2. if (cari == listMhs[mid].ipk) {
    return mid;  // Data ditemukan
} else if (listMhs[mid].ipk < cari) {
    return findBinarySearch(cari, left, mid - 1);
} else {
    return findBinarySearch(cari, mid + 1, right);
}
3. left : Menandai batas kiri area pencarian
   right : Menandai batas kanan area pencarian
   mid : Posisi tengah sebagai pembagi array
4. <img width="317" height="445" alt="image" src="https://github.com/user-attachments/assets/7360185b-d4a4-48c4-88cd-bb872ace4892" />

5. Kerja Binary Search:
-Data harus terurut (sudah di-sorting)
-Membagi area pencarian menjadi 2 setiap iterasi
-Mengeliminasi setengah data yang tidak mungkin mengandung target
-Kompleksitas: O(log n) - jauh lebih cepat dari Sequential Search O(n)

6. Data tidak ditemukan ketika kondisi right < left terpenuhi, yang berarti area pencarian sudah habis
   
7. Hasil
   
<img width="499" height="607" alt="image" src="https://github.com/user-attachments/assets/73a847e8-4c82-4e75-a40a-0d930fe1d995" />

<img width="799" height="499" alt="image" src="https://github.com/user-attachments/assets/914ad951-2387-4d5d-9ca8-518a5afb6fe9" />

