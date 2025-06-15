package consoleView;

import java.util.Scanner;
import bendageometri.Trapesium;

public class TrapesiumConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double sisiSejajar1 = 0;
        double sisiSejajar2 = 0;
        double tinggi = 0;

        System.out.println("*** Trapesium ***");
        while (true) {
            try {
                System.out.print("Masukkan panjang sisi atas (cm): ");
                sisiSejajar1 = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Masukkan panjang sisi bawah (cm): ");
                sisiSejajar2 = Double.parseDouble(input.nextLine());
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

        Trapesium trapesium = new Trapesium(sisiSejajar1, sisiSejajar2, tinggi);
        double luas = trapesium.hitungLuas();
        double keliling = trapesium.hitungKeliling();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas Trapesium    : " + luas);
        System.out.println("Keliling Trapesium: " + keliling);
    }
}