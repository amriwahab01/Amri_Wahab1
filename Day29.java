//restoran memiliki daftar menu dengan harga berikut:
//Nasi Goreng (Rp 25.000), Mie Ayam (Rp 20.000), dan Es Teh (Rp 5.000).
//Jika seseorang memesan satu porsi Nasi Goreng dan satu porsi Mie Ayam,
//berapa total harga pesanan mereka?
package latihan;

public class Day29 {
    public static void main(String[] args) {
        int nasiGor = 25000;
        int mieAyam = 20000;
        //int esTeh = 5000;
        
        int pesananNasiGor = 1 ;
        int pesananMieAyam = 1 ;
        
        int totalHarga = (nasiGor * pesananNasiGor) + (mieAyam * pesananMieAyam);
        System.out.println("total harga pesanan :" + totalHarga);
    }
    
}
