/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author MSI THIN
 */
//class produk
public class Produk {
    private String namaProduk;
    private double harga;
    
    Produk(String namaProduk, double harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    } 
    
    //metode getter dan setter nama produk
    public String getNama(){
            return namaProduk;
    }
    public void setNama (String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    //metode getter dan setter harga
    public double getHarga(){
        return harga;
    }
    public void setHarga (double harga){
        this.harga = harga;
    }
    
    //metode tampilkaninfo
    public void tampilkaninfo(){
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}
