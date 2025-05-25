package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Segitiga;

public class PrismaSegitiga extends Segitiga {
  // Atribut khusus untuk PrismaSegitiga
  protected double tinggiPrismaSegitiga;
  private double volumePrismaSegitiga;
  private double luasPermukaanPrismaSegitiga;

  // Constructor untuk PrismaSegitiga
  public PrismaSegitiga(double alas, double tinggi, double tinggiPrismaSegitiga) {
    super(alas, tinggi);
    this.tinggiPrismaSegitiga = tinggiPrismaSegitiga;
  }

  // Implementasi metode hitungVolume() untuk PrismaSegitiga
  @Override
  public double hitungVolume() {
    // Volume PrismaSegitiga = 0.5 * luas Segitiga * tinggi PrismaSegitiga
    volumePrismaSegitiga = hitungLuas() * tinggiPrismaSegitiga;
    return volumePrismaSegitiga;
  }
  
  // Implementasi metode hitungLuasPermukaan() untuk Prisma Segitiga
    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan Prisma Segitiga = (2 * luas alas) + (kelilingSegitiga * tinggi)
        luasPermukaanPrismaSegitiga = (2 * hitungLuas()) + (hitungKeliling()* tinggiPrismaSegitiga);
        return luasPermukaanPrismaSegitiga;
    }
}

