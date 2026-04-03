import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pulsa> listPulsa = new ArrayList<>();
        ArrayList<PaketData> listPaket = new ArrayList<>();
        ArrayList<PaketNelpon> listNelpon = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int menu;

        listPulsa.add(new Pulsa("Telkomsel", 10000, 12000));
        listPaket.add(new PaketData("Internet 5GB", "5GB", 30000));
        listNelpon.add(new PaketNelpon("Nelpon 60 Menit", 60, 15000));

        do {

            System.out.println("\n=== SISTEM PULSA & PAKET DATA ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Update Harga");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {

                case 1:

                    System.out.print("Pilih (1.Pulsa / 2.Paket Data / 3.Paket Nelpon): ");
                    int pilih = sc.nextInt();
                    sc.nextLine();

                    if (pilih == 1) {

                        System.out.print("Provider : ");
                        String provider = sc.nextLine();

                        System.out.print("Nominal : ");
                        int nominal = sc.nextInt();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();

                        listPulsa.add(new Pulsa(provider, nominal, harga));

                    } else if (pilih == 2) {

                        System.out.print("Nama Paket : ");
                        String nama = sc.nextLine();

                        System.out.print("Kuota : ");
                        String kuota = sc.nextLine();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();

                        listPaket.add(new PaketData(nama, kuota, harga));

                    } else if (pilih == 3) {

                        System.out.print("Nama Paket : ");
                        String nama = sc.nextLine();

                        System.out.print("Menit : ");
                        int menit = sc.nextInt();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();

                        listNelpon.add(new PaketNelpon(nama, menit, harga));

                    } else {
                        System.out.println("Pilihan tidak valid");
                    }

                    System.out.println("Data berhasil ditambahkan");
                    break;

                case 2:

                    System.out.println("\n--- Data Pulsa ---");
                    for (int i = 0; i < listPulsa.size(); i++) {
                        Pulsa p = listPulsa.get(i);
                        System.out.println(i + ". " +
                                p.getProvider() + " " +
                                p.getNominal() +
                                " Harga: " +
                                p.getHarga());
                    }

                    System.out.println("\n--- Data Paket Data ---");
                    for (int i = 0; i < listPaket.size(); i++) {
                        PaketData pd = listPaket.get(i);
                        System.out.println(i + ". " +
                                pd.getNamaPaket() +
                                " (" + pd.getKuota() + ")" +
                                " Harga: " +
                                pd.getHarga());
                    }

                    System.out.println("\n--- Data Paket Nelpon ---");
                    for (int i = 0; i < listNelpon.size(); i++) {
                        PaketNelpon pn = listNelpon.get(i);
                        System.out.println(i + ". " +
                                pn.getNama() +
                                " (" + pn.getMenit() + " menit)" +
                                " Harga: " +
                                pn.getHarga());
                    }

                    break;

                case 3:

                    System.out.print("Update (1.Pulsa / 2.Paket Data / 3.Nelpon): ");
                    int pilihUpdate = sc.nextInt();

                    System.out.print("Index: ");
                    int index = sc.nextInt();

                    System.out.print("Harga Baru: ");
                    int hargaBaru = sc.nextInt();

                    if (pilihUpdate == 1 && index < listPulsa.size()) {
                        listPulsa.get(index).setHarga(hargaBaru);

                    } else if (pilihUpdate == 2 && index < listPaket.size()) {
                        listPaket.get(index).setHarga(hargaBaru);

                    } else if (pilihUpdate == 3 && index < listNelpon.size()) {
                        listNelpon.get(index).setHarga(hargaBaru);

                    } else {
                        System.out.println("Index tidak valid");
                    }

                    break;

                case 4:

                    System.out.print("Hapus (1.Pulsa / 2.Paket Data / 3.Nelpon): ");
                    int pilihHapus = sc.nextInt();

                    System.out.print("Index: ");
                    int indexHapus = sc.nextInt();

                    if (pilihHapus == 1 && indexHapus < listPulsa.size()) {
                        listPulsa.remove(indexHapus);

                    } else if (pilihHapus == 2 && indexHapus < listPaket.size()) {
                        listPaket.remove(indexHapus);

                    } else if (pilihHapus == 3 && indexHapus < listNelpon.size()) {
                        listNelpon.remove(indexHapus);

                    } else {
                        System.out.println("Index tidak valid");
                    }

                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (menu != 5);

    }
}