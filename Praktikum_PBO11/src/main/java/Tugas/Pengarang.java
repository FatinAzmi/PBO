/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author MSI THIN
 */
class Pengarang {
    private String namaPengarang;
    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }
    public String infoPengarang() {
        return "Pengarang: " + this.namaPengarang;
    }
}