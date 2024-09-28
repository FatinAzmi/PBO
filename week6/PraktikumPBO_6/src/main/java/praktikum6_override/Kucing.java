/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_override;

/**
 *
 * @author MSI THIN
 */
public class Kucing extends Hewan {
    Kucing(String nama){
        super(nama, "Kucing");
    }
    
    public void tampilkanInfo() {
        System.out.println("Kucing");
        super.tampilkanInfo();
    }
    
    @Override
    public void bersuara() {
        System.out.println("Meow");
    }
}
