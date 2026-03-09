|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020255 |
| Nama | Daniel Ramadhani Zulkarnain |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/danielramadhaniz031006/PraktikumASD10/tree/11e476a17d1f5ffdb3ed5601b0b3f5543b9697fa/minggu3) |

Hasil Percobaan 3.2

<img width="420" height="391" alt="image" src="https://github.com/user-attachments/assets/e54cffee-7fe3-4075-b9a7-2d937dc12f48" />

Jawaban 3.2.3
1. Tidak harus, Sebuah class bisa saja hanya memiliki atribut saja, atau hanya method saja, bahkan bisa keduanya kosong (empty class). Namun, secara konsep Object-Oriented
   Programming (OOP), class biasanya dibuat sebagai cetak biru (blueprint) yang memiliki atribut (state/keadaan) dan method (behavior/perilaku) agar objek yang dibuat
   memiliki data dan fungsi yang bermakna.
2. Kode tersebut melakukan pendeklarasian dan instansiasi array
   -Mendeklarasikan variabel array dengan nama arrayOfMahasiswa yang bertipe Mahasiswa.
   -Mengalokasikan memori untuk menampung 3 buah referensi objek Mahasiswa.
   -Perlu dicatat bahwa kode ini belum membuat objek Mahasiswa itu sendiri, melainkan hanya membuat "wadah" berupa array yang saat ini masih berisi nilai null di setiap
    indeksnya.
3. Secara eksplisit (tertulis di kode), class Mahasiswa pada langkah awal belum memiliki konstruktor. Namun, Java secara otomatis menyediakan default constructor
   (konstruktor tanpa parameter) jika kita tidak mendefinisikan konstruktor apapun di dalam class tersebut. Jadi, pemanggilan new Mahasiswa() menggunakan konstruktor default
   yang disediakan oleh Java
4. Kode tersebut menginisialisasi atau mengisi nilai atribut dari objek Mahasiswa yang berada pada indeks ke-0 di dalam array arrayOfMahasiswa. Nilai atribut nim, nama, ipk,
   dan lainnya diisi secara langsung (hardcoded) melalui operator assignment (=).
5. Pemisahan ini dilakukan untuk menerapkan prinsip modularitas dan cleaner code:
   -Class Mahasiswa: Berfungsi sebagai class model/blueprint yang hanya mendefinisikan struktur data (atribut) dan perilaku objek. Class ini tidak bisa berjalan sendiri
   karena tidak memiliki method main.
   -Class MahasiswaDemo: Berfungsi sebagai class driver/executor yang berisi method main untuk menjalankan program, membuat instansiasi objek, dan mengelola logika program.
   Dengan dipisah, class Mahasiswa bisa digunakan kembali (reusable) di class lain tanpa menulis ulang kodenya.


Hasil Percobaan 3.3

<img width="403" height="391" alt="Cuplikan layar 2026-02-27 095527" src="https://github.com/user-attachments/assets/d5c94e6a-948d-49bb-b0a6-18d254737985" />
<img width="367" height="507" alt="Cuplikan layar 2026-03-01 191918" src="https://github.com/user-attachments/assets/aeacf9ae-c9be-4070-9a68-6ff8b3f871b7" />

Jawaban 3.3.3
1. <img width="578" height="836" alt="image" src="https://github.com/user-attachments/assets/d6faaf98-188f-4d1c-926d-6e6a494f4160" />
2. Kode tersebut menyebabkan error karena array of object yang dibuat hanya membuat array-nya saja, tetapi belum membuat object pada setiap elemennya.

Hasil Percobaan 3.4

<img width="658" height="745" alt="image" src="https://github.com/user-attachments/assets/9cc68ade-61f0-484e-a147-1b8e6bf70c3a" />

Jawaban 3.4.3
1. Bisa. Disebut Constructor Overloading
2. <img width="653" height="892" alt="image" src="https://github.com/user-attachments/assets/a2e383ac-b15a-4ac3-8564-f32642075964" />

   <img width="777" height="631" alt="image" src="https://github.com/user-attachments/assets/2d4046dc-bba6-4287-b71c-7073120fd6f0" />

3.5 Tugas
1. <img width="680" height="728" alt="image" src="https://github.com/user-attachments/assets/741f84ec-24e1-4dd0-aecb-da68f0d6b1e7" />

2. <img width="563" height="848" alt="image" src="https://github.com/user-attachments/assets/2a499ee5-c650-4789-93e7-43977d08e1b4" />
