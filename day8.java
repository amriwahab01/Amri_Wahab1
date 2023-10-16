package latihan;
class mahasiswa {
    String nama;
    int umur;
    String alamat;
    
    mahasiswa(String inputNama,int inputUmur,String inputAlamat){
        nama = inputNama;
        umur = inputUmur;
        alamat = inputAlamat;
        
        System.out.println(nama);
        System.out.println(umur);
        System.out.println(alamat);
    }
}

public class day8 {
    public static void main(String[] args) {
        mahasiswa mahasiswa01 = new mahasiswa ("amri wahab",20,"sabang subik");
        mahasiswa mahasiswa02 = new mahasiswa ("muslih",18,"sendana");
    }
    
}
