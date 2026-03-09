import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pulsa> listPulsa = new ArrayList<>();
        ArrayList<PaketData> listPaket = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int menu, sub;
        listPulsa.add(new Pulsa("Telkomsel", 10000, 12500));
        listPaket.add(new PaketData("Extra Kuota", "5GB", 30000));


        do {
            System.out.println("\n=== SISTEM PENGISIAN PULSA & PAKET DATA ===");
            System.out.println("1. Tambah Data (Create)");
            System.out.println("2. Lihat Semua Data (Read)");
            System.out.println("3. Update Harga (Update)");
            System.out.println("4. Hapus Data (Delete)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();

            if (menu >= 1 && menu <= 4) {
                System.out.print("Pilih Kategori (1. Pulsa | 2. Paket Data): ");
                sub = sc.nextInt();
                sc.nextLine(); // Clear buffer

                switch (menu) {
                    case 1:
                        if (sub == 1) {
                            System.out.print("Provider: "); String prov = sc.nextLine();
                            System.out.print("Nominal : "); int nom = sc.nextInt();
                            System.out.print("Harga   : "); int hrg = sc.nextInt();
                            listPulsa.add(new Pulsa(prov, nom, hrg));
                        } else {
                            System.out.print("Nama Paket: "); String nama = sc.nextLine();
                            System.out.print("Kuota     : "); String kuota = sc.nextLine();
                            System.out.print("Harga     : "); int hrg = sc.nextInt();
                            listPaket.add(new PaketData(nama, kuota, hrg));
                        }
                        System.out.println("Data berhasil ditambahkan!");
                        break;

                    case 2:
                        if (sub == 1) {
                            System.out.println("\n--- Daftar Pulsa ---");
                            for (int i = 0; i < listPulsa.size(); i++) {
                                System.out.println(i + ". " + listPulsa.get(i).provider + " " + listPulsa.get(i).nominal + " [Harga: " + listPulsa.get(i).harga + "]");
                            }
                        } else {
                            System.out.println("\n--- Daftar Paket Data ---");
                            for (int i = 0; i < listPaket.size(); i++) {
                                System.out.println(i + ". " + listPaket.get(i).namaPaket + " (" + listPaket.get(i).kuota + ") [Harga: " + listPaket.get(i).harga + "]");
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Masukkan Indeks yang akan diubah harganya: ");
                        int idxU = sc.nextInt();
                        if (sub == 1 && idxU < listPulsa.size()) {
                            System.out.print("Harga Baru: ");
                            listPulsa.get(idxU).harga = sc.nextInt();
                        } else if (sub == 2 && idxU < listPaket.size()) {
                            System.out.print("Harga Baru: ");
                            listPaket.get(idxU).harga = sc.nextInt();
                        } else {
                            System.out.println("Indeks tidak valid!");
                        }
                        System.out.println("Update berhasil!");
                        break;

                    case 4:
                        System.out.print("Masukkan Indeks yang akan dihapus: ");
                        int idxD = sc.nextInt();
                        if (sub == 1 && idxD < listPulsa.size()) {
                            listPulsa.remove(idxD);
                        } else if (sub == 2 && idxD < listPaket.size()) {
                            listPaket.remove(idxD);
                        } else {
                            System.out.println("Indeks tidak valid!");
                        }
                        System.out.println("Data berhasil dihapus!");
                        break;
                }
            }
        } while (menu != 5);
        System.out.println("Program Berhenti.");
    }
}