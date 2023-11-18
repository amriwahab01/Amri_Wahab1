package latihan;

import java.util.ArrayList;
import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> genap = new ArrayList<Integer>();
        ArrayList<Integer> ganjil = new ArrayList<Integer>();
        System.out.print("masukkan nilai awal : ");
        int awal = input.nextInt();
        System.out.print("masukkan  nilai akhir");
        int akhir = input.nextInt();
        
        for (int i = awal ; i < akhir+1;i++ ){
            if (i % 2 == 0){
                genap.add(i);
               
            }else{
                ganjil.add(i);
                
            }
        }
        System.out.println(genap);
        System.out.println(ganjil);
        
        int jumlahGenap = genap.get(0);
        int jumlahGanjjil = ganjil.get(0);
        
        for (int i = 1; i < genap.size(); i++){
            jumlahGenap -= genap.get(i);
        }
        for (int i = 1;i < ganjil.size(); i++){
            jumlahGanjjil -= ganjil.get(i);
        }
        System.out.println(jumlahGenap);
        System.out.println(jumlahGanjjil);
        
    }
    
}
