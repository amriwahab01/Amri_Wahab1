package latihan;


import java.util.Scanner;

public class memasukkanduaangka_melakukanoperasiaritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // meminta pengguna untuk memasukkan dua angka 
        System.out.println("masukkan angka pertama :");
        double angkaPertama = input.nextDouble();
        
        System.out.println("masukkan angka kedua :");
        double angkaKedua = input.nextDouble();
        
//        melakukan operasi penjumlahan
        double hasilPenjumlahan = angkaPertama + angkaKedua;
        System.out.println("hasil penjumlahan :" + hasilPenjumlahan);
        
//        melakukan operasi pengurangan
        double hasilPengurangan = angkaPertama - angkaKedua;
        System.out.println("hasil pengurangan :" + hasilPengurangan);

//        melakukan operasi perkalian
        double hasilPerkalian = angkaPertama * angkaKedua;
        System.out.println("hasil perkalian :"+ hasilPerkalian);
        
//        melakukan hasil pembagian
        if (angkaKedua != 0) {
            double hasilPembagian = angkaPertama / angkaKedua;
            System.out.println("hasil pembagian :" + hasilPembagian);
        }else{
            System.out.println("tidak melakukan pembagian karna angka ke dua adalah 0");
        }
        input.close();
        
        }
    }

