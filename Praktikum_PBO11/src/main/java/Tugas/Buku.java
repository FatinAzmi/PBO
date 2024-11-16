/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author MSI THIN
 */
class Buku {
    private String judul;
    private Pengarang pengarang; // Agregasi: Buku memiliki Pengarang
    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    public String infoBuku() {
        return "Judul Buku: " + 
                this.judul + ", " + 
                this.pengarang.infoPengarang();
    }
}