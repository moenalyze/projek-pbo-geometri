package bendageometri;

public class LimasTrapesium extends Trapesium {
    private double tinggiLimas;
    private double tinggiSisiTegak1;
    private double tinggiSisiTegak2;
    private double volumeLimas, luasPermukaanLimas;

    public LimasTrapesium(double s1, double s2, double t, 
                          double tinggiLimas, 
                          double tSisiTegak1, double tSisiTegak2) {
        super(s1, s2, t);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegak1 = tSisiTegak1;
        this.tinggiSisiTegak2 = tSisiTegak2;
    }

    // === Volume ===
    public double hitungVolume() {
        try {
            double luasAlas = hitungLuas();
            if (luasAlas <= 0 || tinggiLimas <= 0)
                throw new IllegalArgumentException("Luas alas dan tinggi limas harus > 0");
            volumeLimas = (1.0 / 3.0) * luasAlas * tinggiLimas;
        } catch (Exception e) {
            System.out.println("Error hitung volume: " + e.getMessage());
            volumeLimas = 0;
        }
        return volumeLimas;
    }

    // Overload dengan parameter
    public double hitungVolume(double luasAlas, double tinggiLimas) {
        try {
            if (luasAlas <= 0 || tinggiLimas <= 0)
                throw new IllegalArgumentException("Input tidak valid");
            return (1.0 / 3.0) * luasAlas * tinggiLimas;
        } catch (Exception e) {
            System.out.println("Error hitungVolume overload: " + e.getMessage());
            return 0;
        }
    }

    public double getVolume() { return volumeLimas; }

    // === Luas Permukaan ===
    public double hitungLuasPermukaan() {
        try {
            double luasAlas = hitungLuas();
            double s1 = super.sisiSejajar1, s2 = super.sisiSejajar2, sm = super.sisiMiring;
            if (luasAlas <= 0 || s1 <= 0 || s2 <= 0 || sm <= 0
                || tinggiSisiTegak1 <= 0 || tinggiSisiTegak2 <= 0)
                throw new IllegalArgumentException("Semua parameter harus > 0");

            double luas1 = 0.5 * s1 * tinggiSisiTegak1;
            double luas2 = 0.5 * s2 * tinggiSisiTegak2;
            double luasSamping = 0.5 * sm * tinggiSisiTegak2;

            luasPermukaanLimas = luasAlas + luas1 + luas2 + 2 * luasSamping;

        } catch (Exception e) {
            System.out.println("Error hitung luas permukaan: " + e.getMessage());
            luasPermukaanLimas = 0;
        }
        return luasPermukaanLimas;
    }

    // Overload parametris
    public double hitungLuasPermukaan(double luasAlas,
                                      double s1, double t1,
                                      double s2, double t2,
                                      double sm, double ts) {
        try {
            if (luasAlas <= 0 || s1 <= 0 || t1 <= 0 ||
                s2 <= 0 || t2 <= 0 || sm <= 0 || ts <= 0)
                throw new IllegalArgumentException("Input overload tidak valid");

            double l1 = 0.5 * s1 * t1;
            double l2 = 0.5 * s2 * t2;
            double lSamping = 0.5 * sm * ts;
            return luasAlas + l1 + l2 + 2 * lSamping;

        } catch (Exception e) {
            System.out.println("Error hitungLuasPermukaan overload: " + e.getMessage());
            return 0;
        }
    }

    public double getLuasPermukaan() { return luasPermukaanLimas; }
}
