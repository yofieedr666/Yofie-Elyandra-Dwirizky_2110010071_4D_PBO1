package pbo4d;

import java.util.ArrayList;
import java.util.Scanner;

public class PenjualanBeraksi {

    // Daftar harga laptop disini juga terdapat array
    private static final int[] daftarHargaLaptop = {5000000, 4500000, 5500000}; // Asus, Acer, HP

    public static void main(String[] args) {
        // Atribut
        int hargaLaptop = daftarHargaLaptop[0]; // Harga laptop saat ini
        String jawab;

        // Error handling
        try {
            // Input/Output sederhana
            Scanner scanner = new Scanner(System.in);

            // ArrayList untuk menyimpan data penjualan
            ArrayList<PenjualanLaptop> penjualanList = new ArrayList<>();

            // Perulangan while
            while (true) {
                System.out.println("===== Penjualan Laptop =====");
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
                PenjualanLaptop penjualan = new PenjualanLaptop(id, namaPelanggan, "Laptop Gaming", hargaLaptop, jumlahLaptop);
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
