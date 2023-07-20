# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi penjualan laptop menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini memungkinkan pengguna untuk mencatat data penjualan laptop, termasuk ID Pelanggan, Nama Pelanggan, Laptop yang dibeli, Harga Laptop, dan Jumlah Pembelian. Aplikasi ini juga menghitung total harga pembelian berdasarkan harga laptop dan jumlah yang dibeli.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, IO Sederhana, ArrayList, dan Error Handling.

## Penjelasan Kode

Berikut adalah penjelasan singkat mengenai konsep OOP yang diimplementasikan dalam kode:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `PenjualanLaptop`, `PenjualanDetail`, dan `PenjualanBeraksi` adalah contoh dari class.

2. **Object** adalah instance dari class. Pada kode ini, `PenjualanLaptop penjualan = new PenjualanLaptop(id, namaPelanggan, "Laptop Gaming", hargaLaptop, jumlahLaptop);` adalah contoh pembuatan object.

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `id`, `namaPelanggan`, `laptop`, `hargaLaptop`, dan `jumlah` adalah contoh atribut.

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `PenjualanLaptop` dan `PenjualanDetail`.

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setId`, `setNamaPelanggan`, `setLaptop`, `setHargaLaptop`, dan `setJumlah` adalah contoh method mutator.

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getId`, `getNamaPelanggan`, `getLaptop`, `getHargaLaptop`, dan `getJumlah` adalah contoh method accessor.

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `id`, `namaPelanggan`, `laptop`, `hargaLaptop`, dan `jumlah` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PenjualanDetail` mewarisi `PenjualanLaptop` dengan sintaks `extends`.

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Pada kode ini, method `displayInfo(String)` di `PenjualanLaptop` merupakan overloading method dan `displayInfo` di `PenjualanDetail` merupakan override dari method di `PenjualanLaptop`.

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam `PenjualanLaptop` dan seleksi `while` dan `if` dalam `PenjualanBeraksi`.

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk meminta input dan menampilkan data.contohnya while (true) {
                System.out.println("===== Penjualan Laptop =====");
                System.out.println("Merk Laptop: " + merkTerpilih);
                System.out.println("Harga Laptop: Rp" + hargaLaptop);
                System.out.println("============================");
                System.out.print("ID Pelanggan: ");
                String id = scanner.nextLine();
                System.out.print("Nama Pelanggan: ");
                String namaPelanggan = scanner.nextLine();
                System.out.print("Jumlah Laptop yang dibeli: ");
                int jumlahLaptop = Integer.parseInt(scanner.nextLine());

                int totalHarga = hargaLaptop * jumlahLaptop;

13. **IO Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

14. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PenjualanDetail[] penjualanArr = new PenjualanDetail[5];` adalah contoh penggunaan array.

15. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error dalam `PenjualanBeraksi`.

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Yofie Elyandra Dwirizky
NPM: 2110010071
