package consoleView;

import java.util.Scanner;
import projekpbo.bangunDatar.Lingkaran;

public class LingkaranConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double jariJari = 0;
        

        System.out.println("* Lingkaran *");
        while (true) {
            try {
                System.out.print("Masukkan jari-jari lingkaran : ");
                jariJari = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input jari-jari harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }
        

        Lingkaran lingkaran  = new Lingkaran(jariJari);
        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas Lingkaran    : " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}