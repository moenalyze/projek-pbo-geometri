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
    
    public LimasBelahKetupat(int diagonal1, int diagonal2, int tinggiLimas, int tinggiSisiTegak) {
        super(diagonal1, diagonal2);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegak = tinggiSisiTegak;
    }

    @Override
    public double hitungVolume() throws IllegalArgumentException {
        try {
            double s = Math.sqrt(Math.pow(diagonal1 / 2.0, 2) + Math.pow(diagonal2 / 2.0, 2)); // sisi belah ketupat
            double tinggiMinimal = Math.sqrt(Math.pow(s / 2.0, 2) + Math.pow(tinggiLimas, 2));
            
            if (diagonal1 <= 0 || diagonal2 <= 0 || tinggiLimas <= 0 || tinggiSisiTegak <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal, tinggi limas, dan tinggi sisi tegak harus lebih besar dari 0");
            } else if (tinggiSisiTegak < tinggiMinimal) {
                throw new IllegalArgumentException("Tinggi sisi tegak terlalu pendek (harus >= " + String.format("%.2f", tinggiMinimal) + ")");
            }
            volume = 1.0 / 3.0 * (super.hitungLuas()* tinggiLimas);
            return volume;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung volume limas belah ketupat: " + e.getMessage());
            throw e;
        }
    }
    
    // overloaded method
    public double hitungVolume(double diagonal1, double diagonal2, double tinggiLimas, double tinggiSisiTegak) throws IllegalArgumentException {
        try {
            double s = Math.sqrt(Math.pow(diagonal1 / 2.0, 2) + Math.pow(diagonal2 / 2.0, 2)); // sisi belah ketupat
            double tinggiMinimal = Math.sqrt(Math.pow(s / 2.0, 2) + Math.pow(tinggiLimas, 2));
            
            if (diagonal1 <= 0 || diagonal2 <= 0 || tinggiLimas <= 0 || tinggiSisiTegak <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal, tinggi limas, dan tinggi sisi tegak harus lebih besar dari 0");
            } else if (tinggiSisiTegak < tinggiMinimal) {
                throw new IllegalArgumentException("Tinggi sisi tegak terlalu pendek (harus >= " + String.format("%.2f", tinggiMinimal) + ")");
            }
            volume = 1.0 / 3.0 * (super.hitungLuas()* tinggiLimas);
            return volume;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung volume limas belah ketupat: " + e.getMessage());
            throw e;
        }
    }

    @Override
    public double hitungLuasPermukaan() throws IllegalArgumentException{
         try {
            double s = Math.sqrt(Math.pow(diagonal1 / 2.0, 2) + Math.pow(diagonal2 / 2.0, 2)); // sisi belah ketupat
            double tinggiMinimal = Math.sqrt(Math.pow(s / 2.0, 2) + Math.pow(tinggiLimas, 2));
            
            if (diagonal1 <= 0 || diagonal2 <= 0 || tinggiLimas <= 0 || tinggiSisiTegak <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal, tinggi limas, dan tinggi sisi tegak harus lebih besar dari 0");
            } else if (tinggiSisiTegak < tinggiMinimal) {
                throw new IllegalArgumentException("Tinggi sisi tegak terlalu pendek (harus >= " + String.format("%.2f", tinggiMinimal) + ")");
            }
            super.hitungSisi();
            double luasSisiTegak = (1.0 / 2.0) * super.getSisi() * tinggiSisiTegak;
            luasPermukaan = super.hitungLuas() + (4 * (luasSisiTegak));
            return luasPermukaan;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas permukaan limas belah ketupat: " + e.getMessage());
            throw e;
        }
    }
    
    // overloaded method
    public double hitungLuasPermukaan(double diagonal1, double diagonal2, double tinggiLimas, double tinggiSisiTegak) throws IllegalArgumentException{
         try {
            double s = Math.sqrt(Math.pow(diagonal1 / 2.0, 2) + Math.pow(diagonal2 / 2.0, 2)); // sisi belah ketupat
            double tinggiMinimal = Math.sqrt(Math.pow(s / 2.0, 2) + Math.pow(tinggiLimas, 2));
            
            if (diagonal1 <= 0 || diagonal2 <= 0 || tinggiLimas <= 0 || tinggiSisiTegak <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal, tinggi limas, dan tinggi sisi tegak harus lebih besar dari 0");
            } else if (tinggiSisiTegak < tinggiMinimal) {
                throw new IllegalArgumentException("Tinggi sisi tegak terlalu pendek (harus >= " + String.format("%.2f", tinggiMinimal) + ")");
            }
            super.hitungSisi();
            double luasSisiTegak = (1.0 / 2.0) * super.getSisi() * tinggiSisiTegak;
            luasPermukaan = super.hitungLuas() + (4 * (luasSisiTegak));
            return luasPermukaan;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas permukaan limas belah ketupat: " + e.getMessage());
            throw e;
        }
    }
}
