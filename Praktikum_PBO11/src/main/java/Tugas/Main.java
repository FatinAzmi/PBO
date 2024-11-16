/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author MSI THIN
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pengarang
        Pengarang pengarang1 = new Pengarang("J.K.Rowling");
        Pengarang pengarang2 = new Pengarang("Makoto Shinkai");
        // Membuat objek Buku
        Buku buku1 = new Buku("Harry Potter and the Sorcerer's Stone", pengarang1);
        Buku buku2 = new Buku("Your Name", pengarang2);
        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan(10);
        // Menambahkan buku ke perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        // Menampilkan semua buku di perpustakaan
        perpustakaan.tampilkanSemuaBuku();
    }
}
