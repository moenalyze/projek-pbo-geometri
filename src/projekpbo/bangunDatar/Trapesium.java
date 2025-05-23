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
public class Trapesium extends Geometri2D {
    // Atribut khusus untuk trapesium
    public double sisiSejajar1;
    public double sisiSejajar2;
    public double tinggi;
    public double sisiMiring;
    private double luasTrapesium;
    private double kelilingTrapesium;

    // Constructor untuk Trapesium
    public Trapesium(double sisiSejajar1, double sisiSejajar2, double tinggi) {
        this.sisiSejajar1 = sisiSejajar1;
        this.sisiSejajar2 = sisiSejajar2;
        this.tinggi = tinggi;
        luasTrapesium = hitungLuas();
        kelilingTrapesium = hitungKeliling();
    }

    // Implementasi metode hitungLuas() untuk trapesium
    @Override
    public double hitungLuas() {
        // Rumus luas trapesium: 0.5 * (alasAtas + alasBawah) * tinggi
        luasTrapesium = 0.5 * (sisiSejajar1 + sisiSejajar2) * tinggi;
        return luasTrapesium;
    }

    // Getter untuk Luas Trapesium
    public double getLuasTrapesium() {
        return luasTrapesium;
    }

    // Implementasi metode hitungKeliling() untuk trapesium
    @Override
    public double hitungKeliling() {
        double selisihSisiSejajar = Math.abs(sisiSejajar1 - sisiSejajar2) / 2;
        sisiMiring = Math.sqrt(Math.pow(selisihSisiSejajar, 2) + Math.pow(tinggi, 2));
        kelilingTrapesium = (sisiSejajar1 + sisiSejajar2) + 2 * sisiMiring;
        return kelilingTrapesium;
    }

    // Getter untuk Keliling Trapesium
    public double getKelilingTrapesium() {
        return kelilingTrapesium;
    }

}
