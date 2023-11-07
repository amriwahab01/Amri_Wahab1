package latihan;

public class Day30 {
    public static void main(String[] args) {
        int jumlahhariker = 25;
        int gajikotorperH = 1200000;
        int uangmakan = 15000;
        
        int gajikotor = gajikotorperH * jumlahhariker;
        int totaluangmakan = uangmakan * jumlahhariker;
        int gajibersih = gajikotor - totaluangmakan;
        System.out.println("===========STRUCTUR KARIAWAN===============");
        System.out.println("jumlah hari kerja = " + jumlahhariker);
        System.out.println("gaji kotor perhari = " + gajikotorperH);
        System.out.println("uang makan = " + uangmakan);
        System.out.println("gaji kotor :" + gajikotor );
        System.out.println("total uang makan :" + totaluangmakan);
        System.out.println("total gaji bersih adalah : "+gajibersih);
        System.out.println("===========================================");
    }
    
}
