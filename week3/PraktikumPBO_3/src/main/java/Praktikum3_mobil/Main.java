/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3_mobil;

/**
 *
 * @author MSI THIN
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza Ember", 2021, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic Turbo", 2019, "Putih");
        mobil1.displayInfo();
        mobil1.startEngine();
        System.out.println();

        mobil2.displayInfo();
        mobil2.startEngine();
        System.out.println();

        mobil1.setWarna("Merah");
        System.out.println("Setelah perubahan warna:");
        mobil1.displayInfo();
    }
}

