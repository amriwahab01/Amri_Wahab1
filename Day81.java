package latihan;
import java.util.Scanner;
public class Day81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data karyawan
        System.out.print("Masukkan nama karyawan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan gaji dasar: ");
        double gajiDasar = scanner.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double tunjangan = scanner.nextDouble();

        System.out.print("Masukkan potongan pajak: ");
        double potonganPajak = scanner.nextDouble();

        // Hitung gaji total
        double gajiTotal = gajiDasar + tunjangan - potonganPajak;

        // Tampilkan hasil
        System.out.println("\n===== Hasil Perhitungan Gaji =====");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Gaji Dasar: " + gajiDasar);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Potongan Pajak: " + potonganPajak);
        System.out.println("Gaji Total: " + gajiTotal);
    }
}

