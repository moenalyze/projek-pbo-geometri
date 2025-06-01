package bendageometri;

import bendageometri.Bola;

public class JuringBola extends Bola {
  // Atribut khusus untuk JuringBola
  private double theta;
  private double luasJuring;
  private double kelilingJuring;

  // Constructor untuk JuringBola
  public JuringBola(double jariJari, double theta) {
    super(jariJari);
    this.theta = theta;
    luasJuring = hitungLuas();
    kelilingJuring = hitungKeliling();
  }

  @Override
  public double hitungLuas() {
    luasJuring = 0.5 * jariJari * jariJari * Math.toRadians(theta);
    return luasJuring;
  }

  // Getter untuk Luas JuringBola
  public double getLuasJuring() {
    return luasJuring;
  }

  @Override
  public double hitungKeliling() {
    kelilingJuring = jariJari * (theta + 2);
    return kelilingJuring;
  }

  public double getKelilingJuring() {
    return kelilingJuring;
  }

}