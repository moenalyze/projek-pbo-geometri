    package projekpbo.bangunRuang;

    import projekpbo.bangunDatar.Lingkaran;

    public class KerucutTerpancung extends Kerucut {
        public double jariJariAtas;
        public double tinggi;

        public double volumeKerucutTerpancung;
        public double luasPermukaanKerucutTerpancung;

        public KerucutTerpancung(double tinggi, double jariJariAtas, double jariJari) {
            super(jariJari); // jari jari bawah / besar r1
            this.jariJariAtas = jariJariAtas; // jari - jari alas kecil r2
            this.tinggi = tinggi;
        }

        public double hitungVolume() {
            volumeKerucutTerpancung = (1.0 / 3.0) * super.pi * tinggi * (super.jariJari * super.jariJari + jariJariAtas * jariJariAtas + super.jariJari * jariJariAtas);
            return volumeKerucutTerpancung;
        }

        public double hitungLuasPermukaan() {
            double garisPelukis = Math.sqrt(Math.pow(tinggi, 2) + Math.pow((super.jariJari - jariJariAtas), 2));

            luasPermukaanKerucutTerpancung = (super.pi * (jariJariAtas + super.jariJari) * garisPelukis) + (super.pi * (Math.pow(super.jariJari, 2) + Math.pow(jariJariAtas, 2)));
            return luasPermukaanKerucutTerpancung;
        }
    }
