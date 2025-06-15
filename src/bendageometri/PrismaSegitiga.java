package bendageometri;

import bendageometri.Segitiga;

public class PrismaSegitiga extends Segitiga {
  // Atribut khusus untuk PrismaSegitiga
  protected double tinggiPrismaSegitiga;
  private double volumePrismaSegitiga;
  private double luasPermukaanPrismaSegitiga;

  // Constructor untuk PrismaSegitiga
  public PrismaSegitiga(double sisi, double tinggiPrismaSegitiga) {
    super(sisi);
    this.tinggiPrismaSegitiga = tinggiPrismaSegitiga;
  }

  public PrismaSegitiga(int sisi, int tinggiPrismaSegitiga) {
    super(sisi);
    this.tinggiPrismaSegitiga = tinggiPrismaSegitiga;
  }

  // Implementasi metode hitungVolume() untuk PrismaSegitiga
  @Override
  public double hitungVolume() {
    // Volume PrismaSegitiga = 0.5 * luas Segitiga * tinggi PrismaSegitiga
    volumePrismaSegitiga = super.hitungLuas() * tinggiPrismaSegitiga;
    return volumePrismaSegitiga;
  }
  
  // Overload hitungVolume dengan sisi dan tinggi prisma
  public double hitungVolume(double sisi, double tinggiPrisma) {
      try {
          if (sisi <=0 || tinggiPrisma <= 0) {
              throw new IllegalArgumentException("Nilai sisi dan tinggi prisma harus lebih dari 0.");
          }
          double luasAlas = ((sisi * sisi) / 4) * Math.sqrt(3);
          return luasAlas * tinggiPrisma;
      } catch (IllegalArgumentException e) {
          System.err.println("Error hitungVolume(sisi, tinggiPrisma): " + e.getMessage());
          throw new IllegalArgumentException("Nilai sisi dan tinggi prisma harus lebih dari 0.");
      }
  }

    // Implementasi metode hitungLuasPermukaan() untuk Prisma Segitiga
    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan Prisma Segitiga = (2 * luas sisi) + (kelilingSegitiga * tinggi)
        luasPermukaanPrismaSegitiga = (2 * super.hitungLuas()) + (super.hitungKeliling()* tinggiPrismaSegitiga);
        return luasPermukaanPrismaSegitiga;
    }

    // Overload hitungLuasPermukaan dengan sisi dan tinggi prisma
    public double hitungLuasPermukaan(double sisi, double tinggiPrisma) {
        try {
            if (sisi <= 0 || tinggiPrisma <= 0) {
                throw new IllegalArgumentException("Nilai sisi dan tinggi prisma harus lebih dari 0.");
            }
            double luasAlas = ((sisi * sisi) / 4) * Math.sqrt(3);
            double keliling = 3 * sisi;
            return (2 * luasAlas) + (keliling * tinggiPrisma);
        } catch (IllegalArgumentException e) {
            System.err.println("Error hitungLuasPermukaan(sisi, tinggiPrisma): " + e.getMessage());
            throw new IllegalArgumentException("Error hitungLuasPermukaan(sisi, tinggiPrisma): " + e.getMessage());
        }
    }
}

