/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5_kendaraan;

/**
 *
 * @author MSI THIN
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil = new Mobil("Kijang Super", 180, 4, 4);
        mobil.tampilkanInfo();

        // Membuat objek SepedaMotor
        SepedaMotor sepedaMotor = new SepedaMotor("Honda Vario", 150, 2, "Honda");
        sepedaMotor.tampilkanInfo();
    }
}