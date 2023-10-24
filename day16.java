package latihan;
public class day16 {
    public static void main(String[] args) {
        int hargaRedmiNote9 = 2400000;  // Harga HP Redmi Note 9
        int modal = 20000;              // Modal awal Fyan
        int hargaKartuByu = 50000;      // Harga satu kartu Byu
        int tanggunganWifi = 300000;    // Biaya wifi per bulan
        int kartuTerjual = 0;           // Jumlah kartu Byu terjual
        int tahun = 0;                  // Jumlah tahun

        while (modal < hargaRedmiNote9) {
            // Penjualan kartu Byu
            kartuTerjual += tahun;
            
            // Pendapatan dari penjualan kartu Byu
            int pendapatan = kartuTerjual * hargaKartuByu;

            // Pengurangan biaya wifi per bulan
            modal += pendapatan - tanggunganWifi * 12;
            
            // Penambahan tahun
            tahun++;
        }

        System.out.println("Fyan dapat membeli HP Redmi Note 9 dalam " + tahun + " tahun.");
    }
}

