package projekpbo.bangunRuang;

import projekpbo.bangunDatar.BelahKetupat;

public class LimasBelahKetupat extends BelahKetupat {
    protected double tinggiLimas;
    protected double tinggiSisiTegak;

    public LimasBelahKetupat(double diagonal1, double diagonal2, double tinggiLimas, double tinggiSisiTegak) {
        super(diagonal1, diagonal2);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegak = tinggiSisiTegak;
    }

    @Override
    public double hitungVolume() {
        return 1.0 / 3.0 * (hitungLuas()* tinggiLimas);
    }

    @Override
    public double hitungLuasPermukaan(){
        double luasSisiTegak = (1.0 / 2.0) * sisi * tinggiSisiTegak;
        return hitungLuas() + (4 * (luasSisiTegak));
    }
}
