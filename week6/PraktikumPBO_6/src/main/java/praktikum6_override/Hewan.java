/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_override;

/**
 *
 * @author MSI THIN
 */
public class Hewan{
    String nama;
    String jenis;
    
    Hewan(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
    }
    
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
    
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}

