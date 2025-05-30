package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Lingkaran;

public class Bola extends Lingkaran {
  // Atribut khusus untuk Bola
  private double volumeBola;
  private double luasPermukaanBola;

  // Constructor untuk Bola
  public Bola(double jariJari) {
    super(jariJari);
    volumeBola = super.hitungVolume();
    luasPermukaanBola = super.hitungLuasPermukaan();
  }
  
  public Bola(int jariJari) {
    super(jariJari);
    volumeBola = super.hitungVolume();
    luasPermukaanBola = super.hitungLuasPermukaan();
  }
  // Implementasi metode hitungVolume() untuk Bola
  @Override
  public double hitungVolume() {
    // Volume Bola = 4/3 * Phi * r ^ 3
    volumeBola = (4.0 / 3.0) * super.pi * Math.pow(jariJari, 3); // Menggunakan jari-jari dari kelas Lingkaran
    return volumeBola;
  }
  
  // Implementasi metode hitungLuasPermukaan() untuk Bola
  @Override
  public double hitungLuasPermukaan() {
    // Luas Permukaan Bola = 4 * Phi * r^2
    luasPermukaanBola = 4 * super.pi * Math.pow(jariJari, 2);
    return luasPermukaanBola;
  }
}
