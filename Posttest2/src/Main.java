import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pulsa> listPulsa = new ArrayList<>();
        ArrayList<PaketData> listPaket = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int menu;

        listPulsa.add(new Pulsa("Telkomsel", 10000, 12000));
        listPaket.add(new PaketData("Internet 5GB", "5GB", 30000));

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

                    System.out.print("Pilih (1.Pulsa / 2.Paket): ");
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

                    } else {

                        System.out.print("Nama Paket : ");
                        String nama = sc.nextLine();

                        System.out.print("Kuota : ");
                        String kuota = sc.nextLine();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();

                        listPaket.add(new PaketData(nama, kuota, harga));
                    }

                    System.out.println("Data berhasil ditambahkan");
                    break;

                case 2:

                    System.out.println("\n--- Data Pulsa ---");

                    for (int i = 0; i < listPulsa.size(); i++) {

                        Pulsa p = listPulsa.get(i);

                        System.out.println(
                                i + ". " +
                                        p.getProvider() + " " +
                                        p.getNominal() +
                                        " Harga: " +
                                        p.getHarga()
                        );
                    }

                    System.out.println("\n--- Data Paket Data ---");

                    for (int i = 0; i < listPaket.size(); i++) {

                        PaketData pd = listPaket.get(i);

                        System.out.println(
                                i + ". " +
                                        pd.getNamaPaket() +
                                        " (" + pd.getKuota() + ")" +
                                        " Harga: " +
                                        pd.getHarga()
                        );
                    }

                    break;

                case 3:

                    System.out.print("Update (1.Pulsa / 2.Paket): ");
                    int pilihUpdate = sc.nextInt();

                    System.out.print("Masukkan Index: ");
                    int index = sc.nextInt();

                    System.out.print("Harga Baru: ");
                    int hargaBaru = sc.nextInt();

                    if (pilihUpdate == 1 && index < listPulsa.size()) {

                        listPulsa.get(index).setHarga(hargaBaru);

                    } else if (pilihUpdate == 2 && index < listPaket.size()) {

                        listPaket.get(index).setHarga(hargaBaru);

                    } else {

                        System.out.println("Index tidak valid");
                    }

                    break;

                case 4:

                    System.out.print("Hapus (1.Pulsa / 2.Paket): ");
                    int pilihHapus = sc.nextInt();

                    System.out.print("Masukkan Index: ");
                    int indexHapus = sc.nextInt();

                    if (pilihHapus == 1 && indexHapus < listPulsa.size()) {

                        listPulsa.remove(indexHapus);

                    } else if (pilihHapus == 2 && indexHapus < listPaket.size()) {

                        listPaket.remove(indexHapus);

                    } else {

                        System.out.println("Index tidak valid");
                    }

                    break;

            }

        } while (menu != 5);

        System.out.println("Program selesai");

    }
}