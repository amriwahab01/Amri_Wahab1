package latihan;

public class imformasiidentitasdatadiri {
    public static void main(String[] args) {
        String nama = "Amri Wahab";
        String nim = "D0221332";
        int umur = calculateUmurFromNIM(nim);
        String kelas = "Informatika E 2023";
        double beratBadan = 55.0;
        double tinggiBadan = 1.78;
        double bmi = calculateBMI(beratBadan, tinggiBadan);
        String alamat = "pambusuang";

        System.out.println("Nama  : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Umur  : " + umur + " tahun");
        System.out.println("Kelas  : " + kelas);
        System.out.println("Berat Badan  : " + beratBadan + " Kg");
        System.out.println("Tinggi Badan  : " + tinggiBadan + " m");
        System.out.println("BMI  : " + bmi);
        System.out.println("Alamat  : " + alamat);
    }

    public static int calculateUmurFromNIM(String nim) {
        // Mengambil 2 digit terakhir dari NIM
        String nimDigit = nim.substring(nim.length() - 2);
        // Mengonversi ke integer
        int nimNumber = Integer.parseInt(nimDigit);
        // Umur dihitung dari 100 - nimNumber
        int umur = 53 - nimNumber;
        return umur;
    }

    public static double calculateBMI(double beratBadan, double tinggiBadan) {
        // Menghitung BMI menggunakan rumus
        return beratBadan / (tinggiBadan * tinggiBadan);
    }
}

    

