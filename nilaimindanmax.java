package latihan;
import java.util.Scanner;
public class nilaimindanmax {
//    SOAL NO 1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();

        double min = Math.min(a, b);
        double max = Math.max(a, b);

        System.out.println("Nilai MIN: " + min);
        System.out.println("Nilai MAX: " + max);

        input.close();
    }
}

// SOAL N0 2

//        Scanner input = new Scanner(System.in);
//
//                System.out.print("Masukkan nilai a: ");
//                double a = input.nextDouble();
//
//                System.out.print("Masukkan nilai b: ");
//                double b = input.nextDouble();
//
//                System.out.print("Masukkan nilai c: ");
//                double c = input.nextDouble();
//
//                System.out.print("Masukkan nilai d: ");
//                double d = input.nextDouble();
//
//                System.out.print("Masukkan nilai e: ");
//                double e = input.nextDouble();
//
//                double min = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
//                double max = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
//
//                System.out.println("Nilai MIN: " + min);
//                System.out.println("Nilai MAX: " + max);
//
//                input.close();
//            }
//        }