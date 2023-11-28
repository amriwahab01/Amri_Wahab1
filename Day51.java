package latihan;

import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("masukkan nilai : ");
            int nilai1 = input.nextInt();
            if (nilai1 % 2 == 0){
                break;
            }
        }
    }
}
    
 
