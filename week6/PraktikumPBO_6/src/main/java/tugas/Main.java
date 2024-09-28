/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author MSI THIN
 */
public class Main {
    public static void main(String[] args){
        KeranjangBelanja keranjang = new KeranjangBelanja();
        
        Buku buku = new Buku("Harry Potter and the Goblet of Fire", 200000);
        Elektronik elektronik = new Elektronik("Kulkas", 1500000);
        Pakaian pakaian = new Pakaian("Kaos Polo", 70000);
        
        keranjang.addProduk(buku);
        keranjang.addProduk(elektronik);
        keranjang.addProduk(pakaian);
        
        keranjang.List();
        
        double totalHarga = keranjang.hitungTotalHarga();
        System.out.println("Total: " + totalHarga);
    }
}
