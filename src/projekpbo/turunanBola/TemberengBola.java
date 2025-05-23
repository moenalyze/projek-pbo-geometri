package projekpbo.turunanBola;

import projekpbo.bangunRuang.Bola;

public class TemberengBola extends Bola {
  // Atribut khusus untuk TemberengBola
  private double theta;
  private double luasTembereng;
  private double kelilingTembereng;

  // Constructor untuk TemberengBola
  public TemberengBola(double jariJari, double theta) {
    super(jariJari);
    this.theta = Math.toRadians(theta);
    luasTembereng = hitungLuas();
    kelilingTembereng = hitungKeliling();
  }

  // Implementasi metode hitungLuas() untuk TemberengBola
  @Override
  public double hitungLuas() {
    luasTembereng = 0.5 * jariJari * jariJari * (theta - Math.sin(theta));
    return luasTembereng;
  }

  // Getter untuk Luas TemberengBola
  public double getLuasTembereng() {
    return luasTembereng;
  }

  // Implementasi metode hitungKeliling() untuk TemberengBola
  @Override
  public double hitungKeliling() {
    double kelilingTembereng = jariJari * (theta + 2);
    return kelilingTembereng;
  }

  public double getKelilingTembereng() {
    return kelilingTembereng;
  }

}
