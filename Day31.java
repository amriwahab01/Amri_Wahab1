package latihan;
import java.util.Scanner;
public class Day31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahkariawan = 5;
        int gajikotor = 120000;
        int uangmakan = 15000;
        
        int totalgajibersih = 0;
        
        for(int i = 1; i <= jumlahkariawan;i++){
            System.out.println("masukkan kariawan : " + i);
            int kariawan = input.nextInt();
            int gajibersih = (kariawan * gajikotor)-(kariawan * uangmakan);
            System.out.println("total gaji bersih kariawan : " + gajibersih );
            totalgajibersih += gajibersih;
        }
        System.out.println("jadi total yang harus disiapkan perusahaan sebanyak : " + totalgajibersih);
        
    }
    
}