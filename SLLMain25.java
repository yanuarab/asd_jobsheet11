public class SLLMain25 {
    public static void main(String[] args) {
        SingleLinkedList25 sll = new SingleLinkedList25();

        Mahasiswa25 mhs1 = new Mahasiswa25("Alvaro", "24212200", "1A", 4.0);
        Mahasiswa25 mhs2 = new Mahasiswa25("Cintia", "22212202", "3C", 3.5);
        Mahasiswa25 mhs3 = new Mahasiswa25("Bimon",  "23212201", "2B", 3.8);
        Mahasiswa25 mhs4 = new Mahasiswa25("Dirga",  "21212203", "4D", 3.6);
        
        sll.addLast(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);

        System.out.println("data index 1 : ");
        sll.getData(1);
        
        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();
        
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
