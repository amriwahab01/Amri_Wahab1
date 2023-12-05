package latihan;
import java.util.Scanner;
public class Day58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[][] meja = new String[2][3];
        
        for(int i = 0; i< meja.length;i++){
            for(int x = 0;x<meja[i].length;x++){
                System.out.format("siapa kira2 yang duduk di meja (%d,%d):",i,x);
                meja[i][x]=input.nextLine();
                    
                }
            }
        System.out.println("-----------------------------");
        for(int i = 0;i<meja.length;i++){
            for(int x = 0; x< meja[i].length;x++){
                System.out.format("| %s | \t",meja[i][x]);
            }
            System.out.println("");
        }
        System.out.println("------------------------------");
    }
    
}
