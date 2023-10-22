package latihan;
import java.util.Scanner;

public class MenentukanBilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan sebuah bilangan bulat
        System.out.print("Masukkan sebuah bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Memeriksa apakah bilangan adalah bilangan prima
        boolean isPrime = isPrimeNumber(bilangan);

        if (isPrime) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }

        scanner.close();
    }

    // Fungsi untuk memeriksa apakah bilangan adalah bilangan prima
    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
   
