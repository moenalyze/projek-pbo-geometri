package bendageometri;

import bendageometri.Trapesium;

public class PrismaTrapesium extends Trapesium {
  // Atribut khusus untuk PrismaTrapesium
  protected double tinggiPrismaTrapesium;
  private double volumePrismaTrapesium;
  private double luasPermukaanPrismaTrapesium;

  // Constructor untuk PrismaTrapesium
  public PrismaTrapesium(double sisiSejajar1, double sisiSejajar2, double tinggi, double tinggiPrismaTrapesium) {
    super(sisiSejajar1, sisiSejajar2, tinggi);
    this.tinggiPrismaTrapesium = tinggiPrismaTrapesium;
  }

  public PrismaTrapesium(int sisiSejajar1, int sisiSejajar2, int tinggi, int tinggiPrismaTrapesium) {
    super(sisiSejajar1, sisiSejajar2, tinggi);
    this.tinggiPrismaTrapesium = tinggiPrismaTrapesium;
  }

  // Implementasi metode hitungVolume() untuk PrismaTrapesium
  @Override
  public double hitungVolume() {
    // Volume PrismaTrapesium = luas Trapesium * tinggi PrismaTrapesium
    volumePrismaTrapesium = super.hitungLuas() * tinggiPrismaTrapesium;
    return volumePrismaTrapesium;
  }

  // Overload hitungVolume dengan sisiSejajar1, sisiSejajar2, tinggi dan tinggi prisma
  public double hitungVolume(double sisiSejajar1, double sisiSejajar2, double tinggi, double tinggiPrismaTrapesium) {
    try{
      if (sisiSejajar1 <= 0 || sisiSejajar2 <= 0 || tinggi <= 0 || tinggiPrismaTrapesium <= 0) {
        throw new IllegalArgumentException("Semua nilai harus lebih dari 0.");
      }
      // Volume PrismaTrapesium = luas Trapesium * tinggi PrismaTrapesium
      double luasAlas = 0.5 * (sisiSejajar1 + sisiSejajar2) * tinggi;
      return luasAlas * tinggiPrismaTrapesium;
    }catch (IllegalArgumentException e) {
          System.err.println("Error hitungVolume(sisiSejajar1, sisiSejajar2, tinggi, tinggiPrisma): " + e.getMessage());
          throw new IllegalArgumentException("Semua nilai harus lebih dari 0.");
    }
  }
  
  // Implementasi metode super.Permukaan() untuk Prisma Trapesium
    @Override
  public double hitungLuasPermukaan() {
    // Luas Permukaan Prisma Trapesium = (2 * luas alas) + (keliling trapesium * tinggi prisma)
    luasPermukaanPrismaTrapesium = (2 * super.hitungLuas()) + (super.hitungKeliling() * tinggiPrismaTrapesium);
    return luasPermukaanPrismaTrapesium;
  }

  public double hitungLuasPermukaan(double sisiSejajar1, double sisiSejajar2, double tinggi, double tinggiPrismaTrapesium) {
    try{
      if (sisiSejajar1 <= 0 || sisiSejajar2 <= 0 || tinggi <= 0 || tinggiPrismaTrapesium <= 0) {
        throw new IllegalArgumentException("Semua nilai harus lebih dari 0.");
      }
      // Luas Permukaan Prisma Trapesium = (2 * luas alas) + (keliling trapesium * tinggi prisma)
      double luasAlas = 0.5 * (sisiSejajar1 + sisiSejajar2) * tinggi;
      double selisihSisiSejajar = Math.abs(sisiSejajar1 - sisiSejajar2) / 2;
      double sisiMiring = Math.sqrt(Math.pow(selisihSisiSejajar, 2) + Math.pow(tinggi, 2));
      double keliling = (sisiSejajar1 + sisiSejajar2) + (2 * sisiMiring);
      return (2 * luasAlas) + (keliling * tinggiPrismaTrapesium);
    }catch (IllegalArgumentException e) {
          System.err.println("Error hitungLuasPermukaan(sisiSejajar1, sisiSejajar2, tinggi, tinggiPrisma): " + e.getMessage());
          throw new IllegalArgumentException("Semua nilai harus lebih dari 0.");
    }
  }
}
