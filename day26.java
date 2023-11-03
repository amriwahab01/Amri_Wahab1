package latihan;

import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine().toLowerCase(); // Mengonversi ke huruf kecil untuk perbandingan yang tepat

        int jumlahKonsonan = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);
            if (Character.isLetter(karakter) && karakter != 'a' && karakter != 'e' && karakter != 'i' && karakter != 'o' && karakter != 'u') {
                jumlahKonsonan++;
            }
        }

        System.out.println("Jumlah huruf konsonan dalam kalimat: " + jumlahKonsonan);

        input.close();
    }
}
        
        
  
