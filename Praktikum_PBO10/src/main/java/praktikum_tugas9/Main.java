/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_tugas9;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Elektronik dengan harga tertentu
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 30000.0; // Contoh harga
        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(hargaElektronik)); 
        
        // Membuat objek Makanan dengan harga tertentu
        Pembayaran makanan = new Makanan();
        double hargaMakanan = 5000.0; // Contoh harga
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(hargaMakanan));
    }
}