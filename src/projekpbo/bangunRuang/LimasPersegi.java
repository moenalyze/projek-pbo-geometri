package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Persegi;

public class LimasPersegi extends Persegi {

    // Atribut khusus untuk limas persegi
    private final double tinggiLimas;
    private double volumeLimasPersegi;
    private double luasPermukaanLimasPersegi;

    // Constructor untuk LimasPersegi
    public LimasPersegi(double sisi, double tinggiLimas) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
        volumeLimasPersegi = hitungVolume();
        luasPermukaanLimasPersegi = hitungLuasPermukaan();
    }

    // Implementasi metode hitungVolume() untuk limas persegi
    @Override
    public double hitungVolume() {
        // Volume limas persegi = (1/3) * luas alas * tinggiLimas
        volumeLimasPersegi = (1.0 / 3.0) * hitungLuas() * tinggiLimas;
        return volumeLimasPersegi;
    }

    // Getter untuk volumeLimas
    public double getVolumeLimas() {
        return volumeLimasPersegi;
    }
    
    // Implementasi metode hitungLuasPermukaan() untuk LimasPersegi
    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan Limas Persegi = luas alas + jumlah luas sisi tegak
        double tinggiSisiTegak = Math.sqrt(Math.pow(0.5 * sisi, 2) + Math.pow(tinggiLimas, 2));
        luasPermukaanLimasPersegi = hitungLuas() + (4 * ((sisi * tinggiSisiTegak)/2));
        return luasPermukaanLimasPersegi;
    }
    
    public double getLuasPermukaanLimasPersegi(){
        return luasPermukaanLimasPersegi;
    }

}

