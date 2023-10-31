package latihan;

public class ArrayDay23 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        // Menghitung jumlah elemen dalam array
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        // Mencetak jumlah elemen
        System.out.println("Jumlah elemen dalam array: " + sum);
    }
}
   