package latihan;

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga_jual_permeter = 300000;
        System.out.print("masukkan luas tanah :");
        int luas_tanah = input.nextInt();
        
        
        int harga_jual = harga_jual_permeter * luas_tanah;
        
        if (harga_jual >= 100000000 ){
            double pajak = 0.05 * harga_jual;
            harga_jual-=pajak;
            System.out.println("kenapajak 5%");
        }else if (harga_jual >= 50000000){
            double pajak = 0.03 * harga_jual;
            harga_jual-=pajak;
            System.out.println("kenapajak 3%");
            
        }else{
            double pajak = 0.01 * harga_jual;
            harga_jual-=pajak;
            System.out.println("kenapajak 1%" );
                
            }
        System.out.println("jadi total uang bersih penjualan tanah setelah di potong pajak senilai  :" +harga_jual+"Rp");
        }
}       
        
        
        
    
    

