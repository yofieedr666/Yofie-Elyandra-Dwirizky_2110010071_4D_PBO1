
package pbo4d;

public class PenjualanLaptop {
    // Atribut
    private String id; // ID pelanggan
    private String namaPelanggan; // Nama pelanggan
    private String laptop; // Jenis laptop yang dibeli
    private int hargaLaptop; // Harga satu laptop
    private int jumlah; // Jumlah laptop yang dibeli

    // Constructor
    public PenjualanLaptop(String id, String namaPelanggan, String laptop, int hargaLaptop, int jumlah) {
        this.id = id;
        this.namaPelanggan = namaPelanggan;
        this.laptop = laptop;
        this.hargaLaptop = hargaLaptop;
        this.jumlah = jumlah;
    }

    // Mutator untuk mengubah nilai ID pelanggan
    public void setId(String id) {
        this.id = id;
    }

    // Mutator untuk mengubah nilai nama pelanggan
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    // Mutator untuk mengubah nilai jenis laptop
    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    // Mutator untuk mengubah nilai harga laptop
    public void setHargaLaptop(int hargaLaptop) {
        this.hargaLaptop = hargaLaptop;
    }

    // Mutator untuk mengubah nilai jumlah laptop
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Accessor untuk mendapatkan nilai ID pelanggan
    public String getId() {
        return id;
    }

    // Accessor untuk mendapatkan nilai nama pelanggan
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    // Accessor untuk mendapatkan nilai jenis laptop
    public String getLaptop() {
        return laptop;
    }

    // Accessor untuk mendapatkan nilai harga laptop
    public int getHargaLaptop() {
        return hargaLaptop;
    }

    // Accessor untuk mendapatkan nilai jumlah laptop
    public int getJumlah() {
        return jumlah;
    }

    // Method untuk menghitung total harga pembelian
    public int getTotalHarga() {
        return hargaLaptop * jumlah;
    }

    // Method untuk menampilkan informasi pembelian
    public String displayInfo() {
        String info = "======== NOTA PEMBELIAN ========"
                + "\nID Pelanggan: " + getId()
                + "\nNama Pelanggan: " + getNamaPelanggan()
                + "\nLaptop: " + getLaptop()
                + "\nHarga Laptop: Rp" + getHargaLaptop()
                + "\nJumlah Pembelian: " + getJumlah()
                + "\nTotal Harga: Rp" + getTotalHarga()
                + "\n=================================";
        return info;
    }
}
