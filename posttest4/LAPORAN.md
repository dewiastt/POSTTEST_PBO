## Identitas Mahasiswa

**Nama** : Dewi Astuti

**NIM** : 2409106007

**Mata Kuliah** : Pemrograman Berorientasi Objek

**Topik Posttest** : Polymorphism dalam Java

---

# Deskripsi Program

Program ini merupakan pengembangan dari **Posttest 3** dengan menambahkan konsep **Polymorphism** dalam Pemrograman Berorientasi Objek menggunakan bahasa **Java**.

Program digunakan untuk mengelola data **pulsa, paket data, dan paket nelpon** melalui sistem menu berbasis **console (terminal)**. Pengguna dapat melakukan operasi seperti menambah data, melihat data, mengubah harga, serta menghapus data.

Data disimpan menggunakan **ArrayList** sehingga dapat dikelola secara dinamis.

---

# Tujuan Program

Tujuan pembuatan program ini adalah:

* Menerapkan konsep **Polymorphism (Overloading & Overriding)**
* Mengembangkan program dari posttest sebelumnya
* Menggunakan kembali method dengan bentuk berbeda
* Membuat program lebih fleksibel dan efisien

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

Program menampilkan seluruh data dengan menggunakan **method polymorphism (overriding)**.

---

### 3. Update Harga (Update)

Pengguna dapat mengubah harga:

* Tanpa diskon
* Dengan diskon

(Menggunakan **method overloading**)

---

### 4. Hapus Data (Delete)

Data dapat dihapus berdasarkan indeks.

---

### 5. Keluar Program

Program berhenti saat pengguna memilih menu keluar.

---

# Konsep Pemrograman Berorientasi Objek yang Digunakan

## 1. Class

Program terdiri dari beberapa class:

* **Main** → program utama
* **Produk** → superclass
* **Pulsa** → subclass
* **PaketData** → subclass
* **PaketNelpon** → subclass

---

## 2. Object

Object dibuat dari class untuk menyimpan data.

Contoh:

```java
Pulsa p = new Pulsa("Telkomsel", 10000, 12000);
```

---

## 3. Inheritance

Subclass mewarisi atribut dan method dari superclass.

```java
class Pulsa extends Produk
class PaketData extends Produk
class PaketNelpon extends Produk
```

---

## 4. Tipe Inheritance

Program menggunakan:

**Hierarchical Inheritance**

```
Produk
 ├── Pulsa
 ├── PaketData
 └── PaketNelpon
```

---

## 5. Polymorphism

Program menerapkan dua jenis polymorphism:

---

### 🔷 A. Method Overloading (Static Polymorphism)

Terjadi pada method `setHarga()` di class **Produk**:

```java
setHarga(int harga)
setHarga(int harga, int diskon)
```

Penjelasan:

* Method sama, parameter berbeda
* Digunakan untuk mengatur harga dengan atau tanpa diskon

---

### 🔷 B. Method Overriding (Dynamic Polymorphism)

Terjadi pada method `tampil()` di setiap subclass:

```java
@Override
public void tampil()
```

Penjelasan:

* Method sama, isi berbeda
* Setiap class menampilkan data sesuai jenisnya

Contoh:

* Pulsa → menampilkan provider dan nominal
* PaketData → menampilkan kuota
* PaketNelpon → menampilkan menit

---

## 6. Encapsulation

Atribut tetap menggunakan **private/protected** dan diakses melalui method.

---

## 7. Getter dan Setter

Digunakan untuk mengakses dan mengubah data.

---

## 8. Access Modifier

| Access Modifier | Fungsi                       |
| --------------- | ---------------------------- |
| public          | dapat diakses dari mana saja |
| private         | hanya dalam class            |
| protected       | dapat diakses oleh subclass  |
| default         | dalam package yang sama      |

---

# Struktur Project

```
Posttest4
│
├── README.md
└── src
     └── posttest4
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
Pulsa: Telkomsel 10000 Harga: 12000

--- Data Paket Data ---
Paket Data: Internet 5GB (5GB) Harga: 30000

--- Data Paket Nelpon ---
Paket Nelpon: Nelpon 60 Menit (60 menit) Harga: 15000
```

---

# Cara Menjalankan Program

1. Buka project menggunakan IDE Java
2. Compile semua file Java
3. Jalankan **Main.java**
4. Gunakan menu pada terminal

---

# Kesimpulan

Program ini berhasil mengimplementasikan konsep **Polymorphism** dalam Pemrograman Berorientasi Objek.

Konsep yang diterapkan meliputi:

* Inheritance
* Polymorphism (Overloading & Overriding)
* Encapsulation
* Access Modifier
* Class dan Object
* ArrayList

Dengan adanya polymorphism, program menjadi lebih:

* Fleksibel
* Efisien
* Mudah dikembangkan

---

# Repository

Repository ini dibuat sebagai bentuk pengumpulan **Posttest 4 Mata Kuliah Pemrograman Berorientasi Objek**.
