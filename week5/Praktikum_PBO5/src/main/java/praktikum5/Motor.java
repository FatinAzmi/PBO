/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author MSI THIN
 */
public class Motor extends Kendaraan {
   String jenisMesin;

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}

