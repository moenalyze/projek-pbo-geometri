package bendageometri;

import bendageometri.BelahKetupat;

public class LimasBelahKetupat extends BelahKetupat {
    protected double tinggiLimas;
    protected double tinggiSisiTegak;
    private double volume;
    private double luasPermukaan;

    public LimasBelahKetupat(double diagonal1, double diagonal2, double tinggiLimas, double tinggiSisiTegak) {
        super(diagonal1, diagonal2);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegak = tinggiSisiTegak;
    }

    @Override
    public double hitungVolume() {
        volume = 1.0 / 3.0 * (super.hitungLuas()* tinggiLimas);
        return volume;
    }

    @Override
    public double hitungLuasPermukaan(){
        double luasSisiTegak = (1.0 / 2.0) * super.hitungSisi() * tinggiSisiTegak;
        luasPermukaan = super.hitungLuas() + (4 * (luasSisiTegak));
        return luasPermukaan;
    }
}
