package latihan;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("gaji pokok : ");
        int gaji_pokok = input.nextInt();
        
        System.out.println("lama lembur :");
        int lama_lembur = input.nextInt();
        
        int gaji_lemburPerJam = 55000;
        
        int gaji = gaji_lemburPerJam * lama_lembur;
        int gaji_bersih = gaji + gaji_pokok;
        System.out.println("gaji bersih yang di terima kariawan : "+gaji_bersih);
    }
    
}
