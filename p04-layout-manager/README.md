# Tugas PBO2 Pertemuan 4

## A. Jawaban Refleksi (Bagian G) 
1\.Karena posisi komponen ditentukan secara manual sehingga tampilan mudah berantakan ketika ukuran jendela berubah. Layout Manager lebih fleksibel dan dapat menyesuaikan ukuran komponen.

2\. FlowLayout mempertahankan ukuran komponen dan mengatur posisinya dalam baris, sedangkan GridLayout membagi ruang menjadi sel yang sama besar sehingga komponen ikut melebar sesuai ukuran sel

3\. Weight X mengatur pembagian sisa lebar pada kolom, sedangkan Fill menentukan apakah komponen mengisi ruang yang tersedia. Pada form, input menggunakan Weight X = 1.0 dan Fill = Horizontal agar dapat melebar.

4\. Agar susunan form lebih teratur dan dapat digabung dengan layout lain. formPanel digunakan untuk menyusun isian dengan GridBagLayout, sedangkan isiPanel menjadi pembungkusnya. Peletakan di North membuat form tetap berada di bagian atas.

5\. Dua prinsip desain yaitu:
-Keselarasan: label dan kolom isian dibuat sejajar sehingga mudah dibaca dari atas ke bawah.
-Kedekatan: data yang berkaitan dikelompokkan, seperti Data Anggota, Kontak, dan Persetujuan.

## B. Foto Sketsa Form dan Tabel Rancangan 
### - Sketsa
![Sketsa Gambar Form Anggota Perpustakaan](tangkapan%20layar%20dan%20sketsa%20formAnggotaPerpustakaan/sketsa.jpg)

### - Tabel Rancangan
| Bagian | Panel | Layout |
|:--------|:------|:------|
| Jendela | JFrame| BorderLayout |
| Header  | headerPanel |boxLayout, Y Axis|
| Isi form|isiPanel (Center), berisi formPanel (North)|isiPanel: BorderLayout. formPanel: GridBagLayout|
| Tombol  |tombolPanel|FlowLayout, Right|

## C. Tangkapan Layar Hasil FormAnggotaPerpustakaan
### 1. Ukuran awal
![Form Anggota Perpustakaan - Ukuran Awal](tangkapan%20layar%20dan%20sketsa%20formAnggotaPerpustakaan/tampilan%20awal.png)

### 2. Ukuran saat dilebarkan
![Form Anggota Perpustakaan - Ukuran Saat Dilebarkan](tangkapan%20layar%20dan%20sketsa%20formAnggotaPerpustakaan/tampilan%20saat%20dilebarkan.png)

## D. Tab Design FormAnggotaPerpustakaan (Jendela Navigator)
![Tab Design Form Anggota Perpustakaan](tangkapan%20layar%20dan%20sketsa%20formAnggotaPerpustakaan/tab%20design%20(navigator).png)
## E. Jawaban Eksperimen
### - Praktikum 2:
1\. Yang berubah yaitu posisi tombol menjadi berada di tengah, dan pada initComponents() nilai FlowLayout.LEFT berubah menjadi FlowLayout.CENTER.
2\. Yang terbentuk yaitu 5 baris, karena terdapat 9 tombol dengan 2 kolom, sehingga GridLayout otomatis menambah baris untuk menampung seluruh tombol.
3\. Lebar tombol berubah menjadi lebih lebar mengikuti ruang panel. Vertical Strut membuat jarak vertikal di antara setiap tombol sehingga susunan tombol menjadi lebih rapi dan tidak terlalu berdempetan.

### - Praktikum 4:
1\. Saat Weight X diubah menjadi 0.0, namaField tidak ikut melebar ketika jendela diperbesar sehingga muncul ruang kosong di sebelah kanan.

2\. Jika Direction formPanel diubah dari North menjadi Center, maka saat jendela ditinggikan form akan berpindah ke bagian tengah dan tidak lagi tetap di atas. Sedangkan jika menggunakan North, form akan tetap berada di bagian atas, meskipun masih ada ruang kosong di bawahnya.

3\. Setelah setMinimumSize(getSize()) dihapus, jendela dapat dikecilkan terlalu jauh sehingga komponen form, terutama bagian isian seperti Text Field dan Text Area menjadi terlalu kecil sehingga komponen form terdesak dan tampilannya menjadi tidak rapi. Pada bagian tombol juga bisa berubah posisinya menjadi bersusun kebawah saat dipersempit lebar jendelanya.  

## F. Saran dari Teman pada Tahap 4
Nama Teman:
| No | Pemeriksaan | Ya atau Belum |
|:--------|:------|:------|
|1 | Label singkat, jelas, dan sejajar||
|2 | Isian dikelompokkan dengan judul bagian||
|3 | Placeholder dipakai untuk isian yang punya format||
|4 | Komponen sesuai jenis data||
|5 | Tombol utama menonjol dan berada di kanan bawah||
|6 | Jarak antar komponen konsisten||
|7 | Form tetap rapi saat jendela dilebarkan dan ditinggikan||
|8 | Tampilan dibuat dengan JFrame Form dan layout manager bukan Null Layout atau Absolute Layout||

### Deklarasi penggunaan AI
disini saya menggunakan Claude untuk membantu saya mengatur penempatan pada bagian jenis anggota agar bisa menjadi tersusun secara horizontal dan bisa berada di posisi kiri (West), dan disarankan oleh claude menggunakan FlowLayout pada bagian radio button tersebut.

