/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author MSI
 */
public class main {
    public static void main(String[] args) {
    
        pekerja worker = new pekerja("Siti", 27, "Cyber Security", 5000000);
        
      
        worker.infopekerja();
        
      
        worker.setNama("Julaika");
        System.out.println();
        System.out.println("Nama baru: " + worker.getNama());
        
      
        worker.DescPekerja();
    }
}

