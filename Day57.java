package latihan;
import java.util.Scanner;
public class Day57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] buah = new String[4];
        
        for(int i = 0; i < buah.length; i++){
            System.out.print("buah ke-" + i + ": ");
            buah[i]=input.nextLine();
            
        }
    }
}
