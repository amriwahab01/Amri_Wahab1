package latihan;
import java.util.ArrayList;
import java.util.Scanner;
public class Day61 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
         ArrayList x = new ArrayList();
        
        x.add("amri");
        x.add(20);
        x.add("laki-laki");
        x.add(123445);
        x.add(true);
        
        x.remove(0);
        System.out.println(x);
    }
    
}
