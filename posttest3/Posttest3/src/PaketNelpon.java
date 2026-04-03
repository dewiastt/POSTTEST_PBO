public class PaketNelpon extends Produk {

    private String nama;
    private int menit;

    public PaketNelpon(String nama, int menit, int harga) {
        super(harga);
        this.nama = nama;
        this.menit = menit;
    }

    public String getNama() {
        return nama;
    }

    public int getMenit() {
        return menit;
    }
}