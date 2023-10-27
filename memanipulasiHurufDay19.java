package latihan;
import java.util.Scanner;
public class memanipulasiHurufDay19 {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);
      for (int i = 0; i < 3; i++) {
        System.out.println("masukkan sebuah kalimat :");
        String masukkan = inputt.nextLine();
  
        String encryptedSentence = encryptVowels(masukkan);
        
        System.out.println("kalimat setelah dienkripsi :" + encryptedSentence);
          }
    }
    public static String encryptVowels (String sentence){
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < sentence.length(); i++){
            char currentChar = sentence.charAt(i);
            if (isVowel(currentChar)){
                if(currentChar == 'a'){
                    result.append("apa");
                } else if (currentChar == 'i'){
                    result.append("ipi");
                } else if (currentChar == 'u'){
                    result.append("upu");
                    
                }
            }else{
                result.append(currentChar);
            }
        }
    return result.toString();
    }   
public static boolean isVowel(char c){
    c = Character.toLowerCase(c);
    return c == 'a' || c == 'i' || c == 'u';
}
    

    
}
