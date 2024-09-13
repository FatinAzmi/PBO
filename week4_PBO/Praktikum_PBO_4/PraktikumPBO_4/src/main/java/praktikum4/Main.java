/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil (bukan Kendaraan)
        Mobil mobil = new Mobil("Toyota Avanza", "Kijang", 225, 5);
        
        // Menampilkan informasi kendaraan
        mobil.displayInfo();
        
        // Mengubah nama kendaraan
        mobil.setNama("Innova");
        System.out.println();
        System.out.println("Nama baru: " + mobil.getNama());
        
        // Menampilkan informasi spesifik mobil
        mobil.infoMobil();
    }
}
