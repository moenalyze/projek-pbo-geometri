package projekpbo.bangunRuang;

import projekpbo.bangunDatar.LayangLayang;

public class PrismaLayangLayang extends LayangLayang {
  // Atribut khusus untuk PrismaJajarGenjang
  public double tinggiPrismaLayangLayang;
  public double volumePrismaLayangLayang;
  public double luasPermukaanPrismaLayangLayang;

  // Constructor untuk PrismaJajarGenjang
  public PrismaLayangLayang(double diagonal1, double diagonal2, double sisi1, double sisi2, double tinggiPrismaLayangLayang) {
    super(diagonal1, diagonal2, sisi1, sisi2);
    this.tinggiPrismaLayangLayang = tinggiPrismaLayangLayang;
    volumePrismaLayangLayang = hitungVolume();
    luasPermukaanPrismaLayangLayang = hitungLuasPermukaan();
  }

  // Implementasi metode hitungVolume() untuk PrismaJajarGenjang
  @Override
  public double hitungVolume() {
    // Volume PrismaJajarGenjang = luas Jajar Genjang * tinggi PrismaJajarGenjang
    volumePrismaLayangLayang = hitungLuas() * tinggiPrismaLayangLayang;
    return volumePrismaLayangLayang;
  }

  // Getter untuk Volume PrismaJajarGenjang
  public double getVolumePrismaJajarGenjang() {
    return volumePrismaLayangLayang;
  }
  
  // Implementasi metode hitungLuasPermukaan() untuk Prisma Jajar Genjang
    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan Prisma Jajar Genjang = (2 * luas alas) + (kelilingjajargenjang * tinggi)
        luasPermukaanPrismaLayangLayang = (2 * hitungLuas()) + (hitungKeliling() * tinggiPrismaLayangLayang);
        return luasPermukaanPrismaLayangLayang;
    }
    
    public double getLuasPermukaanPrismaLayangLayang(){ 
        return luasPermukaanPrismaLayangLayang;
    }
}
