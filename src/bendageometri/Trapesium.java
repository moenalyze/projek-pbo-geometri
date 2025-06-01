package bendageometri;

import bendageometri.Geometri2D;

public class Trapesium extends Geometri2D {
    // Atribut khusus untuk trapesium
    protected double sisiSejajar1;
    protected double sisiSejajar2;
    protected double tinggi;
    protected double sisiMiring;
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
