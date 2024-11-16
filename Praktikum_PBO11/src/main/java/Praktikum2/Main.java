/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author MSI THIN
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek anggota
        Anggota anggota1 = new Anggota("Meow");
        Anggota anggota2 = new Anggota("Mimiauw");
        
        // Membuat objek klub
        Klub klub = new Klub("Klub Sepakbola");
        
        // Menambahkan anggota ke klub
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        
        // Menampilkan informasi klub dan anggotanya
        klub.infoKlub();
    }
}
