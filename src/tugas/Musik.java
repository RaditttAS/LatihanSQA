package tugas;

public class Musik {
    private String judul;
    private String artis;

    public Musik(String judul, String artis) {
        this.judul = judul;
        this.artis = artis;
    }

    public void tampilkanInfo() {
        System.out.println("Judul Lagu: " + judul + ", Artis: " + artis);
    }
}