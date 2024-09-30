/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author MSI THIN
 */
public class Makanan extends Produk{
    private String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa){
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    public String getTanggalKadaluarsa(){
        return tanggalKadaluarsa;
    }
    
    public void setTanggalKadaluarsa(){
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    @Override
    public void tampilkaninfo(){
        super.tampilkaninfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}
