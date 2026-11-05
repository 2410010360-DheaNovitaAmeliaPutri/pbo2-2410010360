/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.table.AbstractTableModel;

/**
 *Nama : Dhea Novita Amelia Putri
 *NPM : 2410010360
 */
public class BarangTableModel extends AbstractTableModel {

    private static final String[] KOLOM =
        {"Nama Barang", "Kategori", "Harga", "Jumlah", "Subtotal"};
    private static final long BATAS_DISKON = 100000;

    private final List<Barang> daftar = new ArrayList<>();
    @Override
    public int getRowCount() {
        return daftar.size();
    }
    
    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }
    
    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];       
    }
    
    @Override
    public Object getValueAt(int baris, int kolom) {
        Barang b = daftar.get(baris);
        return switch (kolom) {
            case 0 -> b.nama();
            case 1 -> b.kategori();
            case 2 -> formatRupiah(b.harga());
            case 3 -> b.jumlah();
            default -> formatRupiah(b.subtotal());
        };
    }
    
    public void tambah(Barang barang) {
        daftar.add(barang);
        fireTableRowsInserted(daftar.size() - 1, daftar.size() - 1);
    }

    public boolean sudahAda(String nama) {
        for (Barang b : daftar) {
            if (b.nama().equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }

    public long hitungTotal() {
        long total = 0;
        for (Barang b : daftar) {
            total += b.subtotal();
        }
        return total;
    }

    public long hitungDiskon() {
        long total = hitungTotal();
        return total >= BATAS_DISKON ? total / 10 : 0;
    }

    public long hitungBayar() {
        return hitungTotal() - hitungDiskon();
    }

    public static String formatRupiah(long nilai) {
        DecimalFormatSymbols simbol = new DecimalFormatSymbols(Locale.of("id", "ID"));
        simbol.setGroupingSeparator('.');
        return "Rp" + new DecimalFormat("#,##0", simbol).format(nilai);
    }
}
