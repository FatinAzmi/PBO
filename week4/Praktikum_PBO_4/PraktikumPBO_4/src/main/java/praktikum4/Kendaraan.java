/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Acer
 */
public class Kendaraan {
    private String nama;
    public String jenisMesin;
    protected int kecepatanMaks;
    public int jumlahPintu;
    
    public Kendaraan(String nama, String jenisMesin, int kecepatanMaks){
        this.nama = nama;
        this.jenisMesin = jenisMesin;
        this.kecepatanMaks = kecepatanMaks;
        
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void displayInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Mesin: " + jenisMesin);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks);
    }
}
