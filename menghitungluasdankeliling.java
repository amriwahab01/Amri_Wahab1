package latihan;
import java.util.Scanner;
public class menghitungluasdankeliling {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilihan;
        do {
            System.out.println("pilih bagun datar yang di hitung");
            System.out.println("1.persegi");
            System.out.println("2.persegi panjjang");
            System.out.println("3.segi tiga");
            System.out.println("4.jajar genjjang");
            System.out.println("5.trapesium");
            System.out.println("6.layang-layang");
            System.out.println("7.belah ketupat");
            System.out.println("8.lingkaran");
            System.out.println("0.keluar");
            System.out.print("masukkan pilihan :");
            pilihan = input.nextInt();
            
            switch (pilihan){
                case 1:
                    hitungPersegi();
                    break;
                case 2:
                    hitungPersegiPanjjang();
                    break;
                case 3:
                    hitungSegiTiga();
                    break;
                case 4:
                    hitungJajarGenjang();
                    break;
                case 5:
                    hitungTrapesium();
                    break;
                case 6:
                    hitungLayanglayang();
                    break;
                case 7:
                    hitungBelahKetupat();
                    break;
                case 8:
                    hitungLingkaran();
                    break;
                case 0:
                    System.out.println("terimah kasih");
                    break;
                default:
                    System.out.println("tidak valid");
                    break;
            }
        }while (pilihan != 0 );
        
    }
    public static void hitungPersegi(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan panjjang :");
        double sisi = input.nextDouble();
        double luas = sisi * sisi;
        double keliling = 4 * sisi;
        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);
    }

    public static void hitungPersegiPanjjang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);
        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
    }

    public static void hitungSegiTiga() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga: " + luas);
    }

    public static void hitungJajarGenjang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        double keliling = 2 * (alas + tinggi);
        System.out.println("Keliling jajar genjang: " + keliling);
    }

    public static void hitungTrapesium() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi atas: ");
        double sisiAtas = input.nextDouble();
        System.out.print("Masukkan panjang sisi bawah: ");
        double sisiBawah = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        double luas = 0.5 * (sisiAtas + sisiBawah) * tinggi;
        double keliling = sisiAtas + sisiBawah + 2 * tinggi;
        System.out.println("Luas trapesium: " + luas);
        System.out.println("Keliling trapesium: " + keliling);
    }

    public static void hitungLayanglayang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan diagonal 1: ");
        double diagonal1 = input.nextDouble();
        System.out.print("Masukkan diagonal 2: ");
        double diagonal2 = input.nextDouble();
        double luas = 0.5 * diagonal1 * diagonal2;
        System.out.println("Luas layang-layang: " + luas);
    }

    public static void hitungBelahKetupat() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan diagonal 1: ");
        double diagonal1 = input.nextDouble();
        System.out.print("Masukkan diagonal 2: ");
        double diagonal2 = input.nextDouble();
        double keliling = 4 * Math.sqrt((0.25 * diagonal1 * diagonal1) + (0.25 * diagonal2 * diagonal2));
        System.out.println("Keliling belah ketupat: " + keliling);
    }

    public static void hitungLingkaran() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();
        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }
}
