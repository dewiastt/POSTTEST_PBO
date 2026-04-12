public class PaketData extends Produk {

    private String namaPaket;
    private String kuota;

    public PaketData(String namaPaket, String kuota, int harga) {
        super(harga);
        this.namaPaket = namaPaket;
        this.kuota = kuota;
    }

    @Override
    public void tampil() {
        System.out.println("Paket Data: " + namaPaket +
                " (" + kuota + ")" +
                " Harga: " + harga);
    }
}