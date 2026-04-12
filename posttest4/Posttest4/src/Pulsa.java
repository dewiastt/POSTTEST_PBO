public class Pulsa extends Produk {

    private String provider;
    private int nominal;

    public Pulsa(String provider, int nominal, int harga) {
        super(harga);
        this.provider = provider;
        this.nominal = nominal;
    }

    @Override
    public void tampil() {
        System.out.println("Pulsa: " + provider +
                " " + nominal +
                " Harga: " + harga);
    }
}