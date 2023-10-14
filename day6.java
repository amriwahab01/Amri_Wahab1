
package latihan;
import java.util.Scanner;
public class day6 {
    public static void main(String[] args) {
        String nama;
        String jurusan;
        int umur;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("nama :");
        nama = sc1.nextLine();
        System.out.print("jurusan :");
        jurusan = sc1.nextLine();
        System.out.print("umur :");
        umur = sc1.nextInt();
        
        System.out.println("masukkan nama anda : "+ nama);
        System.out.println("masukkan jurusan anda : "+jurusan);
        System.out.println("masukkan umur anda : "+ umur);
        
    }
    
}
