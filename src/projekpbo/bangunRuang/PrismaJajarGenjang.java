package projekpbo.bangunRuang;

import projekpbo.bangunDatar.JajarGenjang;

public class PrismaJajarGenjang extends JajarGenjang {
  // Atribut khusus untuk PrismaJajarGenjang
  protected double tinggiPrismaJajarGenjang;
  private double volumePrismaJajarGenjang;
  private double luasPermukaanPrismaJajarGenjang;

  // Constructor untuk PrismaJajarGenjang
  public PrismaJajarGenjang(double alas, double tinggi, double sudutlancip, double tinggiPrismaJajarGenjang) {
    super(alas, tinggi, sudutlancip);
    this.tinggiPrismaJajarGenjang = tinggiPrismaJajarGenjang;
    volumePrismaJajarGenjang = super.hitungVolume();
    luasPermukaanPrismaJajarGenjang = super.hitungLuasPermukaan();
  }
  
  // Constructor untuk PrismaJajarGenjang
  public PrismaJajarGenjang(int alas, int tinggi, int sudutlancip, int tinggiPrismaJajarGenjang) {
    super(alas, tinggi, sudutlancip);
    this.tinggiPrismaJajarGenjang = tinggiPrismaJajarGenjang;
    volumePrismaJajarGenjang = super.hitungVolume();
    luasPermukaanPrismaJajarGenjang = super.hitungLuasPermukaan();
  }

  // Implementasi metode hitungVolume() untuk PrismaJajarGenjang
  @Override
  public double hitungVolume() {
    // Volume PrismaJajarGenjang = luas Jajar Genjang * tinggi PrismaJajarGenjang
    volumePrismaJajarGenjang = super.getLuasJajarGenjang() * tinggiPrismaJajarGenjang;
    return volumePrismaJajarGenjang;
  }
  
  // Implementasi metode hitungLuasPermukaan() untuk Prisma Jajar Genjang
    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan Prisma Jajar Genjang = (2 * luas alas) + (kelilingjajargenjang * tinggi)
        luasPermukaanPrismaJajarGenjang = (2 * super.getLuasJajarGenjang()) + (super.getKelilingJajarGenjang() * tinggiPrismaJajarGenjang);
        return luasPermukaanPrismaJajarGenjang;
    }
}
