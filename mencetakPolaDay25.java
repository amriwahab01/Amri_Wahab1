
package latihan;

public class mencetakPolaDay25 {
    public static void main(String[] args) {
         int tinggi = 5; // Ganti nilai ini sesuai dengan tinggi segitiga yang diinginkan

        for (int baris = 1; baris <= tinggi; baris++) {
            for (int kolom = tinggi; kolom >= baris; kolom--) {
                System.out.print("*");
            }
            System.out.println(); // Pindah ke baris berikutnya setelah mencetak bintang
        }
    }
}
    
