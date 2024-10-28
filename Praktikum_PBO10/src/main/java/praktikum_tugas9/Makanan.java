/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_tugas9;

/**
 *
 * @author Acer
 */
class Makanan implements Pembayaran {
    // Implementasi metode hitungPajak untuk Makanan
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.05; // Pajak 5% dari harga
    }
}