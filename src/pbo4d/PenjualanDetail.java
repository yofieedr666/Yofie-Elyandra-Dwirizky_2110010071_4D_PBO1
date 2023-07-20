package pbo4d;

// Inheritance
public class PenjualanDetail extends PenjualanLaptop {

    // Constructor
    public PenjualanDetail(String id, String namaPelanggan, String laptop, int hargaLaptop, int jumlah) {
        super(id, namaPelanggan, laptop, hargaLaptop, jumlah);
    }

    // Metode untuk mendapatkan pilihan merk laptop
    public String getPilihMerkLaptop() {
        String kodeMerkLaptop = getLaptop().substring(0, 2);

        // Seleksi
        if (kodeMerkLaptop.equals("01")) {
            return "Asus";
        } else if (kodeMerkLaptop.equals("02")) {
            return "Acer";
        } else if (kodeMerkLaptop.equals("03")) {
            return "HP";
        } else {
            return "Merk Laptop Tidak Diketahui";
        }
    }

    // Metode lainnya
    public void displayDetailLaptop() {
        System.out.println("Detail Laptop:");
        System.out.println("Merk: " + getLaptop());
        System.out.println("Harga: " + getHargaLaptop());
        System.out.println("Jumlah: " + getJumlah());
    }

    // Polymorphism (Overriding)
    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nMerk Laptop: " + getPilihMerkLaptop() +
                "\nHarga Laptop: RP " + getHargaLaptop() +
                "\nJumlah Laptop: " + getJumlah() +
                "\nTotal Harga: RP " + displayInfo1();
    }

    private String displayInfo1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}