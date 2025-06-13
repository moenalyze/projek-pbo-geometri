package bendageometri;


public class JuringBola extends Bola {
  // Atribut khusus untuk JuringBola
  private double tinggi;
  private double volumeJuringBola;
  private double luasPermukaanJuringBola;

  // Constructor untuk JuringBola
  public JuringBola(double jariJari, double tinggi) {
    super(jariJari);
    this.tinggi = tinggi;
  }
  
  public JuringBola(int jariJari, int tinggi) {
    super(jariJari);
    this.tinggi = tinggi;
  }

  // Override + try-catch untuk volume
  @Override
  public double hitungVolume() {
    try {
      if (tinggi < 0 || tinggi > jariJari * 2) {
        throw new IllegalArgumentException("Tinggi tidak valid. Harus positif dan maksimal 2x jari-jari.");
      }
      volumeJuringBola = (2.0 / 3.0) * super.pi * Math.pow(jariJari, 2) * tinggi;
    } catch (IllegalArgumentException e) {
      System.out.println("Error menghitung volume Juring Bola: " + e.getMessage());
      volumeJuringBola = 0;
    }
    return volumeJuringBola;
  }

  // Overloading hitungVolume
  public double hitungVolume(double jariJariBaru, double tinggiBaru) {
    try {
      if (tinggiBaru < 0 || tinggiBaru > jariJariBaru * 2) {
        throw new IllegalArgumentException("Tinggi tidak valid. Harus positif dan maksimal 2x jari-jari.");
      }
      return (2.0 / 3.0) * super.pi * Math.pow(jariJariBaru, 2) * tinggiBaru;
    } catch (IllegalArgumentException e) {
      System.out.println("Error hitungVolume overload: " + e.getMessage());
      return 0;
    }
  }

  // Override + try-catch untuk luas permukaan
  @Override
  public double hitungLuasPermukaan() {
    try {
      if (tinggi < 0 || tinggi > jariJari * 2) {
        throw new IllegalArgumentException("Tinggi tidak valid. Harus positif dan maksimal 2x jari-jari.");
      }
      luasPermukaanJuringBola = 2 * super.pi * jariJari * tinggi;
    } catch (IllegalArgumentException e) {
      System.out.println("Error menghitung luas permukaan Juring Bola: " + e.getMessage());
      luasPermukaanJuringBola = 0;
    }
    return luasPermukaanJuringBola;
  }

  // Overloading hitungLuasPermukaan
  public double hitungLuasPermukaan(double jariJariBaru, double tinggiBaru) {
    try {
      if (tinggiBaru < 0 || tinggiBaru > jariJariBaru * 2) {
        throw new IllegalArgumentException("Tinggi tidak valid. Harus positif dan maksimal 2x jari-jari.");
      }
      return 2 * super.pi * jariJariBaru * tinggiBaru;
    } catch (IllegalArgumentException e) {
      System.out.println("Error hitungLuasPermukaan overload: " + e.getMessage());
      return 0;
    }
  }

  // Getter
  public double getVolumeJuringBola() {
    return volumeJuringBola;
  }

  public double getLuasPermukaanJuringBola() {
    return luasPermukaanJuringBola;
  }
  
}