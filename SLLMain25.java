public class SLLMain25
 {
    public static void main(String[] args) {
        SingleLinkedList25 sll = new SingleLinkedList25();

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

    }
}