package latihan;

import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("masukkan angka :");
            int angka = input.nextInt();
            
            if (angka % 3 == 0 && angka % 5 == 0){
                System.out.println("Master class");
                break;
            }else if (angka % 5 == 0){
                System.out.println("Priode of 5");
            }else if (angka % 3 == 0){
                System.out.println("priode of 3");
        }
    }
}
}
    

