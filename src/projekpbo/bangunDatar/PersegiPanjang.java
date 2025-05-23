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
public class PersegiPanjang extends Geometri2D {
    // Atribut khusus untuk persegi panjang
    protected double panjang;
    protected double lebar;


    // Constructor untuk PersegiPanjang
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Implementasi metode hitungLuas() untuk persegi panjang
    @Override
    public double hitungLuas() {
        // Rumus luas persegi panjang: panjang * lebar
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        // Keliling Persegi Panjang = 2 * (panjang + lebar)
        return  2 * (panjang + lebar);
    }

}
