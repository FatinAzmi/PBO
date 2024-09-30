/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author MSI THIN
 */
public class Main {
    public static void main(String[] args) {
        //Membuat objek dari seluruh subclass
        Elektronik elektronik = new Elektronik("Xiaomi 12 Lite", 5000000, 2);
        Makanan makanan = new Makanan("Nasi Goreng ayam", 10000, "12-12-2024");
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Andromeda", 1000000, 200000);
        PegawaiKontrak pegawaiKontrak = new PegawaiKontrak("Jeanne D`Arc", 500000, 48);

        //Menggunakan objek
        elektronik.tampilkaninfo();
        System.out.println();
        
        makanan.tampilkaninfo();
        System.out.println();
        
        pegawaiTetap.tampilkaninfo();
        System.out.println();
        
        pegawaiKontrak.tampilkaninfo();
    }
}
