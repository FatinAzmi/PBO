/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author MSI
 */
public class manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;
    public int gaji;
    
    public manusia(String nama, int usia, String pekerjaan){
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
        public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    
    public void infopekerja(){
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Pekerjaan: " + pekerjaan);
    }
}
