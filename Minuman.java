public class Minuman extends Menu {
    private String kategori;

    public Minuman(String nama, double harga, String kategori) {
        super(nama, harga, "Minuman");
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }
}