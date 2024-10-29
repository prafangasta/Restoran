public class Makanan extends Menu {
    private String kategori;

    public Makanan(String nama, double harga, String kategori) {
        super(nama, harga, "Makanan");
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }
}