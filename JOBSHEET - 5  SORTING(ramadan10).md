|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020255 |
| Nama | Daniel Ramadhani Zulkarnain |
| Kelas | TI - 1F |
| Repository | [link] () |

Hasil Praktikum 1
A. SORTING – BUBBLE SORT
<img width="907" height="328" alt="image" src="https://github.com/user-attachments/assets/94f10881-351e-49f5-96c0-8c41a07577cc" />

B. SORTING – SELECTION SORT
<img width="901" height="325" alt="image" src="https://github.com/user-attachments/assets/45213bcc-c2e3-4940-a647-1b21302f391a" />

C. SORTING – INSERTION SORT
<img width="930" height="359" alt="image" src="https://github.com/user-attachments/assets/e0a53b2a-09cb-4ad1-84be-cfac78573d95" />

5.2.5 Jawaban :
1. Fungsi kode program tersebut adalah untuk menukar (swap) posisi elemen array pada indeks j dan j-1 menggunakan variabel sementara temp jika nilai elemen j-1 lebih besar dari elemen j
2. int min = i;
for (int j=i+1; j<jumData; j++){
    if (data[j]<data[min]){
        min=j;
    }
3. Kondisi pada perulangan (biasanya while (j > 0 && data[j-1] > temp)) bermaksud untuk mencari posisi yang tepat bagi elemen yang sedang diurutkan (temp). Perulangan ini akan terus menggeser elemen-elemen yang nilainya lebih besar dari temp ke arah kanan, selama indeks array masih valid (j > 0)
4. Tujuan perintah tersebut adalah untuk menempatkan nilai yang disimpan di variabel sementara (temp) ke dalam posisi array yang kosong atau posisi yang tepat setelah proses penggeseran elemen sebelumnya selesai dilakukan


Hasil Praktiku 2
1. (Bubble Sort) 
<img width="368" height="827" alt="image" src="https://github.com/user-attachments/assets/befabb5f-71a5-428a-902b-ff7d3f9caa95" />

5.3.4 Jawaban (Praktikum 2 - Bubble Sort)
1. a)Karena dalam proses pengurutan, kita membandingkan elemen ke-j dengan elemen ke-j+1. Jika perulangan i sampai    listMhs.length, maka pada perulangan dalam (j) akan terjadi ArrayIndexOutOfBounds (keluar batas array) saat mengakses indeks terakhir. Selain itu, secara logika, setelah n-1 iterasi, elemen paling akhir sudah pasti berada di posisi yang benar secara otomatis.
   b)Karena setiap kali iterasi i selesai (pass), satu elemen terbesar (atau terkecil tergantung urutan) akan "menggelembung" dan menempati posisi akhir yang benar. Elemen-elemen di bagian akhir array tersebut sudah urut dan tidak perlu dibandingkan lagi pada iterasi berikutnya, sehingga batas perulangan j dikurangi sebesar i
  c)Perulangan i akan berlangsung sebanyak 49 kali (dari i=0 sampai i=48).
Tahap bubble sort yang ditempuh adalah 49 Tahap (sesuai dengan jumlah perulangan i)
2. <img width="470" height="768" alt="image" src="https://github.com/user-attachments/assets/91010f33-2a82-4467-9a71-69b47c8290ac" />

2. (Selection Sort)
<img width="379" height="774" alt="image" src="https://github.com/user-attachments/assets/60f0ecb7-01c9-4f6c-8f36-ffa6b9876194" />

5.3.7 Jawaban (Praktikum 2 - Selection Sort)
1. Proses tersebut berfungsi untuk menukar posisi elemen. Elemen pada indeks i akan ditukar dengan elemen pada indeks idxMin (indeks yang berisi nilai paling kecil yang ditemukan pada iterasi tersebut). Tujuannya adalah untuk menempatkan nilai minimum tersebut ke posisi yang tepat pada urutan depan array.

3. (Insertion Sort)
<img width="471" height="785" alt="image" src="https://github.com/user-attachments/assets/48d5c33b-3f7a-472f-b6b0-f2611190f870" />

5.4.3 Jawaban (Praktikum 2 - Insertion Sort)
1. <img width="482" height="786" alt="image" src="https://github.com/user-attachments/assets/56a2878b-ff1e-47f8-b1cf-34c751e0e67b" />

5.5 Hasil Latihan Praktikum
Pilihan 1 (Tambah Data)
<img width="338" height="703" alt="image" src="https://github.com/user-attachments/assets/ed583867-181f-46ff-9c25-51b6322f6911" />

Pilihan 2 (Tampil Data)
<img width="334" height="366" alt="image" src="https://github.com/user-attachments/assets/8919ec25-8d39-45a4-94c6-8d73dcb9deee" />

Pilihan 3 (Sorting Ascending (Bubble Sort))
<img width="442" height="379" alt="image" src="https://github.com/user-attachments/assets/ff0894d6-65e3-4eef-8a83-7b2174cd12a2" />

Pilihan 4 (Sorting Descending (Selection/Insertion Sort))
<img width="497" height="539" alt="image" src="https://github.com/user-attachments/assets/0b1cb2fe-26a8-489a-b17b-978cce7f8463" />

Pilihan 5 (Keluar)
<img width="133" height="48" alt="image" src="https://github.com/user-attachments/assets/bab08a58-71fd-4e7c-a81d-075db5fde70e" />
