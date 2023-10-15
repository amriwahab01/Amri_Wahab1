package latihan;
public class day7 {
    public static void main(String[] args) {
        int s = 12;
        int luas = luas_kubus(s);
        System.out.println(luas);
        
    }
    // membuat fungsi luas persegi()
    static int luas_persegi (int sisi){
        return sisi * sisi;
    }
    //membuuat fungsi luas kubus()
    static int luas_kubus (int sisi){
    // memanggil sisi luas persegi
        return 6 * luas_persegi (sisi);
       
    }
    
}
