|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020255 |
| Nama | Daniel Ramadhani Zulkarnain |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/danielramadhaniz031006/PraktikumASD10/tree/cca2e2071bb61a0525c0653beb596088d54c4035/minggu10) |


Hasil Percobaan 1 : Operasi Dasar Queue
<img width="285" height="422" alt="image" src="https://github.com/user-attachments/assets/ba9653f0-de67-4419-ba67-e5928a17d180" />


2.1.3. Jawaban
1. Awalnya queue itu kosong, jadi:

size = 0 → memang belum ada data
front = -1 dan rear = -1 → menandakan belum ada posisi yang terisi

Karena kalau langsung 0, program bisa mengira sudah ada data di index pertama

2. <img width="281" height="95" alt="image" src="https://github.com/user-attachments/assets/9cada62b-21d3-4ce0-80b0-b3a68ef891b5" />
Ini dipakai biar queue jadi melingkar (circular)

3. sama kayak tadi, tapi untuk front,
Kalau front sudah di ujung, dia balik ke awal lagi
Jadi proses ambil data tetap bisa lanjut tanpa keluar dari batas array

4. Karena data antrian tidak selalu dimulai dari index 0

5. Ini cara singkat buat bikin index muter (circular)
i + 1 → pindah ke index berikutnya
% max → kalau sudah mentok, balik ke 0

6. <img width="545" height="95" alt="image" src="https://github.com/user-attachments/assets/bf2cacf8-ee20-4c68-bbf2-5db26e886cbf" />
kondisi saat:
- antrian sudah penuh
- tidak bisa tambah data lagi

7. Hasil Modifikasi :
NORMAL
<img width="280" height="438" alt="image" src="https://github.com/user-attachments/assets/220ed724-4dff-4edc-9eb1-1c9929ec8449" />

PEEK
<img width="268" height="139" alt="image" src="https://github.com/user-attachments/assets/487b9867-f94f-4527-9c52-7d4197a1c0b9" />

DEQUEUE
<img width="277" height="137" alt="image" src="https://github.com/user-attachments/assets/7af57794-5c26-4995-9e21-d75de77755a9" />

PRINT SETELAH DEQUEUE
<img width="273" height="152" alt="image" src="https://github.com/user-attachments/assets/8f4985c4-b27b-4a5c-93f6-d790ca1534c7" />

OVERFLOW
<img width="245" height="369" alt="image" src="https://github.com/user-attachments/assets/d8a8b70f-9988-451e-872b-bd21ca52dc3a" />

UNDERFLOW
<img width="377" height="181" alt="image" src="https://github.com/user-attachments/assets/502a384a-4ec0-4771-8347-725d86300c44" />



Hasil Percobaan 2 : Antrian Layanan Akademik
<img width="329" height="496" alt="image" src="https://github.com/user-attachments/assets/6e18bf6a-b72e-48bc-89a6-12c1f64c9b2a" />
<img width="343" height="634" alt="image" src="https://github.com/user-attachments/assets/2f709f61-1771-429f-a019-66775986bd64" />
<img width="338" height="349" alt="image" src="https://github.com/user-attachments/assets/49df649f-934a-4ebc-b121-84a257aa01f9" />

2.2.3 Jawaban
Hasil Modifikasi :
<img width="217" height="586" alt="image" src="https://github.com/user-attachments/assets/3cc8927c-f070-4793-856d-2d7d165355bb" />

<img width="247" height="194" alt="image" src="https://github.com/user-attachments/assets/c83c4e9c-6893-42d9-8ddd-92d4c479631c" />

<img width="244" height="195" alt="image" src="https://github.com/user-attachments/assets/7bae98ce-fb8d-4c77-91fa-d1329e072475" />

<img width="270" height="221" alt="image" src="https://github.com/user-attachments/assets/94d40c1d-1278-41e5-b114-04faa8d386dc" />

<img width="260" height="169" alt="image" src="https://github.com/user-attachments/assets/628864e7-3994-4833-ab5e-00f1575da6d2" />

<img width="251" height="172" alt="image" src="https://github.com/user-attachments/assets/6dcdcf6e-0af9-4913-8d8e-6be5599c6d43" />

<img width="241" height="155" alt="image" src="https://github.com/user-attachments/assets/69070817-f95e-453b-9a68-59050478e36a" />



2.3 Hasil Percobaan Tugas
Tambah Antrian
<img width="133" height="793" alt="image" src="https://github.com/user-attachments/assets/cf841341-5c60-4ed6-becc-72301b4fc3ec" />

Tampilkan Semua
<img width="222" height="253" alt="image" src="https://github.com/user-attachments/assets/a00f51cc-d57d-4f1b-bfd5-56f6bd519d7d" />

Tampilkan 2 Terdepan
<img width="187" height="221" alt="image" src="https://github.com/user-attachments/assets/c88052b4-5050-4cca-9811-4bbe21d0a1b9" />

Tampilkan Terakhir
<img width="200" height="215" alt="image" src="https://github.com/user-attachments/assets/3fb293eb-3e03-49a7-b614-9be894cd438a" />

Jumlah Antrian
<img width="207" height="207" alt="image" src="https://github.com/user-attachments/assets/48c269c9-438e-4731-9726-166ea429d779" />

Proses 2 Mahasiswa
<img width="199" height="220" alt="image" src="https://github.com/user-attachments/assets/6727e770-1492-498a-9994-1e7d1e46e441" />

Sudah Dilayani
<img width="189" height="213" alt="image" src="https://github.com/user-attachments/assets/ec64b185-352e-4729-ba63-7e5fbb2871ae" />

Belum Dilayani
<img width="200" height="214" alt="image" src="https://github.com/user-attachments/assets/dc7b581c-b900-4303-9530-d82e4fdc6395" />

Kosongkan Antrian
<img width="188" height="208" alt="image" src="https://github.com/user-attachments/assets/65f825c3-04b1-4f64-a7c3-cba59d89dfce" />
