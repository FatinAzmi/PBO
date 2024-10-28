/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_tugas9;

/**
 *
 * @author Acer
 */
class Elektronik implements Pembayaran {
    // Implementasi metode hitungPajak untuk Elektronik
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.10; // Pajak 10% dari harga
    }
}