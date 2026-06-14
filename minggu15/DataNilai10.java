package minggu15;

public class DataNilai10 {
    DataMahasiswa10 mahasiswa;
    DataMataKuliah10 matkul;
    double nilai;

    public DataNilai10(DataMahasiswa10 mahasiswa,
                       DataMataKuliah10 matkul,
                       double nilai) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.nilai = nilai;
    }
}