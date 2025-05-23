package projekpbo.bangunRuang;

import projekpbo.bangunDatar.BelahKetupat;

public class PrismaBelahKetupat extends BelahKetupat {
    // Atribut khusus untuk PrismaJajarGenjang
    protected double tinggiPrisma;

    // Constructor untuk PrismaJajarGenjang
    public PrismaBelahKetupat(double diagonal1, double diagonal2, double tinggiPrisma) {
        super(diagonal1, diagonal2);
        this.tinggiPrisma= tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        return hitungLuas() * tinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        return (2 * hitungLuas()) + (super.hitungKeliling() * tinggiPrisma);
    }
}
