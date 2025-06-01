///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package consoleView;
//
//import java.util.Scanner;
//import projekpbo.bangunRuang.PrismaLayangLayang;
//
//
//public class PrismaLayangLayangConsole {
//    public static void show() {
//        Scanner input = new Scanner(System.in);
//        double diagonal1 = 0;
//        double diagonal2 = 0;
//        double sisi1 = 0;
//        double sisi2 = 0;
//        double tinggiPrisma = 0;
//
//        System.out.println("*** Prisma Layang-Layang ***");
//
//        // Input diagonal1
//        while (true) {
//            try {
//                System.out.print("Masukkan panjang diagonal 1 alas (cm): ");
//                diagonal1 = Double.parseDouble(input.nextLine());
//                if (diagonal1 <= 0) {
//                    System.out.println("⚠  Diagonal harus > 0. Coba lagi."); continue;
//                }
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("⚠  Input harus angka. Silakan coba lagi.");
//            }
//        }
//        // Input diagonal2
//        while (true) {
//            try {
//                System.out.print("Masukkan panjang diagonal 2 alas (cm): ");
//                diagonal2 = Double.parseDouble(input.nextLine());
//                if (diagonal2 <= 0) {
//                    System.out.println("⚠  Diagonal harus > 0. Coba lagi."); continue;
//                }
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("⚠  Input harus angka. Silakan coba lagi.");
//            }
//        }
//        // Input sisi1
//        while (true) {
//            try {
//                System.out.print("Masukkan panjang sisi 1 alas (cm): ");
//                sisi1 = Double.parseDouble(input.nextLine());
//                if (sisi1 <= 0) {
//                    System.out.println("⚠  Sisi harus > 0. Coba lagi."); continue;
//                }
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("⚠  Input harus angka. Silakan coba lagi.");
//            }
//        }
//        // Input sisi2
//        while (true) {
//            try {
//                System.out.print("Masukkan panjang sisi 2 alas (cm): ");
//                sisi2 = Double.parseDouble(input.nextLine());
//                if (sisi2 <= 0) {
//                    System.out.println("⚠  Sisi harus > 0. Coba lagi."); continue;
//                }
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("⚠  Input harus angka. Silakan coba lagi.");
//            }
//        }
//        // Input tinggi prisma
//        while (true) {
//            try {
//                System.out.print("Masukkan tinggi prisma (cm): ");
//                tinggiPrisma = Double.parseDouble(input.nextLine());
//                if (tinggiPrisma <= 0) {
//                    System.out.println("⚠  Tinggi harus > 0. Coba lagi."); continue;
//                }
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("⚠  Input harus angka. Silakan coba lagi.");
//            }
//        }
//
//        // Buat objek dan hitung
//        PrismaLayangLayang prisma = new PrismaLayangLayang(
//            diagonal1, diagonal2, sisi1, sisi2, tinggiPrisma
//        );
//        double volume = prisma.hitungVolume();
//        double luasPermukaan = prisma.hitungLuasPermukaan();
//
//        System.out.println();
//        System.out.println(tinggiPrisma);
////        System.out.println(super.hitungLuas());
//        System.out.println("---Hasil Perhitungan---");
//        System.out.printf("Volume Prisma       : %.2f cm³%n", volume);
//        System.out.printf("Luas Permukaan Prisma: %.2f cm²%n", luasPermukaan);
//        
//        System.out.println("    ");
//    }
//
//    public static void main(String[] args) {
//        show();
//    }
//}
//
