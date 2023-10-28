package latihan;
import java.util.Scanner;

public class ascendingDay20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat pertama (m): ");
        int m = input.nextInt();

        System.out.print("Masukkan bilangan bulat kedua (n): ");
        int n = input.nextInt();

        int sum = 0;

        // Pastikan m lebih kecil daripada n
        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
        }

        System.out.println("Penjumlahan bilangan bulat antara " + m + " dan " + n + " adalah:");

        for (int i = m; i <= n; i++) {
            sum += i;
            System.out.print(i);

            // Jika bukan bilangan terakhir, tambahkan tanda '+' setelahnya
            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + sum);

        input.close();
    }
}

