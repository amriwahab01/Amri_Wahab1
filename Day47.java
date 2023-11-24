package latihan;

import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan modal awal : " );
        int modalAwal = input.nextInt();
        
        System.out.print("masukkan lama investasi : " );
        int lamaInvestasi = input.nextInt();
        
        double keuntuganTiapTahun = 0.05;
        
        for (int tahun = 0; tahun < lamaInvestasi;tahun++ ){
            System.out.print(tahun + "tahun");
        double keuntungan = keuntuganTiapTahun * modalAwal;
        modalAwal += keuntungan;
        System.out.println( ":Rp" +modalAwal);
        
        
        }
        
    }
  
}

