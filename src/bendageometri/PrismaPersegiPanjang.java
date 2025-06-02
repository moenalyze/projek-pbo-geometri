package bendageometri;

import bendageometri.PersegiPanjang;

// ukuran persegi panjang diubah, input dari keyboard
public class PrismaPersegiPanjang extends PersegiPanjang {
  // Atribut khusus untuk Balok
  protected double tinggiBalok;
  private double volumeBalok;
  private double luasPermukaanBalok;
  boolean hitungUlang = true;

  // Constructor untuk Balok
  public PrismaPersegiPanjang(double panjang, double lebar, double tinggiBalok) {
    super(panjang, lebar);
    this.tinggiBalok = tinggiBalok;
//    volumeBalok = super.hitungVolume();
//    luasPermukaanBalok = hitungLuasPermukaan();
    
  }

  public void tagPersegiPanjang(){
    System.out.println("Menghitung Prisma Persegi panjang");
  }

  // Implementasi metode hitungVolume() untuk Balok
  @Override
  public double hitungVolume() throws IllegalArgumentException {
        try {
            if (tinggiBalok <= 0) {
                throw new IllegalArgumentException("Tinggi balok harus lebih besar dari 0");
            }
            // Volume Balok = luas Persegi Panjang * tinggi Balok
            if (hitungUlang) {
                volumeBalok = super.hitungLuas() * tinggiBalok; // Memanggil hitungLuas() dari PersegiPanjang
            } else {
                volumeBalok = super.luasPersegiPanjang * tinggiBalok;
            }
            return volumeBalok;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung volume: " + e.getMessage());
            throw e; // Melempar ulang exception untuk ditangani oleh pemanggil
        }
    }

    // Overloading
    public double hitungVolume(int tinggiBalok) throws IllegalArgumentException {
        try {
            if (tinggiBalok <= 0) {
                throw new IllegalArgumentException("Tinggi balok harus lebih besar dari 0");
            }
            // Volume Balok = luas Persegi Panjang * tinggi Balok
            if (hitungUlang) {
                volumeBalok = super.hitungLuas() * tinggiBalok; // Memanggil hitungLuas() dari PersegiPanjang
            } else {
                volumeBalok = super.luasPersegiPanjang * tinggiBalok;
            }
            return volumeBalok;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung volume (overloaded): " + e.getMessage());
            throw e; // Melempar ulang exception untuk ditangani oleh pemanggil
        }
    }

    // Implementasi metode untuk menghitung luas permukaan Balok
    public double hitungLuasPermukaan() throws IllegalArgumentException {
        try {
            if (tinggiBalok <= 0) {
                throw new IllegalArgumentException("Tinggi balok harus lebih besar dari 0");
            }
            // Luas Permukaan Balok = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi))
            luasPermukaanBalok = 2 * ((panjang * lebar) + (panjang * tinggiBalok) + (lebar * tinggiBalok));
            return luasPermukaanBalok;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas permukaan: " + e.getMessage());
            throw e; // Melempar ulang exception untuk ditangani oleh pemanggil
        }
    }

    // Overloading
    public double hitungLuasPermukaan(int tinggiBalok) throws IllegalArgumentException {
        try {
            if (tinggiBalok <= 0) {
                throw new IllegalArgumentException("Tinggi balok harus lebih besar dari 0");
            }
            // Luas Permukaan Balok = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi))
            luasPermukaanBalok = 2 * ((panjang * lebar) + (panjang * tinggiBalok) + (lebar * tinggiBalok));
            return luasPermukaanBalok;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas permukaan (overloaded): " + e.getMessage());
            throw e; // Melempar ulang exception untuk ditangani oleh pemanggil
        }
    }
    
}
