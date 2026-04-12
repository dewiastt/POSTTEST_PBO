public class Produk {

    protected int harga;

    public Produk(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    // Overloading 1
    public void setHarga(int harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak valid");
        }
    }

    // Overloading 2 (dengan diskon)
    public void setHarga(int harga, int diskon) {
        if (harga > 0 && diskon >= 0) {
            this.harga = harga - diskon;
        } else {
            System.out.println("Input tidak valid");
        }
    }

    public void tampil() {
        System.out.println("Produk harga: " + harga);
    }
}