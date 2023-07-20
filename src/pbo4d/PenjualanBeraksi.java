package pbo4d;

import java.util.ArrayList;
import java.util.Scanner;

public class PenjualanBeraksi {

    // Daftar harga laptop disini juga terdapat array
    private static final String[] merkLaptop = {"Asus", "Acer", "HP"};
    private static final int[] daftarHargaLaptop = {5000000, 4500000, 5500000}; // Asus, Acer, HP

    public static void main(String[] args) {
        // Atribut
        String merkTerpilih;
        int hargaLaptop = 0; // Harga laptop saat ini
        String jawab;

        // Error handling
        try {
            // Input/Output sederhana
            Scanner scanner = new Scanner(System.in);

            // ArrayList untuk menyimpan data penjualan
            ArrayList<PenjualanLaptop> penjualanList = new ArrayList<>();

            // Menampilkan daftar merk laptop dan harganya
            System.out.println("===== Daftar Harga Laptop =====");
            for (int i = 0; i < merkLaptop.length; i++) {
                System.out.println((i + 1) + ". " + merkLaptop[i] + " - Rp" + daftarHargaLaptop[i]);
            }
            System.out.println("===============================");

            // Meminta input merk laptop yang ingin dibeli
            System.out.print("Pilih merk laptop [1-3]: ");
            int pilihanMerk = Integer.parseInt(scanner.nextLine());

            // Validasi input merk laptop
            if (pilihanMerk < 1 || pilihanMerk > merkLaptop.length) {
                System.out.println("Merk laptop tidak valid!");
                return;
            } else {
                merkTerpilih = merkLaptop[pilihanMerk - 1];
                hargaLaptop = daftarHargaLaptop[pilihanMerk - 1];
            }

            // Perulangan while
            while (true) {
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

                // Membuat objek PenjualanLaptop dan menambahkan ke dalam ArrayList
                PenjualanLaptop penjualan = new PenjualanLaptop(id, namaPelanggan, merkTerpilih, hargaLaptop, jumlahLaptop);
                penjualanList.add(penjualan);

                System.out.println(penjualan.displayInfo());

                System.out.println("\nApakah Anda Ingin Keluar?");
                System.out.print("Jawab [ya/tidak]: ");
                jawab = scanner.nextLine();
                if (jawab.equalsIgnoreCase("ya")) {
                    break;
                }
            }

            // Menampilkan data penjualan (Output)
            System.out.println("===== DATA PENJUALAN LAPTOP =====");
            for (int i = 0; i < penjualanList.size(); i++) {
                System.out.println("Data ke-" + (i + 1));
                System.out.println(penjualanList.get(i).displayInfo());
            }
            System.out.println("=================================");

        } catch (NumberFormatException e) {
            System.out.println("Kesalahan Format Jumlah Laptop: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
