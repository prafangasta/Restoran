import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Makanan[] daftarMakanan = new Makanan[3];
        daftarMakanan[0] = new Makanan("Ayam Bakar", 25000, "Olahan Ayam");
        daftarMakanan[1] = new Makanan("Ayam Goreng", 20000, "Olahan Ayam");
        daftarMakanan[2] = new Makanan("Ayam Penyet", 22000, "Olahan Ayam");

        Minuman[] daftarMinuman = new Minuman[3];
        daftarMinuman[0] = new Minuman("Teh Botol", 5000, "Dingin");
        daftarMinuman[1] = new Minuman("Kopi", 10000, "Panas");
        daftarMinuman[2] = new Minuman("Air Mineral", 3000, "Dingin");

        System.out.println("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        
        Pelanggan pelanggan = new Pelanggan(namaPelanggan);
        Pesanan pesanan = new Pesanan(pelanggan);

        boolean addMore = true;

        while (addMore) {
            System.out.println("Pilih jenis menu:");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.print("Masukkan pilihan (1 atau 2): ");
            int menuType = scanner.nextInt();
            scanner.nextLine();

            if (menuType == 1) {
                System.out.println("Daftar Makanan:");
                for (int i = 0; i < daftarMakanan.length; i++) {
                    System.out.println((i + 1) + ": " + daftarMakanan[i].getNama() + " - Harga: " + daftarMakanan[i].getHarga());
                }
                System.out.print("Pilih makanan (masukkan nomor): ");
                int pilihanMakanan = scanner.nextInt() - 1;
                if (pilihanMakanan >= 0 && pilihanMakanan < daftarMakanan.length) {
                    System.out.print("Masukkan jumlah pesanan: ");
                    int jumlahMakanan = scanner.nextInt();
                    pesanan.tambahMenu(daftarMakanan[pilihanMakanan], jumlahMakanan);
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } else if (menuType == 2) {
                System.out.println("Daftar Minuman:");
                for (int i = 0; i < daftarMinuman.length; i++) {
                    System.out.println((i + 1) + ": " + daftarMinuman[i].getNama() + " - Harga: " + daftarMinuman[i].getHarga());
                }
                System.out.print("Pilih minuman (masukkan nomor): ");
                int pilihanMinuman = scanner.nextInt() - 1;
                if (pilihanMinuman >= 0 && pilihanMinuman < daftarMinuman.length) {
                    System.out.print("Masukkan jumlah pesanan: ");
                    int jumlahMinuman = scanner.nextInt();
                    pesanan.tambahMenu(daftarMinuman[pilihanMinuman], jumlahMinuman);
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            }

            System.out.println("Ingin menambah menu lagi?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Masukkan pilihan (1 atau 2): ");
            int response = scanner.nextInt();
            scanner.nextLine();
            if (response == 2) {
                addMore = false;
            } else if (response != 1) {
                System.out.println("Pilihan tidak valid. Mengakhiri input.");
                addMore = false;
            }
        }

        System.out.println("Tipe pesanan:");
        System.out.println("1. Dine-In");
        System.out.println("2. Take-Away");
        System.out.print("Masukkan pilihan (1 atau 2): ");
        int tipeResponse = scanner.nextInt();
        scanner.nextLine();
        String tipePesanan = (tipeResponse == 1) ? "Dine-In" : "Take-Away";
        pesanan.setTipePesanan(tipePesanan);

        System.out.println(pesanan);
        scanner.close();
    }
}
