package bendageometri;

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
  }
  
  public CincinBola(int jariJari, int jariJariMajor) {
    super(jariJari);
    this.jariJariMajor = jariJariMajor;
  }

  // Override hitungVolume dengan try-catch
  @Override
  public double hitungVolume() {
    try {
      if (jariJari <= 0 || jariJariMajor <= 0) {
        throw new IllegalArgumentException("Jari-jari tidak boleh nol atau negatif.");
      }
      volumeCincinBola = 2 * Math.pow(super.pi, 2) * jariJariMajor * Math.pow(jariJari, 2);
    } catch (IllegalArgumentException e) {
      System.out.println("Error menghitung volume Cincin Bola: " + e.getMessage());
      volumeCincinBola = 0;
    }
    return volumeCincinBola;
  }

  // Overloading hitungVolume
  public double hitungVolume(double jariJariBaru, double jariJariMajorBaru) {
    try {
      if (jariJariBaru <= 0 || jariJariMajorBaru <= 0) {
        throw new IllegalArgumentException("Jari-jari tidak valid (<= 0).");
      }
      return 2 * Math.pow(super.pi, 2) * jariJariMajorBaru * Math.pow(jariJariBaru, 2);
    } catch (IllegalArgumentException e) {
      System.out.println("Error hitungVolume overload: " + e.getMessage());
      return 0;
    }
  }

  // Override hitungLuasPermukaan dengan try-catch
  @Override
  public double hitungLuasPermukaan() {
    try {
      if (jariJari <= 0 || jariJariMajor <= 0) {
        throw new IllegalArgumentException("Jari-jari tidak boleh nol atau negatif.");
      }
      luasPermukaanCincinBola = 4 * Math.pow(super.pi, 2) * jariJariMajor * jariJari;
    } catch (IllegalArgumentException e) {
      System.out.println("Error menghitung luas permukaan Cincin Bola: " + e.getMessage());
      luasPermukaanCincinBola = 0;
    }
    return luasPermukaanCincinBola;
  }

  // Overloading hitungLuasPermukaan
  public double hitungLuasPermukaan(double jariJariBaru, double jariJariMajorBaru) {
    try {
      if (jariJariBaru <= 0 || jariJariMajorBaru <= 0) {
        throw new IllegalArgumentException("Jari-jari tidak valid (<= 0).");
      }
      return 4 * Math.pow(super.pi, 2) * jariJariMajorBaru * jariJariBaru;
    } catch (IllegalArgumentException e) {
      System.out.println("Error hitungLuasPermukaan overload: " + e.getMessage());
      return 0;
    }
  }

  // Getters
  public double getVolumeCincinBola() {
    return volumeCincinBola;
  }

  public double getLuasPermukaanCincinBola() {
    return luasPermukaanCincinBola;
  }

}