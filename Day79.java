package latihan;
import java.util.Scanner;
public class Day79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan nilai batas atas: ");
            int batasAtas = scanner.nextInt();

            if (batasAtas < 1) {
                System.out.println("Masukkan nilai batas atas yang lebih besar dari 0.");
            } else {
                int hasil = hitungTotalPenjumlahan(batasAtas);
                System.out.println("Total penjumlahan dari 1 sampai " + batasAtas + " adalah: " + hasil);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Masukkan nilai yang valid (bilangan bulat).");
        } finally {
            scanner.close();
        }
    }

    public static int hitungTotalPenjumlahan(int batasAtas) {
        int total = 0;
        for (int i = 1; i <= batasAtas; i++) {
            total += i;
        }
        return total;
    }
}
