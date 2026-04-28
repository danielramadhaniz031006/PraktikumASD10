package minggu9;

import java.util.Scanner;

public class MahasiswaDemo10_modifikasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa10_modifikasi stack = new StackTugasMahasiswa10_modifikasi(5);

        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah"); // jawaban no 4
            System.out.println("6. Jumlah Tugas"); // jawaban no 5
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa10_modifikasi mhs = new Mahasiswa10_modifikasi(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa10_modifikasi dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        int nilai;
                        do {
                            System.out.print("Masukan nilai (0-100): ");
                            nilai = scan.nextInt();
                        } while (nilai < 0 || nilai > 100);
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;

                case 3:
                    Mahasiswa10_modifikasi lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("Nama\tNIM\tKelas\tNilai");
                    stack.print();
                    break;

                case 5: // jawaban no 4
                    Mahasiswa10_modifikasi bawah = stack.peekBottom();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                    }
                    break;

                case 6: // jawaban no 5
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.count());
                    break;

                case 7:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 7);
    }
}