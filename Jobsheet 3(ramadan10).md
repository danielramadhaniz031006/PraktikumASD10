|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020255 |
| Nama | Daniel Ramadhani Zulkarnain |
| Kelas | TI - 1F |
| Repository | [link] () |

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
