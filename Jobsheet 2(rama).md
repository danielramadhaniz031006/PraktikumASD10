|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020255 |
| Nama | Daniel Ramadhani Zulkarnain |
| Kelas | TI - 1F |
| Repository | [link] () |


2.1.3 
Pertanyaan :
1.	Sebutkan dua karakteristik class atau object! 
2.	Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
3.	Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4.	Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di
    dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0". 
5.  Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,
    Kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?

Jawaban :
1.	Atribut (data/properti)
Method (perilaku/fungsi)
2.	nim
    nama
    kelas
    ipk
3.	tampilkanInformasi()
    ubahKelas()
    updateIpk()
    nilaiKinerja()
4.	Method updateIpk() sudah dimodifikasi dengan validasi 0.0–4.0
5.	-Mengevaluasi IPK mahasiswa.
    -Kriteria:
    ≥ 3.5 → Sangat Baik
    ≥ 3.0 → Baik
    ≥ 2.5 → Cukup
    < 2.5 → Kurang
    -Method ini mengembalikan (return) String berupa kategori kinerja.

2.2.3 
Pertanyaan :
1.	Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan? 
2.	Bagaimana cara mengakses atribut dan method suatu objek? 
3.	Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

Jawaban :
1.	Mahasiswa msh1 = new Mahasiswa ();
    Nama objek yang dihasilkan adalah msh1
2.	Atribut : namaObjek.namaAtribut (Contoh : msh1.nama = “Ramadan”)
    Method : namaObjek.namaMethod() (Contoh : msh1.tampilankanInformasi())
3.	Karena di antara pemanggilan method pertama dan kedua , terdapat kode program yang mengubah state (nilai) atribut dari objek mhs1, 
    yaitu mhs1.ubahKelas("TI-1F") dan mhs1.updateIpk(3.8). Oleh karena itu, ketika method tampilkanInformasi() dipanggil kedua kalinya, 
    data yang ditampilkan adalah data yang sudah diperbarui


2.3.3 
Pertanyaan : 
1.	Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter! 
2.	Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut? 
3.	Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
4.	Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya! 
5.	Buat object baru dengan nama mhs menggunakan konstruktor berparameter dari class Mahasiswa!
Jawaban :
1.	public Mahasiswa(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
        }
2.	Baris tersebut melakukan instansiasi objek baru dengan nama mhs2 sekaligus menginisialisasi nilai atributnya langsung melalui parameter konstruktor ("254107020255", "Daniel Ramadhani Zulkarnain", dll) tanpa perlu mengeset atribut satu per satu setelah objek dibuat.
3.	Program akan mengalami error saat compile pada baris Mahasiswa mhs1 = new Mahasiswa();. Alasan: Karena jika kita sudah mendefinisikan konstruktor berparameter secara eksplisit, Java tidak lagi menyediakan konstruktor default (tanpa parameter) secara otomatis. Maka, pemanggilan new Mahasiswa() akan dianggap tidak valid karena tidak ada konstruktor yang cocok.
4.	Tidak. Method dapat diakses secara acak sesuai kebutuhan logika program. Objek menyimpan state (nilai atribut)nya sendiri, sehingga pemanggilan method ubahKelas() tidak harus selalu diikuti atau mendahului method tertentu, kecuali jika ada ketergantungan logika di dalam method tersebut (misal method A membutuhkan hasil perhitungan method B).
5.	Mahasiswa mhsRamadan = new Mahasiswa("254107020255", "Daniel Ramadhani Zulkarnain ", "TI-1F", 3.5);
mhsRamadan.tampilkanInformasi();
