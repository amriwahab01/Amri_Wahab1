package latihan;
import java.util.Scanner;
public class menghitung_totalpenjualan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan harga barang
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        // Meminta pengguna untuk memasukkan jumlah barang yang dibeli
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();

        // Menghitung total harga
        double totalHarga = hargaBarang * jumlahBarang;

        // Menampilkan total harga
        System.out.println("Total harga: " + totalHarga);

        scanner.close();
    }
}

    
}
