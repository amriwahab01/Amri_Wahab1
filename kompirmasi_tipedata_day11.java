package latihan;

import java.util.Scanner;

public class kompirmasi_tipedata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("apakah anda suka dengan Isc? (true/false)");
        boolean sukaIsc = input.nextBoolean();
        System.out.print("berapa usia anda? : ");
        int usia = input.nextInt();
        input.nextLine();
        System.out.print("apa pekerjaan anda? : ");
        String pekerja = input.nextLine();
        
        
        System.out.println("anda suka ISC? : " + sukaIsc);
        System.out.println("berapa usia anda? : " + usia);
        System.out.println("apa pekerjaan anda? :" +pekerja);
        
        input.close();
        
    }
}
