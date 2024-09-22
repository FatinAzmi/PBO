/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5_kendaraan;

/**
 *
 * @author MSI THIN
 */
public class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    KendaraanDarat(String nama, int kecepatan, int jumlahRoda) {
        super(nama, kecepatan);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}


