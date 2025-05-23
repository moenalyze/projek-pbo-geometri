package projekpbo.bangunRuang;

import projekpbo.bangunDatar.PersegiPanjang;

public class PrismaPersegiPanjang extends PersegiPanjang {
  // Atribut khusus untuk Balok
  private double tinggiBalok;

  // Constructor untuk Balok
  public PrismaPersegiPanjang(double panjang, double lebar, double tinggiBalok) {
    super(panjang, lebar);
    this.tinggiBalok = tinggiBalok;
  }

  // Implementasi metode hitungVolume() untuk Balok
  @Override
  public double hitungVolume() {
    // Volume Balok = luas Persegi Panjang * tinggi Balok
    return super.hitungLuas() * tinggiBalok;
  }

  
  // Implementasi metode untuk menghitung luas permukaan Balok
    public double hitungLuasPermukaan() {
      // Luas Permukaan Balok = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi))
      return 2 * ((panjang * lebar) + (panjang * tinggiBalok) + (lebar * tinggiBalok));
    }

}
