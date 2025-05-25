package projekpbo.bangunRuang;

import projekpbo.bangunDatar.BelahKetupat;

public class PrismaBelahKetupat extends BelahKetupat {
    // Atribut khusus untuk PrismaJajarGenjang
    protected double tinggiPrisma;
    private double volume;
    private double luasPermukaan;

    // Constructor untuk PrismaJajarGenjang
    public PrismaBelahKetupat(double diagonal1, double diagonal2, double tinggiPrisma) {
        super(diagonal1, diagonal2);
        this.tinggiPrisma= tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        volume = hitungLuas() * tinggiPrisma;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        luasPermukaan = (2 * super.hitungLuas()) + (super.hitungKeliling() * tinggiPrisma);
        return luasPermukaan;
    }
}
