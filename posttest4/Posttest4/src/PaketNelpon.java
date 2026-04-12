public class PaketNelpon extends Produk {

    private String nama;
    private int menit;

    public PaketNelpon(String nama, int menit, int harga) {
        super(harga);
        this.nama = nama;
        this.menit = menit;
    }

    @Override
    public void tampil() {
        System.out.println("Paket Nelpon: " + nama +
                " (" + menit + " menit)" +
                " Harga: " + harga);
    }
}