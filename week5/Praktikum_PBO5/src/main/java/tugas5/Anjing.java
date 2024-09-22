/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author MSI THIN
 */
public class Anjing extends Hewan {
    Anjing(String nama) {
        super(nama, "Anjing");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Anjing.");
        super.tampilkanInfo();
    }

    public void suara() {
        System.out.println("Suara Anjing = Woofff Wooffff");
    }
}

