package bendageometri;

import bendageometri.PersegiPanjang;

public class LimasPersegiPanjang extends PersegiPanjang {

    // private double tinggiPersegiPanjang;

    private double volumeLimasPersegiPanjang;
    
    protected  double tinggiLimasPersegiPanjang;

    private double luasPermukaanPrismaPersegiPanjang;

    public LimasPersegiPanjang(double panjang, double lebar, double tinggiLimasPersegiPanjang) {
        super(panjang, lebar);
        this.tinggiLimasPersegiPanjang = tinggiLimasPersegiPanjang;
    }

    public double hitungVolume() {
          volumeLimasPersegiPanjang = 1.0 / 3.0 * (super.hitungLuas() * tinggiLimasPersegiPanjang);
          return volumeLimasPersegiPanjang;
    }


    public double hitungLuasPermukaan() {
        
            double tinggiSisiTegak1 = Math.sqrt(Math.pow((1.0/2.0 * lebar), 2) + Math.pow(tinggiLimasPersegiPanjang, 2));
            double tinggiSisiTegak2 = Math.sqrt(Math.pow((1.0/2.0 * panjang), 2) + Math.pow(tinggiLimasPersegiPanjang, 2));
            double luasSisiTegak1 = (1.0/2.0) * panjang * tinggiSisiTegak1;
            double luasSisiTegak2 = (1.0/2.0) * lebar * tinggiSisiTegak2;
            
        luasPermukaanPrismaPersegiPanjang = super.hitungLuas() + (2 * (luasSisiTegak1 + luasSisiTegak2));
        
        return luasPermukaanPrismaPersegiPanjang;
    }


}
