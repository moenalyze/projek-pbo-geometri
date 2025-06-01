package consoleView;

import java.util.Scanner;
import bendageometri.Trapesium;

public class TrapesiumConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double alasAtas = 0;
        double alasBawah = 0;
        double tinggi = 0;

        System.out.println("*** Trapesium ***");
        while (true) {
            try {
                System.out.print("Masukkan panjang alas atas (cm): ");
                alasAtas = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Masukkan panjang alas bawah (cm): ");
                alasBawah = Double.parseDouble(input.nextLine());
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

        Trapesium trapesium = new Trapesium(alasAtas, alasBawah, tinggi);
        double luas = trapesium.hitungLuas();
        double keliling = trapesium.hitungKeliling();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas Trapesium    : " + luas);
        System.out.println("Keliling Trapesium: " + keliling);
    }
}