package bendageometri;

public class TemberengBola extends Bola {
  // Atribut khusus untuk TemberengBola
  private double tinggi;
  private double luasTemberengBola;
  private double volumeTemberengBola;

  // Constructor untuk TemberengBola
  public TemberengBola(double jariJari, double tinggi) {
    super(jariJari);
    this.tinggi = tinggi;
  }
  
  public TemberengBola(int jariJari, int tinggi) {
    super(jariJari);
    this.tinggi = tinggi;
  }

  // Override + try-catch
  @Override
  public double hitungVolume() {
    try {
      if (tinggi < 0 || tinggi > jariJari) {
        throw new IllegalArgumentException("Tinggi tidak boleh negatif atau lebih besar dari jari-jari bola.");
      }
      volumeTemberengBola = (1.0 / 3.0) * super.pi * Math.pow(tinggi, 2) * (3 * jariJari - tinggi);
    } catch (IllegalArgumentException e) {
      System.out.println("Error menghitung volume: " + e.getMessage());
      volumeTemberengBola = 0;
    }
    return volumeTemberengBola;
  }

  // Overloading hitungVolume
  public double hitungVolume(double jariJariBaru, double tinggiBaru) {
    try {
      if (tinggiBaru < 0 || tinggiBaru > jariJariBaru) {
        throw new IllegalArgumentException("Tinggi tidak valid.");
      }
      return (1.0 / 3.0) * super.pi * Math.pow(tinggiBaru, 2) * (3 * jariJariBaru - tinggiBaru);
    } catch (IllegalArgumentException e) {
      System.out.println("Error hitungVolume overload: " + e.getMessage());
      return 0;
    }
  }

  @Override
  public double hitungLuas() {
    try {
      if (tinggi < 0 || tinggi > jariJari) {
        throw new IllegalArgumentException("Tinggi tidak valid.");
      }
      luasTemberengBola = 2 * super.pi * jariJari * tinggi;
    } catch (IllegalArgumentException e) {
      System.out.println("Error menghitung luas: " + e.getMessage());
      luasTemberengBola = 0;
    }
    return luasTemberengBola;
  }

  // Overloading hitungLuas
  public double hitungLuas(double jariJariBaru, double tinggiBaru) {
    try {
      if (tinggiBaru < 0 || tinggiBaru > jariJariBaru) {
        throw new IllegalArgumentException("Tinggi tidak valid.");
      }
      return 2 * super.pi * jariJariBaru * tinggiBaru;
    } catch (IllegalArgumentException e) {
      System.out.println("Error hitungLuas overload: " + e.getMessage());
      return 0;
    }
  }

  // Getter
  public double getVolumeTemberengBola() {
    return volumeTemberengBola;
  }

  public double getLuasTembereng() {
    return luasTemberengBola;
  }

}
