/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5_kendaraan;

/**
 *
 * @author MSI THIN
 */
public class Mobil extends KendaraanDarat {
    int jumlahPintu;

    Mobil(String nama, int kecepatan, int jumlahRoda, int jumlahPintu) {
        super(nama, kecepatan, jumlahRoda);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}


