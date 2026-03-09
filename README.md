# Sistem Pengisian Pulsa dan Paket Data Online

## 📝 Deskripsi Program
Sistem Pengisian Pulsa dan Paket Data Online adalah aplikasi manajemen inventaris produk digital berbasis Java Console yang dirancang untuk mengoptimalkan pengelolaan stok layanan telekomunikasi. Program ini berfungsi sebagai platform administratif sederhana yang menjembatani pencatatan produk pulsa reguler dan paket internet dalam satu sistem terintegrasi.

## 2. Fitur Program
Program memiliki menu interaktif yang dapat dijalankan berulang kali (looping) hingga pengguna memilih menu keluar. Fitur utamanya meliputi operasi **CRUD**:
* ➕ **Create**: Menambahkan data produk pulsa atau paket data baru.
* 📖 **Read**: Melihat daftar seluruh produk yang tersedia.
* ✏️ **Update**: Mengedit harga produk yang sudah ada.
* 🗑️ **Delete**: Menghapus produk yang sudah tidak dijual.

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

## 🖥️ Struktur Menu Program
Saat dijalankan, program akan menampilkan menu sebagai berikut:
```text
===============================================
===== SISTEM PENGISIAN PULSA & PAKET DATA =====
===============================================
1. Tambah Data (Create)
2. Lihat Data (Read)
3. Update Harga (Update)
4. Hapus Data (Delete)
5. Keluar
===============================================
Pilih Menu: _perbarui harga pada item Pulsa atau Paket Data tertentu berdasarkan indeks.
* **Delete**: Menghapus data Pulsa atau Paket Data dari daftar.

## 3. Implementasi Modul

### Modul 1: Pengenalan PBO & Dasar Java
* **ArrayList**: Digunakan sebagai wadah penyimpanan data dinamis untuk menampung objek dari class `Pulsa` dan `PaketData`.
* **Control Flow**: 
    * `do-while`: Digunakan untuk menjaga program tetap berjalan hingga user memilih menu "Keluar".
    * `switch-case`: Digunakan untuk percabangan menu utama (1-5).
    * `if-else`: Digunakan untuk sub-menu (memilih kategori Pulsa/Paket) dan validasi indeks agar tidak terjadi error saat update/delete.
* **Scanner**: Digunakan untuk menangkap input dari keyboard pengguna.

### Modul 2: Class dan Object
* **Class & Property**: Membuat blueprint `Pulsa` (properti: provider, nominal, harga) dan `PaketData` (properti: namaPaket, kuota, harga).
* **Constructor**: Digunakan untuk menginisialisasi objek baru secara instan saat ditambahkan ke dalam ArrayList.
* **Keyword `this`**: Digunakan di dalam constructor untuk merujuk pada properti internal class agar tidak tertukar dengan parameter input.

## 4. Struktur Kode
* `Main.java`: Berisi logika utama program dan manajemen menu.
* `Pulsa`: Class data untuk entitas Pulsa.
* `PaketData`: Class data untuk entitas Paket Data.

---
## Identitas Pengembang
* **Nama** : Dewi astuti
* **NIM** : 2409106007
* **Kelas** : A1'24
* **Prodi** : Informatika
