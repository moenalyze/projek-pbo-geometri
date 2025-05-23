/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

/**
 *
 * @author User
 */
public class LayangLayang extends Geometri2D {
    // Atribut khusus untuk layang-layang
    public double diagonal1;
    public double diagonal2;
    public double sisi1;
    public double sisi2;
    public double luasLayangLayang;
    public double kelilingLayangLayang;

    // Constructor untuk LayangLayang
    public LayangLayang(double diagonal1, double diagonal2, double sisi1, double sisi2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        luasLayangLayang = hitungLuas();
        kelilingLayangLayang = hitungKeliling();
    }

    // Implementasi metode hitungLuas() untuk layang-layang
    @Override
    public double hitungLuas() {
        // Rumus luas layang-layang: 0.5 * diagonal1 * diagonal2
        luasLayangLayang = 0.5 * diagonal1 * diagonal2;
        return luasLayangLayang;
    }

    // Getter untuk Luas Layang Layang
    public double getLuasLayangLayang() {
        return luasLayangLayang;
    }

    @Override
    public double hitungKeliling() {
        // rumus mencari keliling 2 * (sisi1 + sisi2)
        kelilingLayangLayang = 2 * (sisi1 + sisi2);
        return kelilingLayangLayang;
    }

    // Getter untuk keliling Layang Layang
    public double getKelilingLayangLayang() {
        return kelilingLayangLayang;
    }
}
