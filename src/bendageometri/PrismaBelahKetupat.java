package bendageometri;

import bendageometri.BelahKetupat;

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
    
    // overloaded constructor
    public PrismaBelahKetupat(int diagonal1, int diagonal2, int tinggiPrisma) {
        super(diagonal1, diagonal2);
        this.tinggiPrisma= tinggiPrisma;
    }

    @Override
    public double hitungVolume()  throws IllegalArgumentException {
        try {
            if (diagonal1 <= 0 || diagonal2 <= 0 || tinggiPrisma <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal dan tinggi harus lebih besar dari 0");
            }
            volume = super.hitungLuas() * tinggiPrisma;
            return volume;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung volume prisma belah ketupat: " + e.getMessage());
            throw e;
        }
    }
    
    // overloaded method
    public double hitungVolume(double diagonal1, double diagonal2, double tinggiPrisma)  throws IllegalArgumentException {
        try {
            if (diagonal1 <= 0 || diagonal2 <= 0 || tinggiPrisma <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal dan tinggi harus lebih besar dari 0");
            }
            volume = super.hitungLuas() * tinggiPrisma;
            return volume;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung volume prisma belah ketupat: " + e.getMessage());
            throw e;
        }
    }

    @Override
    public double hitungLuasPermukaan() throws IllegalArgumentException {
        try {
            if (diagonal1 <= 0 || diagonal2 <= 0 || tinggiPrisma <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal dan tinggi harus lebih besar dari 0");
            }
            luasPermukaan = (2 * super.hitungLuas()) + (super.hitungKeliling() * tinggiPrisma);
            return luasPermukaan;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas permukaan prisma belah ketupat: " + e.getMessage());
            throw e;
        }
    }
    
    // overloaded
    public double hitungLuasPermukaan(double diagonal1, double diagonal2, double tinggiPrisma) throws IllegalArgumentException {
        try {
            if (diagonal1 <= 0 || diagonal2 <= 0 || tinggiPrisma <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal dan tinggi harus lebih besar dari 0");
            }
            luasPermukaan = (2 * super.hitungLuas()) + (super.hitungKeliling() * tinggiPrisma);
            return luasPermukaan;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas permukaan prisma belah ketupat: " + e.getMessage());
            throw e;
        }
    }
}
