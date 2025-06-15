package consoleView;

import java.util.Scanner;
import bendageometri.Segitiga;

public class SegitigaConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double sisi = 0;

        System.out.println("*** Segitiga ***");
        while (true) {
            try {
                System.out.print("Masukkan panjang sisi (cm): ");
                sisi = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }

        Segitiga segitiga = new Segitiga(sisi);
        double luas = segitiga.hitungLuas();
        double keliling = segitiga.hitungKeliling();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas Segitga    : " + luas);
        System.out.println("Keliling Segitiga: " + keliling);
    }
}