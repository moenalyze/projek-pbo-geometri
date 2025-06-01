package bendageometri;

import bendageometri.Segitiga;


public class LimasSegitiga extends Segitiga {
    protected double tinggiLimas;
    private double volumeLimasSegitiga;
    private double luasPermukaanLimasSegitiga;
//    private double getRandomDouble(5.0, 10.0);
    

    public LimasSegitiga(double alas, double tinggi, double tinggiLimas) {
        super(alas, tinggi);
        this.tinggiLimas = tinggiLimas;
        tinggiLimas = Math.random();
    }

    public double hitungVolume() {
          volumeLimasSegitiga = (1.0 / 3.0 * hitungLuas() * tinggiLimas);
          return volumeLimasSegitiga;
    }
    
    public double hitungLuasPermukaan() {
        double tinggiSisiTegak = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(1.0/2.0 * tinggi, 2));
        double luasSisiTegak = 1.0/2.0 * alas * tinggiSisiTegak;
        luasPermukaanLimasSegitiga = hitungLuas() + 3 * luasSisiTegak;
        return luasPermukaanLimasSegitiga;
    }
}