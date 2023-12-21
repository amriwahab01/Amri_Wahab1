package latihan;
import java.util.Scanner;
public class Day74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input penghasilan bulanan dari keyboard
        System.out.print("Masukkan penghasilan bulanan (Rp): ");
        double penghasilanBulanan = scanner.nextDouble();

        // Syarat minimum penghasilan untuk zakat profesi
        double penghasilanMinimum = 5240000;

        // Menghitung zakat profesi jika syarat terpenuhi
        if (penghasilanBulanan >= penghasilanMinimum) {
            double zakatProfesi = 0.025 * penghasilanBulanan;
            System.out.println("Besaran zakat profesi yang harus dibayarkan: Rp" + zakatProfesi);
        } else {
            System.out.println("Penghasilan belum mencapai syarat minimum untuk zakat profesi.");
        }

        // Menutup objek Scanner
        scanner.close();
    }
}

  
