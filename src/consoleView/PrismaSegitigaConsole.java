package ConsoleView;

import java.util.Scanner;
import projekpbo.bangunRuang.PrismaSegitiga;

public class PrismaSegitigaConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double alasSegitiga = 0;
        double tinggiSegitiga = 0;
        double tinggiPrisma = 0;

        System.out.println("*** Prisma Segitiga ***");
        while (true) {
            try {
                System.out.print("Masukkan panjang alas segitiga: ");
                alasSegitiga = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Masukkan tinggi segitiga (cm): ");
                tinggiSegitiga = Double.parseDouble(input.nextLine());
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

        PrismaSegitiga segitiga = new PrismaSegitiga(alasSegitiga, tinggiSegitiga, tinggiPrisma);
        double volume = segitiga.hitungVolume();
        double luasPermukaan = segitiga.hitungLuasPermukaan();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Volume Prisma Segitiga    : " + volume);
        System.out.println("Luas Permukaan Prisma Segitiga: " + luasPermukaan);
    }
}