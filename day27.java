package latihan;

import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan sebuah bilangan bulat positif: ");
        int bilangan = input.nextInt();

        if (bilangan <= 1) {
            System.out.println("Bukan bilangan prima.");
        } else if (isPrima(bilangan)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }

        input.close();
    }

    public static boolean isPrima(int bilangan) {
        if (bilangan <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(bilangan); i++) {
            if (bilangan % i == 0) {
                return false;
            }
        }
        return true;
    }
}

   
