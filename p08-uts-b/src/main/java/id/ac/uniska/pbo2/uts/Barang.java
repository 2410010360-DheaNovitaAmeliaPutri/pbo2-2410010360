/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

/**
 *Nama : Dhea Novita Amelia Putri
 *NPM : 2410010360
 */
public record Barang(String nama, Kategori kategori, int harga, int jumlah) {

    public long subtotal() {
        return (long) harga * jumlah;
    }
}
