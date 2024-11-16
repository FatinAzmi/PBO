/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author MSI THIN
 */
class Perpustakaan {
    private Buku[] daftarBuku;
    private int jumlahBuku;
    public Perpustakaan(int kapasitas) {
        this.daftarBuku = new Buku[kapasitas];
        this.jumlahBuku = 0;
    }
    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Perpustakaan sudah penuh!");
        }
    }
    public void tampilkanSemuaBuku() {
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println(daftarBuku[i].infoBuku());
        }
    }
}