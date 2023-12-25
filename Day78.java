package latihan;
import java.util.Scanner;
public class Day78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] angkaGanjil = new int[10];
        int jumlahAngka = 10;

        // Meminta pengguna untuk memasukkan 10 angka ganjil
        for (int i = 0; i < jumlahAngka; i++) {
            while (true) {
                System.out.print("Masukkan angka ganjil ke-" + (i + 1) + ": ");
                int angka = scanner.nextInt();
                if (angka % 2 == 1) {
                    angkaGanjil[i] = angka;
                    break;
                } else {
                    System.out.println("Mohon masukkan angka ganjil.");
                }
            }
        }

        // Menghitung penjumlahan dari array
        int hasilPenjumlahan = 0;
        for (int angka : angkaGanjil) {
            hasilPenjumlahan += angka;
        }

        // Menampilkan hasil
        System.out.println("\nArray Angka Ganjil:");
        for (int angka : angkaGanjil) {
            System.out.print(angka + " ");
        }
        System.out.println("\nHasil Penjumlahan: " + hasilPenjumlahan);

        // Menutup objek Scanner
        scanner.close();
    }
}

    

