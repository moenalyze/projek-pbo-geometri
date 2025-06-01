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

    public double hitungLuas() {
         // Menghitung luas juring: bagian dari lingkaran yang dibatasi oleh 2 jari-jari dan busu
        double luasJuring = (sudut / 360.0) * pi * super.jariJari * super.jariJari;
        // Menghitung tinggi segitiga yang terbentuk dari dua jari-jari dan tali busur
        double tinggiSegitiga = Math.sqrt(Math.pow(super.jariJari, 2) - Math.pow(taliBusur / 2, 2));
         // Menghitung luas segitiga yang dibentuk oleh dua jari-jari dan tali busur
        double luasSegitiga = 0.5 * tinggiSegitiga * taliBusur;
        luasTemberengLingkaran = luasJuring - luasSegitiga;
        return luasTemberengLingkaran;
    }
    
    public double getLuasTembereng() {
        return luasTemberengLingkaran;
    }

    public double hitungKeliling() {
        KelilingTemberengLingkaran = busur + taliBusur;
        return KelilingTemberengLingkaran;
    }
}
