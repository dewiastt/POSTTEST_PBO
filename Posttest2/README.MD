# Posttest 2 – Pemrograman Berorientasi Objek

## Implementasi Encapsulation pada Sistem Pengelolaan Pulsa dan Paket Data

---

## Identitas Mahasiswa

**Nama** : Dewi Astuti
**NIM** : 2409106007
**Mata Kuliah** : Pemrograman Berorientasi Objek
**Topik Posttest** : Encapsulation dan Access Modifier dalam Java

---

# Deskripsi Program

Program ini merupakan pengembangan dari **Posttest 1** dengan menerapkan konsep **Encapsulation** dalam Pemrograman Berorientasi Objek menggunakan bahasa **Java**.

Program ini dibuat untuk mengelola data **pulsa dan paket data** melalui sistem menu sederhana berbasis **console (terminal)**. Pengguna dapat melakukan beberapa operasi seperti menambah data, melihat data, mengubah harga, serta menghapus data yang tersedia.

Data yang dimasukkan oleh pengguna akan disimpan dalam struktur data **ArrayList**, sehingga program dapat mengelola banyak data secara dinamis.

---

# Tujuan Program

Tujuan pembuatan program ini adalah:

* Menerapkan konsep **Encapsulation** dalam pemrograman Java
* Menggunakan **Getter dan Setter** untuk mengakses atribut
* Mengimplementasikan **Access Modifier** dalam class
* Mengembangkan program dari posttest sebelumnya menggunakan konsep **Object-Oriented Programming (OOP)**

---

# Fitur Program

Program memiliki beberapa fitur utama sebagai berikut:

### 1. Tambah Data (Create)

Pengguna dapat menambahkan data baru berupa:

* Pulsa
* Paket Data

### 2. Lihat Data (Read)

Program akan menampilkan seluruh data pulsa dan paket data yang telah disimpan.

### 3. Update Harga (Update)

Pengguna dapat mengubah harga dari data yang dipilih berdasarkan indeks.

### 4. Hapus Data (Delete)

Data yang tidak diperlukan dapat dihapus dari daftar.

### 5. Keluar Program

Program akan berhenti ketika pengguna memilih menu keluar.

---

# Konsep Pemrograman Berorientasi Objek yang Digunakan

## 1. Class

Program ini terdiri dari beberapa class yang memiliki fungsi masing-masing, yaitu:

* **Main** → berfungsi sebagai program utama
* **Pulsa** → menyimpan data pulsa
* **PaketData** → menyimpan data paket internet

---

## 2. Object

Object dibuat dari class **Pulsa** dan **PaketData** untuk menyimpan data.

Contoh pembuatan object:

```java
Pulsa p = new Pulsa("Telkomsel", 10000, 12000);
```

Object tersebut menyimpan informasi seperti:

* Provider
* Nominal pulsa
* Harga pulsa

---

## 3. Encapsulation

Encapsulation merupakan teknik **menyembunyikan atribut class dari akses langsung** oleh class lain.

Atribut dalam class dibuat menggunakan **access modifier `private`** agar hanya dapat diakses melalui method tertentu.

Contoh:

```java
private int harga;
```

Dengan metode ini, keamanan data dalam program dapat lebih terjaga.

---

## 4. Getter dan Setter

Untuk mengakses dan mengubah nilai atribut yang bersifat private, digunakan **method getter dan setter**.

Contoh method Getter:

```java
public int getHarga() {
    return harga;
}
```

Contoh method Setter:

```java
public void setHarga(int harga) {
    this.harga = harga;
}
```

---

## 5. Access Modifier

Program ini menerapkan seluruh jenis **Access Modifier dalam Java**.

| Access Modifier | Fungsi                                              |
| --------------- | --------------------------------------------------- |
| public          | dapat diakses dari mana saja                        |
| private         | hanya dapat diakses dalam class                     |
| protected       | dapat diakses dalam package yang sama atau subclass |
| default         | dapat diakses dalam package yang sama               |

Penggunaan access modifier membantu mengatur **hak akses terhadap atribut dan method dalam program**.

---

# Struktur Project

Struktur folder project pada repository ini adalah sebagai berikut:

```
Posttest2
│
├── README.md
└── src
     └── posttest2
           ├── Main.java
           ├── Pulsa.java
           └── PaketData.java
```

Penjelasan file:

* **Main.java**
  Berisi program utama yang menjalankan menu sistem.

* **Pulsa.java**
  Class yang digunakan untuk menyimpan data pulsa.

* **PaketData.java**
  Class yang digunakan untuk menyimpan data paket internet.

---

# Contoh Tampilan Program

```
=== SISTEM PULSA & PAKET DATA ===
1. Tambah Data
2. Lihat Data
3. Update Harga
4. Hapus Data
5. Keluar

Pilih Menu: 2

--- Data Pulsa ---
0. Telkomsel 10000 Harga: 12000

--- Data Paket Data ---
0. Internet 5GB (5GB) Harga: 30000
```

---

# Cara Menjalankan Program

1. Buka project menggunakan IDE Java seperti **IntelliJ IDEA** atau **NetBeans**
2. Compile seluruh file Java
3. Jalankan file **Main.java**
4. Gunakan menu yang tersedia pada terminal untuk mengelola data

---

# Kesimpulan

Program ini berhasil mengimplementasikan konsep **Pemrograman Berorientasi Objek (OOP)** khususnya **Encapsulation** dalam bahasa pemrograman Java.

Selain itu, program ini juga menerapkan beberapa konsep penting seperti:

* Class dan Object
* Access Modifier
* Getter dan Setter
* Pengelolaan data menggunakan **ArrayList**

Dengan menerapkan konsep tersebut, program menjadi lebih **terstruktur, aman, dan mudah dikembangkan**.

---

# Repository

Repository ini dibuat sebagai bentuk pengumpulan **Posttest 2 Mata Kuliah Pemrograman Berorientasi Objek**.
