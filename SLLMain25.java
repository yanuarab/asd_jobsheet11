import java.util.Scanner;

public class SLLMain25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList25 sll = new SingleLinkedList25();

        // Data awal
        Mahasiswa25 mhs1 = new Mahasiswa25("Alvaro", "24212200", "1A", 4.0);
        Mahasiswa25 mhs2 = new Mahasiswa25("Bimon",  "23212201", "2B", 3.8);
        Mahasiswa25 mhs3 = new Mahasiswa25("Cintia", "22212202", "3C", 3.5);
        Mahasiswa25 mhs4 = new Mahasiswa25("Dirga",  "21212203", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        // Tambah data lewat keyboard
        System.out.print("masukan berapa data yang ingin di masukan:");
        int jumlah = sc.nextInt();
        sc.nextLine(); // buang newline

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            String ipkStr = sc.nextLine().replace(",", "."); // Ganti koma ke titik
            double ipk = Double.parseDouble(ipkStr);


            Mahasiswa25 mhsInput = new Mahasiswa25(nama, nim, kelas, ipk);
            sll.addLast(mhsInput);
        }

        System.out.println("\n=== hasil setelah di tambahkan ===");
        sll.print();

        sc.close();
    }
}
