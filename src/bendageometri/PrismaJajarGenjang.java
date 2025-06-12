package bendageometri;

import bendageometri.JajarGenjang;

public class PrismaJajarGenjang extends JajarGenjang {
  // Atribut khusus untuk PrismaJajarGenjang
  protected double tinggiPrismaJajarGenjang;
  private double volumePrismaJajarGenjang;
  private double luasPermukaanPrismaJajarGenjang;

  // Constructor untuk PrismaJajarGenjang
  public PrismaJajarGenjang(double alas, double tinggi, double sudutlancip, double tinggiPrismaJajarGenjang) {
    super(alas, tinggi, sudutlancip);
    this.tinggiPrismaJajarGenjang = tinggiPrismaJajarGenjang;
//    volumePrismaJajarGenjang = super.hitungVolume();
//    luasPermukaanPrismaJajarGenjang = super.hitungLuasPermukaan();
  }
  
  // Constructor untuk PrismaJajarGenjang
  public PrismaJajarGenjang(int alas, int tinggi, int sudutlancip, int tinggiPrismaJajarGenjang) {
    super(alas, tinggi, sudutlancip);
    this.tinggiPrismaJajarGenjang = tinggiPrismaJajarGenjang;
//    volumePrismaJajarGenjang = super.hitungVolume();
//    luasPermukaanPrismaJajarGenjang = super.hitungLuasPermukaan();
  }
  
  public PrismaJajarGenjang(double alas, double tinggiAlas, double tinggiPrisma) {
    super(alas, tinggiAlas);
    this.tinggiPrismaJajarGenjang = tinggiPrismaJajarGenjang;
//    volumePrismaJajarGenjang = super.hitungVolume();
//    luasPermukaanPrismaJajarGenjang = super.hitungLuasPermukaan();
  }

  // Implementasi metode hitungVolume() untuk PrismaJajarGenjang
  @Override
  public double hitungVolume() {
    // Volume PrismaJajarGenjang = luas Jajar Genjang * tinggi PrismaJajarGenjang
    volumePrismaJajarGenjang = super.hitungLuas() * tinggiPrismaJajarGenjang;
    return volumePrismaJajarGenjang;
  }
  
  // Implementasi metode hitungLuasPermukaan() untuk Prisma Jajar Genjang
    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan Prisma Jajar Genjang = (2 * luas alas) + (kelilingjajargenjang * tinggi)
        luasPermukaanPrismaJajarGenjang = (2 * super.hitungLuas()) + (super.hitungKeliling() * tinggiPrismaJajarGenjang);
        return luasPermukaanPrismaJajarGenjang;
    }
    
    // Overload hitungVolume dengan alas, tinggi alas, dan tinggi prisma
    public double hitungVolume(double alas, double tinggiAlas, double tinggiPrisma) {
        try {
            if (alas <= 0 || tinggiAlas <= 0 || tinggiPrisma <= 0) {
                throw new IllegalArgumentException("Nilai alas, tinggi alas, dan tinggi prisma harus lebih dari 0.");
            }
            double luasAlas = alas * tinggiAlas;
            return luasAlas * tinggiPrisma;
        } catch (IllegalArgumentException e) {
            System.err.println("Error hitungVolume(alas, tinggiAlas, tinggiPrisma): " + e.getMessage());
            throw new IllegalArgumentException("Nilai alas, tinggi alas, dan tinggi prisma harus lebih dari 0.");
        }
    }

    // Overload hitungVolume dengan alas, sisi miring, sudut, dan tinggi prisma
    public double hitungVolume(double alas, double sisiMiring, double sudutDerajat, double tinggiPrisma) {
        try {
            if (alas <= 0 || sisiMiring <= 0 || sudutDerajat <= 0 || sudutDerajat >= 180 || tinggiPrisma <= 0) {
                throw new IllegalArgumentException("Input tidak valid. Pastikan semua nilai positif dan sudut di antara 0-180.");
            }
            double sudutRadian = Math.toRadians(sudutDerajat);
            double luasAlas = alas * sisiMiring * Math.sin(sudutRadian);
            return luasAlas * tinggiPrisma;
        } catch (IllegalArgumentException e) {
            System.err.println("Error hitungVolume(alas, sisiMiring, sudut, tinggiPrisma): " + e.getMessage());
            throw new IllegalArgumentException("Error hitungVolume(alas, sisiMiring, sudut, tinggiPrisma): " + e.getMessage());
        }
    }

    // Overload hitungLuasPermukaan dengan alas, tinggi alas, sisi miring, dan tinggi prisma
    public double hitungLuasPermukaan(double alas, double tinggiAlas, double sisiMiring, double tinggiPrisma) {
        try {
            if (alas <= 0 || tinggiAlas <= 0 || sisiMiring <= 0 || tinggiPrisma <= 0) {
                throw new IllegalArgumentException("Semua nilai harus lebih dari 0.");
            }
            double luasAlas = alas * tinggiAlas;
            double keliling = 2 * (alas + sisiMiring);
            return (2 * luasAlas) + (keliling * tinggiPrisma);
        } catch (IllegalArgumentException e) {
            System.err.println("Error hitungLuasPermukaan(alas, tinggiAlas, sisiMiring, tinggiPrisma): " + e.getMessage());
            throw new IllegalArgumentException("Error hitungLuasPermukaan(alas, tinggiAlas, sisiMiring, tinggiPrisma): " + e.getMessage());
        }
    }
}
