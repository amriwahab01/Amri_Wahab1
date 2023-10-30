package latihan;

import java.util.Scanner;

public class menampilkanNilai_min_Dan_max {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nilai a: ");
        double a = input.nextDouble();

        System.out.println("Masukkan nilai b: ");
        double b = input.nextDouble();

        System.out.println("Masukkan nilai c: ");
        double c = input.nextDouble();

        System.out.println("Masukkan nilai d: ");
        double d = input.nextDouble();

        System.out.println("Masukkan nilai e: ");
        double e = input.nextDouble();

        // Temukan nilai minimum
        double min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        if (e < min) {
            min = e;
        }

        // Temukan nilai maksimum
        double max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        if (e > max) {
            max = e;
        }

        System.out.println("Nilai minimum: " + min);
        System.out.println("Nilai maksimum: " + max);

        input.close();
    }
}
