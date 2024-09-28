/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_override;

/**
 *
 * @author MSI THIN
 */
public class Anjing extends Hewan {
    Anjing(String nama){
        super(nama, "Anjing");
    }
    
    public void tampilkanInfo() {
        System.out.println("Anjing");
        super.tampilkanInfo();
    }
    
    @Override
    public void bersuara() {
        System.out.println("Suara anjing: Woof");
    }
}

