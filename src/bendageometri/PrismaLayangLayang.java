package bendageometri;

import bendageometri.LayangLayang;

public class PrismaLayangLayang extends LayangLayang {
    protected double tinggiPrismaLayangLayang;
    private double volumePrismaLayangLayang;
    private double luasPermukaanPrismaLayangLayang;

    public PrismaLayangLayang(double diagonal1, double diagonal2, double sisi1, double sisi2, double tinggiPrismaLayangLayang) {
        super(diagonal1, diagonal2, sisi1, sisi2);
        this.tinggiPrismaLayangLayang = tinggiPrismaLayangLayang;
        this.volumePrismaLayangLayang = hitungVolume();
        this.luasPermukaanPrismaLayangLayang = hitungLuasPermukaan();
    }

    // ================= VOLUME =================

    @Override
    public double hitungVolume() throws IllegalArgumentException {
        if (tinggiPrismaLayangLayang <= 0) {
            throw new IllegalArgumentException("Tinggi prisma harus lebih besar dari 0");
        }
        volumePrismaLayangLayang = super.hitungLuas() * tinggiPrismaLayangLayang;
        return volumePrismaLayangLayang;
    }

    // Overloading volume dengan parameter
    public double hitungVolume(double diagonal1, double diagonal2, double tinggi) throws IllegalArgumentException {
        if (diagonal1 <= 0 || diagonal2 <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException("Semua nilai harus lebih besar dari 0");
        }
        double luasAlas = 0.5 * diagonal1 * diagonal2;
        volumePrismaLayangLayang = luasAlas * tinggi;
        return volumePrismaLayangLayang;
    }

    public double getVolumePrismaLayangLayang() {
        return volumePrismaLayangLayang;
    }

    // ================= LUAS PERMUKAAN =================

    @Override
    public double hitungLuasPermukaan() throws IllegalArgumentException {
        if (tinggiPrismaLayangLayang <= 0 || sisi1 <= 0 || sisi2 <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi prisma harus lebih besar dari 0");
        }
        luasPermukaanPrismaLayangLayang = (2 * super.hitungLuas()) + (super.hitungKeliling() * tinggiPrismaLayangLayang);
        return luasPermukaanPrismaLayangLayang;
    }

    // Overloading luas permukaan dengan parameter
    public double hitungLuasPermukaan(double diagonal1, double diagonal2, double sisi1, double sisi2, double tinggi) throws IllegalArgumentException {
        if (diagonal1 <= 0 || diagonal2 <= 0 || sisi1 <= 0 || sisi2 <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException("Semua nilai harus lebih besar dari 0");
        }

        double luasAlas = 0.5 * diagonal1 * diagonal2;
        double keliling = 2 * (sisi1 + sisi2);
        luasPermukaanPrismaLayangLayang = (2 * luasAlas) + (keliling * tinggi);
        return luasPermukaanPrismaLayangLayang;
    }

    public double getLuasPermukaanPrismaLayangLayang() {
        return luasPermukaanPrismaLayangLayang;
    }
}
