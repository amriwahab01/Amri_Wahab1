package latihan;

import java.util.Scanner;
public class Day32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang tanah: ");
        int panjangTanah = input.nextInt();
        System.out.print("Masukkan lebar tanah: ");
        int lebar = input.nextInt();
        
        int hargatanah = 500000; 
        int totalhargatanah = panjangTanah * lebar * hargatanah; 
        System.out.println("Total harga tanah: " + totalhargatanah);
    }
}
