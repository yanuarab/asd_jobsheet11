import java.util.Locale;

public class Mahasiswa25 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa25(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilInformasi () {
       System.out.printf(Locale.US, "%s\t%s\t%s\t%.1f\n", nama, nim, kelas, ipk);

    }
}