package latihan;
import java.util.Scanner;
public class Day77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas atas angka: ");
        int batasAtas = scanner.nextInt();

        int jumlahHabisDibagiTiga = 0;

        for (int angka = 1; angka < batasAtas; angka++) {
            if (angka % 3 == 0) {
                jumlahHabisDibagiTiga++;
            }
        }

        System.out.println("Jumlah angka yang habis dibagi 3 dari 1 sampai " + (batasAtas - 1) + " adalah: " + jumlahHabisDibagiTiga);
    }
}

    

