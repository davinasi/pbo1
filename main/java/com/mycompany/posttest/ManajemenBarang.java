package com.mycompany.posttest;

import java.util.ArrayList;

public class ManajemenBarang {
    private static ArrayList<BarangSihir> items = new ArrayList<>();

    // Method untuk menambahkan barang
    public static void addItem(BarangSihir item) {
        items.add(item);
        System.out.println("Barang berhasil ditambahkan.");
    }

    // Method untuk menampilkan semua barang
    public static void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Inventaris kosong.");
            return;
        }
        System.out.println("Daftar Barang:");
        for (BarangSihir item : items) {
            item.displayInfo();
        }
    }

    // Method untuk mencari barang
    public static void searchItem(String name) {
        for (BarangSihir item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                System.out.println("Barang ditemukan:");
                item.displayInfo();
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }
}
