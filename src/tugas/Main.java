package tugas;

public class Main {
    public static void main(String[] args) {
        Musik lagu1 = new Musik("love", "wave to earth");
        Musik lagu2 = new Musik("Blinding Lights", "The Weeknd");

        lagu1.tampilkanInfo();
        lagu2.tampilkanInfo();
    }
}