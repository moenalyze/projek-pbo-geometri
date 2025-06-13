/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bendageometri;

import bendageometri.Geometri2D;

/**
 *
 * @author User
 */
public class LayangLayang extends Geometri2D {
    protected double diagonal1;
    protected double diagonal2;
    protected double sisi1;
    protected double sisi2;
    private double luasLayangLayang;
    private double kelilingLayangLayang;

    public LayangLayang(double diagonal1, double diagonal2, double sisi1, double sisi2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.luasLayangLayang = hitungLuas();
        this.kelilingLayangLayang = hitungKeliling();
    }

    @Override
    public double hitungLuas() throws IllegalArgumentException {
        if (diagonal1 <= 0 || diagonal2 <= 0) {
            throw new IllegalArgumentException("Diagonal harus lebih besar dari 0");
        }
        luasLayangLayang = 0.5 * diagonal1 * diagonal2;
        return luasLayangLayang;
}

// Overloaded method dengan parameter input
    public double hitungLuas(double diagonal1, double diagonal2) throws IllegalArgumentException {
        if (diagonal1 <= 0 || diagonal2 <= 0) {
            throw new IllegalArgumentException("Diagonal harus lebih besar dari 0");
        }
        luasLayangLayang = 0.5 * diagonal1 * diagonal2;
        return luasLayangLayang;
}

    public double getLuasLayangLayang() {
        return luasLayangLayang;
    }

    // Overriding dengan pengecekan validitas
    @Override
    public double hitungKeliling() throws IllegalArgumentException {
        if (sisi1 <= 0 || sisi2 <= 0) {
            throw new IllegalArgumentException("Sisi-sisi harus lebih besar dari 0");
        }
        kelilingLayangLayang = 2 * (sisi1 + sisi2);
        return kelilingLayangLayang;
    }

    // Overloaded method dengan parameter
    public double hitungKeliling(double sisi1, double sisi2) throws IllegalArgumentException {
        if (sisi1 <= 0 || sisi2 <= 0) {
            throw new IllegalArgumentException("Sisi-sisi harus lebih besar dari 0");
        }
        kelilingLayangLayang = 2 * (sisi1 + sisi2);
        return kelilingLayangLayang;
    }

    public double getKelilingLayangLayang() {
        return kelilingLayangLayang;
    }
}

