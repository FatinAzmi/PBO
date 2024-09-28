/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author MSI THIN
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing("kucing puss meong");
        kucing.bersuara(); // Output: Hewan bersuara
        kucing.makan("ikan"); // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2); // Memanggil metode makan() yang overloaded
    }
      
}