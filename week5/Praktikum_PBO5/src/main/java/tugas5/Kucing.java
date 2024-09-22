/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author MSI THIN
 */
public class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama, "Kucing");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Kucing.");
        super.tampilkanInfo();
    }

    public void suara() {
        System.out.println("Suara kucing = Meowwwww");
    }
}


