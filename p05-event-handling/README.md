# Tugas PBO2 Pertemuan 5

## A. Tabel Pengamatan
|No| Tindakan | Event yang tercatat |
|:-:|:--------|:--------------------|
|1|Arahkan kursor ke tombol, lalu jauhkan|MouseEvent kursor masuk ke tombol, MouseEvent kursor keluar dari tombol|
|2|Klik tombol Klik saya|MouseEvent kursor masuk ke tombol, ActionEvent tombol diklik|
|3|Centang lalu hapus centang Aktifkan fitur|ItemEvent    kotak dicentang, ItemEvent centang dihapus|
|4|Ganti pilihan dari Pagi menjadi Malam|ItemEvent memilih Malam|
|5|Klik isian, lalu ketik kata "abc"|FocusEvent isian mendapat fokus, KeyEvent mengetik huruf a, KeyEvent mengetik huruf b, KeyEvent mengetik huruf c|
|6|Klik tombol setelah mengetik di isian|MouseEvent kursor masuk ke tombol, FocusEvent isian kehilangan fokus, ActionEvent tombol diklik|

## B. Jawaban Eksperimen Praktikum 3 dan 4
### Praktikum 3
1\. Pesan tercetak 2 kali setiap pilihan diganti. itemStateChanged dipanggil sekali untuk pilihan lama (DESELECTED) dan sekali untuk pilihan baru (SELECTED).

2\. Karena keyPressed terjadi saat tombol keyboard ditekan, sebelum karakter tersebut masuk ke dalam JTextField. Akibatnya teks yang dibaca masih belum memuat karakter yang baru ditekan.

3\. Di jendela Output muncul java.lang.NumberFormatException: For input string: "a" beserta stack trace. Aplikasi tidak berhenti, tetapi hasilLabel tidak diperbarui dan pengguna tidak mendapat pesan apa pun.
atau:
Program mengalami `NumberFormatException` karena teks berupa huruf tidak dapat diubah menjadi angka. Error akan terlihat pada jendela Output.

### Praktikum 4
1\. Pesan akan tercetak 2 kali, karena satu klik tombol menjalankan dua listener. Karena itu satu tombol sebaiknya menggunakan satu cara event agar aksi tidak dijalankan dua kali.

2\. Pada tab Design ditambahkan tombol `%` pada panel operator. Pada tab Source ditambahkan event untuk tombol `%` dan logika modulus pada method `hitung()` agar dapat melakukan operasi hitung modulus menggunakan operator % untuk menghitung sisa modulus.

3\. Saat tombol Hapus ditekan, kursor langsung berada di isian pertama karena method hapus() menjalankan: angka1Field.requestFocusInWindow(); Perintah tersebut mengembalikan fokus ke field angka pertama.

## C. Peta Event pada FormAnggotaPerpustakaan
|Komponen| Menu Event |Aksi|
|:-------|:-----------|:---|
|Kotak centang setuju | Item: itemStateChanged | Tombol Daftar hanya aktif jika dicentang |
|Tombol Batal| Action: actionPerformed |Kosongkan semua isian dan kembalikan fokus ke NPM |
|Tombol Daftar| Action: actionPerformed |Tampilkan ringkasan data dengan JOptionPane |
|Isian NPM | Key: keyReleased |Label kecil menampilkan jumlah digit, misalnya "8 dari 10 digit"|
|Form (JFrame di Navigator) |Window: windowClosing | Minta konfirmasi sebelum aplikasi ditutup|

## D. Tangkapan Layar Jendela Properties bagian Events untuk Tombol Daftar
![Form Anggota Perpustakaan - Jendela Properties Events Tombol Daftar](tangkapan%20layar/Jendela%20Properties%20bagian%20Events%20pada%20Tombol%20Daftar.png)

## E. Tangkapan Layar Dialog Ringkasan
![Form Anggota Perpustakaan - Dialog Ringkasan](tangkapan%20layar/dialog%20ringkasan.png)

## F. Tangkapan Layar Dialog Konfirmasi Keluar
![Form Anggota Perpustakaan - Dialog Konfirmasi Keluar](tangkapan%20layar/dialog%20keluar.png)

## G. Deklarasi Penggunaan AI
disini saya menggunakan Claude untuk membantu memeriksa kode program terhadap kriteria penilaian, seperti apakah di dalamnya masih yang perlu diperbaiki atau ada label/field yang didalamnya terdapat action(event) karena saya tidak sengaja mengklik 2 kali.