package bendageometri;

import bendageometri.PersegiPanjang;

public class LimasPersegiPanjang extends PersegiPanjang {

    private double volumeLimasPersegiPanjang;
    protected double tinggiLimasPersegiPanjang;
    private double luasPermukaanPrismaPersegiPanjang;

    public LimasPersegiPanjang(double panjang, double lebar, double tinggiLimasPersegiPanjang) {
        super(panjang, lebar);
        this.tinggiLimasPersegiPanjang = tinggiLimasPersegiPanjang;
    }

    public double hitungVolume() throws IllegalArgumentException {
        try {
            if (tinggiLimasPersegiPanjang <= 0) {
                throw new IllegalArgumentException("Tinggi limas persegi panjang harus lebih besar dari 0");
            }
            volumeLimasPersegiPanjang = 1.0 / 3.0 * (super.hitungLuas() * tinggiLimasPersegiPanjang);
            return volumeLimasPersegiPanjang;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung volume: " + e.getMessage());
            throw e;
        }
    }

    // Overloading
    public double hitungVolume(int tinggiLimasPersegiPanjang) throws IllegalArgumentException {
        try {
            if (tinggiLimasPersegiPanjang <= 0) {
                throw new IllegalArgumentException("Tinggi limas persegi panjang harus lebih besar dari 0");
            }
            volumeLimasPersegiPanjang = 1.0 / 3.0 * (super.hitungLuas() * tinggiLimasPersegiPanjang);
            return volumeLimasPersegiPanjang;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung volume (overloaded): " + e.getMessage());
            throw e;
        }
    }

    public double hitungLuasPermukaan() throws IllegalArgumentException {
        try {
            if (tinggiLimasPersegiPanjang <= 0) {
                throw new IllegalArgumentException("Tinggi limas persegi panjang harus lebih besar dari 0");
            }
            double tinggiSisiTegak1 = Math.sqrt(Math.pow((0.5 * lebar), 2) + Math.pow(tinggiLimasPersegiPanjang, 2));
            double tinggiSisiTegak2 = Math.sqrt(Math.pow((0.5 * panjang), 2) + Math.pow(tinggiLimasPersegiPanjang, 2));
            double luasSisiTegak1 = 0.5 * panjang * tinggiSisiTegak1;
            double luasSisiTegak2 = 0.5 * lebar * tinggiSisiTegak2;

            luasPermukaanPrismaPersegiPanjang = super.hitungLuas() + (2 * (luasSisiTegak1 + luasSisiTegak2));
            return luasPermukaanPrismaPersegiPanjang;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas permukaan: " + e.getMessage());
            throw e;
        }
    }

    public double hitungLuasPermukaan(int tinggiLimasPersegiPanjang) throws IllegalArgumentException {
        try {
            if (tinggiLimasPersegiPanjang <= 0) {
                throw new IllegalArgumentException("Tinggi limas persegi panjang harus lebih besar dari 0");
            }
            double tinggiSisiTegak1 = Math.sqrt(Math.pow((0.5 * lebar), 2) + Math.pow(tinggiLimasPersegiPanjang, 2));
            double tinggiSisiTegak2 = Math.sqrt(Math.pow((0.5 * panjang), 2) + Math.pow(tinggiLimasPersegiPanjang, 2));
            double luasSisiTegak1 = 0.5 * panjang * tinggiSisiTegak1;
            double luasSisiTegak2 = 0.5 * lebar * tinggiSisiTegak2;

            luasPermukaanPrismaPersegiPanjang = super.hitungLuas() + (2 * (luasSisiTegak1 + luasSisiTegak2));
            return luasPermukaanPrismaPersegiPanjang;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas permukaan (overloaded): " + e.getMessage());
            throw e;
        }
    }

    // Overloaded method menggunakan sudut (dalam derajat)
    public double hitungLuasPermukaan(double sudutDerajat) throws IllegalArgumentException {
        try {
            if (sudutDerajat <= 0 || sudutDerajat >= 90) {
                throw new IllegalArgumentException("Sudut harus antara 0 dan 90 derajat");
            }

            double sudutRad = Math.toRadians(sudutDerajat);

            double tinggiSisiTegak1 = 0.5 * lebar * Math.tan(sudutRad);
            double tinggiSisiTegak2 = 0.5 * panjang * Math.tan(sudutRad);
            double luasSisiTegak1 = 0.5 * panjang * tinggiSisiTegak1;
            double luasSisiTegak2 = 0.5 * lebar * tinggiSisiTegak2;

            luasPermukaanPrismaPersegiPanjang = super.hitungLuas() + 2 * (luasSisiTegak1 + luasSisiTegak2);
            return luasPermukaanPrismaPersegiPanjang;

        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas permukaan berdasarkan sudut: " + e.getMessage());
            throw e;
        }
    }

}
