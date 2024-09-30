/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author MSI THIN
 */
public class Elektronik extends Produk{
    private int garansi;
    
    Elektronik(String namaProduk, double harga, int garansi){
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    public int getGaransi(){
        return garansi;
    }
    
    public void setGaransi(int garansi){
        this.garansi = garansi;
    }
    
    @Override
    public void tampilkaninfo(){
        super.tampilkaninfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}