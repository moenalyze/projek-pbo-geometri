package bendageometri;

import bendageometri.Lingkaran;

public class Tabung extends Lingkaran {
  // Atribut khusus untuk Silinder
  protected double tinggiSilinder;
  private double volumeSilinder;
  private double luasPermukaanSilinder;

  // Constructor untuk Silinder
  public Tabung(double jariJari, double tinggiSilinder) {
    super(jariJari);
    this.tinggiSilinder = tinggiSilinder;
//    volumeSilinder = super.hitungVolume();
//    luasPermukaanSilinder = super.hitungLuasPermukaan();
  }
  
  public Tabung(int jariJari, int tinggiSilinder) {
    super(jariJari);
    this.tinggiSilinder = tinggiSilinder;
//    volumeSilinder = super.hitungVolume();
//    luasPermukaanSilinder = super.hitungLuasPermukaan();
  }

  // Implementasi metode hitungVolume() untuk Silinder
   @Override
  public double hitungVolume() {
    try {
      if (jariJari <= 0 || tinggiSilinder <= 0) {
        throw new IllegalArgumentException("Jari-jari dan tinggi harus lebih dari 0");
      }
      volumeSilinder = hitungLuas() * tinggiSilinder;
      return volumeSilinder;
    } catch (IllegalArgumentException e) {
      System.err.println("Error saat menghitung volume tabung: " + e.getMessage());
      throw e;
    }
  }
  
   // Overloaded: Hitung volume dengan diameter dan tinggi
  public double hitungVolume(double diameter, double tinggi) {
    try {
      if (diameter <= 0 || tinggi <= 0) {
        throw new IllegalArgumentException("Diameter dan tinggi harus lebih dari 0");
      }
      double r = diameter / 2;
      return Math.PI * r * r * tinggi;
    } catch (IllegalArgumentException e) {
      System.err.println("Error saat menghitung volume tabung (overloaded): " + e.getMessage());
      throw e;
    }
  }
  
  // Override: Menghitung luas permukaan silinder
  @Override
  public double hitungLuasPermukaan() {
    try {
      if (jariJari <= 0 || tinggiSilinder <= 0) {
        throw new IllegalArgumentException("Jari-jari dan tinggi harus lebih dari 0");
      }
      luasPermukaanSilinder = 2 * super.hitungLuas() + super.hitungKeliling() * tinggiSilinder;
      return luasPermukaanSilinder;
    } catch (IllegalArgumentException e) {
      System.err.println("Error saat menghitung luas permukaan tabung: " + e.getMessage());
      throw e;
    }
  }
  
   // Overloaded: Hitung luas permukaan dengan diameter dan tinggi
  public double hitungLuasPermukaan(double diameter, double tinggi) {
    try {
      if (diameter <= 0 || tinggi <= 0) {
        throw new IllegalArgumentException("Diameter dan tinggi harus lebih dari 0");
      }
      double r = diameter / 2;
      return 2 * Math.PI * r * (r + tinggi);
    } catch (IllegalArgumentException e) {
      System.err.println("Error saat menghitung luas permukaan tabung (overloaded): " + e.getMessage());
      throw e;
    }
  }
}
