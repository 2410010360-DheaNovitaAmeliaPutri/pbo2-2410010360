# PBO Pertemuan 7 Mini Proyek

## Tautan video Demo Mini Proyek
https://drive.google.com/file/d/1_zHUBt6Lqc1c83e7KdEUnpas7r3rwAIz/view?usp=drivesdk

### Fitur
- Tabel buku: kode, judul, penulis, tahun terbit, dan status (5 data contoh).
- Tambah dan ubah lewat JDialog Form modal dengan validasi.
- Hapus dengan konfirmasi.
- Tombol Ubah dan Hapus aktif hanya jika ada baris yang dipilih.
- Menu Bar (File, Buku, Bantuan) dengan accelerator Ctrl+N, Ctrl+E, dan Ctrl+D.
- Pencarian berdasarkan kode, judul, dan penulis, serta pengurutan dengan klik judul kolom.
- Label status jumlah buku yang tampil.

### Validasi
| Isian | Aturan |
|---|---|
| Kode | Wajib diisi dan tidak boleh sama dengan kode yang sudah ada |
| Judul | Wajib diisi |
| Penulis | Wajib diisi |
| Tahun Terbit | Harus angka antara 1900 dan tahun sekarang |

Kode buku tidak bisa diubah saat mengubah data, supaya tetap unik.

### Peta Event

| Komponen | Event | Method yang dipanggil |
|---|---|---|
| `tambahButton` | actionPerformed | `tambah()` |
| `ubahButton` | actionPerformed | `ubah()` |
| `hapusButton` | actionPerformed | `hapus()` |
| `cariField` | keyReleased | `saring()` |
| `bukuTable` | mouseClicked (klik dua kali) | `ubah()` |
| `bukuTable` (selection model) | ListSelectionListener | `perbaruiTombol()` |
| `tambahItem` (Ctrl+N) | actionPerformed | `tambah()` |
| `ubahItem` (Ctrl+E) | actionPerformed | `ubah()` |
| `hapusItem` (Ctrl+D) | actionPerformed | `hapus()` |
| `tentangItem` | actionPerformed | menampilkan dialog Tentang |
| `keluarItem` | actionPerformed | `dispose()` |
| `simpanButton` (dialog) | actionPerformed | `simpan()` |
| `batalButton` (dialog) | actionPerformed | `dispose()` |


### Deklarasi penggunaan AI
Disini saya menggunakan claude untuk membantu saya memeriksa apakah ada yang masih terewat atau belum sesuai dengan kriteria penilaiannya, setelah saya selesai mengerjakan semua sesuai dengan ketentuan tugasnya.