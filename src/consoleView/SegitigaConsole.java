package consoleView;

import java.util.Scanner;
import bendageometri.Segitiga;

public class SegitigaConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double alas = 0;
        double tinggi = 0;

        System.out.println("*** Segitiga ***");
        while (true) {
            try {
                System.out.print("Masukkan panjang alas (cm): ");
                alas = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }

        // Input sudut dengan validasi
        while (true) {
            try {
                System.out.print("Masukkan tinggi (cm): ");
                tinggi= Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }

        Segitiga segitiga = new Segitiga(alas, tinggi);
        double luas = segitiga.hitungLuas();
        double keliling = segitiga.hitungKeliling();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas Segitga    : " + luas);
        System.out.println("Keliling Segitiga: " + keliling);
    }
}