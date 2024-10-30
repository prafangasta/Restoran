public class Pesanan {
    private Pelanggan pelanggan;
    private Menu[] menuList = new Menu[100]; 
    private int count = 0; 
    private String tipePesanan;

    public Pesanan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void tambahMenu(Menu menu) {
        if (count < menuList.length) {
            menuList[count++] = menu;
        } else {
            System.out.println("Pesanan sudah penuh.");
        }
    }

    public void setTipePesanan(String tipe) {
        this.tipePesanan = tipe;
    }

    public double hitungTotalHarga() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += menuList[i].getHarga();
        }
        return total;
    }

    @Override
    public String toString() {
        return String.format("Pesanan untuk %s%nTipe Pesanan: %s%nTotal Harga: %.2f%n", 
                             pelanggan.getNama(), tipePesanan, hitungTotalHarga());
    }
}
