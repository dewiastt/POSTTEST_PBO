# Laporan Posttest: Sistem Pengisian Pulsa dan Paket Data Online

## 1. Deskripsi Program
Program ini merupakan aplikasi manajemen data (CRUD) sederhana untuk layanan pengisian pulsa dan paket data. Program dirancang menggunakan bahasa pemrograman Java dengan menerapkan paradigma Pemrograman Berorientasi Objek (OOP) sesuai dengan batasan materi pada Modul 1 dan Modul 2.

## 2. Fitur Program
Program memiliki menu interaktif yang dapat dijalankan berulang kali (looping) hingga pengguna memilih menu keluar. Fitur utamanya meliputi:
* **Create**: Menambahkan data stok Pulsa baru atau Paket Data baru.
* **Read**: Menampilkan daftar seluruh stok Pulsa dan Paket Data yang tersimpan.
* **Update**: Mem# 📱 Laporan Posttest: Sistem Pengisian Pulsa dan Paket Data Online

## 📝 Deskripsi Program
Program ini merupakan aplikasi berbasis **Java Console** yang dibuat untuk membantu pengelolaan stok **Pulsa dan Paket Data** secara digital. Sistem ini memungkinkan administrator untuk mengelola inventaris produk secara efisien melalui antarmuka baris perintah.

Program ini memungkinkan pengguna untuk melakukan operasi **CRUD**:
* ➕ **Create**: Menambahkan data produk pulsa atau paket data baru.
* 📖 **Read**: Melihat daftar seluruh produk yang tersedia.
* ✏️ **Update**: Mengedit harga produk yang sudah ada.
* 🗑️ **Delete**: Menghapus produk yang sudah tidak dijual.

Program ini dibangun dengan menerapkan konsep dasar **Object Oriented Programming (OOP)** sesuai materi Modul 1 dan Modul 2.

---

## 🎯 Tujuan Program
1.  **Implementasi OOP**: Menerapkan konsep `Class` dan `Object` dalam bahasa Java.
2.  **Manajemen Stok**: Membuat sistem logika sederhana untuk pengelolaan produk digital.
3.  **Data Dinamis**: Melatih penggunaan `ArrayList` sebagai penyimpanan data yang fleksibel dibandingkan array statis.
4.  **Interaksi User**: Mengasah kemampuan penggunaan `Scanner` untuk menangkap input data secara *real-time*.

---

## 🏗️ Struktur Program
Program terdiri dari tiga kelas utama yang saling terintegrasi:

### 1. Kelas `Pulsa`
Berfungsi sebagai model data untuk produk pulsa.
* **Atribut**: `provider`, `nominal`, `harga`.
* **Metode**: Constructor untuk inisialisasi data menggunakan keyword `this`.

### 2. Kelas `PaketData`
Berfungsi sebagai model data untuk produk paket internet.
* **Atribut**: `namaPaket`, `kuota`, `harga`.
* **Metode**: Constructor untuk memetakan parameter ke properti class (Modul 2).

### 3. Kelas `Main` (Sistem Pengisian Pulsa)
Kelas utama yang menjalankan logika program dengan komponen:
* `ArrayList<Pulsa> listPulsa`: Koleksi penyimpan data pulsa.
* `ArrayList<PaketData> listPaket`: Koleksi penyimpan data paket data.
* `Scanner input`: Objek untuk membaca masukan pengguna.
* `main()`: Metode utama yang mengontrol alur menggunakan `do-while` dan `switch-case`.

---

## 🚀 Fitur Program
| Fitur | Deskripsi |
| :--- | :--- |
| **Tambah Data** | Memilih kategori (Pulsa/Paket) dan menyimpan objek baru ke ArrayList. |
| **Lihat Data** | Menampilkan daftar produk beserta indeksnya untuk memudahkan navigasi. |
| **Edit Data** | Memperbarui atribut harga pada objek yang sudah ada di list. |
| **Hapus Data** | Menghilangkan objek dari list berdasarkan nomor indeks yang dipilih. |
| **Keluar** | Menghentikan eksekusi program secara aman. |

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
*Tugas ini disusun untuk memenuhi syarat Posttest Praktikum Pemrograman Berorientasi Objek.*
