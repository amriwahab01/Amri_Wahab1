package latihan;
import java.util.Scanner;
public class Day67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah nilai: ");
        int jumlahNilai = input.nextInt();
        double[] nilaiArray = new double[jumlahNilai];
        
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiArray[i] = input.nextDouble();
        }
        System.out.print("Nilai yang dimasukkan: ");
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print(nilaiArray[i] + " ");
        }
        double total = 0;
        for (int i = 0; i < jumlahNilai; i++) {
            total += nilaiArray[i];
        }

        double rataRata = total / jumlahNilai;
        System.out.println("\nRata-rata nilai: " + rataRata);

    }
}
       