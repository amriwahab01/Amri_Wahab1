package latihan;
import java.util.Scanner;
public class Day64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = input.nextInt();

        // Mendeklarasikan array dengan ukuran yang dimasukkan oleh pengguna
        int[] angkaArray = new int[jumlahElemen];

        // Meminta pengguna memasukkan nilai untuk setiap elemen array
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai untuk elemen ke-" + (i + 1) + ": ");
            angkaArray[i] = input.nextInt();
        }

        // Menampilkan isi array
        System.out.print("Isi array: ");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print(angkaArray[i] + " ");
        }

        // Menghitung jumlah elemen dalam array
        int jumlah = 0;
        for (int i = 0; i < jumlahElemen; i++) {
            jumlah += angkaArray[i];
        }

        // Menampilkan jumlah elemen dalam array
        System.out.println("\nJumlah elemen dalam array: " + jumlah);
    }
    
}
