package bendageometri;

import bendageometri.Lingkaran;

public class Bola extends Lingkaran {
  // Atribut khusus untuk Bola
  private double volumeBola;
  private double luasPermukaanBola;

  // Constructor untuk Bola
  public Bola(double jariJari) {
    super(jariJari);
//    volumeBola = super.hitungVolume();
//    luasPermukaanBola = super.hitungLuasPermukaan();
  }
  
  public Bola(int jariJari) {
    super(jariJari);
//    volumeBola = super.hitungVolume();
//    luasPermukaanBola = super.hitungLuasPermukaan();
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
  
  // Overload hitungVolume dengan parameter jari-jari
public double hitungVolume(double jariJari) {
    try {
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus lebih dari 0.");
        }
        volumeBola = (4.0 / 3.0) * super.pi * Math.pow(jariJari, 3);
        return volumeBola;
    } catch (IllegalArgumentException e) {
        System.err.println("Error menghitung volume bola: " + e.getMessage());
        return 0;
    }
}

// Overload hitungLuasPermukaan dengan parameter jari-jari
public double hitungLuasPermukaan(double jariJari) {
    try {
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus lebih dari 0.");
        }
        luasPermukaanBola = 4 * super.pi * Math.pow(jariJari, 2);
        return luasPermukaanBola;
    } catch (IllegalArgumentException e) {
        System.err.println("Error menghitung luas permukaan bola: " + e.getMessage());
        return 0;
    }
}

}
