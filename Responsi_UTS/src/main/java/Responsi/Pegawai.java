/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author MSI THIN
 */
public class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    Pegawai(String namaPegawai, double gaji){
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    //metode getter dan setter nama pegawai
    public String getNama(){
            return namaPegawai;
    }
    public void setNama (String namaPegawai){
        this.namaPegawai = namaPegawai;
    }
    
    //metode getter dan setter gaji
    public double getGaji(){
        return gaji;
    }
    public void setGaji (double gaji){
        this.gaji = gaji;
    }
    
    public void tampilkaninfo(){
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
}
