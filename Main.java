/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Scanner;

// Kelas Segitiga yang merupakan turunan dari ObjekGeometris
class Segitiga {
    // Bidang data untuk sisi segitiga
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // Konstruktor tanpa argumen yang membuat segitiga default
    public Segitiga() {
    }

    // Konstruktor dengan sisi yang ditentukan
    public Segitiga(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Metode pengakses untuk sisi segitiga
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Metode untuk menghitung luas segitiga
    public double getArea() {
        double s = (side1 + side2 + side3) / 2; // setengah keliling
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Rumus Heron
    }

    // Metode untuk menghitung keliling segitiga
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Metode untuk mengembalikan deskripsi string segitiga
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + side1 + " sisi2 = " + side2 + " sisi3 = " + side3;
    }
}

// Program Pengujian Segitiga
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan sisi 1 segitiga: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi 2 segitiga: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi 3 segitiga: ");
        double side3 = input.nextDouble();

        System.out.print("Masukkan warna segitiga: ");
        String warna = input.next();

        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean terisi = input.nextBoolean();

        // Membuat objek Segitiga dengan sisi yang dimasukkan
        Segitiga segitiga = new Segitiga(side1, side2, side3);

        // Menampilkan informasi tentang segitiga
        System.out.println("Segitiga dibuat!");
        System.out.println(segitiga.toString());
        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna segitiga: " + warna);
        System.out.println("Segitiga terisi: " + terisi);
    }
}

