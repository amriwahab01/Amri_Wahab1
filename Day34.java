package latihan;

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
      System.out.println("masukkan penghasilan bulanan :");
        int penghasilan ;
        penghasilan = input.nextInt();
        
        int penghasillanzakat = 5240000 ;
        if (penghasilan > penghasillanzakat){
            double besarzakat = 0.025 * penghasillanzakat;
            System.out.println("maka beasar zakat adalah "+ besarzakat);
        }else{
            System.out.println("besar zakat adalah 0");
        }
        
    }
   
}
