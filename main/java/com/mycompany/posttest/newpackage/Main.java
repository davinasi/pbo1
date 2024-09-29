package com.mycompany.posttest.newpackage;

import java.util.Scanner;
import com.mycompany.posttest.BarangSihir; // Import BarangSihir
import com.mycompany.posttest.ManajemenBarang; // Import ManajemenBarang

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu Manajemen Inventaris Barang Sihir:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Cari Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan tipe barang: ");
                    String type = scanner.nextLine();
                    System.out.print("Masukkan jumlah barang: ");
                    int quantity = scanner.nextInt();
                    ManajemenBarang.addItem(new BarangSihir(name, type, quantity));
                    break;
                case 2:
                    ManajemenBarang.displayItems();
                    break;
                case 3:
                    System.out.print("Masukkan nama barang yang dicari: ");
                    String searchName = scanner.nextLine();
                    ManajemenBarang.searchItem(searchName);
                    break;
                case 4:
                    System.out.println("Terima kasih! Program dihentikan.");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        } while (choice != 4);
        
        scanner.close();
    }
}
