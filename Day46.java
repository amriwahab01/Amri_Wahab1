package latihan;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka :");
        int angka = input.nextInt();
        
        for (int i = 0; i <= angka ; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
    
}
