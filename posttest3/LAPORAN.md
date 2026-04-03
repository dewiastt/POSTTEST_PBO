## Identitas Mahasiswa

**Nama** : Dewi Astuti

**NIM** : 2409106007

**Mata Kuliah** : Pemrograman Berorientasi Objek

**Topik Posttest** : Inheritance dalam Java

---

# Deskripsi Program

Program ini merupakan pengembangan dari **Posttest 2** dengan menerapkan konsep **Inheritance** dalam Pemrograman Berorientasi Objek menggunakan bahasa **Java**.

Program digunakan untuk mengelola data **pulsa, paket data, dan paket nelpon** melalui sistem menu sederhana berbasis **console (terminal)**. Pengguna dapat melakukan operasi seperti menambah data, melihat data, mengubah harga, serta menghapus data.

Semua data disimpan menggunakan struktur data **ArrayList**, sehingga program dapat menangani banyak data secara dinamis.

---

# Tujuan Program

Tujuan pembuatan program ini adalah:

* Menerapkan konsep **Inheritance** dalam pemrograman Java
* Mengembangkan program dari posttest sebelumnya
* Mengurangi duplikasi kode menggunakan konsep pewarisan
* Menggunakan kembali atribut dan method dari superclass

---

# Fitur Program

Program memiliki beberapa fitur utama sebagai berikut:

### 1. Tambah Data (Create)

Pengguna dapat menambahkan data berupa:

* Pulsa
* Paket Data
* Paket Nelpon

---

### 2. Lihat Data (Read)

Program menampilkan seluruh data yang tersimpan, yaitu:

* Data Pulsa
* Data Paket Data
* Data Paket Nelpon

---

### 3. Update Harga (Update)

Pengguna dapat mengubah harga data berdasarkan indeks.

---

### 4. Hapus Data (Delete)

Data dapat dihapus dari daftar sesuai pilihan pengguna.

---

### 5. Keluar Program

Program akan berhenti saat pengguna memilih menu keluar.

---

# Konsep Pemrograman Berorientasi Objek yang Digunakan

## 1. Class

Program terdiri dari beberapa class:

* **Main** → program utama
* **Produk** → superclass (class induk)
* **Pulsa** → subclass
* **PaketData** → subclass
* **PaketNelpon** → subclass

---

## 2. Object

Object dibuat dari masing-masing class untuk menyimpan data.

Contoh:

```java
Pulsa p = new Pulsa("Telkomsel", 10000, 12000);
```

---

## 3. Inheritance

Program ini menerapkan konsep **Inheritance (pewarisan)**, yaitu subclass mewarisi atribut dan method dari superclass.

Superclass:

```java
class Produk
```

Subclass:

```java
class Pulsa extends Produk
class PaketData extends Produk
class PaketNelpon extends Produk
```

---

## 4. Tipe Inheritance

Program menggunakan:

**Hierarchical Inheritance**

Struktur:

```
Produk
 ├── Pulsa
 ├── PaketData
 └── PaketNelpon
```

---

## 5. Encapsulation

Atribut dalam class tetap menggunakan **access modifier private** dan diakses menggunakan getter dan setter.

Contoh:

```java
private int harga;
```

---

## 6. Getter dan Setter

Digunakan untuk mengakses dan mengubah data.

```java
public int getHarga() {
    return harga;
}

public void setHarga(int harga) {
    this.harga = harga;
}
```

---

## 7. Access Modifier

Program menggunakan beberapa access modifier:

| Access Modifier | Fungsi                       |
| --------------- | ---------------------------- |
| public          | dapat diakses dari mana saja |
| private         | hanya dalam class            |
| protected       | dapat diakses oleh subclass  |
| default         | dalam package yang sama      |

---

# Struktur Project

```
Posttest3
│
├── README.md
└── src
     └── posttest3
           ├── Main.java
           ├── Produk.java
           ├── Pulsa.java
           ├── PaketData.java
           └── PaketNelpon.java
```

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

--- Data Paket Nelpon ---
0. Nelpon 60 Menit (60 menit) Harga: 15000
```

---

# Cara Menjalankan Program

1. Buka project menggunakan IDE Java (IntelliJ IDEA / NetBeans / VS Code)
2. Compile semua file Java
3. Jalankan **Main.java**
4. Gunakan menu pada terminal

---

# Kesimpulan

Program ini berhasil mengimplementasikan konsep **Inheritance** dalam Pemrograman Berorientasi Objek.

Selain itu, program juga menerapkan:

* Class dan Object
* Encapsulation
* Access Modifier
* Getter dan Setter
* Struktur data ArrayList

Dengan adanya inheritance, kode menjadi lebih **efisien, terstruktur, dan mudah dikembangkan** karena menghindari duplikasi atribut dan method.

---

# Repository

Repository ini dibuat sebagai bentuk pengumpulan **Posttest 3 Mata Kuliah Pemrograman Berorientasi Objek**.
