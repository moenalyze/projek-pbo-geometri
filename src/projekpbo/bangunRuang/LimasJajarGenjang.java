package projekpbo.bangunRuang;

import projekpbo.bangunDatar.JajarGenjang;

public class LimasJajarGenjang extends JajarGenjang {

    private double tinggiJajarGenjang;
    private double volumeLimasJajarGenjang;
    private double luasPermukaanLimasJajarGenjang;
    private double tinggiLimas;
    private double alasJajarGenjang;

    public LimasJajarGenjang(double alasJajarGenjang, double tinggiJajarGenjang, double sudutLancip, double tinggiLimas) {
        super(alasJajarGenjang, tinggiJajarGenjang, sudutLancip);
        this.tinggiLimas = tinggiLimas;
    }

//    public double LimasJajarGenjang(double alas, double tinggi, double tinggiLimasJajarGenjang) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
    @Override
    public double hitungVolume() {
        volumeLimasJajarGenjang = hitungLuas() * tinggiLimas;
        return volumeLimasJajarGenjang;
    }

    public double getVolumeLimasJajarGenjang() {
        return volumeLimasJajarGenjang;
    }

    @Override
    public double hitungLuasPermukaan(){
            double tinggiSisiTegak1 = Math.sqrt(Math.pow((1.0/2.0 * getSisiMiringJajarGenjang()), 2) + Math.pow(tinggiLimas, 2));
            double tinggiSisiTegak2 = Math.sqrt(Math.pow((1.0/2.0 * alasJajarGenjang), 2) + Math.pow(tinggiLimas, 2));
            double luasSisiTegak1 = (1.0/2.0) * alasJajarGenjang * tinggiSisiTegak1;
            double luasSisiTegak2 = (1.0/2.0) * getSisiMiringJajarGenjang() * tinggiSisiTegak2;
        luasPermukaanLimasJajarGenjang = hitungLuas() + (2 * (luasSisiTegak1 + luasSisiTegak2));
        return luasPermukaanLimasJajarGenjang;
    }

    public double getLuasPermukaanLimasJajarGenjang() {
        return luasPermukaanLimasJajarGenjang;
    }
}
