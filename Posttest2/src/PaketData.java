public class PaketData {

    private String namaPaket;
    private String kuota;

    protected int harga;

    public PaketData(String namaPaket, String kuota, int harga) {
        this.namaPaket = namaPaket;
        this.kuota = kuota;
        this.harga = harga;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public String getKuota() {
        return kuota;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak valid");
        }
    }

}