/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author MSI
 */
public class pekerja extends manusia {
    private int gaji;
    
    public pekerja(String nama, int usia, String pekerjaan, int gaji){
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    } 
    
        // Getter untuk jumlah pintu
    public int getGaji() {
        return gaji;
    }

    // Setter untuk jumlah pintu
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public void DescPekerja(){
        System.out.println("Pekerjaan baru: " + pekerjaan);
        System.out.println("Usia: " + usia);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Gaji: " + gaji);
    }
}