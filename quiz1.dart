// //no 1
// void main() {
//   String nama = "amri";
//   print(nama);
// }
// // import 'dart:io';

// // no 4
// import 'dart:io';

// void main() {
//   stdout.write("masukkan sisi : ");
//   double sisi = double.parse(stdin.readLineSync()!);
//   double luaspersegi = sisi * sisi;
//   print("hasil luas persegi: $luaspersegi");

//   stdout.write("masukkan alas :");
//   double alas = double.parse(stdin.readLineSync()!);
//   stdout.write("masukkan tinggi :");
//   double tinggi = double.parse(stdin.readLineSync()!);
//   double luassegitiga = 0.5 * alas * tinggi;
//   print("hasil luas segitiga = $luassegitiga");

//   stdout.write("masukkan jari :");
//   double jari = double.parse(stdin.readLineSync()!);
//   double luaslingkaran = 22 / 7 * jari * jari;
//   print("hasil luas lingkaran = $luaslingkaran");
// }

// // no 2
void main() {
  double sisi = 2.19;
  double luasper = sisi * sisi;
  print("hasil : $luasper");

  double alas = 20;
  double tinggi = 20;
  double luassegitiga = 0.5 * alas * tinggi;
  print("hasil : $luassegitiga");

  double jari = 30;
  double luaslingkaran = 22 / 7 * jari * jari;
  print("hasil : $luaslingkaran");
}

// no 3
// import 'dart:io';

// void main() {
//   print("nama depan");
//   String namadepan = stdin.readLineSync()!;
//   print("nama belakan");
//   String namabe = stdin.readLineSync()!;
//   print("nama lengkap: $namadepan $namabe");
// }

// // Nomor 5
// import 'dart:io';

// void main() {
//   print('masukkan angka: ');
//   int angka = int.parse(stdin.readLineSync()!);

//   if (angka % 2 == 0) {
//     print('angka genap');
//   } else {
//     print('angka ganjil');
//   }
// }
