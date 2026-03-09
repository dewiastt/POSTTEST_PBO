class Pulsa {
    String provider;
    int nominal;
    int harga;

    Pulsa(String provider, int nominal, int harga) {
        this.provider = provider;
        this.nominal = nominal;
        this.harga = harga;
    }
}

class PaketData {
    String namaPaket;
    String kuota;
    int harga;

    PaketData(String namaPaket, String kuota, int harga) {
        this.namaPaket = namaPaket;
        this.kuota = kuota;
        this.harga = harga;
    }
}