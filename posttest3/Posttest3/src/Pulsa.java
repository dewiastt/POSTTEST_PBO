public class Pulsa extends Produk {

    private String provider;
    private int nominal;
    private int stok;

    public Pulsa(String provider, int nominal, int harga) {
        super(harga);
        this.provider = provider;
        this.nominal = nominal;
        this.stok = 10;
    }

    public String getProvider() {
        return provider;
    }

    public int getNominal() {
        return nominal;
    }

    public int getStok() {
        return stok;
    }
}