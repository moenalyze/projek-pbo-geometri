package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Trapesium;

public class LimasTrapesium extends Trapesium {
    private double tinggiLimas;
    private double tinggiSisiTegak1; // sisi yang sejajar
    private double tinggiSisiTegak2; // sisi yang miring
    private double volumeLimasTrapesium;
    private double luasPermukaanLimasTrapesium;

    public LimasTrapesium(double sisiSejajar1,double sisiSejajar2,double tinggi, double tinggiSisiTegak1, double tinggiSisiTegak2) {
        super(sisiSejajar1, sisiSejajar2, tinggi);
        this.tinggiSisiTegak1 = tinggiSisiTegak1;
        this.tinggiSisiTegak2 = tinggiSisiTegak2;
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volumeLimasTrapesium = 1.0 / 3.0 * tinggiLimas * hitungLuas();
        return volumeLimasTrapesium;
    }
    
     public double getVolumeLimasTrapesium() {
        return volumeLimasTrapesium;
    }

    public double hitungLuasPermukaan() {
        double luasSisiTegak1 = 0.5 * super.sisiSejajar1 * tinggiSisiTegak1;
        double luasSisiTegak2 = 0.5 * super.sisiSejajar2 * tinggiSisiTegak1;
        double luasSisiTegak3 = 0.5 * super.sisiMiring * tinggiSisiTegak2;
        luasPermukaanLimasTrapesium = hitungLuas() + tinggiSisiTegak1 + tinggiSisiTegak2 + (2 * luasSisiTegak3);
        return luasPermukaanLimasTrapesium;
    }

    public double getLuasPermukaanLimasTrapesium() {
        return luasPermukaanLimasTrapesium;
    }
}
