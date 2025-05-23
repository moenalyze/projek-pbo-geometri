package projekpbo.bangunRuang;

import projekpbo.bangunDatar.PersegiPanjang;

public class PrismaPersegiPanjang extends PersegiPanjang {
  // Atribut khusus untuk Balok
  protected double tinggiBalok;
  private double volumeBalok;
  private double luasPermukaanBalok;

  // Constructor untuk Balok
  public PrismaPersegiPanjang(double panjang, double lebar, double tinggiBalok) {
    super(panjang, lebar);
    this.tinggiBalok = tinggiBalok;
    volumeBalok = super.hitungVolume();
    luasPermukaanBalok = hitungLuasPermukaan();
  }

  // Implementasi metode hitungVolume() untuk Balok
  @Override
  public double hitungVolume() {
    // Volume Balok = luas Persegi Panjang * tinggi Balok
    volumeBalok = super.hitungLuas() * tinggiBalok;
    return volumeBalok;
  }


  
  // Implementasi metode untuk menghitung luas permukaan Balok
    public double hitungLuasPermukaan() {
        // Luas Permukaan Balok = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi))
        luasPermukaanBalok = 2 * ((panjang * lebar) + (panjang * tinggiBalok) + (lebar * tinggiBalok)); 
      return luasPermukaanBalok;
    }
    

}
