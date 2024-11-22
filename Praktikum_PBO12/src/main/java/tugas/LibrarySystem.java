/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author MSI THIN
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> bukuList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Simpan Buku ke File Teks");
            System.out.println("3. Simpan Buku ke File Serial");
            System.out.println("4. Tampilkan Daftar Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline
            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanBuku();
                case 5 -> {
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();
        Buku buku = new Buku(judul, pengarang, tahunTerbit);
        bukuList.add(buku);
        System.out.println("Buku berhasil ditambahkan.");
    }

    private static void simpanKeFileTeks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEXT_FILE))) {
            for (Buku buku : bukuList) {
                writer.write(buku.toString());
                writer.newLine(); // Menambahkan newline setelah setiap buku
            }
            System.out.println("Data buku berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList);
            System.out.println("Objek buku berhasil disimpan ke file serial.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serial.");
            e.printStackTrace();
        }
    }

    private static void tampilkanBuku() {
        System.out.println("Daftar Buku:");
        // Menampilkan daftar buku yang ada di file teks
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            System.out.println("\nIsi file buku.txt:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Tidak dapat membaca file teks.");
            e.printStackTrace();
        }

        // Menampilkan daftar buku yang ada di file serial
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            List<Buku> deserializedBukuList = (List<Buku>) ois.readObject();
            System.out.println("\nIsi file buku.ser:");
            for (Buku buku : deserializedBukuList) {
                buku.tampilkanInfo();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Tidak dapat membaca file serial.");
            e.printStackTrace();
        }
    }
}
