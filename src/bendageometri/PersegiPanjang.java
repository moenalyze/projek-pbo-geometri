/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bendageometri;

import bendageometri.Geometri2D;

/**
 *
 * @author Kelompok 2 IF-A
 */
public class PersegiPanjang extends Geometri2D {
    // Atribut khusus untuk persegi panjang
    protected double panjang;
    protected double lebar;
    protected double luasPersegiPanjang;
    private double kelilingPersegiPanjang;

    // Constructor untuk PersegiPanjang
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

     // Constructor overload untuk PersegiPanjang
    public PersegiPanjang(int panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Implementasi metode hitungLuas() untuk persegi panjang
    @Override
    public double hitungLuas() throws IllegalArgumentException {
        if (panjang <= 0 || lebar <= 0) {
            throw new IllegalArgumentException("Panjang dan lebar harus lebih besar dari 0");
        }
        // Rumus luas persegi panjang: panjang * lebar
        luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
    }

    public double hitungLuas(int panjang, int lebar) throws IllegalArgumentException {
        if (panjang <= 0 || lebar <= 0) {
            throw new IllegalArgumentException("Panjang dan lebar harus lebih besar dari 0");
        }
        // Rumus luas persegi panjang: panjang * lebar
        luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
    }

    public void tagPersegiPanjang(){
        System.out.println("Menghitung persegi pnjang");
    }

    // Getter untuk luas Persegi Panjang
    public double getLuasPersegiPanjang() {
        return luasPersegiPanjang;
    }

    @Override
    public double hitungKeliling() throws IllegalArgumentException {
        if (panjang <= 0 || lebar <= 0) {
            throw new IllegalArgumentException("Panjang dan lebar harus lebih besar dari 0");
        }
        // Keliling Persegi Panjang = 2 * (panjang + lebar)
        kelilingPersegiPanjang = 2 * (panjang + lebar);
        return kelilingPersegiPanjang;
    }

    // Overloading perhitungan
    public double hitungKeliling(int panjang, int lebar) throws IllegalArgumentException {
        if (panjang <= 0 || lebar <= 0) {
            throw new IllegalArgumentException("Panjang dan lebar harus lebih besar dari 0");
        }
        // Keliling Persegi Panjang = 2 * (panjang + lebar)
        kelilingPersegiPanjang = 2 * (panjang + lebar);
        return kelilingPersegiPanjang;
    }

    // Getter untuk keliling Persegi Panjang
    public double getKelilingPersegiPanjang() {
        return kelilingPersegiPanjang;
    }

}
