package latihan;
import java.util.Scanner;
public class Day85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Penjualan Barang ===");

        // Input barang
        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();

        // Hitung total pembelian
        double totalPembelian = hargaBarang * jumlahBarang;

        // Tampilkan hasil
        System.out.println("\n=== Struk Pembelian ===");
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.println("Total Pembelian: " + totalPembelian);

        // Tutup scanner
        scanner.close();
    }
}

    

