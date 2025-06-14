package bendageometri;

public class TemberengLingkaran extends Lingkaran {
    protected double pi = 3.14;
    protected double taliBusur;
    protected double busur;
    protected double jariJari;
    protected double sudut;
    private double luasTemberengLingkaran;
    private double KelilingTemberengLingkaran;

    public TemberengLingkaran(double jariJari, double taliBusur, double sudut, double busur) {
        super(jariJari);
        this.taliBusur = taliBusur;
        this.sudut = sudut;
        this.busur = busur;
    }
    
    // Overloading Constructor
    public TemberengLingkaran(int jariJari, int taliBusur, int sudut, int busur) {
        super(jariJari);
        this.taliBusur = taliBusur;
        this.sudut = sudut;
        this.busur = busur;
    }
    
     /**
     * Menghitung luas tembereng lingkaran.
     * Tembereng adalah bagian dari juring dikurangi segitiga yang dibentuk oleh tali busur dan jari-jari.
     * 
     * Rumus:
     * - Luas Juring = (sudut / 360) * π * r^2
     * - Tinggi segitiga = √(r² - (taliBusur / 2)²)
     * - Luas Segitiga = ½ * alas (tali busur) * tinggi
     * - Luas Tembereng = Luas Juring - Luas Segitiga
     */

    // Versi default tanpa parameter, menggunakan atribut kelas
    public double hitungLuas() throws IllegalArgumentException {
        try {
            if (sudut <= 0 || sudut > 360) {
                throw new IllegalArgumentException("Sudut harus antara 0 hingga 360 derajat");
            }
            if (super.jariJari <= 0) {
                throw new IllegalArgumentException("Jari-jari harus lebih besar dari 0");
            }
            if (taliBusur <= 0 || taliBusur > 2 * super.jariJari) {
                throw new IllegalArgumentException("Tali busur tidak valid");
            }

            double luasJuring = (sudut / 360.0) * pi * super.jariJari * super.jariJari;
            double tinggiSegitiga = Math.sqrt(Math.pow(super.jariJari, 2) - Math.pow(taliBusur / 2, 2));
            double luasSegitiga = 0.5 * tinggiSegitiga * taliBusur;

            luasTemberengLingkaran = luasJuring - luasSegitiga;
            return luasTemberengLingkaran;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas tembereng lingkaran: " + e.getMessage());
            throw e;
        }
    }

    // Versi overloaded dengan parameter eksplisit
    public static double hitungLuas(double sudut, double jariJari, double taliBusur) throws IllegalArgumentException {
        try {
            // Validasi dasar
            if (sudut <= 0 || sudut > 360) {
                throw new IllegalArgumentException("Sudut harus antara 0 hingga 360 derajat");
            }
            if (jariJari <= 0) {
                throw new IllegalArgumentException("Jari-jari harus lebih besar dari 0");
            }
            if (taliBusur <= 0 || taliBusur > 2 * jariJari) {
                throw new IllegalArgumentException("Tali busur tidak valid. Maksimal panjangnya adalah diameter.");
            }

            // Validasi geometri:
            // Hitung sudut minimal (dalam derajat) agar tali busur bisa terbentuk dari jari-jari dan sudut pusat
            double sudutMinimal = Math.toDegrees(2 * Math.asin(taliBusur / (2 * jariJari)));
            if (sudut < sudutMinimal) {
                throw new IllegalArgumentException(
                    String.format(
                        "Sudut terlalu kecil untuk jari-jari dan tali busur ini. Sudut minimal yang valid: %.2f°", sudutMinimal
                    )
                );
            }

            // Hitung luas juring
            double luasJuring = (sudut / 360.0) * Math.PI * jariJari * jariJari;

            // Hitung tinggi segitiga isoseles dari tali busur
            double tinggiSegitiga = Math.sqrt(Math.pow(jariJari, 2) - Math.pow(taliBusur / 2.0, 2));
            double luasSegitiga = 0.5 * taliBusur * tinggiSegitiga;

            // Hitung luas tembereng
            double luasTembereng = luasJuring - luasSegitiga;

            if (luasTembereng < 0) {
                throw new ArithmeticException("Hasil luas tembereng negatif. Cek kembali kombinasi input.");
            }

            return luasTembereng;

        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println("Error saat menghitung luas tembereng lingkaran: " + e.getMessage());
            throw e;
        }
    }

    public double hitungKeliling() {
        KelilingTemberengLingkaran = busur + taliBusur;
        return KelilingTemberengLingkaran;
    }
    
    // Versi overloaded dengan parameter eksplisit
public double hitungKeliling(double busur, double taliBusur) throws IllegalArgumentException {
    try {
        if (busur <= 0) {
            throw new IllegalArgumentException("Panjang busur harus lebih besar dari 0");
        }
        if (taliBusur <= 0) {
            throw new IllegalArgumentException("Panjang tali busur harus lebih besar dari 0");
        }

        KelilingTemberengLingkaran = busur + taliBusur;
        return KelilingTemberengLingkaran;
    } catch (IllegalArgumentException e) {
        System.err.println("Error saat menghitung keliling tembereng lingkaran (overloaded): " + e.getMessage());
        throw e;
    }
}

    
    public double getLuasTembereng() {
        return luasTemberengLingkaran;
    }
}
