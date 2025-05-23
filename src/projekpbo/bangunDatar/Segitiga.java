/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

/**
 *
 * @author user
 */
public class Segitiga extends Geometri2D {
    // Atribut khusus untuk segitiga
    public double sisi;
    public double tinggi;
    private double luasSegitiga;
    private double kelilingSegitiga;

    // Constructor untuk Segitiga
    public Segitiga(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
        luasSegitiga = hitungLuas();
        kelilingSegitiga = hitungKeliling();
    }

    // Implementasi metode hitungLuas() untuk segitiga
    @Override
    public double hitungLuas() {
        // Rumus luas segitiga: 0.5 * alas * tinggi
        luasSegitiga = 0.5 * sisi * tinggi;
        return luasSegitiga;
    }

    // Getter untuk Luas Segitiga
    public double getLuasSegitiga() {
        return luasSegitiga;
    }

    @Override
    public double hitungKeliling() {
        // Rumus keliling segitiga: 3 * sisi - segitiga sama sisi
        kelilingSegitiga = 3 * sisi;
        return kelilingSegitiga;
    }

    // Getter untuk Keliling Segitiga
    public double getKelilingSegitiga() {
      return kelilingSegitiga;
    }
}
