package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Lingkaran;

public class Kerucut extends Lingkaran {
  // Atribut khusus untuk Kerucut
  protected double tinggiKerucut;
  private double volumeKerucut;
  private double luasPermukaanKerucut;

  // Constructor untuk Kerucut
  public Kerucut(double jariJari, double tinggiKerucut) {
    super(jariJari);
    this.tinggiKerucut = tinggiKerucut;
  }
  
  // Constructor untuk Kerucut overloading
  public Kerucut(int jariJari, int tinggiKerucut) {
    super(jariJari);
    this.tinggiKerucut = tinggiKerucut;
  }

  // public Kerucut(double jariJari) {
  //   super(jariJari);
  // }

  // Implementasi metode hitungVolume() untuk Kerucut
  @Override
  public double hitungVolume() {
    // Volume Kerucut = 1/3 * luas Lingkaran * tinggi Kerucut
    volumeKerucut = (1.0 / 3.0) * super.hitungLuas() * tinggiKerucut;
    return volumeKerucut;
  }


  
  // Implementasi metode hitungLuasPermukaan() untuk Kerucut
  @Override
  public double hitungLuasPermukaan() {
    // Luas Permukaan Kerucut = luas alas + luas selimut
    luasPermukaanKerucut =  super.hitungLuas() + (super.pi * jariJari * Math.sqrt(Math.pow(tinggiKerucut, 2) + Math.pow(jariJari, 2)));
    return luasPermukaanKerucut;
  }
  
  public double getLuasPermukaanKerucut(){
    return luasPermukaanKerucut;
  }

}
