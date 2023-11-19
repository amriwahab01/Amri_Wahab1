package latihan;

import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai");
        int nilai = input.nextInt();
        
        for(int i = 0 ; i <= nilai ; i++){
            System.out.print("+---".repeat(i + 1));
            System.out.println("+");
            
            System.out.print("|   ".repeat(i + 1));
            System.out.println("|");
        }
        
        System.out.print("+---".repeat(nilai + 1));
        System.out.println("+");
    }
    
}
