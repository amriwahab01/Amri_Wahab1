package latihan;

import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan nilai awal :");
        int nilaiAwal = input.nextInt();
        
        System.out.print("masukkan nilai akhir :");
        int nilaiAkhir = input.nextInt();
        
        for (int i = nilaiAwal; i > nilaiAkhir-1;i--){
            if (i % 2 == 0){
                System.out.println(i+ " : adalah bilangab genap");
            }else{
                System.out.println(i+ " : adalah bilangan ganjil");
            }
            
        }
        
    }
    
}
