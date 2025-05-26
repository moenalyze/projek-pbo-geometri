package projekpbo.turunanBola;

import projekpbo.bangunRuang.Bola;
import projekpbo.bangunDatar.Lingkaran;

public class CincinBola extends Bola {
  // Atribut khusus untuk Juring
  // private double jariJariMinor; // dari Lingkaran Jarijari Dalam
  private double jariJariMajor; // jarak jari jari luat dan jari jari dalam
  private double volumeCincinBola;
  private double luasPermukaanCincinBola;

  // Constructor untuk Juring
  public CincinBola(double jariJari, double jariJariMajor) {
    super(jariJari);
    this.jariJariMajor = jariJariMajor;
    volumeCincinBola = hitungVolume();
    luasPermukaanCincinBola = hitungLuasPermukaan();
  }

  @Override
  public double hitungVolume() {
    
    volumeCincinBola = 2 * Math.pow(super.pi, 2) * jariJariMajor * Math.pow(jariJari, 2);
    return volumeCincinBola;
  }

  public double getVolumeCincinBola() {
    return volumeCincinBola;
  }

  @Override
  public double hitungLuasPermukaan() {
    luasPermukaanCincinBola = 4 * Math.pow(super.pi, 2) * jariJariMajor * jariJari;
    return luasPermukaanCincinBola;
  }

  public double getLuasPermukaanCincinBola() {
    return luasPermukaanCincinBola;
  }

}