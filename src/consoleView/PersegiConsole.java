package consoleView;

import java.util.Scanner;
import bendageometri.Persegi;

/**
 * Nara Ganteng
 */
public class PersegiConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double sisi = 0;

        System.out.println("*** Persegi ***");
        // Input sisi dengan validasi
        while (true) {
            try {
                System.out.print("Masukkan panjang sisi (cm): ");
                sisi = Double.parseDouble(input.nextLine());
                if (sisi <= 0) {
                    System.out.println("⚠  Panjang sisi harus lebih dari 0. Silakan coba lagi.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input sisi harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }

        // Buat objek Persegi dan hitung
        Persegi persegi = new Persegi(sisi);
        double luas = persegi.hitungLuas();
        double keliling = persegi.hitungKeliling();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");
        System.out.printf("Luas Persegi    : %.2f cm²%n", luas);
        System.out.printf("Keliling Persegi: %.2f cm%n", keliling);
        
        System.out.println("    ");
    }

    public static void main(String[] args) {
        show();
    }
}
