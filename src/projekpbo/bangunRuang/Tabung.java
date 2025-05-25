package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Lingkaran;

public class Tabung extends Lingkaran {
  // Atribut khusus untuk Silinder
  protected double tinggiSilinder;
  private double volumeSilinder;
  private double luasPermukaanSilinder;

  // Constructor untuk Silinder
  public Tabung(double jariJari, double tinggiSilinder) {
    super(jariJari);
    this.tinggiSilinder = tinggiSilinder;
    volumeSilinder = super.hitungVolume();
    luasPermukaanSilinder = super.hitungLuasPermukaan();
  }

  // Implementasi metode hitungVolume() untuk Silinder
  @Override
  public double hitungVolume() {
    // Volume Silinder = luas Lingkaran * tinggi Silinder
    volumeSilinder = hitungLuas() * tinggiSilinder;
    return volumeSilinder;
  }

  // Implementasi metode hitungLuasPermukaan() untuk Silinder
  @Override
  public double hitungLuasPermukaan() {
    // Luas Permukaan Silinder = 2 * luas Lingkaran + keliling Lingkaran * tinggi
    // Silinder
    luasPermukaanSilinder = 2 * super.hitungLuas() + super.hitungKeliling() * tinggiSilinder;
    return luasPermukaanSilinder;
  }
}
