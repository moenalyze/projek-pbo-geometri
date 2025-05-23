package projekpbo.bangunRuang;

import projekpbo.bangunDatar.PersegiPanjang;

public class LimasPersegiPanjang extends PersegiPanjang {
    private  double tinggiLimasPersegiPanjang;

    public LimasPersegiPanjang(double panjang, double lebar, double tinggiLimasPersegiPanjang) {
        super(panjang, lebar);
        this.tinggiLimasPersegiPanjang = tinggiLimasPersegiPanjang;
    }

    public double hitungVolume() {
          return 1.0 / 3.0 * (hitungLuas() * tinggiLimasPersegiPanjang);
    }


    public double hitungLuasPermukaan() {
        
            double tinggiSisiTegak1 = Math.sqrt(Math.pow((1.0/2.0 * lebar), 2) + Math.pow(tinggiLimasPersegiPanjang, 2));
            double tinggiSisiTegak2 = Math.sqrt(Math.pow((1.0/2.0 * panjang), 2) + Math.pow(tinggiLimasPersegiPanjang, 2));
            double luasSisiTegak1 = (1.0/2.0) * panjang * tinggiSisiTegak1;
            double luasSisiTegak2 = (1.0/2.0) * lebar * tinggiSisiTegak2;
                    
        return super.hitungLuas() + (2 * (luasSisiTegak1 + luasSisiTegak2));
    }

}
