package bendageometri;

import bendageometri.Trapesium;

public class PrismaTrapesium extends Trapesium {
  // Atribut khusus untuk PrismaTrapesium
  protected double tinggiPrismaTrapesium;
  private double volumePrismaTrapesium;
  private double luasPermukaanPrismaTrapesium;

  // Constructor untuk PrismaTrapesium
  public PrismaTrapesium(double alasAtas, double alasBawah, double tinggi, double tinggiPrismaTrapesium) {
    super(alasAtas, alasBawah, tinggi);
    this.tinggiPrismaTrapesium = tinggiPrismaTrapesium;
  }

  // Implementasi metode hitungVolume() untuk PrismaTrapesium
  @Override
  public double hitungVolume() {
    // Volume PrismaTrapesium = luas Trapesium * tinggi PrismaTrapesium
    volumePrismaTrapesium = hitungLuas() * tinggiPrismaTrapesium;
    return volumePrismaTrapesium;
  }
  
  // Implementasi metode hitungLuasPermukaan() untuk Prisma Trapesium
    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan Prisma Trapesium = (2 * luas alas) + (keliling trapesium * tinggi prisma)
        luasPermukaanPrismaTrapesium = (2 * hitungLuas()) + (hitungKeliling() * tinggiPrismaTrapesium);
        return luasPermukaanPrismaTrapesium;
    }
}
