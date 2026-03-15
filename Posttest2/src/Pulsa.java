public class Pulsa {

    private String provider;
    private int nominal;
    private int harga;

    int stok;

    public Pulsa(String provider, int nominal, int harga) {
        this.provider = provider;
        this.nominal = nominal;
        this.harga = harga;
        this.stok = 10;
    }

    public String getProvider() {
        return provider;
    }

    public int getNominal() {
        return nominal;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif");
        }
    }

}