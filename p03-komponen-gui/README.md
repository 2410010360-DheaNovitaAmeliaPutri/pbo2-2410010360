# Tugas PBO2 Pertemuan 3

## A. Form Pemesanan Tiket Travel

### 1. Tema Terang

![Form Pemesanan Tiket Travel - Mode Terang](tangkapan%20layar%20hasil%20program%20P03/Form%20Pemesanan%20Tiket%20Travel%20Mode%20Terang.png)

### 2. Tema Gelap

![Form Pemesanan Tiket Travel - Mode Gelap](tangkapan%20layar%20hasil%20program%20P03/Form%20Pemesanan%20Tiket%20Travel%20Mode%20Gelap.png)

---

## B. Tab Design FormTiketTravel (Jendela Navigator)

![Tab Design FormTiketTravel](tangkapan%20layar%20hasil%20program%20P03/Tab%20Design%20FormTiketTravel.png)

---

## C. Jawaban Pertanyaan Refleksi (Bagian G)

1\. Top-level container adalah wadah utama berupa jendela aplikasi, contohnya JFrame. Intermediate container adalah wadah untuk mengelompokkan komponen di dalam jendela, contohnya JPanel. Atomic component adalah komponen yang berinteraksi langsung dengan pengguna, contohnya JButton.

2\. Agar kedua JRadioButton menjadi satu kelompok pilihan, sehingga pengguna hanya dapat memilih satu pilihan pada satu waktu. Kalau setiap radio button berdiri sendiri, Swing tidak tahu bahwa kduanya saling berkaitan, sehingga keduanya bisa terpilih bersamaan.

3\. JComboBox dipilih ketika pilihan yang tersedia cukup banyak sehingga lebih praktis ditampilkan dalam daftar pilihan. Sedangkan JRadioButton lebih cocok untuk sedikit pilihan yang ingin langsung terlihat.

4\. Karena initComponents() dibuat secara otomatis oleh NetBeans dan dapat dibuat ulang (regenerated) ketika desain form diubah. Kode tambahan sebaiknya ditulis di luar blok initComponents(), misalnya setelah pemanggilan initComponents() pada konstruktor atau di dalam event handler.

5\. Agar tema FlatLaf langsung diterapkan ketika form dan komponennya dibuat, sehingga tampilan aplikasi menggunakan tema FlatLaf, bukan tampilan bawaan Swing.