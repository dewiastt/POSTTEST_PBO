# Sistem Pengisian Pulsa dan Paket Data Online

## 📝 Deskripsi Program
---
*  Sistem Pengisian Pulsa dan Paket Data Online adalah aplikasi manajemen inventaris produk digital berbasis Java Console yang dirancang untuk mengoptimalkan pengelolaan stok layanan telekomunikasi. Program ini berfungsi sebagai platform administratif sederhana yang menjembatani pencatatan produk pulsa reguler dan paket internet dalam satu sistem terintegrasi. *
---

## 🎯 Tujuan Program
1.  **Implementasi OOP**: Menerapkan konsep `Class` dan `Object` dalam bahasa Java.
2.  **Manajemen Stok**: Membuat sistem logika sederhana untuk pengelolaan produk digital.
3.  **Data Dinamis**: Melatih penggunaan `ArrayList` sebagai penyimpanan data yang fleksibel dibandingkan array statis.
4.  **Interaksi User**: Mengasah kemampuan penggunaan `Scanner` untuk menangkap input data secara *real-time*.

---

## 🏗️ Struktur Program
 Program terdiri dari tiga kelas utama yang saling terintegrasi dan Program ini juga dirancang menggunakan arsitektur **Object-Oriented Programming (OOP)** sederhana yang memisahkan antara entitas data (Model) dan logika pemrosesan (Main System).

### 1. Entitas Data (Data Class)
Setiap class merepresentasikan produk digital yang berbeda:

* **Class `Pulsa`**: Digunakan untuk mengelola produk pulsa reguler.
    * **Atribut**: `provider` (String), `nominal` (int), `harga` (int).
    * **Metode**: *Constructor* berparameter dengan penggunaan keyword `this`.

      <img width="384" height="182" alt="image" src="https://github.com/user-attachments/assets/0d580cc3-34b5-4780-8954-f6d525406e27" />

* **Class `PaketData`**: Digunakan untuk mengelola produk paket internet.
    * **Atribut**: `namaPaket` (String), `kuota` (String), `harga` (int).
    * **Metode**: *Constructor* berparameter untuk inisialisasi instansiasi objek.

       <img width="358" height="184" alt="image" src="https://github.com/user-attachments/assets/6fa9a060-3cff-48d2-a5cc-128d26daffca" />

### 2. Manajemen Koleksi Data (Storage)
clas ini diguankan untuk menyimpan data pulsa dan paket data

* **`ArrayList<Pulsa>`**: Menyimpan koleksi objek dari class `Pulsa`.
* **`ArrayList<PaketData>`**: Menyimpan koleksi objek dari class `PaketData`.
* **Keunggulan**: Penggunaan `ArrayList` memungkinkan sistem melakukan penambahan dan penghapusan data secara fleksibel tanpa batasan ukuran array statis.

  <img width="367" height="153" alt="image" src="https://github.com/user-attachments/assets/038752d8-d163-487b-ae40-46031b7df225" />


### 3. Logika Utama (Main System Control)
Pusat kendali program berada pada kelas utama :

* **Deklarasi & Inisialisasi**: Menyiapkan objek `Scanner` untuk input dan `ArrayList` sebagai database sementara.
* **Looping (`do-while`)**: Menjaga aplikasi tetap aktif sehingga pengguna dapat melakukan navigasi menu berkali-kali tanpa harus memulai ulang program.
* **Percabangan (`switch-case`)**: Menentukan fitur mana yang akan dieksekusi berdasarkan input angka dari pengguna.
* **Validasi Kondisional (`if-else`)**: Digunakan untuk sub-menu (memilih kategori produk) serta pengecekan batas indeks agar tidak terjadi error `IndexOutOfBounds` saat proses Update atau Delete.

   <img width="461" height="202" alt="image" src="https://github.com/user-attachments/assets/9673edeb-4cd7-4730-b91f-c9b0740a433d" />


---

## 🚀 Fitur Program
| Fitur | Deskripsi |
| :--- | :--- |
| **Tambah Data** | Memilih kategori (Pulsa/Paket) dan menyimpan objek baru ke ArrayList. |
<img width="273" height="196" alt="image" src="https://github.com/user-attachments/assets/935f9d0e-af34-447f-b4d4-da616f7b6279" />

| **Lihat Data** | Menampilkan daftar produk beserta indeksnya untuk memudahkan navigasi. |
<img width="283" height="205" alt="image" src="https://github.com/user-attachments/assets/2d9df69e-d2cf-462a-bc91-d73f83bf806c" />

| **Edit Data** | Memperbarui atribut harga pada objek yang sudah ada di list. |
<img width="278" height="183" alt="image" src="https://github.com/user-attachments/assets/bd495f4d-1f08-4f99-8095-893b3a81c23e" />

| **Hapus Data** | Menghilangkan objek dari list berdasarkan nomor indeks yang dipilih. |
<img width="274" height="169" alt="image" src="https://github.com/user-attachments/assets/23192b0a-900b-4b57-a682-ae64ae329777" />


| **Keluar** | Menghentikan eksekusi program secara aman. |

<img width="270" height="137" alt="image" src="https://github.com/user-attachments/assets/0a3e0a3c-e634-4f39-b371-e1da52c20c83" />

---
| ## 👤 Identitas Pengembang |
* **Nama** : Dewi astuti
* **NIM** : 2409106007
* **Kelas** : A1'24
* **Prodi** : Informatika
