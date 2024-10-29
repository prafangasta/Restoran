public class Menu {
    private String nama;
    private double harga;
    private String tipe;

    public Menu(String nama, double harga, String tipe) {
        this.nama = nama;
        this.harga = harga;
        this.tipe = tipe;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getTipe() {
        return tipe;
    }
}