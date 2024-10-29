import java.util.ArrayList;

public class RiwayatPesanan {
    private ArrayList<Pesanan> riwayat;

    public RiwayatPesanan() {
        riwayat = new ArrayList<>();
    }

    public void tambahPesanan(Pesanan pesanan) {
        riwayat.add(pesanan);
    }

    public void tampilkanRiwayat() {
        for (Pesanan pesanan : riwayat) {
            System.out.println(pesanan);
        }
    }
}