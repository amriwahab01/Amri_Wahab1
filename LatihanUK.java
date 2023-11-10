package latihanuk;

import java.util.Scanner;



public class LatihanUK {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka :");
        int angka ;
        angka = input.nextInt();
        for (int i = 1; i <= angka ; i++){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                
            }
            
            
        }
        
    }
}
//        System.out.println("masukkan penghasilan bulanan :");
//        int penghasilan ;
//        penghasilan = input.nextInt();
//        
//        int penghasillanzakat = 5240000 ;
//        if (penghasilan > penghasillanzakat){
//            double besarzakat = 0.025 * penghasillanzakat;
//            System.out.println("maka beasar zakat adalah "+ besarzakat);
//        }else{
//            System.out.println("besar zakat adalah 0");
//        }
//    }
//}
       
    
        
//        System.out.print("masukkan username : ");
//        String username ;
//        username = input.nextLine();
//        System.out.println("masukkan pasword :");
//        int pasword ;
//        pasword = input.nextInt();
//        
//        if (pasword == 234 || "Amri" == username){
//            System.out.println("login berhasil" );
//        }else{
//            System.out.println("login gagal" );
//        }
//        
//        
//    }
//}
////        int gajibulanan = 5000000;
////        int potongangaji = 25000;
////        int tanpaketerangan = 3;
////        
////        if ( tanpaketerangan > 3 ){
////            int makadiberipotongan = gajibulanan - potongangaji;
////            
//////            double pajak = 0.05 * gajidipotong;
//////            double gajibersih = pajak - gajibulanan;
////            System.out.println("gajibersih kariawan :" + makadiberipotongan);
////        }
            
        


//        System.out.println("masukkan harga hp :");
//        int hargahp ; 
//        hargahp = input.nextInt();
//        System.out.println("masukkan gaji pokok : ");
//        int gajipokok;
//        gajipokok = input.nextInt();
//        System.out.println("masukkan uang kost : ");
//        int uangkost ;
//        uangkost = input.nextInt();
//        int uangditabung = 1500000;
//        
//        int gajibersih = (gajipokok - uangkost );
//        int berapalama = hargahp / gajibersih;
//        System.out.println("jadi butuh : "+ berapalama);
//        
//        
//        
        


//        System.out.print("masukkan nama depan : ");
//        String namadepan;
//        namadepan = input.nextLine();
//        System.out.print("masukkan nama belakang");
//        String namabelakang ;
//        namabelakang = input.nextLine();
//        System.out.print("masukkan tinggi : ");
//        double tinggi;
//        tinggi = input.nextDouble();
//        System.out.println("masukkan berat badang : ");
//        double beratbadan;
//        beratbadan = input.nextDouble();
//        System.out.println("masukkan ukuran baju :");
//        char ukuranbaju;
//        ukuranbaju = input.next().charAt(0);
//        System.out.println("masu kkan status pernikahan :");
//        boolean pernikahan;
//        pernikahan = input.nextBoolean();
//        System.out.println(namadepan + " " + namabelakang);
//        System.out.println(tinggi);
//        System.out.println(beratbadan);
//        System.out.println(ukuranbaju);
//        System.out.println(pernikahan);
//        
//        
//        
//            }
//            
//}
