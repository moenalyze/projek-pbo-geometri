package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Lingkaran;

public class Kerucut extends Lingkaran {
  // Atribut khusus untuk Kerucut
  private double tinggiKerucut;

  // Constructor untuk Kerucut
  public Kerucut(double jariJari, double tinggiKerucut) {
    super(jariJari);
    this.tinggiKerucut = tinggiKerucut;
  }
  
  public Kerucut(double jariJari) {
    super(jariJari);
  }

  // Implementasi metode hitungVolume() untuk Kerucut
  @Override
  public double hitungVolume() {
    // Volume Kerucut = 1/3 * luas Lingkaran * tinggi Kerucut
    return (1.0 / 3.0) * super.hitungLuas() * tinggiKerucut;
  }

  
  // Implementasi metode hitungLuasPermukaan() untuk Kerucut
  @Override
  public double hitungLuasPermukaan() {
    // Luas Permukaan Kerucut = luas alas + luas selimut
    return super.hitungLuas() + (super.pi * jariJari * Math.sqrt(Math.pow(tinggiKerucut, 2) + Math.pow(jariJari, 2)));
  }
  

}
