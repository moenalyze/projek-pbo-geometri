package projekpbo.bangunDatar;

public class JuringLingkaran extends Lingkaran {
    public double jariJari;
    public double sudut;
    public double luasJuringLingkaran;
    public double kelilingJuringLingkaran;

    public JuringLingkaran(double jariJari, double sudut) {
        super(jariJari);
        this.jariJari = jariJari;
        this.sudut = sudut;
    }

    public double hitungLuas() {
        luasJuringLingkaran = (sudut / 360.0) * super.hitungLuas();
        return luasJuringLingkaran;
    }
    
    public double getLuasJuringLingkaran() {
        return luasJuringLingkaran;
    }

    public double hitungKeliling() {
        double panjangBusur = (sudut / 360.0) * 2 * Math.PI * jariJari;
        kelilingJuringLingkaran = panjangBusur + 2 * jariJari;
        return kelilingJuringLingkaran;
    }
    
    public double getKelilingJuringLingkaran() {
        return kelilingJuringLingkaran;
    }
}
