/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author MSI THIN
 */
public class Buku extends Produk{
    Buku(String nama, double harga){
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon(){
        return harga * 0.05;
    }
}
