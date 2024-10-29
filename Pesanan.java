
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
        StringBuilder sb = new StringBuilder();
        sb.append("Pesanan untuk ").append(pelanggan.getNama()).append("\n");
        sb.append("Tipe Pesanan: ").append(tipePesanan).append("\n");
        sb.append("Total Harga: ").append(hitungTotalHarga()).append("\n");
        return sb.toString();
    }
}