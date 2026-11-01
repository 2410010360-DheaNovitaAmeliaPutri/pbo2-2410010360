# Tugas PBO2 Pertemuan 6

### A. Foto atau pindaian lembar peer review yang Anda terima dari teman
![Lembar Peer Review dari Teman](Tangkapan%20Layar/Lembar_Peer_Review_Heuristik.jpg)


### B. Tabel singkat berisi temuan dari teman dan perbaikan
| No | Temuan dari teman | Skor | Perbaikan yang saya lakukan | Commit |
|--|-------------------|:----:|-----------------------------|--------|
|1	|Jumlah isian yang perlu diperbaiki tampil di dekat tombol saat Daftar diklik, dan dialog sukses muncul bila data benar. Namun tombol Daftar nonaktif sebelum persetujuan dicentang tanpa keterangan apa pun saat kursor diarahkan ke tombol.|1| Menambahkan tooltip pada tombol Daftar dengan pesan "Centang persetujuan terlebih dahulu sebelum mendaftar" agar pengguna mengetahui apa yang harus dilakukan.| P06: Menambahkan tooltip pada tombol Daftar|
| 2 |Tombol Batal meminta konfirmasi bila ada isian. Namun saat semua isian sudah terisi lalu tombol X diklik, jendela langsung tertutup tanpa peringatan sehingga data hilang. | 1 |Mengubah defaultCloseOperation menjadi DO_NOTHING_ON_CLOSE dan menambahkan konfirmasi saat tombol X diklik agar pengguna bisa memilih untuk menutup form atau membatalkannya. | P06: Menambahkan konfirmasi pada tombol Batal |

### C. Tangkapan layar (screenshot) formAnggota dengan pesan kesalahan
![Form Anggota - Pesan Kesalahan](Tangkapan%20Layar/FormAnggota%20pesan%20kesalahan.png)

#### Dan juga Tangkapan layar (screenshot) formAnggotaPerpustakaan yang telah diberikan Validasi sesuai dengan ketentuan tugas yang dikumpulkan di Modul yaitu :
berisi proyek p06-validasi-input dan FormAnggotaPerpustakaan yang sudah divalidasi, lengkap dengan file .java dan .form.

![Form Anggota Perpustakaan - Jendela Properties Events Tombol Daftar](Tangkapan%20Layar/FormAnggotaPerpustakaan%20pesan%20kesalahan.png)

### D. Tangkapan layar jendela Navigator FormAnggota yang memperlihatkan label pesan
![Form Anggota - Jendela Navigator Label Pesan](Tangkapan%20Layar/Jendela%20Navigator%20yang%20memperlihatkan%20label%20pesan.png)

#### Tangkapan layar FormAnggotaPerpustakaan - Jendela Navigator
![Form AnggotaPerpustakaan - Jendela Navigator Label Pesan](Tangkapan%20Layar/Jendela%20Navigator%20FormAnggotaPerpustakaan.png)

### E. Jawaban eksperimen Praktikum 4
1\. Ketika mengetik huruf pada isian NPM, huruf tersebut tidak muncul karena isian NPM hanya menerima angka. Hal ini terjadi karena adanya perintah evt.consume() yang membatalkan karakter selain angka.

2\. Ketika mengisi email dengan siti@ lalu menekan Tab, pesan kesalahan langsung muncul karena format email yang dimasukkan belum benar. Pemeriksaan dilakukan ketika berpindah dari isian email ke isian berikutnya..

3\. Ketika saya melewati isian Nama tanpa mengisi apa pun, program tidak langsung menampilkan pesan kesalahan. Hal ini karena program hanya memeriksa Nama jika isian tersebut tidak kosong. Isian yang masih kosong baru akan diperiksa ketika tombol Daftar diklik.

4\. Ketika mencentang persetujuan lalu menekan tombol Daftar dalam keadaan form masih kosong, fokus pertama kali diarahkan ke isian NPM karena NPM merupakan isian pertama yang belum valid.

5\. Ketika menekan tombol Alt bersama huruf N, fokus berpindah ke isian Nama karena huruf N digunakan sebagai mnemonic pada label Nama. Pengaturan tersebut menggunakan properti displayedMnemonic dan labelFor.

6\. Iya, data yang sudah di isi tetap ada karena ketika saya memilih No, proses penghapusan dibatalkan. Jadi, data yang sebelumnya saya masukkan tidak terhapus dan masih tetap tampil pada form.

### F. Deklarasi penggunaan AI
Disini saya menggunakan claude untuk membantu saya memeriksa apakah ada yang masih terewat atau belum sesuai dengan kriteria penilaiannya, setelah saya selesai mengerjakan semuanya sesuai dengan ketentuan tugasnya.

### catatan: Untuk bagian latihan mandiri pada pengembangan FormAnggotaPerpustakaan, saya juga menerapkannya pada FormAnggota agar bisa lebih memahami dan terbiasa menggunakan validasi input serta penerapannya pada form yang saya buat.