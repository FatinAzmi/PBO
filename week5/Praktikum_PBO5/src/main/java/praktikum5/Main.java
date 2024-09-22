/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author MSI THIN
 */
public class Main {
    public static void main(String[] args) {
        // Create a Mobil object
        Mobil mobil = new Mobil ();
        mobil.nama = "Toyota Avanza";
        mobil.kecepatan = 180;
        mobil.jumlahPintu= 4;
        mobil.tampilkanInfoMobil();  

        // Create a SepedaMotor object
        Motor motor = new Motor ();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jenisMesin= "2-tak";
        motor.tampilkanInfo();  

    }
}

