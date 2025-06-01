package bendageometri;

import bendageometri.LayangLayang;

public class LimasLayangLayang extends LayangLayang {

    private double tinggiLimas;
    private double tinggiSisiTegak1; // tinggi yang alasnya pendek
    private double tinggiSisiTegak2; // tinggi yang alasnya panjang
    private double volumeLimasLayangLayang;
    private double luasPermukaanLimasLayangLayang;

    public LimasLayangLayang(double diagonal1, double diagonal2, double sisi1, double sisi2, double tinggiLimas, double tinggiSisiTegak1, double tinggiSisiTegak) {
        super(diagonal1, diagonal2, sisi1, sisi2);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegak1 = tinggiSisiTegak1;
        this.tinggiSisiTegak2 = tinggiSisiTegak2;
    }

    public double hitungVolume() {
        volumeLimasLayangLayang = 1.0 / 3.0 * hitungLuas() * tinggiLimas;
        return volumeLimasLayangLayang;
    }

    public double getVolumeLimasLayangLayang() {
        return volumeLimasLayangLayang;
    }

    public double hitungLuasPermukaan() {
        double luasSisiTegak1 = 0.5 * tinggiSisiTegak1 * sisi1;
        double luasSisiTegak2 = 0.5 * tinggiSisiTegak2 * sisi2;
        luasPermukaanLimasLayangLayang = hitungLuas() + 2 * (luasSisiTegak1 + luasSisiTegak2);
        return luasPermukaanLimasLayangLayang;
    }

    public double getLuasPermukaanLimasLayangLayang() {
        return luasPermukaanLimasLayangLayang;
    }
}
