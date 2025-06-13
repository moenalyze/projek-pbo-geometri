package bendageometri;

import bendageometri.Persegi;

public class LimasPersegi extends Persegi {

    // Atribut khusus untuk limas persegi
    protected double tinggiLimas;
    private double volumeLimasPersegi;
    private double luasPermukaanLimasPersegi;

    // Constructor
    public LimasPersegi(double sisi, double tinggiLimas) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
        this.volumeLimasPersegi = hitungVolume();
        this.luasPermukaanLimasPersegi = hitungLuasPermukaan();
    }

    // ========== VOLUME ==========

    @Override
    public double hitungVolume() throws IllegalArgumentException {
        if (sisi <= 0 || tinggiLimas <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi limas harus lebih besar dari 0");
        }
        volumeLimasPersegi = (1.0 / 3.0) * sisi * sisi * tinggiLimas;
        return volumeLimasPersegi;
    }

    // Overloading Volume
    public double hitungVolume(double sisi, double tinggi) throws IllegalArgumentException {
        if (sisi <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi harus lebih besar dari 0");
        }
        return (1.0 / 3.0) * sisi * sisi * tinggi;
    }

    public double getVolumeLimas() {
        return volumeLimasPersegi;
    }

    // ========== LUAS PERMUKAAN ==========

    @Override
    public double hitungLuasPermukaan() throws IllegalArgumentException {
        if (sisi <= 0 || tinggiLimas <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi limas harus lebih besar dari 0");
        }
        // Menghitung tinggi segitiga sisi tegak dengan Teorema Pythagoras
        double tinggiSisiTegak = Math.sqrt(Math.pow(0.5 * sisi, 2) + Math.pow(tinggiLimas, 2));
        double luasSegitigaTegak = 0.5 * sisi * tinggiSisiTegak;
        luasPermukaanLimasPersegi = (sisi * sisi) + (4 * luasSegitigaTegak);
        return luasPermukaanLimasPersegi;
    }

    // Overloading Luas Permukaan
    public double hitungLuasPermukaan(double sisi, double tinggi) throws IllegalArgumentException {
        if (sisi <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi harus lebih besar dari 0");
        }
        double tinggiSisiTegak = Math.sqrt(Math.pow(0.5 * sisi, 2) + Math.pow(tinggi, 2));
        double luasSegitigaTegak = 0.5 * sisi * tinggiSisiTegak;
        return (sisi * sisi) + (4 * luasSegitigaTegak);
    }

    public double getLuasPermukaanLimasPersegi() {
        return luasPermukaanLimasPersegi;
    }
}
