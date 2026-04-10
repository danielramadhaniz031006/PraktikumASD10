|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020255 |
| Nama | Daniel Ramadhani Zulkarnain |
| Kelas | TI - 1F |
| Repository | [link] () |

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
