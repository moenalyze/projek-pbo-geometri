package projekpbo.bangunDatar;

public class TemberengLingkaran extends Lingkaran {
    private double taliBusur;
    private double busur;
    private double jariJari;
    private double sudut;
    private double luasTemberengLingkaran;
    private double KelilingTemberengLingkaran;

    public TemberengLingkaran(double jariJari, double taliBusur, double sudut, double busur) {
        super(jariJari);
        this.taliBusur = taliBusur;
        this.sudut = sudut;
        this.busur = busur;
    }

    public double hitungLuas() {
        double luasJuring = (sudut / 360.0) * Math.PI * super.jariJari * super.jariJari;
        double tinggiSegitiga = Math.sqrt(Math.pow(super.jariJari, 2) - Math.pow(taliBusur / 2, 2));
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
    
     public double getKelilingTembereng() {
        return KelilingTemberengLingkaran;
    }
}
