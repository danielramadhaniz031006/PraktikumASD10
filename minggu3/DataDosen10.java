package minggu3;

public class DataDosen10 {

    public void dataSemuaDosen(Dosen10[] arrayOfDosen) {
        int no = 1;
        for (Dosen10 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no);
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("-------------------------------------");
            no++;
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen10 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("-------------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen10 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }

        if (jmlPria > 0)
            System.out.println("Rata-rata Usia Pria   : " + (totalPria / jmlPria));
        if (jmlWanita > 0)
            System.out.println("Rata-rata Usia Wanita : " + (totalWanita / jmlWanita));

        System.out.println("-------------------------------------");
    }

    public void infoDosenPalingTua(Dosen10[] arrayOfDosen) {
        Dosen10 tertua = arrayOfDosen[0];

        for (Dosen10 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua:");
        System.out.println("Kode  : " + tertua.kode);
        System.out.println("Nama  : " + tertua.nama);
        System.out.println("Usia  : " + tertua.usia);
        System.out.println("-------------------------------------");
    }

    public void infoDosenPalingMuda(Dosen10[] arrayOfDosen) {
        Dosen10 termuda = arrayOfDosen[0];

        for (Dosen10 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda:");
        System.out.println("Kode  : " + termuda.kode);
        System.out.println("Nama  : " + termuda.nama);
        System.out.println("Usia  : " + termuda.usia);
        System.out.println("-------------------------------------");
    }
}