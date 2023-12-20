package latihan;
import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan panjang sisi kubus (cm): ");
        double sisi = input.nextDouble();

        double luasKubus = 6 * Math.pow(sisi, 2);

        double volumeKubus = Math.pow(sisi, 3);

        System.out.println("Luas Kubus: " + luasKubus + " cm^2");
        System.out.println("Volume Kubus: " + volumeKubus + " cm^3");

    }
}

    
