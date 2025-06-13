package bendageometri;

public class LimasLayangLayang extends LayangLayang {

    private double tinggiLimas;
    private double tinggiSisiTegak1;
    private double tinggiSisiTegak2;
    private double volumeLimasLayangLayang;
    private double luasPermukaanLimasLayangLayang;

    public LimasLayangLayang(double diagonal1, double diagonal2,
                             double sisi1, double sisi2,
                             double tinggiLimas,
                             double tinggiSisiTegak1, double tinggiSisiTegak2) {
        super(diagonal1, diagonal2, sisi1, sisi2);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegak1 = tinggiSisiTegak1;
        this.tinggiSisiTegak2 = tinggiSisiTegak2;
    }

    // volume override dengan try-catch
    public double hitungVolume() {
        try {
            if (hitungLuas() <= 0 || tinggiLimas <= 0) {
                throw new IllegalArgumentException("Luas alas dan tinggi limas harus > 0");
            }
            volumeLimasLayangLayang = (1.0 / 3.0) * hitungLuas() * tinggiLimas;
        } catch (Exception e) {
            System.out.println("Error menghitung volume: " + e.getMessage());
            volumeLimasLayangLayang = 0;
        }
        return volumeLimasLayangLayang;
    }

    // volume overload
    public double hitungVolume(double diagonal1, double diagonal2,
                               double sisi1, double sisi2,
                               double tinggiLimas) {
        try {
            if (diagonal1 <= 0 || diagonal2 <= 0 ||
                sisi1 <= 0 || sisi2 <= 0 ||
                tinggiLimas <= 0) {
                throw new IllegalArgumentException("Semua parameter harus > 0");
            }
            double luasAlas = 0.5 * diagonal1 * diagonal2;
            return (1.0 / 3.0) * luasAlas * tinggiLimas;
        } catch (Exception e) {
            System.out.println("Error hitungVolume overload: " + e.getMessage());
            return 0;
        }
    }

    public double getVolumeLimasLayangLayang() {
        return volumeLimasLayangLayang;
    }

    // luas permukaan override dengan try-catch
    public double hitungLuasPermukaan() {
        try {
            double sisi1 = super.sisi1;
            double sisi2 = super.sisi2;

            if (hitungLuas() <= 0 ||
                tinggiSisiTegak1 <= 0 || tinggiSisiTegak2 <= 0 ||
                sisi1 <= 0 || sisi2 <= 0) {
                throw new IllegalArgumentException("Semua parameter harus > 0");
            }

            double luasSisi1 = 0.5 * sisi1 * tinggiSisiTegak1;
            double luasSisi2 = 0.5 * sisi2 * tinggiSisiTegak2;

            luasPermukaanLimasLayangLayang = hitungLuas() + 2 * (luasSisi1 + luasSisi2);
        } catch (Exception e) {
            System.out.println("Error menghitung luas permukaan: " + e.getMessage());
            luasPermukaanLimasLayangLayang = 0;
        }
        return luasPermukaanLimasLayangLayang;
    }

    // luas permukaan overload
    public double hitungLuasPermukaan(double diagonal1, double diagonal2,
                                       double sisi1, double sisi2,
                                       double tinggiSisiTegak1, double tinggiSisiTegak2) {
        try {
            if (diagonal1 <= 0 || diagonal2 <= 0 ||
                sisi1 <= 0 || sisi2 <= 0 ||
                tinggiSisiTegak1 <= 0 || tinggiSisiTegak2 <= 0) {
                throw new IllegalArgumentException("Semua parameter harus > 0");
            }
            double luasAlas = 0.5 * diagonal1 * diagonal2;
            double luasSisi1 = 0.5 * sisi1 * tinggiSisiTegak1;
            double luasSisi2 = 0.5 * sisi2 * tinggiSisiTegak2;
            return luasAlas + 2 * (luasSisi1 + luasSisi2);
        } catch (Exception e) {
            System.out.println("Error hitungLuasPermukaan overload: " + e.getMessage());
            return 0;
        }
    }

    public double getLuasPermukaanLimasLayangLayang() {
        return luasPermukaanLimasLayangLayang;
    }
}
