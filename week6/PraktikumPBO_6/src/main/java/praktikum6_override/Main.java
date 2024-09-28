/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_override;

/**
 *
 * @author MSI THIN
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Kucing("Puss meong");
        hewan.bersuara(); // Output: Meow
        System.out.println();
        
        Kucing kucing = new Kucing("Void the Magical of Lunar Moon");
        kucing.tampilkanInfo();
        kucing.makan("iwak"); // Memanggil metode makan() dari kelas Hewan
        kucing.makan("iwak", 2); // Memanggil metode makan() yang overloaded
        System.out.println();
        
        Anjing anjing = new Anjing("Dawg");
        anjing.tampilkanInfo();
        anjing.bersuara(); // Output: Woof
        anjing.makan("Ayam", 3); // Memanggil metode makan() yang overloaded pada kelas Hewan
    }
}
