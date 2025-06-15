package bendageometri;

import bendageometri.Segitiga;


public class LimasSegitiga extends Segitiga {
    private double volumeLimasSegitiga;
    private double luasPermukaanLimasSegitiga;
//    private double getRandomDouble(5.0, 10.0);
    
    public LimasSegitiga(double sisi) {
        super(sisi);
    }

    public LimasSegitiga(int sisi) {
        super(sisi);
    }

    // Implementasi metode hitungVolume() untuk PrismaJajarGenjang
    @Override
    public double hitungVolume() {
          volumeLimasSegitiga = (super.sisi * super.sisi * super.sisi) * (Math.sqrt(2) / 12);
          return volumeLimasSegitiga;
    }
    
    // Implementasi metode hitungLuasPermukaan() untuk Prisma Jajar Genjang
    @Override
    public double hitungLuasPermukaan() {
        luasPermukaanLimasSegitiga = super.hitungLuas() * 4;
        return luasPermukaanLimasSegitiga;
    }

    // Overload hitungVolume dengan alas, tinggi alas, dan tinggi prisma
    public double hitungVolume(double sisi) {
        try {
            if (sisi <= 0) {
                throw new IllegalArgumentException("Nilai sisi harus lebih dari 0.");
            }
            return (sisi * sisi * sisi) * (Math.sqrt(2) / 12);
        } catch (IllegalArgumentException e) {
            System.err.println("Error hitungVolume(sisi): " + e.getMessage());
            throw new IllegalArgumentException("Nilai sisi harus lebih dari 0.");
        }
    }

    // Overload hitungLuasPermukaan dengan alas, tinggi alas, sisi miring, dan tinggi prisma
    public double hitungLuasPermukaan(double sisi) {
        try {
            if (sisi <= 0) {
                throw new IllegalArgumentException("Nilai sisi harus lebih dari 0.");
            }
            double luasAlas = ((sisi * sisi) / 4) * Math.sqrt(3);
            return luasAlas * 4;
        } catch (IllegalArgumentException e) {
            System.err.println("Error hitungLuasPermukaan(sisi): " + e.getMessage());
            throw new IllegalArgumentException("Error hitungLuasPermukaan(sisi): " + e.getMessage());
        }
    }
}