package latihan;
import java.util.Scanner;
public class penjualantanah_day18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan luas tanah (dalam meter persegi): ");
        double luasTanah = input.nextDouble();

        // Harga jual per meter
        double hargaPerMeter = 300000;

        // Menghitung total harga jual
        double totalHargaJual = luasTanah * hargaPerMeter;

        // Menghitung pajak berdasarkan ketentuan
        double pajak;
        if (totalHargaJual > 100000000) {
            pajak = totalHargaJual * 0.05;
        } else if (totalHargaJual > 50000000) {
            pajak = totalHargaJual * 0.03;
        } else {
            pajak = totalHargaJual * 0.01;
        }

        // Menghitung uang bersih
        double uangBersih = totalHargaJual - pajak;

        // Menampilkan hasil
        System.out.printf("Total harga jual tanah: Rp %.2f%n", totalHargaJual);
        System.out.printf("Jumlah pajak yang harus dibayarkan: Rp %.2f%n", pajak);
        System.out.printf("Uang bersih yang didapatkan: Rp %.2f%n", uangBersih);
    }
}
