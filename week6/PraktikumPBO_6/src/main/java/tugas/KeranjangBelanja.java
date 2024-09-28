/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author MSI THIN
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja{    
    private List<Produk> produkList;
    
    public KeranjangBelanja(){
        produkList = new ArrayList<>();
    }
    
    public void addProduk(Produk produk) {
        produkList.add(produk);
    }
    
    public void List(){
        for (Produk produk : produkList){
            System.out.println("Nama: " + produk.nama);
            System.out.println("Harga: " + produk.getHarga());
            System.out.println("Diskon: " + produk.hitungDiskon());
            System.out.println("Harga setelah diskon: " + (produk.getHarga() - produk.hitungDiskon()));
            System.out.println("-------------------");
        }
    }
    
    public double hitungTotalHarga() {
        double totalHarga = 0;
        for (Produk produk : produkList) {
            totalHarga += produk.getHarga() - produk.hitungDiskon();
        }
        return totalHarga;
    }
}
    