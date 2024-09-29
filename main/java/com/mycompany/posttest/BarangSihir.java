package com.mycompany.posttest;

public class BarangSihir {
    private String name;
    private String type;
    private int quantity;

    // Constructor
    public BarangSihir(String name, String type, int quantity) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method untuk menampilkan informasi barang
    public void displayInfo() {
        System.out.println("Nama: " + name + ", Tipe: " + type + ", Jumlah: " + quantity);
    }
}
