package ConsoleView;

import java.util.Scanner;
import projekpbo.bangunRuang.PrismaTrapesium;

public class PrismaTrapesiumConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double alasAtas = 0;
        double alasBawah = 0;
        double tinggiTrapesium = 0;
        double tinggiPrisma = 0;

        System.out.println("*** Prisma Segitiga ***");
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

        while (true) {
            try {
                System.out.print("Masukkan tinggi trapesium (cm): ");
                tinggiTrapesium = Double.parseDouble(input.nextLine());
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
                System.out.print("Masukkan tinggi prisma (cm): ");
                tinggiPrisma= Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }

        PrismaTrapesium trapesium = new PrismaTrapesium(alasAtas, alasBawah, tinggiTrapesium, tinggiPrisma);
        double volume = trapesium.hitungVolume();
        double luasPermukaan = trapesium.hitungLuasPermukaan();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Volume Prisma Trapesium    : " + volume);
        System.out.println("Luas Permukaan Prisma Trapesium: " + luasPermukaan);
    }
}