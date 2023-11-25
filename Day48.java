package latihan;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("maskkan angka pertama :");
        int angkaPertama = input.nextInt();
        
        System.out.println("masukkan angka ke dua :");
        int angkaKedua = input.nextInt();
        
        int jumlah = angkaPertama + angkaKedua;
        
        if (jumlah % 2 == 1){
            jumlah += 2;
            System.out.println(jumlah);
        }else{
            jumlah+=1;
            System.out.println(jumlah);
            
        }
    }
    
}
